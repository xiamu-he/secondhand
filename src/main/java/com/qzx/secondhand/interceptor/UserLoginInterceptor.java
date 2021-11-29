package com.qzx.secondhand.interceptor;


import com.qzx.secondhand.exception.handler.UserDefinedException;
import com.qzx.secondhand.exception.statusCode.GlobalCodeEnum;
import com.qzx.secondhand.service.TradeUserService;
import com.qzx.secondhand.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author qzx
 * @create 2021-10-25 20:14
 * @function
 */
public class UserLoginInterceptor implements HandlerInterceptor {
    @Autowired
    TradeUserService tradeUserService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }

        String token = request.getHeader("token");
        //未登录
        if (token == null) {
            throw new UserDefinedException(GlobalCodeEnum.USER_NOT_LOGIN);
        }

        //登录失效
        Long userId = JwtUtils.verityUser(token);
        if (userId == null) {
            throw new UserDefinedException(GlobalCodeEnum.TOKEN_IS_INVALID);
        } else {
            if (tradeUserService.selectByPrimaryKey(userId) == null) {
                throw new UserDefinedException(GlobalCodeEnum.USER_NOT_EXIST);
            }
        }
        return true;
    }
}

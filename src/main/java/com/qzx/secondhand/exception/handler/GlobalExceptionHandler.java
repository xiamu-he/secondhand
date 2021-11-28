package com.qzx.secondhand.exception.handler;


import com.qzx.secondhand.exception.result.BaseResp;
import com.qzx.secondhand.exception.statusCode.ExceptionUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;


/**
 * @author ：liuzipan
 * @date ：Created in 2020/3/17 23:36
 * @description：统一异常处理接口
 * @modified By：
 */


@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public BaseResp ServletExceptionHandler(Exception e , HttpServletResponse response) {
        // 设置http返回码
        response.setStatus(ExceptionUtil.getExceptionHttpStatusCode(e));
        BaseResp baseResp = new BaseResp(ExceptionUtil.getExceptionCustomCode(e));
        log.warn("[{}],{}",baseResp.getCode(), e.getMessage(), e);
        return baseResp;
    }

}
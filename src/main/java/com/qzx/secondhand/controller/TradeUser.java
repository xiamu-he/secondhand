package com.qzx.secondhand.controller;

import com.qzx.secondhand.exception.handler.UserDefinedException;
import com.qzx.secondhand.exception.result.BaseResp;
import com.qzx.secondhand.exception.statusCode.GlobalCodeEnum;
import com.qzx.secondhand.service.TradeUserService;
import com.qzx.secondhand.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qzx
 * @create 2021-11-25 20:39
 * @function
 */
@RestController
@RequestMapping(value = "/user")
public class TradeUser {
    @Autowired
    TradeUserService tradeUserService;

    @GetMapping("/login")
    public BaseResp test(){
        return null;
    }
}

package com.qzx.secondhand.controller;

import com.qzx.secondhand.service.TradeUserService;
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

    @GetMapping(value = "/test")
    public String test(){
        for (int i=0;i<10;i++){
            tradeUserService.selectall();
        }
        return "Hello, Async!";
    }
}

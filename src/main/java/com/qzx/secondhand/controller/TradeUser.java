package com.qzx.secondhand.controller;

import com.qzx.secondhand.exception.result.Result;
import com.qzx.secondhand.service.TradeUserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Result login() {
        return null;
    }


    @ApiOperation("查询用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "凭据", required = true, paramType = "header")
    })
    @PostMapping("/personal/info/detail")
    public Result getPersonInfoDetail(@RequestParam("id") Long id) {
        return tradeUserService.getPersonInfoDetail(id);
    }


}

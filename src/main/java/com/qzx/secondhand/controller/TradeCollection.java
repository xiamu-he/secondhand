package com.qzx.secondhand.controller;

import com.qzx.secondhand.exception.result.Result;
import com.qzx.secondhand.service.TradeCollectionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.ReactivePubSubCommands;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qzx
 * @create 2021-11-30 23:32
 * @function
 */
@RestController
@RequestMapping(value = "/collection")
@Api("用户收藏接口")
public class TradeCollection {
    @Autowired
    TradeCollectionService tradeCollectionService;

    @PostMapping(value = "/list")
    @ApiOperation("获取收藏列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token",value = "凭据",required = true,paramType = "header"),
            @ApiImplicitParam(name = "id",value = "用户id",required = true,paramType = "query")
    })
    public Result getCollectionList(@RequestParam("id") Long id,
                                    @RequestParam(value = "pageSize",defaultValue = "8") Integer pageSize,
                                    @RequestParam(value = "page",defaultValue = "1") Integer page){
        return Result.success(tradeCollectionService.selectCollectionVoJoinwithPage(page,pageSize,id));
    }
}

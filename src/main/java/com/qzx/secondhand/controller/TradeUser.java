package com.qzx.secondhand.controller;

import com.alibaba.fastjson.JSONObject;
import com.qzx.secondhand.exception.result.Result;
import com.qzx.secondhand.model.domain.TradeCollection;
import com.qzx.secondhand.model.domain.TradeCommodity;
import com.qzx.secondhand.model.domain.TradeDesireProduct;
import com.qzx.secondhand.model.vo.user.UserDetailInfo;
import com.qzx.secondhand.service.TradeCollectionService;
import com.qzx.secondhand.service.TradeCommodityService;
import com.qzx.secondhand.service.TradeDesireProductService;
import com.qzx.secondhand.service.TradeUserService;
import com.qzx.secondhand.util.JwtUtils;
import io.lettuce.core.cluster.pubsub.api.sync.PubSubNodeSelection;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.prefs.BackingStoreException;

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

    @Autowired
    TradeCollectionService tradeCollectionService;

    @Autowired
    TradeCommodityService tradeCommodityService;

    @Autowired
    TradeDesireProductService tradeDesireProductService;

    @GetMapping("/login")
    public Result login() {
        return null;
    }


    @ApiOperation(value = "查询用户简要信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "凭据", required = true, dataTypeClass = String.class, paramType = "header"),
            @ApiImplicitParam(name = "id", value = "用户id", required = true, dataTypeClass = Long.class, paramType = "query")
    })
    @GetMapping(value = "/personal/info/brief")
    public Result getPersonInfoBrief(@RequestParam(value = "id") Long id) {
        return tradeUserService.getPersonInfoBrief(id);
    }


    @ApiOperation("查询用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "凭据", required = true, dataTypeClass = String.class, paramType = "header"),
            @ApiImplicitParam(name = "id", value = "用户id", required = true, dataTypeClass = Long.class, paramType = "query")
    })
    @GetMapping("/personal/info/detail")
    public Result getPersonInfoDetail(@RequestParam("id") Long id) {
        return tradeUserService.getPersonInfoDetail(id);
    }


    @ApiOperation("获取收藏列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "凭据", required = true, dataTypeClass = String.class, paramType = "header"),
            @ApiImplicitParam(name = "id", value = "用户id", required = true, dataTypeClass = Long.class, paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页面大小", required = true, dataTypeClass = Integer.class, paramType = "query"),
            @ApiImplicitParam(name = "page", value = "页码", required = true, dataTypeClass = Integer.class, paramType = "query")
    })
    @GetMapping(value = "/commodity/collection")
    public Result getCollectionList(@RequestParam("id") Long id,
                                    @RequestParam(value = "pageSize", defaultValue = "8") Integer pageSize,
                                    @RequestParam(value = "page", defaultValue = "1") Integer page) {
        return tradeCollectionService.selectCollectionVoJoinwithPage(page, pageSize, id);
    }

    @ApiOperation("获取用户发布的商品列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "凭据", required = true, dataTypeClass = String.class, paramType = "header"),
            @ApiImplicitParam(name = "id", value = "用户id", required = true, dataTypeClass = Long.class, paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页面大小", required = true, dataTypeClass = Integer.class, paramType = "query"),
            @ApiImplicitParam(name = "page", value = "页码", required = true, dataTypeClass = Integer.class, paramType = "query"),
            @ApiImplicitParam(name = "expired", value = "是否按商品是否过期进行排序", required = false, dataTypeClass = Boolean.class, paramType = "query")
    })
    @GetMapping("/commodity/publish")
    public Result getPublishList(@RequestParam(value = "id") Long id,
                                 @RequestParam(value = "pageSize", defaultValue = "8") Integer pageSize,
                                 @RequestParam(value = "page", defaultValue = "1") Integer page,
                                 @RequestParam(value = "expired", defaultValue = "false", required = false) Boolean expired) {
        return tradeCommodityService.selectCommodityVoJoinwithPage(page, pageSize, id, expired);
    }

    @ApiOperation("获取用户求购商品列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "凭据", required = true, dataTypeClass = String.class, paramType = "header"),
            @ApiImplicitParam(name = "id", value = "用户id", required = true, dataTypeClass = Long.class, paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "页面大小", required = true, dataTypeClass = Integer.class, paramType = "query"),
            @ApiImplicitParam(name = "page", value = "页码", required = true, dataTypeClass = Integer.class, paramType = "query"),
            @ApiImplicitParam(name = "expired", value = "是否按商品是否过期进行排序", required = false, dataTypeClass = Boolean.class, paramType = "query")
    })
    @GetMapping(value = "/desire/product/sell")
    public Result getDesireProductList(@RequestParam(value = "id") Long id,
                                       @RequestParam(value = "pageSize", defaultValue = "8") Integer pageSize,
                                       @RequestParam(value = "page", defaultValue = "1") Integer page,
                                       @RequestParam(value = "expired", defaultValue = "false", required = false) Boolean expired) {
        return tradeDesireProductService.selectDesireProductVOwithPage(page, pageSize, id, expired);
    }


    @ApiOperation("修改出售商品状态 下架 完成 上架")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "凭据", required = true, dataTypeClass = String.class, paramType = "header"),
            @ApiImplicitParam(name = "commodity_id", value = "商品id", required = true, dataTypeClass = Long.class, paramType = "query"),
            @ApiImplicitParam(name = "commodity_state", value = "商品状态", required = true, dataTypeClass = Byte.class, paramType = "query")
    })
    @PutMapping(value = "/commodity/state")
    public Result updateCommodityState(@RequestParam(value = "commodity_id") Long commodity_id, @RequestParam(value = "commodity_state") Byte commodity_state) {
        TradeCommodity tradeCommodity = new TradeCommodity();
        tradeCommodity.setCommodityId(commodity_id);
        tradeCommodity.setCommodityState(commodity_state);
        return tradeCommodityService.updateByPrimaryKeySelective(tradeCommodity);
    }

    @ApiOperation("修改求购商品状态 下架 完成 上架")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "凭据", required = true, dataTypeClass = String.class, paramType = "header"),
            @ApiImplicitParam(name = "id", value = "求购商品id", required = true, dataTypeClass = Long.class, paramType = "query"),
            @ApiImplicitParam(name = "product_state", value = "求购商品状态", required = true, dataTypeClass = Byte.class, paramType = "query")
    })
    @PutMapping(value = "/product/state")
    public Result updateProductState(@RequestParam(value = "id") Long id, @RequestParam(value = "product_state") Byte product_state) {
        TradeDesireProduct tradeDesireProduct = new TradeDesireProduct();
        tradeDesireProduct.setId(id);
        tradeDesireProduct.setProductState(product_state);
        return tradeDesireProductService.updateByPrimaryKeySelective(tradeDesireProduct);
    }

    @ApiOperation("修改用户信息")
    @PutMapping(value = "/update/info")
    public Result updateUserInfo(@RequestBody JSONObject jsonObject){
        return tradeUserService.updateByPrimaryKeySelective(jsonObject);
    }
}

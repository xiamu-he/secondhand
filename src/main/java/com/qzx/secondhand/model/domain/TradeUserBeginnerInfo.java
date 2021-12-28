package com.qzx.secondhand.model.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
@author qzx
@create 2021-12-08 11:07
@function
*/
/**
    * 用户的各类身份信息
    */
@ApiModel(value="用户的各类身份信息")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TradeUserBeginnerInfo implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 用户ID
    */
    @ApiModelProperty(value="用户ID")
    private Long userId;

    /**
    * 首次收藏
    */
    @ApiModelProperty(value="首次收藏")
    private Boolean firstCollection;

    /**
    * 首次发布卖品
    */
    @ApiModelProperty(value="首次发布卖品")
    private Boolean firstPublishSell;

    /**
    * 首次发布交换品
    */
    @ApiModelProperty(value="首次发布交换品")
    private Boolean firstPublishExchange;

    /**
    * 首次发布免费商品
    */
    @ApiModelProperty(value="首次发布免费商品")
    private Boolean firstPublishFree;

    /**
    * 首次卖出
    */
    @ApiModelProperty(value="首次卖出")
    private Boolean firstSoldOut;

    /**
    * 首次评价
    */
    @ApiModelProperty(value="首次评价")
    private Boolean firstEvaluate;

    /**
    * 首次分享
    */
    @ApiModelProperty(value="首次分享")
    private Boolean firstShare;

    /**
    * 首次检索
    */
    @ApiModelProperty(value="首次检索")
    private Boolean firstExplore;

    /**
    * 首次留言
    */
    @ApiModelProperty(value="首次留言")
    private Boolean firstMessage;

    private static final long serialVersionUID = 1L;
}
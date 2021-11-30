package com.qzx.secondhand.model.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
@author qzx
@create 2021-11-30 17:29
@function
*/
@ApiModel(value="trade_commodity")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TradeCommodity implements Serializable {
    @ApiModelProperty(value="")
    private Long commodityId;

    /**
    * 商品名称
    */
    @ApiModelProperty(value="商品名称")
    private String commodityName;

    /**
    * 商品发布者ID
    */
    @ApiModelProperty(value="商品发布者ID")
    private Long commodityPublisherId;

    /**
    * 商品类型  0 仅换 1仅售 2换/售 3免费商品
    */
    @ApiModelProperty(value="商品类型  0 仅换 1仅售 2换/售 3免费商品")
    private Byte commodityType;

    /**
    * 交换商品名称
    */
    @ApiModelProperty(value="交换商品名称")
    private String commodityExchangeName;

    /**
    * 商品定价
    */
    @ApiModelProperty(value="商品定价")
    private Integer commodityPrice;

    /**
    * 商品状态 1：上架 2：下架  3：完成
    */
    @ApiModelProperty(value="商品状态 1：上架 2：下架  3：完成")
    private Byte commodityState;

    /**
    * 商品上架时间
    */
    @ApiModelProperty(value="商品上架时间")
    private Date commodityReleaseTime;

    /**
    * 商品上架天数
    */
    @ApiModelProperty(value="商品上架天数")
    private Integer commodityReleaseDay;

    /**
    * 商品下架时间
    */
    @ApiModelProperty(value="商品下架时间")
    private Date commodityDismissTime;

    /**
    * 商品图片
    */
    @ApiModelProperty(value="商品图片")
    private String commodityAvatar;

    /**
    * 商品描述
    */
    @ApiModelProperty(value="商品描述")
    private String commodityDescription;

    /**
    * 商品浏览量
    */
    @ApiModelProperty(value="商品浏览量")
    private Long commodityScanCount;

    /**
    * 商品分类
    */
    @ApiModelProperty(value="商品分类")
    private Byte commodityClassification;

    /**
    * 商品二级分类标签
    */
    @ApiModelProperty(value="商品二级分类标签")
    private Byte commoditySecondClassification;

    /**
    * 商品所在位置 南校区或者北校区
    */
    @ApiModelProperty(value="商品所在位置 南校区或者北校区")
    private String commodityAddress;

    /**
    * 是否被锁，默认为0
    */
    @ApiModelProperty(value="是否被锁，默认为0")
    private Boolean isLocked;

    /**
    * 是否过期
    */
    @ApiModelProperty(value="是否过期")
    private Boolean isExpired;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date gmtCreate;

    /**
    * 修改时间
    */
    @ApiModelProperty(value="修改时间")
    private Date gmtModified;

    private static final long serialVersionUID = 1L;
}
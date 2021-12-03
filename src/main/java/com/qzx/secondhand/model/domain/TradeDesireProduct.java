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
@create 2021-12-02 12:02
@function
*/
/**
    * 求购产品
    */
@ApiModel(value="求购产品")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TradeDesireProduct implements Serializable {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Long id;

    /**
    * 产品发布者ID
    */
    @ApiModelProperty(value="产品发布者ID")
    private Long productPublisherId;

    /**
    * 产品名字
    */
    @ApiModelProperty(value="产品名字")
    private String productName;

    /**
    * 产品价格
    */
    @ApiModelProperty(value="产品价格")
    private Integer productPrice;

    /**
    * 产品状态 1：上架 2：下架  3：完成
    */
    @ApiModelProperty(value="产品状态 1：上架 2：下架  3：完成")
    private Byte productState;

    /**
    * 产品图片
    */
    @ApiModelProperty(value="产品图片")
    private String productImage;

    /**
    * 产品发布时间
    */
    @ApiModelProperty(value="产品发布时间")
    private Date productReleaseTime;

    /**
    * 产品上架天数
    */
    @ApiModelProperty(value="产品上架天数")
    private Integer productReleaseDay;

    /**
    * 产品下架时间
    */
    @ApiModelProperty(value="产品下架时间")
    private Date productDismissTime;

    /**
    * 产品描述
    */
    @ApiModelProperty(value="产品描述")
    private String productDescription;

    /**
    * 产品浏览量
    */
    @ApiModelProperty(value="产品浏览量")
    private Long productScanCount;

    /**
    * 商品所在位置 南校区或者北校区
    */
    @ApiModelProperty(value="商品所在位置 南校区或者北校区")
    private String productAddress;

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
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
/**
    * 商品分类表
    */
@ApiModel(value="商品分类表")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TradeCommodityClassification implements Serializable {
    /**
    * 类别id
    */
    @ApiModelProperty(value="类别id")
    private Long id;

    /**
    * 一级标签id

    */
    @ApiModelProperty(value="一级标签id,")
    private Integer classificationId;

    /**
    * 一级标签名称
    */
    @ApiModelProperty(value="一级标签名称")
    private String classificationName;

    /**
    * 二级标签id
    */
    @ApiModelProperty(value="二级标签id")
    private Integer classificationSecondId;

    /**
    * 二级标签名称
    */
    @ApiModelProperty(value="二级标签名称")
    private String classificationSecondName;

    /**
    * 是否被撤销。0：未撤销 1：已撤销
    */
    @ApiModelProperty(value="是否被撤销。0：未撤销 1：已撤销")
    private Byte isDismissed;

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
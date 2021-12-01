package com.qzx.secondhand.model.vo.user;

import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.List;

import lombok.Data;


@Data
public class CollectionVO {
    /**
     *
     */
    @ApiModelProperty(value = "商品id")
    private Long commodityId;

    /**
     * 商品名称
     */
    @ApiModelProperty(value = "商品名称")
    private String commodityName;

    /**
     * 商品发布者ID
     */
    @ApiModelProperty(value = "商品发布者ID")
    private Long commodityPublisherId;

    /**
     * 商品发布者名称
     */
    @ApiModelProperty(value="商品发布者名称")
    private String userName;

    /**
     * 商品发布者头像
     */
    @ApiModelProperty(value="商品发布者头像")
    private String userAvatar;

    /**
     * 商品发布者手机号码
     */
    @ApiModelProperty(value="商品发布者手机号码")
    private String userPhoneNumber;

    /**
     * 商品发布者微信号
     */
    @ApiModelProperty(value="商品发布者微信号")
    private String userWxNumber;

    /**
     * 商品类型  0 仅换 1仅售 2换/售 3免费商品
     */
    @ApiModelProperty(value = "商品类型  0 仅换 1仅售 2换/售 3免费商品")
    private Byte commodityType;

    /**
     * 交换商品名称
     */
    @ApiModelProperty(value = "交换商品名称")
    private String commodityExchangeName;

    /**
     * 商品定价
     */
    @ApiModelProperty(value = "商品定价")
    private Integer commodityPrice;

    /**
     * 商品状态 1：上架 2：下架  3：完成
     */
    @ApiModelProperty(value = "商品状态 1：上架 2：下架  3：完成")
    private Byte commodityState;

    /**
     * 商品上架时间
     */
    @ApiModelProperty(value = "商品上架时间")
    private Date commodityReleaseTime;


    /**
     * 商品图片
     */
    @ApiModelProperty(value = "商品图片")
    private String commodityAvatar;

    /**
     * 商品图片集合
     */
    @ApiModelProperty("商品图片集合")
    private List<String> commodityAvatarList;

    /**
     * 商品描述
     */
    @ApiModelProperty(value = "商品描述")
    private String commodityDescription;

    /**
     * 商品浏览量
     */
    @ApiModelProperty(value = "商品浏览量")
    private Long commodityScanCount;

    /**
     * 商品一级分类标签
     */
    @ApiModelProperty(value = "商品一级分类标签")
    private Byte commodityClassification;

    /**
     * 一级标签名称
     */
    @ApiModelProperty(value="一级标签名称")
    private String classificationName;

    /**
     * 商品二级分类标签
     */
    @ApiModelProperty(value = "商品二级分类标签")
    private Long commoditySecondClassification;

    /**
     * 二级标签名称
     */
    @ApiModelProperty(value="二级标签名称")
    private String classificationSecondName;

    /**
     * 商品所在位置 南校区或者北校区
     */
    @ApiModelProperty(value = "商品所在位置 南校区或者北校区")
    private String commodityAddress;
}

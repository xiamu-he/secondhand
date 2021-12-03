package com.qzx.secondhand.model.vo.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;
import java.util.Date;
import lombok.Data;


@Data
public class DesireProductVO {
    /**
     * 求购商品ID
     */
    @ApiModelProperty(value = "求购商品ID")
    private Long id;

    /**
     * 产品发布者ID
     */
    @ApiModelProperty(value = "产品发布者ID")
    private Long productPublisherId;

    /**
     * 产品名字
     */
    @ApiModelProperty(value = "产品名字")
    private String productName;

    /**
     * 产品价格
     */
    @ApiModelProperty(value = "产品价格")
    private Integer productPrice;

    /**
     * 产品状态 1：上架 2：下架  3：完成
     */
    @ApiModelProperty(value = "产品状态 1：上架 2：下架  3：完成")
    private Byte productState;

    /**
     * 产品图片
     */
    @ApiModelProperty(value = "产品图片")
    private String productImage;


    /**
     * 产品发布时间
     */
    @ApiModelProperty(value = "产品发布时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date productReleaseTime;

    /**
     * 产品描述
     */
    @ApiModelProperty(value = "产品描述")
    private String productDescription;

    /**
     * 产品浏览量
     */
    @ApiModelProperty(value = "产品浏览量")
    private Long productScanCount;

    /**
     * 商品所在位置 南校区或者北校区
     */
    @ApiModelProperty(value = "商品所在位置 南校区或者北校区")
    private String productAddress;

    /**
     * 是否过期
     */
    @ApiModelProperty(value = "是否过期")
    private Boolean isExpired;

    /**
     * 用户性别 "0":男 "1":女
     */
    @ApiModelProperty(value = "用户性别 '0':男 '1':女")
    private String userSex;

    /**
     * 发布人昵称
     */
    @ApiModelProperty(value = "发布人昵称")
    private String userName;

    /**
     * 用户微信号
     */
    @ApiModelProperty(value = "用户微信号")
    private String userWxNumber;

    /**
     * 用户手机号码
     */
    @ApiModelProperty(value = "用户手机号码")
    private String userPhoneNumber;

    /**
     * 用户头像
     */
    @ApiModelProperty(value = "用户头像")
    private String userAvatar;

    /**
     * 用户积分
     */
    @ApiModelProperty(value = "用户积分")
    private Integer userScore;

    /**
     * 是否认证。0：未认证 1：已认证  默认为0
     */
    @ApiModelProperty(value = "是否认证。0：未认证 1：已认证  默认为0")
    private Boolean isCertified;
}

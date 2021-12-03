package com.qzx.secondhand.model.vo.user;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qzx.secondhand.mapper.TradeCommodityMapper;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;


@Data
public class CommodityVO {
    /**
     *商品id
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date commodityReleaseTime;

    /**
     * 商品上架天数
     */
    @ApiModelProperty(value = "商品上架天数")
    private Integer commodityReleaseDay;

    /**
     * 商品图片
     */
    @ApiModelProperty(value = "商品图片")
    private String commodityAvatar;

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
     * 商品分类
     */
    @ApiModelProperty(value = "商品分类")
    private Byte commodityClassification;

    /**
     * 商品二级分类标签
     */
    @ApiModelProperty(value = "商品二级分类标签")
    private Integer commoditySecondClassification;

    /**
     * 商品所在位置 南校区或者北校区
     */
    @ApiModelProperty(value = "商品所在位置 南校区或者北校区")
    private String commodityAddress;

    /**
     * 是否被锁，默认为0
     */
    @ApiModelProperty(value = "是否被锁，默认为0")
    private Boolean isLocked;

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
     *
     */
    @ApiModelProperty(value = "用户昵称")
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

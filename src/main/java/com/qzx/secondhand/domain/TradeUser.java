package com.qzx.secondhand.domain;

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
@create 2021-11-25 20:32
@function
*/
@ApiModel(value="trade_user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TradeUser implements Serializable {
    /**
    * 用户ID
    */
    @ApiModelProperty(value="用户ID")
    private Long userId;

    /**
    * 用户微信ID
    */
    @ApiModelProperty(value="用户微信ID")
    private String userWxOpenId;

    /**
    * 用户邮箱
    */
    @ApiModelProperty(value="用户邮箱")
    private String userMail;

    /**
    * 用户密码
    */
    @ApiModelProperty(value="用户密码")
    private String userPassword;

    /**
    * 用户性别 "0":男 "1":女
    */
    @ApiModelProperty(value="用户性别 '0':男 '1':女")
    private String userSex;

    @ApiModelProperty(value="")
    private String userName;

    /**
    * 用户校园卡号
    */
    @ApiModelProperty(value="用户校园卡号")
    private String userCampusCardNumber;

    /**
    * 用户微信号
    */
    @ApiModelProperty(value="用户微信号")
    private String userWxNumber;

    /**
    * 用户手机号码
    */
    @ApiModelProperty(value="用户手机号码")
    private String userPhoneNumber;

    /**
    * 用户头像
    */
    @ApiModelProperty(value="用户头像")
    private String userAvatar;

    /**
    * 用户地址
    */
    @ApiModelProperty(value="用户地址")
    private String userAddress;

    /**
    * 用户等级
    */
    @ApiModelProperty(value="用户等级")
    private Integer userLevel;

    /**
    * 用户积分
    */
    @ApiModelProperty(value="用户积分")
    private Integer userScore;

    /**
    * 用户是否注销。 默认为0，未注销
    */
    @ApiModelProperty(value="用户是否注销。 默认为0，未注销")
    private Boolean isDismissed;

    /**
    * 是否认证。0：未认证 1：已认证  默认为0
    */
    @ApiModelProperty(value="是否认证。0：未认证 1：已认证  默认为0")
    private Boolean isCertified;

    /**
    * 用户真实姓名
    */
    @ApiModelProperty(value="用户真实姓名")
    private String userRealName;

    /**
    * 用户所属学院
    */
    @ApiModelProperty(value="用户所属学院")
    private String userCollege;

    /**
    * 用户班级
    */
    @ApiModelProperty(value="用户班级")
    private String userClass;

    /**
    * 用户校园卡图片地址
    */
    @ApiModelProperty(value="用户校园卡图片地址")
    private String userCampusCardAvatar;

    /**
    * 用户评分
    */
    @ApiModelProperty(value="用户评分")
    private Double userEvaluateScore;

    /**
    * 是否是新手，默认为是
    */
    @ApiModelProperty(value="是否是新手，默认为是")
    private Boolean isBeginner;

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
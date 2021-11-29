package com.qzx.secondhand.model.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ApiModel(description = "个人详细信息")
public class UserDetailInfo {
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
     * 用户校园卡号
     */
    @ApiModelProperty(value = "用户校园卡号")
    private String userCampusCardNumber;

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
     * 用户地址
     */
    @ApiModelProperty(value = "用户地址")
    private String userAddress;

    /**
     * 用户校园卡图片地址
     */
    @ApiModelProperty(value = "用户校园卡图片地址")
    private String userCampusCardAvatar;
}


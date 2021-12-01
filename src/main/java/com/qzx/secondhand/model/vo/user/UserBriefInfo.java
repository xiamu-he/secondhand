package com.qzx.secondhand.model.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("用户简要信息")
public class UserBriefInfo {
    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID")
    private Long userId;

    /**
     *用户昵称
     */
    @ApiModelProperty(value = "用户昵称")
    private String userName;

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

    /**
     * 用户校园卡图片地址
     */
    @ApiModelProperty(value = "用户校园卡图片地址")
    private String userCampusCardAvatar;
}

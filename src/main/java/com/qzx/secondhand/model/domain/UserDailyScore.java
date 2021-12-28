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
@create 2021-12-08 11:07
@function
*/

@ApiModel(value="用户每日分数")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDailyScore implements Serializable {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Long id;

    @ApiModelProperty(value="")
    private Long userId;

    /**
    * 记录时间
    */
    @ApiModelProperty(value="记录时间")
    private Date recordTime;

    /**
    * 用户登录
    */
    @ApiModelProperty(value="用户登录")
    private Integer userLogin;

    /**
    * 每次登录
    */
    @ApiModelProperty(value="每次登录")
    private Integer everyLogin;

    /**
    * 用户发布
    */
    @ApiModelProperty(value="用户发布")
    private Integer userPublish;

    /**
    * 用户留言
    */
    @ApiModelProperty(value="用户留言")
    private Integer userMessage;

    /**
    * 用户卖出
    */
    @ApiModelProperty(value="用户卖出")
    private Integer userSell;

    /**
    * 用户收藏
    */
    @ApiModelProperty(value="用户收藏")
    private Integer userCollect;

    /**
    * 用户分享
    */
    @ApiModelProperty(value="用户分享")
    private Integer userShare;

    /**
    * 是否被撤销。默认为0
    */
    @ApiModelProperty(value="是否被撤销。默认为0")
    private Byte isDismissed;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
    * 修改时间
    */
    @ApiModelProperty(value="修改时间")
    private Date modifiedTime;

    private static final long serialVersionUID = 1L;
}
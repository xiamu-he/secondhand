package com.qzx.secondhand.model.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qzx
 * @create 2021-12-08 11:30
 * @function
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(description = "向前端展示的日常积分状态图")
public class DailyScoreRecordVO {
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
}

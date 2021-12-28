package com.qzx.secondhand.model.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qzx
 * @create 2021-12-08 11:13
 * @function
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(description = "向前端展示的首次积分状态图")
public class FirstScoreRecordVO {
    /**
     * 首次收藏
     */
    @ApiModelProperty(value="首次收藏")
    private Boolean firstCollection;

    /**
     * 首次发布卖品
     */
    @ApiModelProperty(value="首次发布卖品")
    private Boolean firstPublishSell;

    /**
     * 首次卖出
     */
    @ApiModelProperty(value="首次卖出")
    private Boolean firstSoldOut;

    /**
     * 首次分享
     */
    @ApiModelProperty(value="首次分享")
    private Boolean firstShare;

    /**
     * 首次检索
     */
    @ApiModelProperty(value="首次检索")
    private Boolean firstExplore;

    /**
     * 首次留言
     */
    @ApiModelProperty(value="首次留言")
    private Boolean firstMessage;
}

package com.qzx.secondhand.model.vo.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author qzx
 * @create 2021-12-09 15:05
 * @function
 */

@ApiModel(value = "trade_notification")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NotificationVO {
    /**
     * 消息ID
     */
    @ApiModelProperty(value = "消息ID")
    private Long notificationId;

    /**
     * 消息类型。1：交易类信息2：系统类信息
     */
    @ApiModelProperty(value = "消息类型。1：交易类信息2：系统类信息 ")
    private Integer typeHood;

    /**
     * 发送方Id
     */
    @ApiModelProperty(value = "发送方Id")
    private Long sender;

    /**
     * 发送者姓名
     */
    @ApiModelProperty(value = "发送者姓名")
    private String senderName;

    /**
     * 接收方ID
     */
    @ApiModelProperty(value = "接收方ID")
    private Long receiver;

    /**
     * 消息标题
     */
    @ApiModelProperty(value = "消息标题")
    private String title;

    /**
     * 消息内容
     */
    @ApiModelProperty(value = "消息内容")
    private String content;

    /**
     * 额外信息
     */
    @ApiModelProperty(value = "额外信息")
    private String extras;

    /**
     * 发送时间
     */
    @ApiModelProperty(value = "发送时间")
    private Date sendTime;
}

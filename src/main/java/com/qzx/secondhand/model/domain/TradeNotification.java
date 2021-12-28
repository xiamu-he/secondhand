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
 * @author qzx
 * @create 2021-12-09 14:45
 * @function
 */
@ApiModel(value = "trade_notification")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TradeNotification implements Serializable {
    /**
     * 消息ID
     */
    @ApiModelProperty(value = "消息ID")
    private Long id;

    @ApiModelProperty(value = "")
    private Long notificationId;

    @ApiModelProperty(value = "")
    private Integer cmd;

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

    @ApiModelProperty(value = "")
    private Date sendTime;

    /**
     * 是否已读。默认为0
     */
    @ApiModelProperty(value = "是否已读。默认为0")
    private Integer isReaded;

    @ApiModelProperty(value = "")
    private Integer isProcessed;

    /**
     * 用户是否注销。 默认为0，未注销
     */
    @ApiModelProperty(value = "用户是否注销。 默认为0，未注销")
    private Boolean isDismissed;

    /**
     * 发送时间
     */
    @ApiModelProperty(value = "发送时间")
    private Date createTime;

    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间")
    private Date modifyTime;

    @ApiModelProperty(value = "")
    private Date processedTime;

    @ApiModelProperty(value = "")
    private String processedResult;

    private static final long serialVersionUID = 1L;
}
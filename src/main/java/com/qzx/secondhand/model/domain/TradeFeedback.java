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
@create 2021-12-08 16:34
@function
*/
@ApiModel(value="系统问题反馈")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TradeFeedback implements Serializable {
    @ApiModelProperty(value="")
    private Long id;

    /**
    * 用户ID
    */
    @ApiModelProperty(value="用户ID")
    private Long userId;

    /**
    * 用户联系方式
    */
    @ApiModelProperty(value="用户联系方式")
    private String userContact;

    /**
    * 反馈内容
    */
    @ApiModelProperty(value="反馈内容")
    private String feedbackContent;

    /**
    * 是否被撤销。默认为0
    */
    @ApiModelProperty(value="是否被撤销。默认为0")
    private Boolean isDismissed;

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
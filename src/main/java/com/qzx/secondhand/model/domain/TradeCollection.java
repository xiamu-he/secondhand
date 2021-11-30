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
@create 2021-11-30 17:29
@function
*/
@ApiModel(value="trade_collection")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TradeCollection implements Serializable {
    /**
    * 收藏ID号
    */
    @ApiModelProperty(value="收藏ID号")
    private Long collectionId;

    /**
    * 用户id
    */
    @ApiModelProperty(value="用户id")
    private Long userId;

    /**
    * 产品ID
    */
    @ApiModelProperty(value="产品ID")
    private Long commodityId;

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
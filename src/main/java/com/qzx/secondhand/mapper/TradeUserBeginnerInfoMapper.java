package com.qzx.secondhand.mapper;

import com.qzx.secondhand.model.domain.TradeUserBeginnerInfo;

/**
@author qzx
@create 2021-12-08 11:07
@function
*/
public interface TradeUserBeginnerInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TradeUserBeginnerInfo record);

    int insertSelective(TradeUserBeginnerInfo record);

    TradeUserBeginnerInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TradeUserBeginnerInfo record);

    int updateByPrimaryKey(TradeUserBeginnerInfo record);
}
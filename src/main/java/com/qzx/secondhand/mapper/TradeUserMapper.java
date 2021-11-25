package com.qzx.secondhand.mapper;

import com.qzx.secondhand.domain.TradeUser;

/**
@author qzx
@create 2021-11-25 20:32
@function
*/
public interface TradeUserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(TradeUser record);

    int insertSelective(TradeUser record);

    TradeUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(TradeUser record);

    int updateByPrimaryKey(TradeUser record);
}
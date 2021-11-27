package com.qzx.secondhand.mapper;
import org.apache.ibatis.annotations.Param;

import com.qzx.secondhand.model.domain.TradeUser;

import java.util.List;

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
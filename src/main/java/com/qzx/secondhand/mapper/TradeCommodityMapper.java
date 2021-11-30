package com.qzx.secondhand.mapper;

import com.qzx.secondhand.model.domain.TradeCommodity;

/**
@author qzx
@create 2021-11-30 17:29
@function
*/
public interface TradeCommodityMapper {
    int deleteByPrimaryKey(Long commodityId);

    int insert(TradeCommodity record);

    int insertSelective(TradeCommodity record);

    TradeCommodity selectByPrimaryKey(Long commodityId);

    int updateByPrimaryKeySelective(TradeCommodity record);

    int updateByPrimaryKey(TradeCommodity record);
}
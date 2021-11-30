package com.qzx.secondhand.mapper;

import com.qzx.secondhand.model.domain.TradeCommodityClassification;

/**
@author qzx
@create 2021-11-30 17:29
@function
*/
public interface TradeCommodityClassificationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TradeCommodityClassification record);

    int insertSelective(TradeCommodityClassification record);

    TradeCommodityClassification selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TradeCommodityClassification record);

    int updateByPrimaryKey(TradeCommodityClassification record);
}
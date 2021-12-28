package com.qzx.secondhand.mapper;

import com.qzx.secondhand.model.domain.TradeFeedback;

/**
@author qzx
@create 2021-12-08 16:34
@function
*/
public interface TradeFeedbackMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TradeFeedback record);

    int insertSelective(TradeFeedback record);

    TradeFeedback selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TradeFeedback record);

    int updateByPrimaryKey(TradeFeedback record);
}
package com.qzx.secondhand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.qzx.secondhand.model.domain.TradeCommodityClassification;
import com.qzx.secondhand.mapper.TradeCommodityClassificationMapper;
/**
@author qzx
@create 2021-11-30 17:29
@function
*/
@Service
public class TradeCommodityClassificationService{

    @Autowired
    private TradeCommodityClassificationMapper tradeCommodityClassificationMapper;

    
    public int deleteByPrimaryKey(Long id) {
        return tradeCommodityClassificationMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(TradeCommodityClassification record) {
        return tradeCommodityClassificationMapper.insert(record);
    }

    
    public int insertSelective(TradeCommodityClassification record) {
        return tradeCommodityClassificationMapper.insertSelective(record);
    }

    
    public TradeCommodityClassification selectByPrimaryKey(Long id) {
        return tradeCommodityClassificationMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(TradeCommodityClassification record) {
        return tradeCommodityClassificationMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(TradeCommodityClassification record) {
        return tradeCommodityClassificationMapper.updateByPrimaryKey(record);
    }

}

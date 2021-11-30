package com.qzx.secondhand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.qzx.secondhand.mapper.TradeCommodityMapper;
import com.qzx.secondhand.model.domain.TradeCommodity;
/**
@author qzx
@create 2021-11-30 17:29
@function
*/
@Service
public class TradeCommodityService{

    @Autowired
    private TradeCommodityMapper tradeCommodityMapper;

    
    public int deleteByPrimaryKey(Long commodityId) {
        return tradeCommodityMapper.deleteByPrimaryKey(commodityId);
    }

    
    public int insert(TradeCommodity record) {
        return tradeCommodityMapper.insert(record);
    }

    
    public int insertSelective(TradeCommodity record) {
        return tradeCommodityMapper.insertSelective(record);
    }

    
    public TradeCommodity selectByPrimaryKey(Long commodityId) {
        return tradeCommodityMapper.selectByPrimaryKey(commodityId);
    }

    
    public int updateByPrimaryKeySelective(TradeCommodity record) {
        return tradeCommodityMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(TradeCommodity record) {
        return tradeCommodityMapper.updateByPrimaryKey(record);
    }

}

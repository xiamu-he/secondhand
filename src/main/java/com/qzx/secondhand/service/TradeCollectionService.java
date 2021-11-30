package com.qzx.secondhand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.qzx.secondhand.model.domain.TradeCollection;
import com.qzx.secondhand.mapper.TradeCollectionMapper;
/**
@author qzx
@create 2021-11-30 17:29
@function
*/
@Service
public class TradeCollectionService{

    @Autowired
    private TradeCollectionMapper tradeCollectionMapper;

    
    public int deleteByPrimaryKey(Long collectionId) {
        return tradeCollectionMapper.deleteByPrimaryKey(collectionId);
    }

    
    public int insert(TradeCollection record) {
        return tradeCollectionMapper.insert(record);
    }

    
    public int insertSelective(TradeCollection record) {
        return tradeCollectionMapper.insertSelective(record);
    }

    
    public TradeCollection selectByPrimaryKey(Long collectionId) {
        return tradeCollectionMapper.selectByPrimaryKey(collectionId);
    }

    
    public int updateByPrimaryKeySelective(TradeCollection record) {
        return tradeCollectionMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(TradeCollection record) {
        return tradeCollectionMapper.updateByPrimaryKey(record);
    }

}

package com.qzx.secondhand.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.qzx.secondhand.model.domain.TradeCollection;

/**
 * @author qzx
 * @create 2021-11-29 23:18
 * @function
 */
@Service
public class TradeCollectionService {

    @Resource
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



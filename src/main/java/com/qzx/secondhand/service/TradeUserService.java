package com.qzx.secondhand.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.qzx.secondhand.model.domain.TradeUser;
import com.qzx.secondhand.mapper.TradeUserMapper;

import java.util.List;

/**
@author qzx
@create 2021-11-25 20:32
@function
*/
@Service
public class TradeUserService{

    @Resource
    private TradeUserMapper tradeUserMapper;

    public int deleteByPrimaryKey(Long userId) {
        return tradeUserMapper.deleteByPrimaryKey(userId);
    }

    
    public int insert(TradeUser record) {
        return tradeUserMapper.insert(record);
    }

    
    public int insertSelective(TradeUser record) {
        return tradeUserMapper.insertSelective(record);
    }

    
    public TradeUser selectByPrimaryKey(Long userId) {
        return tradeUserMapper.selectByPrimaryKey(userId);
    }

    
    public int updateByPrimaryKeySelective(TradeUser record) {
        return tradeUserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(TradeUser record) {
        return tradeUserMapper.updateByPrimaryKey(record);
    }
}

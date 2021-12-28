package com.qzx.secondhand.service;

import com.qzx.secondhand.exception.result.Result;
import com.qzx.secondhand.exception.statusCode.GlobalCodeEnum;
import com.qzx.secondhand.model.vo.user.FirstScoreRecordVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.qzx.secondhand.model.domain.TradeUserBeginnerInfo;
import com.qzx.secondhand.mapper.TradeUserBeginnerInfoMapper;
/**
@author qzx
@create 2021-12-08 11:07
@function
*/
@Service
public class TradeUserBeginnerInfoService{

    @Resource
    private TradeUserBeginnerInfoMapper tradeUserBeginnerInfoMapper;

    
    public int deleteByPrimaryKey(Long id) {
        return tradeUserBeginnerInfoMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(TradeUserBeginnerInfo record) {
        return tradeUserBeginnerInfoMapper.insert(record);
    }

    
    public int insertSelective(TradeUserBeginnerInfo record) {
        return tradeUserBeginnerInfoMapper.insertSelective(record);
    }

    
    public Result selectByPrimaryKey(Long id) {
        TradeUserBeginnerInfo tradeUserBeginnerInfo = tradeUserBeginnerInfoMapper.selectByPrimaryKey(id);
        if(tradeUserBeginnerInfo == null){
            return Result.error(GlobalCodeEnum.USER_NOT_EXIST);
        }
        FirstScoreRecordVO firstScoreRecordVO=new FirstScoreRecordVO();
        BeanUtils.copyProperties(tradeUserBeginnerInfo,firstScoreRecordVO);
        return Result.success(firstScoreRecordVO);
    }

    
    public int updateByPrimaryKeySelective(TradeUserBeginnerInfo record) {
        return tradeUserBeginnerInfoMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(TradeUserBeginnerInfo record) {
        return tradeUserBeginnerInfoMapper.updateByPrimaryKey(record);
    }

}

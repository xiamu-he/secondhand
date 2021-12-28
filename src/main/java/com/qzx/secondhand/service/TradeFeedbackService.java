package com.qzx.secondhand.service;

import com.alibaba.fastjson.JSONObject;
import com.qzx.secondhand.exception.result.Result;
import com.qzx.secondhand.exception.statusCode.GlobalCodeEnum;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.qzx.secondhand.model.domain.TradeFeedback;
import com.qzx.secondhand.mapper.TradeFeedbackMapper;
/**
@author qzx
@create 2021-12-08 16:34
@function
*/
@Service
public class TradeFeedbackService{

    @Resource
    private TradeFeedbackMapper tradeFeedbackMapper;

    
    public int deleteByPrimaryKey(Long id) {
        return tradeFeedbackMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(TradeFeedback record) {
        return tradeFeedbackMapper.insert(record);
    }

    
    public Result insertSelective(JSONObject jsonObject) {
        TradeFeedback tradeFeedback = JSONObject.toJavaObject(jsonObject, TradeFeedback.class);
        int i = tradeFeedbackMapper.insertSelective(tradeFeedback);
        if(i>0){
            return Result.success();
        }
        return Result.error(GlobalCodeEnum.INSERT_FAIL);
    }

    
    public TradeFeedback selectByPrimaryKey(Long id) {
        return tradeFeedbackMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(TradeFeedback record) {
        return tradeFeedbackMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(TradeFeedback record) {
        return tradeFeedbackMapper.updateByPrimaryKey(record);
    }

}

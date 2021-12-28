package com.qzx.secondhand.service;

import com.qzx.secondhand.exception.result.Result;
import com.qzx.secondhand.exception.statusCode.GlobalCodeEnum;
import com.qzx.secondhand.model.vo.user.DailyScoreRecordVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.qzx.secondhand.model.domain.UserDailyScore;
import com.qzx.secondhand.mapper.UserDailyScoreMapper;
/**
@author qzx
@create 2021-12-08 11:07
@function
*/
@Service
public class UserDailyScoreService{

    @Resource
    private UserDailyScoreMapper userDailyScoreMapper;

    
    public int deleteByPrimaryKey(Long id) {
        return userDailyScoreMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(UserDailyScore record) {
        return userDailyScoreMapper.insert(record);
    }

    
    public int insertSelective(UserDailyScore record) {
        return userDailyScoreMapper.insertSelective(record);
    }

    
    public Result selectByPrimaryKey(Long id) {
        UserDailyScore userDailyScore = userDailyScoreMapper.selectByUserId(id);
        if(userDailyScore == null){
            return Result.error(GlobalCodeEnum.USER_NOT_EXIST);
        }
        DailyScoreRecordVO dailyScoreRecordVO = new DailyScoreRecordVO();
        BeanUtils.copyProperties(userDailyScore,dailyScoreRecordVO);
        return Result.success(dailyScoreRecordVO);
    }

    
    public int updateByPrimaryKeySelective(UserDailyScore record) {
        return userDailyScoreMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserDailyScore record) {
        return userDailyScoreMapper.updateByPrimaryKey(record);
    }

}

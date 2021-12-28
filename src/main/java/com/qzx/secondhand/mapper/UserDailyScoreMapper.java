package com.qzx.secondhand.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.qzx.secondhand.model.domain.UserDailyScore;

/**
@author qzx
@create 2021-12-08 11:07
@function
*/
public interface UserDailyScoreMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserDailyScore record);

    int insertSelective(UserDailyScore record);

    UserDailyScore selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserDailyScore record);

    int updateByPrimaryKey(UserDailyScore record);

    UserDailyScore selectByUserId(@Param("userId")Long userId);
}
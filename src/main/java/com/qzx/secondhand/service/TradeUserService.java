package com.qzx.secondhand.service;

import com.qzx.secondhand.exception.handler.UserDefinedException;
import com.qzx.secondhand.exception.result.Result;
import com.qzx.secondhand.exception.statusCode.GlobalCodeEnum;
import com.qzx.secondhand.mapper.TradeUserMapper;
import com.qzx.secondhand.model.vo.user.UserDetailInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.qzx.secondhand.model.domain.TradeUser;

/**
 * @author qzx
 * @create 2021-11-25 20:32
 * @function
 */
@Service
public class TradeUserService {

    @Autowired
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

    public Result selectByPrimaryKey(Long userId) {
        if (tradeUserMapper.selectByPrimaryKey(userId) == null) {
            throw new UserDefinedException(GlobalCodeEnum.USER_NOT_EXIST);
        }
        return Result.success(tradeUserMapper.selectByPrimaryKey(userId));
    }


    public int updateByPrimaryKeySelective(TradeUser record) {
        return tradeUserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(TradeUser record) {
        return tradeUserMapper.updateByPrimaryKey(record);
    }

    public Result getPersonInfoDetail(Long id) {
        TradeUser tradeUser = tradeUserMapper.selectByPrimaryKey(id);
        if (tradeUser == null) {
            throw new UserDefinedException(GlobalCodeEnum.USER_NOT_EXIST);
        }
        UserDetailInfo userDetailInfo = new UserDetailInfo();
        BeanUtils.copyProperties(tradeUser, userDetailInfo);
        return Result.success(userDetailInfo);
    }
}



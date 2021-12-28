package com.qzx.secondhand.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qzx.secondhand.exception.result.Result;
import com.qzx.secondhand.exception.statusCode.GlobalCodeEnum;
import com.qzx.secondhand.model.domain.TradeNotification;
import com.qzx.secondhand.model.vo.user.NotificationVO;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

import com.qzx.secondhand.mapper.TradeNotificationMapper;

import java.util.List;

/**
 * @author qzx
 * @create 2021-12-09 14:43
 * @function
 */
@Service
public class TradeNotificationService {

    @Resource
    private TradeNotificationMapper tradeNotificationMapper;


    public int deleteByPrimaryKey(Long id) {
        return tradeNotificationMapper.deleteByPrimaryKey(id);
    }


    public int insert(TradeNotification record) {
        return tradeNotificationMapper.insert(record);
    }


    public int insertSelective(TradeNotification record) {
        return tradeNotificationMapper.insertSelective(record);
    }


    public TradeNotification selectByPrimaryKey(Long id) {
        return tradeNotificationMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(TradeNotification record) {
        return tradeNotificationMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(TradeNotification record) {
        return tradeNotificationMapper.updateByPrimaryKey(record);
    }

    public Result selectByReceiverwithPage(int page, int pageSize, Long receiver,Integer isReaded) {
        PageHelper.startPage(page, pageSize);
        List<NotificationVO> list = new PageInfo<>(tradeNotificationMapper.selectByReceiver(receiver,isReaded)).getList();
        return Result.success(list);
    }

    public Result updateIsReadedByNotificationId(Long notificationId) {
        int i = tradeNotificationMapper.updateIsReadedByNotificationId(notificationId);
        if(i>0){
            return Result.success();
        }
        return Result.error(GlobalCodeEnum.UPDATE_FAIL);
    }

    public Result updateIsDismissedByNotificationId(Long notificationId) {
        int i = tradeNotificationMapper.updateIsDismissedByNotificationId(notificationId);
        if(i>0){
            return Result.success();
        }
        return Result.error(GlobalCodeEnum.DALETE_FAIL);
    }
}



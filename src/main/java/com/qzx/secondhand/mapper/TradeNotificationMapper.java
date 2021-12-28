package com.qzx.secondhand.mapper;

import com.qzx.secondhand.model.vo.user.NotificationVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

import com.qzx.secondhand.model.domain.TradeNotification;

/**
 * @author qzx
 * @create 2021-12-09 14:45
 * @function
 */
public interface TradeNotificationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TradeNotification record);

    int insertSelective(TradeNotification record);

    TradeNotification selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TradeNotification record);

    int updateByPrimaryKey(TradeNotification record);

    List<NotificationVO> selectByReceiver(@Param("receiver") Long receiver, @Param("isReaded") Integer isReaded);

    int updateIsReadedByNotificationId(@Param("notificationId")Long notificationId);

    int updateIsDismissedByNotificationId(@Param("notificationId")Long notificationId);
}
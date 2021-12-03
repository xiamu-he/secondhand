package com.qzx.secondhand.mapper;

import com.qzx.secondhand.model.domain.TradeDesireProduct;
import com.qzx.secondhand.model.vo.user.DesireProductVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author qzx
 * @create 2021-12-02 12:02
 * @function
 */
public interface TradeDesireProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TradeDesireProduct record);

    int insertSelective(TradeDesireProduct record);

    TradeDesireProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TradeDesireProduct record);

    int updateByPrimaryKey(TradeDesireProduct record);


    List<DesireProductVO> selectDesireProductVO(@Param("id") Long id, @Param("expired") Boolean expired);
}
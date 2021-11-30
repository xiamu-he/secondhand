package com.qzx.secondhand.mapper;

import com.qzx.secondhand.model.domain.TradeCollection;
import com.qzx.secondhand.model.vo.user.CollectionVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author qzx
 * @create 2021-11-30 17:29
 * @function
 */
public interface TradeCollectionMapper {
    int deleteByPrimaryKey(Long collectionId);

    int insert(TradeCollection record);

    int insertSelective(TradeCollection record);

    TradeCollection selectByPrimaryKey(Long collectionId);

    int updateByPrimaryKeySelective(TradeCollection record);

    int updateByPrimaryKey(TradeCollection record);

    List<CollectionVO> selectCollectionVoJoin(@Param("id") Long id);
}
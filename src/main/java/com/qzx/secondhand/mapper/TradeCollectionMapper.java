package com.qzx.secondhand.mapper;

import com.qzx.secondhand.model.domain.TradeCollection;
import com.qzx.secondhand.model.vo.user.CollectionVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author qzx
 * @create 2021-11-29 23:28
 * @function
 */
public interface TradeCollectionMapper {
    /**
     * delete by primary key
     *
     * @param collectionId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long collectionId);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(TradeCollection record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TradeCollection record);

    /**
     * select by primary key
     *
     * @param collectionId primary key
     * @return object by primary key
     */
    TradeCollection selectByPrimaryKey(Long collectionId);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TradeCollection record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TradeCollection record);
}
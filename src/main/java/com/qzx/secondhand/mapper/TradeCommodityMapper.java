package com.qzx.secondhand.mapper;

import com.qzx.secondhand.model.domain.TradeCommodity;

/**
@author qzx
@create 2021-11-29 23:28
@function
*/
public interface TradeCommodityMapper {
    /**
     * delete by primary key
     * @param commodityId primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long commodityId);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(TradeCommodity record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TradeCommodity record);

    /**
     * select by primary key
     * @param commodityId primary key
     * @return object by primary key
     */
    TradeCommodity selectByPrimaryKey(Long commodityId);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TradeCommodity record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TradeCommodity record);
}
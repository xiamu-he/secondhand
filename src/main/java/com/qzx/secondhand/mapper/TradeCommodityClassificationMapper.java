package com.qzx.secondhand.mapper;

import com.qzx.secondhand.model.domain.TradeCommodityClassification;

/**
@author qzx
@create 2021-11-29 23:28
@function
*/
public interface TradeCommodityClassificationMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(TradeCommodityClassification record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TradeCommodityClassification record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TradeCommodityClassification selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TradeCommodityClassification record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TradeCommodityClassification record);
}
package com.qzx.secondhand.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.qzx.secondhand.model.domain.TradeCommodityClassification;

/**
 * @author qzx
 * @create 2021-11-29 23:18
 * @function
 */
@Service
public class TradeCommodityClassificationService {

    @Resource
    private TradeCommodityClassificationMapper tradeCommodityClassificationMapper;


    public int deleteByPrimaryKey(Long id) {
        return tradeCommodityClassificationMapper.deleteByPrimaryKey(id);
    }


    public int insert(TradeCommodityClassification record) {
        return tradeCommodityClassificationMapper.insert(record);
    }


    public int insertSelective(TradeCommodityClassification record) {
        return tradeCommodityClassificationMapper.insertSelective(record);
    }


    public TradeCommodityClassification selectByPrimaryKey(Long id) {
        return tradeCommodityClassificationMapper.selectByPrimaryKey(id);
    }


    public int updateByPrimaryKeySelective(TradeCommodityClassification record) {
        return tradeCommodityClassificationMapper.updateByPrimaryKeySelective(record);
    }


    public int updateByPrimaryKey(TradeCommodityClassification record) {
        return tradeCommodityClassificationMapper.updateByPrimaryKey(record);
    }

}



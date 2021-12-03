package com.qzx.secondhand.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qzx.secondhand.exception.result.Result;
import com.qzx.secondhand.mapper.TradeCommodityMapper;
import com.qzx.secondhand.model.vo.user.CommodityVO;
import com.qzx.secondhand.model.vo.user.DesireProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.qzx.secondhand.model.domain.TradeDesireProduct;
import com.qzx.secondhand.mapper.TradeDesireProductMapper;

import java.util.List;

/**
@author qzx
@create 2021-12-02 12:02
@function
*/
@Service
public class TradeDesireProductService{

    @Autowired
    private TradeDesireProductMapper tradeDesireProductMapper;

    @Autowired
    private TradeCommodityMapper tradeCommodityMapper;

    
    public int deleteByPrimaryKey(Long id) {
        return tradeDesireProductMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(TradeDesireProduct record) {
        return tradeDesireProductMapper.insert(record);
    }

    
    public int insertSelective(TradeDesireProduct record) {
        return tradeDesireProductMapper.insertSelective(record);
    }

    
    public TradeDesireProduct selectByPrimaryKey(Long id) {
        return tradeDesireProductMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(TradeDesireProduct record) {
        return tradeDesireProductMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(TradeDesireProduct record) {
        return tradeDesireProductMapper.updateByPrimaryKey(record);
    }

    public Result selectDesireProductVOwithPage(int page, int pageSize, Long id,Boolean expired) {
        PageHelper.startPage(page, pageSize);
        return Result.success(new PageInfo<DesireProductVO>(tradeDesireProductMapper.selectDesireProductVO(id,expired)).getList());
        //return Result.success(new PageInfo<CommodityVO>(tradeCommodityMapper.selectCommodityVoJoin(id, expired)).getList());

    }
}

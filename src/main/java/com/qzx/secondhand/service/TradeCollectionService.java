package com.qzx.secondhand.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qzx.secondhand.exception.result.Result;
import com.qzx.secondhand.model.vo.user.CollectionVO;
import com.qzx.secondhand.util.file.PictureUtils;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.qzx.secondhand.model.domain.TradeCollection;
import com.qzx.secondhand.mapper.TradeCollectionMapper;

import java.util.List;

/**
@author qzx
@create 2021-11-30 17:29
@function
*/
@Service
public class TradeCollectionService{

    @Autowired
    private TradeCollectionMapper tradeCollectionMapper;

    
    public int deleteByPrimaryKey(Long collectionId) {
        return tradeCollectionMapper.deleteByPrimaryKey(collectionId);
    }

    
    public int insert(TradeCollection record) {
        return tradeCollectionMapper.insert(record);
    }

    
    public int insertSelective(TradeCollection record) {
        return tradeCollectionMapper.insertSelective(record);
    }

    
    public TradeCollection selectByPrimaryKey(Long collectionId) {
        return tradeCollectionMapper.selectByPrimaryKey(collectionId);
    }

    
    public int updateByPrimaryKeySelective(TradeCollection record) {
        return tradeCollectionMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(TradeCollection record) {
        return tradeCollectionMapper.updateByPrimaryKey(record);
    }

    public List<CollectionVO> selectCollectionVoJoin(Long id) {
        return tradeCollectionMapper.selectCollectionVoJoin(id);
    }

    public Result selectCollectionVoJoinwithPage(Integer page, Integer pageSize, Long id) {
        PageHelper.startPage(page, pageSize);
        List<CollectionVO> collectionVOList = new PageInfo<CollectionVO>(tradeCollectionMapper.selectCollectionVoJoin(id)).getList();
        for(CollectionVO collectionVO:collectionVOList){
            collectionVO.setCommodityAvatarList(PictureUtils.Picturestr2List(collectionVO.getCommodityAvatar()));
        }
        return Result.success(collectionVOList);
    }
}

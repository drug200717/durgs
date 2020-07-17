package com.durgs.dao;

import com.durgs.entity.hpurchase;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface hpurchaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(hpurchase record);

    int insertSelective(hpurchase record);

    hpurchase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(hpurchase record);

    int updateByPrimaryKey(hpurchase record);
}
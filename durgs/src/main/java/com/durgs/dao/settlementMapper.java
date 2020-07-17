package com.durgs.dao;

import com.durgs.entity.settlement;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface settlementMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(settlement record);

    int insertSelective(settlement record);

    settlement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(settlement record);

    int updateByPrimaryKey(settlement record);
}
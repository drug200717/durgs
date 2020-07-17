package com.durgs.dao;

import com.durgs.entity.settlementdetailed;
@Mapper
public interface settlementdetailedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(settlementdetailed record);

    int insertSelective(settlementdetailed record);

    settlementdetailed selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(settlementdetailed record);

    int updateByPrimaryKey(settlementdetailed record);
}
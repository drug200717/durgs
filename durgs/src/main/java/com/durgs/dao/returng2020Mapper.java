package com.durgs.dao;

import com.durgs.entity.returng2020;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface returng2020Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(returng2020 record);

    int insertSelective(returng2020 record);

    returng2020 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(returng2020 record);

    int updateByPrimaryKey(returng2020 record);
}
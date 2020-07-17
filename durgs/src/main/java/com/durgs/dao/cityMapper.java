package com.durgs.dao;

import com.durgs.entity.city;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface cityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(city record);

    int insertSelective(city record);

    city selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(city record);

    int updateByPrimaryKey(city record);
}
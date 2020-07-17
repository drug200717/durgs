package com.durgs.dao;

import com.durgs.entity.address_city;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface address_cityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(address_city record);

    int insertSelective(address_city record);

    address_city selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(address_city record);

    int updateByPrimaryKey(address_city record);
}
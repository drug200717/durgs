package com.durgs.dao;

import com.durgs.entity.address_province;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface address_provinceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(address_province record);

    int insertSelective(address_province record);

    address_province selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(address_province record);

    int updateByPrimaryKey(address_province record);
}
package com.durgs.dao;

import com.durgs.entity.supplier;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface supplierMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(supplier record);

    int insertSelective(supplier record);

    supplier selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(supplier record);

    int updateByPrimaryKey(supplier record);
}
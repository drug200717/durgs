package com.durgs.dao;

import com.durgs.entity.supervisory;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface supervisoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(supervisory record);

    int insertSelective(supervisory record);

    supervisory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(supervisory record);

    int updateByPrimaryKey(supervisory record);
}
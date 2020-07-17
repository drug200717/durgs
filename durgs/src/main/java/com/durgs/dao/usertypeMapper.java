package com.durgs.dao;

import com.durgs.entity.usertype;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface usertypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(usertype record);

    int insertSelective(usertype record);

    usertype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(usertype record);

    int updateByPrimaryKey(usertype record);
}
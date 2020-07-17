package com.durgs.dao;

import com.durgs.entity.address_town;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface address_townMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(address_town record);

    int insertSelective(address_town record);

    address_town selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(address_town record);

    int updateByPrimaryKey(address_town record);
}
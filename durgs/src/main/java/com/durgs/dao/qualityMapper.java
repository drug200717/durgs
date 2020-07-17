package com.durgs.dao;

import com.durgs.entity.quality;
@Mapper
public interface qualityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(quality record);

    int insertSelective(quality record);

    quality selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(quality record);

    int updateByPrimaryKey(quality record);
}
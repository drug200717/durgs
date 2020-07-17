package com.durgs.dao;

import com.durgs.entity.returng;
@Mapper
public interface returngMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(returng record);

    int insertSelective(returng record);

    returng selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(returng record);

    int updateByPrimaryKey(returng record);
}
package com.durgs.dao;

import com.durgs.entity.drugs;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface drugsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(drugs record);

    int insertSelective(drugs record);

    drugs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(drugs record);

    int updateByPrimaryKey(drugs record);
}
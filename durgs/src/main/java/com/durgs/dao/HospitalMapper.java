package com.durgs.dao;

import com.durgs.entity.Hospital;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HospitalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    Hospital selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);
}
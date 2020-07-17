package com.durgs.dao;

import com.durgs.entity.purchase;
@Mapper
public interface purchaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(purchase record);

    int insertSelective(purchase record);

    purchase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(purchase record);

    int updateByPrimaryKey(purchase record);
}
package com.durgs.dao;

import com.durgs.entity.purchase_order;
@Mapper
public interface purchase_orderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(purchase_order record);

    int insertSelective(purchase_order record);

    purchase_order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(purchase_order record);

    int updateByPrimaryKey(purchase_order record);
}
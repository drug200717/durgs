package com.durgs.service.impl;

import com.durgs.dao.HospitalMapper;
import com.durgs.entity.Hospital;
import com.durgs.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Resource
    private HospitalMapper hospitalMapper;

    @Override
    public Hospital queryById(Integer id) {
        Hospital hospital = hospitalMapper.selectByPrimaryKey(id);
        return hospital;
    }
}

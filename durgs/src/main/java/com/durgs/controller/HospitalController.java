package com.durgs.controller;

import com.alibaba.fastjson.JSON;
import com.durgs.entity.Hospital;
import com.durgs.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @RequestMapping(value = "gethospitalList")
    @ResponseBody
    public String getList(){
        Integer id = 1;
        Hospital list = hospitalService.queryById(id);
        return JSON.toJSONString(list);
    }
}

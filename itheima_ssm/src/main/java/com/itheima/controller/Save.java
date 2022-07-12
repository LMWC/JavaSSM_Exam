package com.itheima.controller;

import com.itheima.domain.Dept;
import com.itheima.domain.Patient;
import com.itheima.service.HospitalService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/save")
public class Save {

    @Autowired
    private HospitalService hospitalService;

    //查询所有科室名称与科室id
    //返回json进行遍历
    @RequestMapping("/findAllDept")
    @ResponseBody
    public List<Dept> findAllDept(){
        System.out.println(hospitalService.findAllDept());
       return hospitalService.findAllDept();
    }

    //保存病人信息  然后返回挂号页面
    @RequestMapping("/savePatient")
    public String savePatient(Patient patient){
        hospitalService.savePatient(patient);
        return "subscribe-form";
    }

    //结合输入框内容进行查询,判断输入框内容有无,在sql上加上where,然后返回ModelAndView
    @RequestMapping("/findAllPatient")
    public ModelAndView findAllPatient(String pname) {
        ModelAndView modelAndView = new ModelAndView();
        List<Patient> patientList = hospitalService.findAllPatient(pname);
        modelAndView.setViewName("patients-list");
        System.out.println(patientList);
        modelAndView.addObject("list", patientList);
        return modelAndView;
    }
}

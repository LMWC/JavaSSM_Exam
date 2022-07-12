package com.itheima.service.impl;

import com.itheima.domain.Dept;
import com.itheima.domain.Patient;
import com.itheima.mapper.HospitalMapper;
import com.itheima.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalMapper mapper;

    @Override
    public List<Dept> findAllDept() {
        return mapper.findAllDept();
    }

    @Override
    public void savePatient(Patient patient) {
        mapper.savePatient(patient);
    }

    @Override
    public List<Patient> findAllPatient(String pname) {
        return mapper.findAllPatient(pname);
    }
}

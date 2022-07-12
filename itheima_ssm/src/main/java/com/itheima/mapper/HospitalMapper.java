package com.itheima.mapper;

import com.itheima.domain.Dept;
import com.itheima.domain.Patient;

import java.util.List;

public interface HospitalMapper {
    List<Dept> findAllDept();

    void savePatient(Patient patient);

    List<Patient> findAllPatient(String pname);
}

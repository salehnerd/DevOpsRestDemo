package com.fapi.restdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fapi.restdemo.model.SmEmpInfo;

//Repository Layer
public interface EmpCloudRepository extends JpaRepository<SmEmpInfo, String>{

}

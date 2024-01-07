package com.fapi.restdemo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.fapi.restdemo.model.SmEmpInfo;
import com.fapi.restdemo.repository.EmpCloudRepository;
import com.fapi.restdemo.service.EmpCloudService;

@Service
public class EmpCloudServiceImpl implements EmpCloudService{

	//Now EmpCloudRepository layer interacting with Service Layer
	EmpCloudRepository empcloudrepository;
	
	public EmpCloudServiceImpl(EmpCloudRepository empcloudrepository) {
		this.empcloudrepository = empcloudrepository;
	}

	//Whatever comes in this SmEmpInfo should be saved in the DB
	@Override
	public String createSmEmpInfo(SmEmpInfo smi) {
		// TODO Auto-generated method stub
		//Business Logic 1
		empcloudrepository.save(smi);
		return "Success Crated and Saved";
	}

	@Override
	public String updateSmEmpInfo(SmEmpInfo smi) {
		// TODO Auto-generated method stub
		//Business Logic 2
		empcloudrepository.save(smi);
		return "Success Updated and Saved";
	}

	@Override
	public String deleteSmEmpInfo(String employId) {
		// TODO Auto-generated method stub
		//Business Logic 3
		empcloudrepository.deleteById(employId);
		return "Success Deleted";
	}

	@Override
	public SmEmpInfo getSmEmpInfo(String employId) {
		// TODO Auto-generated method stub
		//Business Logic 4
		return empcloudrepository.findById(employId).get();
	}

	@Override
	public List<SmEmpInfo> getAllSmEmpInfo() {
		// TODO Auto-generated method stub
		//Business Logic 5
		return empcloudrepository.findAll();
	}

}

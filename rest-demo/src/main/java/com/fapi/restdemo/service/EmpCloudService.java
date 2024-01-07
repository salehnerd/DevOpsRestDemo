package com.fapi.restdemo.service;

import java.util.List;

import com.fapi.restdemo.model.SmEmpInfo;

//Service Or Business Layer
public interface EmpCloudService {
	
	public String createSmEmpInfo(SmEmpInfo smi);
	public String updateSmEmpInfo(SmEmpInfo smi);
	public String deleteSmEmpInfo(String employId);
	public SmEmpInfo getSmEmpInfo(String employId);
	public List<SmEmpInfo> getAllSmEmpInfo();

	

}

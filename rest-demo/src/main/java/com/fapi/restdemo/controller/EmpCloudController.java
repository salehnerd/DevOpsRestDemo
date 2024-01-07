package com.fapi.restdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fapi.restdemo.model.SmEmpInfo;
import com.fapi.restdemo.service.EmpCloudService;




//Controller Layer


@RestController
@RequestMapping("/smempinfo")
public class EmpCloudController {
	
	EmpCloudService empCloudService;
	
	
	

	public EmpCloudController(EmpCloudService empCloudService) {
		this.empCloudService = empCloudService;
		
		
	}
	// Read Specific Cloud Emp Info Details from DB
	@GetMapping("{employId}")
	public SmEmpInfo getSmEmpInfoDetails(@PathVariable("employId") String employId)
	{
		return empCloudService.getSmEmpInfo(employId);
				
	}
	

	// Read All Cloud Emp Info Details from DB
	@GetMapping()
	public List<SmEmpInfo> getAllSmEmpInfoDetails()
	{
		return empCloudService.getAllSmEmpInfo();
				
	}
	
	
	//any creation request will arrive with Post Method this MTHOD will Executed
	@PostMapping
	public String createEmpInfo(@RequestBody SmEmpInfo smi) {
		
		empCloudService.createSmEmpInfo(smi);
		return "Emp Created Sussfuly";
	}
	


	@PutMapping
	public String updateEmpInfo(@RequestBody SmEmpInfo smi) {
	
		empCloudService.updateSmEmpInfo(smi);
		return "Emp Updated Sussfuly";
	
}
	@DeleteMapping("{employId}")
	public String deletedEmpInfo(@PathVariable("employId") String employId) {
		
		empCloudService.deleteSmEmpInfo(employId);
		return "Emp Delete Sussfuly";
	
}
	

	}
	

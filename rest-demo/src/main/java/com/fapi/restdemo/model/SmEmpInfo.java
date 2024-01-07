package com.fapi.restdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sm_emp_info")
public class SmEmpInfo {

	@Id
	private String employId;
	private String employName;
	private String employGender;
	private String employPhoneNum;
	
	
	public SmEmpInfo(String employId, String employName, String employGender, String employPhoneNum) {
		this.employId = employId;
		this.employName = employName;
		this.employGender = employGender;
		this.employPhoneNum = employPhoneNum;
	}
	
	public SmEmpInfo() {

}
	public String getEmployId() {
		return employId;
	}


	public void setEmployId(String employId) {
		this.employId = employId;
	}


	public String getEmployName() {
		return employName;
	}


	public void setEmployName(String employName) {
		this.employName = employName;
	}


	public String getEmployGender() {
		return employGender;
	}


	public void setEmployGender(String employGender) {
		this.employGender = employGender;
	}


	public String getEmployPhoneNum() {
		return employPhoneNum;
	}


	public void setEmployPhoneNum(String employPhoneNum) {
		this.employPhoneNum = employPhoneNum;
	}


	
	
}

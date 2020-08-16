package com.entity;

public class EmployeeEntity {

	private String empName;
	private AddressEntity empAddress;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public AddressEntity getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(AddressEntity empAddress) {
		this.empAddress = empAddress;
	}
	
}

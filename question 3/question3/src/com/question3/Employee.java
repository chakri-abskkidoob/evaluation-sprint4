package com.question3;

import java.io.Serializable;

public class Employee implements Serializable{
	private int empId;
	private String empName;
	private Object address;
	private String email;
	private String password;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Object getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, String string, String email, String password) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = string;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + ", email=" + email
				+ ", password=" + password + "]";
	}
	void funA() {	
		System.out.println("Inside funA of employee");
	}
	
}

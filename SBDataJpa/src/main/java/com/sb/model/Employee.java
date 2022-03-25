package com.sb.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




@Entity
@Table(name = "employees")
//@JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler","fileHandler"})
public class Employee{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empId;
	private String empName;
	private String empMail;
	private double empSalary;
	
	public Employee(Long empId, String empName, String empMail, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empMail = empMail;
		this.empSalary = empSalary;
	}
	public Employee(String empName, String empMail, double empSalary) {
		this.empName = empName;
		this.empMail = empMail;
		this.empSalary = empSalary;
	}
	public Employee() {
		
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpMail() {
		return empMail;
	}
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empMail=" + empMail + ", empSalary=" + empSalary
				+ "]";
	}
	
	
	
	
	
}

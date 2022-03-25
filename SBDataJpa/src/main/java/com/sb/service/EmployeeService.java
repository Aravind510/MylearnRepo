package com.sb.service;

import com.sb.model.Employee;

public interface EmployeeService {
	
	public Employee saveEmployee(Employee emp);
	
	public Employee getEmployee(long empId);
	
	public Employee updateEmployee(Employee emp);

}

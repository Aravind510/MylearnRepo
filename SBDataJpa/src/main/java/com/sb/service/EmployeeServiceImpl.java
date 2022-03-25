package com.sb.service;


import org.springframework.stereotype.Service;

import com.sb.model.Employee;
import com.sb.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository empRepo;
	
	public EmployeeServiceImpl(EmployeeRepository empRepo) {
		this.empRepo = empRepo;
	}



	@Override
	public Employee saveEmployee(Employee emp) {
		
		return empRepo.save(emp);
	}

	@Override
	public Employee getEmployee(long empId) {
		
		return empRepo.findById(empId).orElse(null);
	}
	

	@Override
	public Employee updateEmployee(Employee emp) {
		
		return empRepo.save(emp);
	}



	
	

}

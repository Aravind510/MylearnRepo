package com.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.model.Employee;
import com.sb.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	private EmployeeService empService;

	public EmployeeController(EmployeeService empService) {
		this.empService = empService;
	}
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee emp) {
		return empService.saveEmployee(emp);
	}
	
	@GetMapping("/fetch/{id}")
	public Employee getEmployeeById(@PathVariable("id") long empId) {
		
		return empService.getEmployee(empId);
	}
	

}

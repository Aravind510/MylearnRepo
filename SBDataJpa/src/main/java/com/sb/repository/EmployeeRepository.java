package com.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

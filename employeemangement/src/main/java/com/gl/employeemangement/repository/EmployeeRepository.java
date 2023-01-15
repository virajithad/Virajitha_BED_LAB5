package com.gl.employeemangement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.employeemangement.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
}

package com.gl.employeemangement.service;

import java.util.List;

import com.gl.employeemangement.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	public void SaveOrUpdate(Employee emp);
	public void deleteEmployeeById(int id);
	public Employee getEmployeeById(int id);
	

}

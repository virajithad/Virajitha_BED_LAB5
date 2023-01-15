package com.gl.employeemangement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.employeemangement.model.Employee;
import com.gl.employeemangement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repository;
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return repository.findAll();
	}

	@Override
	public void SaveOrUpdate(Employee emp) {
		repository.save(emp);
		
	}

	@Override
	public void deleteEmployeeById(int id) {
		repository.deleteById(id);
	}

	@Override
	public Employee getEmployeeById(int id) {


		return repository.findById(id).get();
	}


}

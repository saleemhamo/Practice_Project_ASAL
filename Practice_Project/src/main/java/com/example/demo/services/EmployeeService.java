package com.example.demo.services;

import java.util.List;

import com.example.demo.models.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	
	public String addEmployee(Employee employee);
}

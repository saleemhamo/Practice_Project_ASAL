package com.example.demo.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Employee;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.services.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;	
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
		
	}

	@Override
	public String addEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "Employee Added Successfully";
	}

}

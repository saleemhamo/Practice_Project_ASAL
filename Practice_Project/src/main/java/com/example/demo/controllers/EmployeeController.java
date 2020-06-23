package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Employee;
import com.example.demo.services.EmployeeService;

@RestController
public class EmployeeController {

	EmployeeService employeeSerrvice;

	@GetMapping("employee/getAllEmplyees")
	public List<Employee> getAllEmployees() {
		return employeeSerrvice.getAllEmployees();
	}

	@PostMapping("employee/addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		return employeeSerrvice.addEmployee(employee);

	}

}

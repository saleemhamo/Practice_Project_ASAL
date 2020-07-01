package com.example.demo.DTO;

import com.example.demo.models.Person;



public class EmployeeDTO extends Person {

	private int empId;
	private double salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

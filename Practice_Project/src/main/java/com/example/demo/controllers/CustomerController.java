package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Customer;
import com.example.demo.services.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("customer/getAllCustomers")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	@PostMapping("customers/addCustomer")
	public String addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
	
	
	
}

package com.example.demo.services;

import java.util.List;


import com.example.demo.models.Customer;

public interface CustomerService {


	public List<Customer> getAllCustomers();
	
	public String addCustomer(Customer customer);
	
}

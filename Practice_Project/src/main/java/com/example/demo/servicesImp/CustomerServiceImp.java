package com.example.demo.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Customer;
import com.example.demo.repositories.CustomerRepository;
import com.example.demo.services.CustomerService;

@Service
public class CustomerServiceImp implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public String addCustomer(Customer customer) {
		customerRepository.save(customer);
		return "Customer Added Successfully";
	}

}

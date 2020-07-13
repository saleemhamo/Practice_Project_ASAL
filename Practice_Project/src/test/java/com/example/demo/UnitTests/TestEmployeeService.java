package com.example.demo.UnitTests;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.services.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestEmployeeService {

	
	@Autowired
	private EmployeeService service;
	
	@MockBean
	private EmployeeRepository reporitory;
}

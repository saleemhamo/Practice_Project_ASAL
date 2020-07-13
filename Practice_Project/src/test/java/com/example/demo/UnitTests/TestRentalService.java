package com.example.demo.UnitTests;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.repositories.RentalRepositoty;
import com.example.demo.services.RentalService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRentalService {

	
	
	@Autowired
	private RentalService service;
	
	@MockBean
	private RentalRepositoty reporitory;
	
}

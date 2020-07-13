package com.example.demo.UnitTests;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.models.Car;
import com.example.demo.repositories.CarRepository;
import com.example.demo.services.CarService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCarService {

	@Autowired
	private CarService service;

	@MockBean
	private CarRepository carRepository;

	@Test
	public void getCarsTest() {

		when(service.getCars()).thenReturn(
				Stream.of(new Car(10, "BMW", "Black"), new Car(11, "GOLF", "White")).collect(Collectors.toList()));
		assertEquals(2, service.getCars().size());
	}

}

package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Car;
import com.example.demo.services.CarService;

@RestController
public class CarController {

	@Autowired 
	CarService carService;
	
	
	@GetMapping("/car/getAllCars")
	public List<Car> getAllCars(){
		return carService.getCars();
	}
	
	@PostMapping("car/addCar")
	public String addCar(@RequestBody Car car) {
		return carService.addCar(car);
	}
	
	
	
	
	
	
}

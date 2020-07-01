package com.example.demo.servicesImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.Car;
import com.example.demo.repositories.CarRepository;
import com.example.demo.services.CarService;

@Service
public class CarServiceImp implements CarService {

	CarRepository carRepository;
	
	
	public CarServiceImp (CarRepository carRepository) {
		this.carRepository = carRepository;
	}
	
	
	@Override
	public List<Car> getCars() {
		return carRepository.findAll();
	}

	@Override
	public String addCar(Car car) {
		carRepository.save(car);
		return "Added Successfully";
	}

}

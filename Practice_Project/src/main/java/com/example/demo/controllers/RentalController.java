package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Rental;
import com.example.demo.services.RentalService;

@RestController
public class RentalController {

	
	RentalService rentalService;

	@GetMapping("rental/getAllRentals")
	public List<Rental> getAllRentals() {
		return rentalService.getAllRentals();
	}

	@PostMapping("rental/addRental")
	public String addEmployee(@RequestBody Rental rental) {
		return rentalService.addRental(rental);

	}

	
	
	
}

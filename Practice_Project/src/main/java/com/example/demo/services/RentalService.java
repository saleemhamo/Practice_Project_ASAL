package com.example.demo.services;

import java.util.List;

import com.example.demo.models.Rental;

public interface RentalService {

	public List<Rental> getAllRentals();

	public String addRental(Rental rental);

}

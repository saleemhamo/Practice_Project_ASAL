package com.example.demo.servicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Rental;
import com.example.demo.repositories.RentalRepositoty;
import com.example.demo.services.RentalService;

@Service
public class RentalServiceImp implements RentalService {

	@Autowired
	RentalRepositoty rentalRepository;
	
	@Override
	public List<Rental> getAllRentals() {
		return rentalRepository.findAll();
	}

	@Override
	public String addRental(Rental rental) {
		rentalRepository.save(rental);
		return "Rental Added";
	}

	
	
	
}

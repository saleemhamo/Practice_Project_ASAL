package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Rental;

public interface RentalRepositoty extends JpaRepository<Rental, Integer>{

}

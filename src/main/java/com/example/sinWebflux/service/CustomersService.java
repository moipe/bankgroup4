package com.example.sinWebflux.service;

import java.util.List;
import java.util.Optional;

import com.example.sinWebflux.model.Customers;

public interface CustomersService {
	
	List<Customers> finAll();
	
	Optional<Customers> findById(String id);

}

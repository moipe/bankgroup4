package com.example.sinWebflux.service;

import java.util.List;
import java.util.Optional;

import com.example.sinWebflux.model.Persons;

public interface PersonsService {
	
	List<Persons> findAll();
	
	Optional<Persons> findById(String id);
	
	Boolean save(Persons customer, String customerId);
	
	Boolean update(Persons customer);

}

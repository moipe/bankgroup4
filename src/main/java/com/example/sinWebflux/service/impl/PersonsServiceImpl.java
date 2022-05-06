package com.example.sinWebflux.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sinWebflux.model.Persons;
import com.example.sinWebflux.repository.PersonsRepository;
import com.example.sinWebflux.service.PersonsService;

@Service
public class PersonsServiceImpl implements PersonsService{
	
	@Autowired
	private PersonsRepository personsRepository;

	@Override
	public List<Persons> findAll() {
		
		List<Persons> lst = personsRepository.findAll();

		return lst;
	}

	@Override
	public Optional<Persons> findById(String id) {
		
		Persons customer = personsRepository.findById(id).get();
		
		return Optional.ofNullable(customer);
	}

	@Override
	public Boolean save(Persons customer) {
		
		personsRepository.save(customer);
		
		return true;
	}

	@Override
	public Boolean update(Persons customer) {
		
		Persons customer1 = personsRepository.findById(customer.get_id()).get();
		
		customer1 = customer;
		
		personsRepository.save(customer1);
		
		return true;
	}

}

package com.example.sinWebflux.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sinWebflux.model.Customers;
import com.example.sinWebflux.model.Persons;
import com.example.sinWebflux.repository.CustomersRepository;
import com.example.sinWebflux.repository.PersonsRepository;
import com.example.sinWebflux.service.PersonsService;

@Service
public class PersonsServiceImpl implements PersonsService{
	
	@Autowired
	private PersonsRepository personsRepository;
	
	@Autowired
	private CustomersRepository customersRepository;

	@Override
	public List<Persons> findAll() {
		
		List<Persons> lst = personsRepository.findAll();

		return lst;
	}

	@Override
	public Optional<Persons> findById(String id) {
		
		Persons persons = personsRepository.findById(id).get();
		
		return Optional.ofNullable(persons);
	}

	@Override
	public Boolean save(Persons persons, String customerId) {
		
		Customers customer = customersRepository.findById(customerId).get();
		
		Persons oPersons = personsRepository.save(persons);
		
		customer.getPersons().add(oPersons);
		
		customersRepository.save(customer);
		
		return true;
	}

	@Override
	public Boolean update(Persons persons) {
		
		Persons persons1 = personsRepository.findById(persons.get_id()).get();
		
		persons1 = persons;
		
		personsRepository.save(persons1);
		
		return true;
	}

}

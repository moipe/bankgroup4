package com.example.sinWebflux.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sinWebflux.model.Customers;
import com.example.sinWebflux.repository.CustomersRepository;
import com.example.sinWebflux.service.CustomersService;

@Service
public class CustomersServiceImpl implements CustomersService{
	
	@Autowired
	private CustomersRepository customersRepository;

	@Override
	public List<Customers> finAll() {
		
		List<Customers> lst = customersRepository.findAll();
		
		return lst;
	}

	@Override
	public Optional<Customers> findById(String id) {
		
		Customers customer = customersRepository.findById(id).get();
		
		return Optional.ofNullable(customer);
	}

	@Override
	public Boolean save(Customers customers) {
		
		customersRepository.save(customers);
		
		return true;
	}
	
}

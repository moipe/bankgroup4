package com.example.sinWebflux.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sinWebflux.model.Customers;
import com.example.sinWebflux.service.CustomersService;

@RestController
@RequestMapping("/customer")
public class CustomersController {
	
	@Autowired
	private CustomersService customersService;
	
	@GetMapping
	private List<Customers> findAll(){
		
		List<Customers> lst = customersService.finAll();
		
		return lst;
	}
	
	@GetMapping("/{id}")
	private Customers findById(@PathVariable String id){
		
		Customers customer = customersService.findById(id).get();
		
		return customer;
	}
	
	@PostMapping
	private Boolean save(@RequestBody Customers customers) {
		
		customersService.save(customers);
		
		return true;
		
	}

}
package com.example.sinWebflux.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sinWebflux.model.Persons;
import com.example.sinWebflux.service.PersonsService;

@RestController
@RequestMapping("/person")
public class PersonsController {
	
	@Autowired
	private PersonsService personsService;
	
	@GetMapping
	private List<Persons> findAll(){
		
		List<Persons> lst = personsService.findAll();
		return lst;
	}
	
	@GetMapping("/{id}")
	private Persons findByid(@PathVariable String id) {
		
		Persons customer = personsService.findById(id).get();
		
		return customer;
	}
	
	@PostMapping
	private Boolean save(@RequestBody Persons customer) {
		
		return personsService.save(customer);
	}
	
	@PutMapping("/{id}")
	private Boolean update(@PathVariable String id, @RequestBody Persons customer) {
		
		customer.set_id(id);
		
		return personsService.save(customer);
	}

}

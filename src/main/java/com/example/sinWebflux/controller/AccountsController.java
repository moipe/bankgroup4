package com.example.sinWebflux.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sinWebflux.model.Accounts;
import com.example.sinWebflux.service.AccountsService;

@RestController
@RequestMapping("/account")
public class AccountsController {

	@Autowired
	private AccountsService accountsService;
	
	@GetMapping
	private List<Accounts> findAll(){
		
		List<Accounts> lst = accountsService.findAll();
		return lst;
	}
	
	@GetMapping("/{id}")
	private Accounts findByid(@PathVariable String id) {
		
		Accounts accounts = accountsService.findById(id).get();
		
		return accounts;
	}
	
	@PostMapping
	private Boolean save(@RequestBody Accounts accounts, 
						@RequestParam String productId, 
						@RequestParam String customerId) {
		
		accountsService.save(accounts, productId, customerId);
		
		return true;
	}
	
}
package com.example.sinWebflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sinWebflux.model.Transactions;
import com.example.sinWebflux.service.TransactionsService;

@RestController
@RequestMapping("/transaction")
public class TransactionsController {
	
	@Autowired
	private TransactionsService transactionsService;
	
	@PostMapping
	private Boolean save(@RequestParam String accountId, @RequestBody Transactions transactions) {
		
		transactionsService.save(transactions, accountId);
		
		return true;
	}
	
	
	@PutMapping("/{id}")
	private Boolean update(@PathVariable String id, @RequestBody Transactions transactions) {
		
		transactions.set_id(id);
		
		transactionsService.update(transactions);
		
		return true;
	}
	

}

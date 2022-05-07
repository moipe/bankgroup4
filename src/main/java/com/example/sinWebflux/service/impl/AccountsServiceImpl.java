package com.example.sinWebflux.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sinWebflux.model.Accounts;
import com.example.sinWebflux.model.Customers;
import com.example.sinWebflux.model.Products;
import com.example.sinWebflux.repository.AccountsRepository;
import com.example.sinWebflux.repository.CustomersRepository;
import com.example.sinWebflux.service.AccountsService;

@Service
public class AccountsServiceImpl implements AccountsService{
	
	@Autowired
	private AccountsRepository accountsRepository;
	
	@Autowired
	private CustomersRepository customersRepository;

	@Override
	public List<Accounts> findAll() {
		List<Accounts> lst = accountsRepository.findAll();
		return lst;
	}

	@Override
	public Optional<Accounts> findById(String id) {
		Accounts accounts = accountsRepository.findById(id).get();	
		return Optional.ofNullable(accounts);
	}

	@Override
	public Boolean save(Accounts accounts, String productId, String customerId) {
		
		Customers customers = customersRepository.findById(customerId).get();
		
		Products product = new Products();
		
		product.set_id(productId);
		
		accounts.setProducts(product);
		
		Accounts oAccounts =accountsRepository.save(accounts);
		
		customers.getAccounts().add(oAccounts);
		
		customersRepository.save(customers);
		
		return true;
	}

}
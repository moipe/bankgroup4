package com.example.sinWebflux.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sinWebflux.model.Accounts;
import com.example.sinWebflux.repository.AccountsRepository;
import com.example.sinWebflux.service.AccountsService;

@Service
public class AccountsServiceImpl implements AccountsService{
	
	@Autowired
	private AccountsRepository accountsRepository;

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

}
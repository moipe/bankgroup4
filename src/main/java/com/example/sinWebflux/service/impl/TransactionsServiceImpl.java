package com.example.sinWebflux.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sinWebflux.model.Accounts;
import com.example.sinWebflux.model.Transactions;
import com.example.sinWebflux.repository.AccountsRepository;
import com.example.sinWebflux.repository.TransactionsRepository;
import com.example.sinWebflux.service.TransactionsService;

@Service
public class TransactionsServiceImpl implements TransactionsService{
	
	@Autowired
	private TransactionsRepository transactionsRepository;
	
	@Autowired
	private AccountsRepository accountsRepository;

	@Override
	public Boolean save(Transactions transactions, String accountId) {
		
		Accounts accounts = accountsRepository.findById(accountId).get();
		
		Transactions oTransactions = transactionsRepository.save(transactions);
		
		accounts.getTransactions().add(oTransactions);
		
		accountsRepository.save(accounts);
		
		return true;
	}

	@Override
	public Boolean update(Transactions transactions) {
		
		Transactions oTransactions = transactionsRepository.findById(transactions.get_id()).get();
		
		oTransactions = transactions;
		
		transactionsRepository.save(oTransactions);
		
		return true;
	}
	
	

}

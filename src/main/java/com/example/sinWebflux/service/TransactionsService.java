package com.example.sinWebflux.service;

import com.example.sinWebflux.model.Transactions;

public interface TransactionsService {
	
	Boolean save(Transactions transactions, String accountId);
	
	Boolean update(Transactions transactions);
	
	//void delete(String id);

}

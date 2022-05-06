package com.example.sinWebflux.service;

import java.util.List;
import java.util.Optional;

import com.example.sinWebflux.model.Accounts;

public interface AccountsService {
	
	List<Accounts> findAll();
	
	Optional<Accounts> findById(String id);

}

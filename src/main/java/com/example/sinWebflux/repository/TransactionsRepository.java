package com.example.sinWebflux.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.sinWebflux.model.Transactions;

@Repository
public interface TransactionsRepository extends MongoRepository<Transactions, String>{

}

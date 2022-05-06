package com.example.sinWebflux.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.sinWebflux.model.Customers;

@Repository
public interface CustomersRepository extends MongoRepository<Customers, String> {

}

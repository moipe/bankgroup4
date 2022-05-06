package com.example.sinWebflux.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.sinWebflux.model.Accounts;

@Repository
public interface AccountsRepository extends MongoRepository<Accounts, String> {

}

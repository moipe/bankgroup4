package com.example.sinWebflux.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.sinWebflux.model.Persons;

@Repository
public interface PersonsRepository extends MongoRepository<Persons, String>{

}

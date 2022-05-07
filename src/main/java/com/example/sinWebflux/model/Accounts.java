package com.example.sinWebflux.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "accounts")
public class Accounts {

	@Id
	private String _id;
	
	private Double balance;
	
	@DBRef
	private Products products;
	
	@DBRef
	private List<Transactions> transactions =  new ArrayList<>();

}
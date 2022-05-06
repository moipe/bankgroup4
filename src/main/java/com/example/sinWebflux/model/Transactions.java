package com.example.sinWebflux.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "transactions")
public class Transactions {
	
	@Id
	private String _id;
	
	private String description;
	
	private String type;
	
	private Double amount;

}

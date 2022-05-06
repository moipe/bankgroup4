package com.example.sinWebflux.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "persons")
public class Persons {
	
	@Id
	private String _id;
	
	private String name;
	
	private String surnames;
	
	private int mobile;
	
	private String email;
	
	private int document;
	
	private String type; 

}
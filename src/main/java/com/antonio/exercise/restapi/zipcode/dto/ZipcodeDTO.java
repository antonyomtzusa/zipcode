package com.antonio.exercise.restapi.zipcode.dto;

import java.util.List;

import lombok.Data;

@Data
public class ZipcodeDTO {


	private Long id;
	
	private String zipcode;
	
	private String locality;
	
	private String federal_entity;
	
	private List<Settlement> settlements;
	
	private String municipality;
	
}

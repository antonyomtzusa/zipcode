package com.antonio.exercise.restapi.zipcode.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(schema = "developer", name = "zipcode")
public class Zipcode {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="zipcodeid")
	private String zipcode;
	
	@Column(name="locality")
	private String locality;
	
	@Column(name="federal_entity")
	private String federal_entity;
	
	@Column(name="settlement_name")
	private String settlement_name;
	
	@Column(name="settlement_zone")
	private String settlement_zone;
	
	@Column(name="settlement_type")
	private String settlement_type;
	
	@Column(name="municipality")
	private String municipality;

}
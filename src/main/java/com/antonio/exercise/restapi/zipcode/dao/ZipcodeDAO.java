package com.antonio.exercise.restapi.zipcode.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.antonio.exercise.restapi.zipcode.dto.Zipcode;

public interface ZipcodeDAO extends JpaRepository<Zipcode, String>{

	@Query(value="SELECT  zipcode FROM Zipcode zipcode WHERE zipcodeid = :zipcode")
	List< Zipcode> findbyZipcode(@Param("zipcode") String zipcode);
	
}

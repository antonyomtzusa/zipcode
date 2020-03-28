package com.antonio.exercise.restapi.zipcode.manager;

import org.springframework.http.ResponseEntity;

//import com.antonio.exercise.restapi.zipcode.dto.Zipcode;

public interface ZipcodeManager {
	
	ResponseEntity<?> get(String zipcodeId);

}

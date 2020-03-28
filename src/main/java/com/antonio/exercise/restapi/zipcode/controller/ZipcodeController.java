package com.antonio.exercise.restapi.zipcode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.antonio.exercise.restapi.zipcode.dto.Zipcode;
import com.antonio.exercise.restapi.zipcode.manager.ZipcodeManager;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
@RequestMapping(value = "/v1", produces = "application/json;charset=UTF-8")
@Api(value="ZipCodes", description="ZipCodes Api to retrieve the zipcode in Mexico")
public class ZipcodeController {
	
	private ZipcodeManager zipcodeManager;
	
	@Autowired
    public void setZipcodeManager(ZipcodeManager zipcodeManager) {
        this.zipcodeManager = zipcodeManager;
    }
	
	@RequestMapping(value="/zipcode/{zipcodeId}",
    		method = RequestMethod.GET)
	@ApiOperation(value="Get a zipcode entity with zipcode provides if doesnt exist send a HTTP status error", response=Zipcode.class)
    public ResponseEntity<?> get(@PathVariable String zipcodeId){
		return zipcodeManager.get(zipcodeId);
    } 
	
}
package com.antonio.exercise.restapi.zipcode.manager;

import com.antonio.exercise.restapi.zipcode.dao.ZipcodeDAO;
import com.antonio.exercise.restapi.zipcode.dto.Zipcode;
import com.antonio.exercise.restapi.zipcode.dto.ZipcodeDTO;
import com.antonio.exercise.restapi.zipcode.exception.ZipcodeNotFoundException;
import com.antonio.exercise.restapi.zipcode.util.ZipcodeMapper;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ZipcodeManagerImpl implements ZipcodeManager{

	private ZipcodeMapper zipcodeMapper;
	private ZipcodeDAO zipcodeDAO;
	
	
	@Autowired
	public void setZipcodemapper(ZipcodeMapper zipcodeMapper) {
		this.zipcodeMapper = zipcodeMapper;
	}

	@Autowired
	public void setZipcodeDAO(ZipcodeDAO zipcodeDAO) {
		this.zipcodeDAO = zipcodeDAO;
	}

	public ResponseEntity<?> get(String zipcode) {
		
		//Optional< List <Zipcode>> zipcodes= zipcodeDAO.findbyZipcode(zipcode);
		List<Zipcode>  list=zipcodeDAO.findbyZipcode(zipcode);
		ZipcodeDTO zipcodeDTO;
        if(list.size()==0) {
        	throw new ZipcodeNotFoundException("ZipCode with value "+String.format("id: %l", zipcode)+" not Found");
        }else {
        	zipcodeDTO = zipcodeMapper.transformToDTO(list);
        }
        return new ResponseEntity<>(zipcodeDTO,HttpStatus.OK);
		
	}
		
}
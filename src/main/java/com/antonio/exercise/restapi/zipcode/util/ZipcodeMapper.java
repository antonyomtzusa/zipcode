package com.antonio.exercise.restapi.zipcode.util;

import java.util.List;

import com.antonio.exercise.restapi.zipcode.dto.Zipcode;
import com.antonio.exercise.restapi.zipcode.dto.ZipcodeDTO;

public interface ZipcodeMapper {

	ZipcodeDTO transformToDTO(List<Zipcode> zipcode);
	
}

package com.antonio.exercise.restapi.zipcode.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.antonio.exercise.restapi.zipcode.dto.Settlement;
import com.antonio.exercise.restapi.zipcode.dto.Zipcode;
import com.antonio.exercise.restapi.zipcode.dto.ZipcodeDTO;

@Component
public class ZipcodeMapperImpl implements ZipcodeMapper{
	
    public ZipcodeDTO transformToDTO(List<Zipcode> lista) {
        ZipcodeDTO zipcodeDTO = new ZipcodeDTO();
        List<Settlement> settlementList= new ArrayList<>();
        for(Zipcode elemento:lista) {
        	Settlement settlement= new Settlement();
        	settlement.setSettlement_name(elemento.getSettlement_name());
        	settlement.setSettlement_type(elemento.getSettlement_type());
        	settlement.setSettlement_zone(elemento.getSettlement_zone());
        	settlementList.add(settlement);
        }
        zipcodeDTO.setMunicipality(lista.get(0).getMunicipality());
        zipcodeDTO.setFederal_entity(lista.get(0).getFederal_entity());
        zipcodeDTO.setId(lista.get(0).getId());
        zipcodeDTO.setLocality(lista.get(0).getLocality());
        zipcodeDTO.setZipcode(lista.get(0).getZipcode());
        zipcodeDTO.setSettlements(settlementList);
        return zipcodeDTO;
    }	
}
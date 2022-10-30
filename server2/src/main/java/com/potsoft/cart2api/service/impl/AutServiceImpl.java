package com.potsoft.cart2api.service.impl;

import com.potsoft.cart2api.service.AutService;

import com.potsoft.cart2api.model.aut.AutRolGrupAct;
import com.potsoft.cart2api.repository.aut.AutRolGrupActRepository;

//import java.util.Arrays;
//import java.util.Collections;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AutServiceImpl implements AutService 
{

	@Autowired
	private AutRolGrupActRepository autRolGrupActRepository;


	@Override
	public List<AutRolGrupAct> findByAutRolgrupactRolid(@NotNull Long aut_rolgrupact_rolid) {
		return this.autRolGrupActRepository.findByAutRolgrupactRolid(aut_rolgrupact_rolid);
	}


	@Override
	public List<AutRolGrupAct> findByAutRolgrupactRolcod(@NotBlank String aut_rolgrupact_rolcod) {
		return this.autRolGrupActRepository.findByAutRolgrupactRolcod(aut_rolgrupact_rolcod);
	}

}




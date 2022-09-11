package com.potsoft.cart2api.service;

import com.potsoft.cart2api.model.aut.AutRolGrupAct;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public interface AutService {
	List<AutRolGrupAct> findByAutRolgrupactRolid(@NotNull Long aut_rolgrupact_rolid);
	List<AutRolGrupAct> findByAutRolgrupactRolcod(@NotBlank String aut_rolgrupact_rolcod);
  
}


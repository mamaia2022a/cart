package com.potsoft.cart2api.controller;


import com.potsoft.cart2api.model.aut.AutRolGrupAct;
import com.potsoft.cart2api.service.AutService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/aut")
public class AutController {

	@Autowired
	private AutService autService;

  
	@CrossOrigin(origins = "*")
	@GetMapping("/grupactiuni/rolid/{rolid}")
	public ResponseEntity<List<AutRolGrupAct>> getGrupActiuniPentruRolId(@PathVariable(name = "rolid") Long rolid) 
	{
	  return ResponseEntity.ok(autService.findByAutRolgrupactRolid(rolid));
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/grupactiuni/rolcod/{rolcod}")
	public ResponseEntity<List<AutRolGrupAct>> getGrupActiuniPentruRolCod(@PathVariable(name = "rolcod") String rolcod) 
	{
		return ResponseEntity.ok(autService.findByAutRolgrupactRolcod(rolcod));
	}


}

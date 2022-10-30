package com.potsoft.cart2api.controller;


import com.potsoft.cart2api.payload.response.pay.PayIPNResponse_Creare;
//import com.potsoft.cart2api.security.CurrentUser;
//import com.potsoft.cart2api.security.UserDetailsImpl;
//import com.potsoft.cart2api.service.AutUserService;
//import com.potsoft.cart2api.service.MemService;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;

//import java.nio.file.attribute.UserPrincipal;
//import java.util.List;

//import javax.validation.Valid;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import java.sql.SQLException;


@RestController
@RequestMapping("/api/pay")
public class PayController {

	//@Autowired
	//private AutUserService autUserService;

	//@Autowired
	//private MemService memService;

 
	@CrossOrigin(origins = "*")
	@GetMapping("/ipn")
	public ResponseEntity<PayIPNResponse_Creare> pay_ipn(
		                              @RequestBody Object payIPNRequestCreare
	                                 ) 
	{
     //@CurrentUser UserPrincipal currentUser
	  //UserDetailsImpl crtuser = (UserDetailsImpl) currentUser;    
    PayIPNResponse_Creare ipnResponseCreare = new PayIPNResponse_Creare();
	  return ResponseEntity.ok(ipnResponseCreare );
	}


	

}

package com.potsoft.cart2api.controller;
import java.sql.SQLException;


import org.springframework.transaction.annotation.Transactional;

import com.potsoft.cart2api.payload.response.pay.PayIPNResponse_Creare;
//import com.potsoft.cart2api.security.CurrentUser;
//import com.potsoft.cart2api.security.UserDetailsImpl;
//import com.potsoft.cart2api.service.AutUserService;
//import com.potsoft.cart2api.service.MemService;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//import java.nio.file.attribute.UserPrincipal;
//import java.util.List;

//import javax.validation.Valid;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import java.sql.SQLException;


@RestController
@RequestMapping("/api/pay")
public class PayController {

	//@Autowired
	//private AutUserService autUserService;

	//@Autowired
	//private MemService memService;

 

  //-----------------------------------------------------------
	@CrossOrigin(origins = "*")
	@PostMapping("/ipn")
	@Transactional(rollbackFor = { SQLException.class })
  /**
  public String testGetRequest(@RequestBody String request) throws IOException {
      final byte[] requestContent;
      requestContent = IOUtils.toByteArray(request.getReader());
      return new String(requestContent, StandardCharsets.UTF_8);
  }*/
	public ResponseEntity<PayIPNResponse_Creare> pay_ipn(
                                  @RequestParam String amount,
                                  @RequestParam String curr,
                                  @RequestParam String invoice_id,
                                  @RequestParam String ep_id,
                                  @RequestParam String merch_id,
                                  @RequestParam String action,
                                  @RequestParam String message,
                                  @RequestParam String approval,
                                  @RequestParam String timestamp,
                                  @RequestParam String nonce,
                                  @RequestParam String fp_hash
	                                 ) 
	{
     //@CurrentUser UserPrincipal currentUser
	  //UserDetailsImpl crtuser = (UserDetailsImpl) currentUser;    
    System.out.println(amount);
    PayIPNResponse_Creare ipnResponseCreare = new PayIPNResponse_Creare();
	  return ResponseEntity.ok(ipnResponseCreare );
	}


	

}

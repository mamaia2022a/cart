package com.potsoft.cart2api.controller;
import java.sql.SQLException;


import org.springframework.transaction.annotation.Transactional;

import com.potsoft.cart2api.payload.request.pay.PayDataRequest_Creare;
import com.potsoft.cart2api.payload.response.pay.PayDataResponse_Creare;
import com.potsoft.cart2api.payload.response.pay.PayIPNResponse_Creare;
//import com.potsoft.cart2api.payload.response.pay.PayIPNResponse_Creare;
import com.potsoft.cart2api.service.PayService;

import com.potsoft.cart2api.security.CurrentUser;
import com.potsoft.cart2api.security.UserDetailsImpl;
//import com.potsoft.cart2api.service.AutUserService;
//import com.potsoft.cart2api.service.MemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.core.userdetails.UserDetails;

import javax.validation.Valid;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//import java.sql.SQLException;


@RestController
@RequestMapping("/api/pay")
public class PayController {

	//@Autowired
	//private AutUserService autUserService;

	@Autowired
	private PayService payService;

 
    //-----------------------------------------------------------
	@CrossOrigin(origins = "*")
	@PostMapping("/transaction/crearedate")
	@Transactional(rollbackFor = { SQLException.class })
	public ResponseEntity<PayDataResponse_Creare> transactionCreareDate(
		                                               @Valid @RequestBody PayDataRequest_Creare payDataRequestCreare,
		                                               @CurrentUser UserDetails currentUser) 
  {
    UserDetailsImpl crtuser = (UserDetailsImpl) currentUser;   
    PayDataResponse_Creare resp = payService.createTransactionData(crtuser.getId(), payDataRequestCreare);

	  //---
	  return ResponseEntity.ok(resp);
	}


  
  //-----------------------------------------------------------
	@CrossOrigin(origins = "*")
	@PostMapping("/ipn")
	@Transactional(rollbackFor = { SQLException.class })
	public ResponseEntity<PayIPNResponse_Creare> pay_TransactionIPN(
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

  /** 
  public String testGetRequest(@RequestBody String request) throws IOException {
    final byte[] requestContent;
    requestContent = IOUtils.toByteArray(request.getReader());
    return new String(requestContent, StandardCharsets.UTF_8);
}

  */
	

}

package com.potsoft.cart2api.controller;


import com.potsoft.cart2api.payload.request.mem.MembruTipRequest_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruTipResponse_Creare;
import com.potsoft.cart2api.security.CurrentUser;
import com.potsoft.cart2api.security.UserDetailsImpl;
import com.potsoft.cart2api.service.MemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.attribute.UserPrincipal;
//import java.util.List;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/mem")
public class MemController {

	@Autowired
	private MemService memService;

	@CrossOrigin(origins = "*")
	@GetMapping("/membru/tip/creare")
	public ResponseEntity<MembruTipResponse_Creare> membruTip_Creaza(
		                             @Valid @RequestBody MembruTipRequest_Creare membruTipRequestCreare,
	                                 @CurrentUser UserPrincipal currentUser) 
	{
	  UserDetailsImpl crtuser = (UserDetailsImpl) currentUser;    
	  return ResponseEntity.ok(memService.membruTip_Creare(crtuser.getId(), membruTipRequestCreare));
	}



}

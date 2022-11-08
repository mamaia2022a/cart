package com.potsoft.cart2api.controller;


import com.potsoft.cart2api.payload.request.mem.GrupRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.GrupRequest_MembriInAsteptare;
import com.potsoft.cart2api.payload.request.mem.GrupRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.GrupRequest_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.GrupResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.GrupResponse_MembriInAsteptare;
import com.potsoft.cart2api.payload.response.mem.GrupResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.GrupResponse_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_AcceptareAfiliere;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_CerereAfiliere;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Excludere;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_GrupulMeuVizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Plecare;
import com.potsoft.cart2api.payload.request.mem.MembruTipRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruTipRequest_Schimbare;
import com.potsoft.cart2api.payload.request.pay.PayDataRequest_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_AcceptareAfiliere;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_CerereAfiliere;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Excludere;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_GrupulMeuVizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Plecare;
import com.potsoft.cart2api.payload.response.mem.MembruTipResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruTipResponse_Schimbare;
import com.potsoft.cart2api.payload.response.pay.PayDataResponse_Creare;
import com.potsoft.cart2api.security.CurrentUser;
import com.potsoft.cart2api.security.UserDetailsImpl;
import com.potsoft.cart2api.service.AutUserService;
import com.potsoft.cart2api.service.MemService;
import com.potsoft.cart2api.service.PayService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;

import java.nio.file.attribute.UserPrincipal;
//import java.util.List;

import javax.validation.Valid;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;


@RestController
@RequestMapping("/api/mem")
public class MemController {

	@Autowired
	private PayService payService;

  @Autowired
	private AutUserService autUserService;

	@Autowired
	private MemService memService;

	@CrossOrigin(origins = "*")
	@GetMapping("/membru/tip/creare")
	public ResponseEntity<MembruTipResponse_Creare> membru_Creare(
		                             @Valid @RequestBody MembruTipRequest_Creare membruTipRequestCreare,
	                                 @CurrentUser UserPrincipal currentUser) 
	{
	  UserDetailsImpl crtuser = (UserDetailsImpl) currentUser;    
	  return ResponseEntity.ok(memService.membruTip_Creare(crtuser.getId(), membruTipRequestCreare));
	}


    //-----------------------------------------------------------
	@CrossOrigin(origins = "*")
	@PostMapping("/membru/tip/schimbare")
	@Transactional(rollbackFor = { SQLException.class })
	public ResponseEntity<MembruTipResponse_Schimbare> validateRegistration(
		                                               @Valid @RequestBody MembruTipRequest_Schimbare memTipRequestSchimbare,
		                                               @CurrentUser UserDetails currentUser) 
    {
      UserDetailsImpl crtuser = (UserDetailsImpl) currentUser;   
	  //---
	  String crtUserRol = memTipRequestSchimbare.getCrtmemrolcod();
	  String newUserRol = memTipRequestSchimbare.getNewmemrolcod();
	  autUserService.changeAutUserRol(crtuser.getId(), crtUserRol, newUserRol);
	  //---
      MembruTipResponse_Schimbare memTipResponseSchimbare = memService.membruTip_Schimbare(crtuser.getId(),
		                                                                             memTipRequestSchimbare);
	  //---
	  return ResponseEntity.ok(memTipResponseSchimbare);
	}

  //-----------------------------------------------------------
	@CrossOrigin(origins = "*")
	@PostMapping("/schimbare2")
	@Transactional(rollbackFor = { SQLException.class })
	public ResponseEntity<PayDataResponse_Creare> validateRegistration2(
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
	@PostMapping("/grup/creare")
	@Transactional(rollbackFor = { SQLException.class })
	public ResponseEntity<GrupResponse_Creare> grupCreare(
		                                               @Valid @RequestBody GrupRequest_Creare memGrupRequestCreare,
		                                               @CurrentUser UserDetails currentUser) 
    {
      UserDetailsImpl crtuser = (UserDetailsImpl) currentUser; 
	  //--
	  String crtUserRol = memGrupRequestCreare.getCrtmemrolcod();
	  String newUserRol = memGrupRequestCreare.getNewmemrolcod();
	  autUserService.changeAutUserRol(crtuser.getId(), crtUserRol, newUserRol);
	  //--
      GrupResponse_Creare memGrupResponseCreare = memService.grup_Creare(crtuser.getId(), memGrupRequestCreare);
	  //---
	  return ResponseEntity.ok(memGrupResponseCreare);
	}

    //-----------------------------------------------------------
	@CrossOrigin(origins = "*")
	@PostMapping("/grup/vizualizare")
	@Transactional(rollbackFor = { SQLException.class })
	public ResponseEntity<GrupResponse_Vizualizare> grupVizualizare(
		                                               @Valid @RequestBody GrupRequest_Vizualizare memGrupRequestVizualizare,
		                                               @CurrentUser UserDetails currentUser) 
    {
      UserDetailsImpl crtuser = (UserDetailsImpl) currentUser; 
	  //--
	  //--
      GrupResponse_Vizualizare memGrupResponseVizualizare = memService.grup_Vizualizare(crtuser.getId(), memGrupRequestVizualizare);
	  //---
	  return ResponseEntity.ok(memGrupResponseVizualizare);
	}

	//-----------------------------------------------------------
	@CrossOrigin(origins = "*")
	@PostMapping("/membru/grupulmeu_vizualizare")
	@Transactional(rollbackFor = { SQLException.class })
	public ResponseEntity<MembruGrupResponse_GrupulMeuVizualizare> membru_GrupulMeuVizualizare(
									@Valid @RequestBody MembruGrupRequest_GrupulMeuVizualizare requestGrupulMeuVizualizare,
									@CurrentUser UserDetails currentUser) 
	{
		UserDetailsImpl crtuser = (UserDetailsImpl) currentUser; 
		//--
		//--
		MembruGrupResponse_GrupulMeuVizualizare respGrupulMeuVizualizare 
								= memService.membruGrup_GrupulMeuVizualizare(crtuser.getId(), requestGrupulMeuVizualizare);
		//---
		return ResponseEntity.ok(respGrupulMeuVizualizare );
	}
	
	
    //-----------------------------------------------------------
	@CrossOrigin(origins = "*")
	@PostMapping("/grup/membriinasteptare")
	@Transactional(rollbackFor = { SQLException.class })
	public ResponseEntity<GrupResponse_MembriInAsteptare> grupMembriInAsteptare(
		                                               @Valid @RequestBody GrupRequest_MembriInAsteptare memGrupRequestMembriInAsteptare,
		                                               @CurrentUser UserDetails currentUser) 
    {
      UserDetailsImpl crtuser = (UserDetailsImpl) currentUser; 
	  //--
	  //--
      GrupResponse_MembriInAsteptare memGrupResponseMembriInAsteptare = memService.grup_MembriInAsteptare(crtuser.getId(), memGrupRequestMembriInAsteptare);
	  //---
	  return ResponseEntity.ok(memGrupResponseMembriInAsteptare);
	}

	//-----------------------------------------------------------
	@CrossOrigin(origins = "*")
	@PostMapping("/grup/stergere")
	@Transactional(rollbackFor = { SQLException.class })
	public ResponseEntity<GrupResponse_Stergere> grupStergere(
		                                               @Valid @RequestBody GrupRequest_Stergere memGrupRequestStergere,
		                                               @CurrentUser UserDetails currentUser) 
    {
       UserDetailsImpl crtuser = (UserDetailsImpl) currentUser;    		
	  //--
      GrupResponse_Stergere memGrupResponseStergere = memService.grup_Stergere(crtuser.getId(), memGrupRequestStergere);
	  //---
	  return ResponseEntity.ok(memGrupResponseStergere);
	}

    //-----------------------------------------------------------
	@CrossOrigin(origins = "*")
	@PostMapping("/grup/membru/cerere_afiliere")
	@Transactional(rollbackFor = { SQLException.class })
	public ResponseEntity<MembruGrupResponse_CerereAfiliere> cerereAfiliereMembru(
		                                    @Valid @RequestBody MembruGrupRequest_CerereAfiliere memGrupRequestCerereAfiliere,
		                                    @CurrentUser UserDetails currentUser) 
    {
      UserDetailsImpl crtuser = (UserDetailsImpl) currentUser;    		
	  //--
      MembruGrupResponse_CerereAfiliere membruGrupResponseCerereAfiliere 
	                                = memService.membruGrup_CerereAfiliere(crtuser.getId(), memGrupRequestCerereAfiliere);
	  //---
	  return ResponseEntity.ok(membruGrupResponseCerereAfiliere);
	}

    //-----------------------------------------------------------
	@CrossOrigin(origins = "*")
	@PostMapping("/grup/sefgrup/acceptare_afiliere")
	@Transactional(rollbackFor = { SQLException.class })
	public ResponseEntity<MembruGrupResponse_AcceptareAfiliere> acceptareAfiliereMembru(
		                                    @Valid @RequestBody MembruGrupRequest_AcceptareAfiliere memGrupRequestCerereAfiliere,
		                                    @CurrentUser UserDetails currentUser) 
    {
		UserDetailsImpl crtuser = (UserDetailsImpl) currentUser;    		
		//--
		MembruGrupResponse_AcceptareAfiliere membruGrupResponseAcceptareAfiliere 
									= memService.membruGrup_AcceptareAfiliere(crtuser.getId(), memGrupRequestCerereAfiliere);
		//---
		return ResponseEntity.ok(membruGrupResponseAcceptareAfiliere);
	}
	

    //-----------------------------------------------------------
	@CrossOrigin(origins = "*")
	@PostMapping("/grup/membru/plecare")
	@Transactional(rollbackFor = { SQLException.class })
	public ResponseEntity<MembruGrupResponse_Plecare> plecareMembru(
		                                    @Valid @RequestBody MembruGrupRequest_Plecare memGrupRequestPlecare,
		                                    @CurrentUser UserDetails currentUser) 
    {
		UserDetailsImpl crtuser = (UserDetailsImpl) currentUser;    		
		//--
		MembruGrupResponse_Plecare membruGrupResponsePlecare
									= memService.membruGrup_Plecare(crtuser.getId(), memGrupRequestPlecare);
		//---
		return ResponseEntity.ok(membruGrupResponsePlecare);
	}


	//-----------------------------------------------------------
	@CrossOrigin(origins = "*")
	@PostMapping("/grup/membru/excludere")
	@Transactional(rollbackFor = { SQLException.class })
	public ResponseEntity<MembruGrupResponse_Excludere> excludereMembru(
											@Valid @RequestBody MembruGrupRequest_Excludere memGrupRequestExcludere,
											@CurrentUser UserDetails currentUser) 
	{
		UserDetailsImpl crtuser = (UserDetailsImpl) currentUser;    		
		//--
		MembruGrupResponse_Excludere membruGrupResponseExcludere
									= memService.membruGrup_Excludere(crtuser.getId(), memGrupRequestExcludere);
		//---
		return ResponseEntity.ok(membruGrupResponseExcludere);
	}
	


}

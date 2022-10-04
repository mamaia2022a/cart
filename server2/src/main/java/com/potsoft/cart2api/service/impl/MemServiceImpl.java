package com.potsoft.cart2api.service.impl;

import com.potsoft.cart2api.exception.CartapiException;
import com.potsoft.cart2api.model.aut.AutUser;
import com.potsoft.cart2api.model.aut.AutUserInfo;
//import com.potsoft.cart2api.model.aut.AutUserRol;
import com.potsoft.cart2api.model.gen.GenAcoperireGeografica;
import com.potsoft.cart2api.model.mem.MemGrup;
import com.potsoft.cart2api.model.mem.MemMembru;
import com.potsoft.cart2api.model.mem.MemMembruCI;
import com.potsoft.cart2api.model.mem.MemMembruCotizatie;
import com.potsoft.cart2api.model.mem.MemMembruGrup;
import com.potsoft.cart2api.model.mem.MemMembruRol;
import com.potsoft.cart2api.model.mem.MemMembruTip;
import com.potsoft.cart2api.model.mem.MemSefGrup;
import com.potsoft.cart2api.model.mem.MemTip;
import com.potsoft.cart2api.model.mem.MemTipRol;
import com.potsoft.cart2api.payload.request.mem.GrupRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.GrupRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.GrupRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembriGrupRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruAdresaRequest_Actualizare;
import com.potsoft.cart2api.payload.request.mem.MembruAdresaRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruCIRequest_Actualizare;
import com.potsoft.cart2api.payload.request.mem.MembruCIRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruCIRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruCotizatieRequest_Actualizare;
import com.potsoft.cart2api.payload.request.mem.MembruCotizatieRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruCotizatieRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.MembruCotizatieRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_AcceptareAfiliere;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Activare;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_CerereAfiliere;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Excludere;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Plecare;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.MembruRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruRolRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruRolRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.MembruTipRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruTipRequest_Schimbare;
import com.potsoft.cart2api.payload.request.mem.MembruTipRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.SefGrupRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.SefGrupRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.SefGrupRequest_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.GrupResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.GrupResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.GrupResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembriGrupResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruAdresaResponse_Actualizare;
import com.potsoft.cart2api.payload.response.mem.MembruAdresaResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruCIResponse_Actualizare;
import com.potsoft.cart2api.payload.response.mem.MembruCIResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruCIResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruCotizatieResponse_Actualizare;
import com.potsoft.cart2api.payload.response.mem.MembruCotizatieResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruCotizatieResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.MembruCotizatieResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_AcceptareAfiliere;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Activare;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_CerereAfiliere;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Excludere;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Plecare;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.MembruResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruRolResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruRolResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.MembruTipResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruTipResponse_Schimbare;
import com.potsoft.cart2api.payload.response.mem.MembruTipResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.SefGrupResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.SefGrupResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.SefGrupResponse_Vizualizare;
import com.potsoft.cart2api.repository.mem.MemMembruRepository;
import com.potsoft.cart2api.repository.aut.AutUserInfoRepository;
import com.potsoft.cart2api.repository.aut.AutUserRepository;
//import com.potsoft.cart2api.repository.aut.AutUserRolRepository;
import com.potsoft.cart2api.repository.gen.GenAcoperireGeograficaRepository;
import com.potsoft.cart2api.repository.mem.MemGrupRepository;
import com.potsoft.cart2api.repository.mem.MemMembruCIRepository;
import com.potsoft.cart2api.repository.mem.MemMembruCotizatieRepository;
import com.potsoft.cart2api.repository.mem.MemMembruGrupRepository;
import com.potsoft.cart2api.repository.mem.MemMembruRolRepository;
import com.potsoft.cart2api.repository.mem.MemMembruTipRepository;
import com.potsoft.cart2api.repository.mem.MemSefGrupRepository;
import com.potsoft.cart2api.repository.mem.MemTipRepository;
import com.potsoft.cart2api.repository.mem.MemTipRolRepository;
import com.potsoft.cart2api.service.MemService;
import com.potsoft.cart2api.service.MesService;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;


//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemServiceImpl implements MemService 
{

	@Autowired
	private MesService mesService;

	@Autowired
	private AutUserRepository autUserRepository;

	@Autowired
	private AutUserInfoRepository autUserInfoRepository;

	//@Autowired
	//private AutUserRolRepository autUserRolRepository;

	@Autowired
	private MemTipRepository memTipRepository;

	@Autowired
	private MemTipRolRepository memTipRolRepository;

	@Autowired
	private GenAcoperireGeograficaRepository genAcoperireGeograficaRepository;

	@Autowired
	private MemMembruRepository memMembruRepository;

	@Autowired
	private MemMembruCIRepository memMembruCIRepository;

	@Autowired
	private MemMembruCotizatieRepository memMembruCotizatieRepository;

	@Autowired
	private MemMembruTipRepository memMembruTipRepository;

	@Autowired
	private MemMembruRolRepository memMembruRolRepository;

	@Autowired
	private MemMembruGrupRepository memMembruGrupRepository;

	@Autowired
	private MemSefGrupRepository memSefGrupRepository;

    @Autowired
	private MemGrupRepository memGrupRepository;

	
	@Override
	public MembruResponse_Creare membru_Creare(Long userid, String rolCod)
    {
	  AutUser     autUser     = autUserRepository.loadByAutUserId(userid);
	  AutUserInfo autUserInfo = autUserInfoRepository.loadByAutUserInfoUserid(userid);
	  //AutUserRol  autUserRol  = autUserRolRepository.loadByAutUserRolUseridAndAutUserRolRolcod(userid, rolCod);
	  //---
	  MemTip memTip = memTipRepository.loadByMemTipCod(rolCod);
	  //--- 
	  MemMembru newMemMembru = creazaSiSalveazaMemMembru(autUser, autUserInfo, memTip);
	  //---
	  creazaSiSalveazaMemMembruTip(newMemMembru, memTip);
	  //---
	  GenAcoperireGeografica newMemAcoperireGeografica = 
	                        genAcoperireGeograficaRepository.loadByGenAcoperiregeograficaCod(
								                                                 "TOATE");

	  //---
	  MemTipRol memTipRol = memTipRolRepository.loadByMemTiprolCod(rolCod);
	  creazaSiSalveazaMemMembruRol(newMemMembru, memTipRol, newMemAcoperireGeografica);
	  //---
	  MembruResponse_Creare resp = new MembruResponse_Creare();	
	  return resp;
	}


	@Override
	public MembruResponse_Creare membru_Creare(Long userid, MembruRequest_Creare membruRequestCreare)
	{
	  MembruResponse_Creare resp = new MembruResponse_Creare();	
	  return resp;
	}
  
	@Override
	public MembruResponse_Stergere membru_Stergere(Long userid, MembruRequest_Stergere membruRequestStergere)
	{
	  MembruResponse_Stergere resp = new MembruResponse_Stergere();	
	  return resp;
	}

	@Override
	public MembruResponse_Vizualizare membru_Vizualizare(Long userid, MembruRequest_Vizualizare membruRequestVizualizare)
	{
	  MembruResponse_Vizualizare resp = new MembruResponse_Vizualizare();	
	  return resp;
	}
	
	
	@Override
	public MembruCIResponse_Creare  membruCI_Creare(Long userid, MembruCIRequest_Creare membruCIRequestCreare)
	{
	  MembruCIResponse_Creare resp = new MembruCIResponse_Creare();	
	  return resp;
	}
	

	@Override
	public MembruCIResponse_Actualizare membruCI_Actualizare(Long userid, 
	                                                         MembruCIRequest_Actualizare membruCIRequestActualizare)
	{
	  MembruCIResponse_Actualizare resp = new MembruCIResponse_Actualizare();	
	  return resp;
	}
	

	@Override
	public MembruCIResponse_Vizualizare membruCI_Vizualizare  (Long userid, 
	                                                           MembruCIRequest_Vizualizare membruCIRequestVizualizare)
	{
	  MembruCIResponse_Vizualizare resp = new MembruCIResponse_Vizualizare();	
	  return resp;
	}
  


	@Override
	public MembruCotizatieResponse_Creare membruCotizatie_Creare(Long userid, 
	                                                             MembruCotizatieRequest_Creare membruCotizatieRequestCreare)
	{
	  MembruCotizatieResponse_Creare resp = new MembruCotizatieResponse_Creare();	
	  return resp;
	}

	@Override
	public MembruCotizatieResponse_Actualizare membruCotizatie_Actualizare(Long userid, 
	                                                           MembruCotizatieRequest_Actualizare membruCotizatieRequestActualizare)
	{
	  MembruCotizatieResponse_Actualizare resp = new MembruCotizatieResponse_Actualizare();	
	  return resp;
	}
	
	@Override
	public MembruCotizatieResponse_Stergere membruCotizatie_Stergere(Long userid, MembruCotizatieRequest_Stergere    membruCotizatieRequestStergere)
	{
	  MembruCotizatieResponse_Stergere resp = new MembruCotizatieResponse_Stergere();	
	  return resp;
	}
	
	@Override
	public MembruCotizatieResponse_Vizualizare  membruCotizatie_Vizualizare(Long userid, 
	                                                MembruCotizatieRequest_Vizualizare membruCotizatieRequestVizualizare)
	{
	  MembruCotizatieResponse_Vizualizare resp = new MembruCotizatieResponse_Vizualizare();	
	  return resp;
	}
  

	@Override
	public MembruAdresaResponse_Actualizare membruAdresa_Actualizare(Long userid, 
	                                                MembruAdresaRequest_Actualizare membruCIRequestActualizare)
	{
	  MembruAdresaResponse_Actualizare resp = new MembruAdresaResponse_Actualizare();	
	  return resp;
	}


	@Override
	public MembruAdresaResponse_Vizualizare membruAdresa_Vizualizare(Long userid, MembruAdresaRequest_Vizualizare membruCIRequestVizualizare)
  	{
	  MembruAdresaResponse_Vizualizare resp = new MembruAdresaResponse_Vizualizare();	
	  return resp;
	}

  
	@Override
	public MembruTipResponse_Creare membruTip_Creare(Long userid, MembruTipRequest_Creare membruTipRequestCreare)
	{
	  MembruTipResponse_Creare resp = new MembruTipResponse_Creare();	
	  return resp;
	}
	
	@Override
	public MembruTipResponse_Stergere membruTip_Stergere(Long userid, MembruTipRequest_Stergere membruTipRequestStergere)
	{
	  MembruTipResponse_Stergere resp = new MembruTipResponse_Stergere();	
	  return resp;
	}

	//used
	@Override
	public MembruTipResponse_Schimbare  membruTip_Schimbare(Long userid, MembruTipRequest_Schimbare  membruTipRequestSchimbare)
	{
	  String crtMemTipCod    = membruTipRequestSchimbare.getCrtmemtipcod();
	  String newMemTipCod    = membruTipRequestSchimbare.getNewmemtipcod();
	  String crtMemTiprolCod = membruTipRequestSchimbare.getCrtmemrolcod();
	  String newMemTiprolCod = membruTipRequestSchimbare.getNewmemrolcod();  
	  return schimbaretipMemMembru(userid, crtMemTipCod, newMemTipCod, crtMemTiprolCod, newMemTiprolCod);
	}


	//used
	@Override
	public MembruTipResponse_Schimbare  schimbaretipMemMembru(Long userid, String crtMemTipCod, String newMemTipCod, 
	                                                         String crtMemTiprolCod, String newMemTiprolCod)
	{
	  MembruTipResponse_Schimbare resp = new MembruTipResponse_Schimbare();	
      //--  
	  if ( 
		   ( crtMemTipCod.equals("SIMPATIZ") && newMemTipCod.equals("MEMINCNFL") ) ||
		   //-- un membru incepator devine membru activ (afiliat sau nu)
		   (crtMemTipCod.equals("MEMINCNFL") && newMemTipCod.equals("MEMACTNFL")) ||
	       (crtMemTipCod.equals("MEMINCAFL") && newMemTipCod.equals("MEMACTAFL")) ||
		   //-- un membru activ devine membru experimentat (afiliat sau nu)
		   (crtMemTipCod.equals("MEMACTNFL") && newMemTipCod.equals("MEMEXPNFL")) ||
		   (crtMemTipCod.equals("MEMACTAFL") && newMemTipCod.equals("MEMEXPAFL")) ||
		   //-- un membru activ sau experimentat Neafiliat isi formeaza propriul grup
		   (crtMemTipCod.equals("MEMACTNFL") && newMemTipCod.equals("SEFGRUP")) ||
		   (crtMemTipCod.equals("MEMEXPNFL") && newMemTipCod.equals("SEFGRUP")) ||
		   //-- un sef de grup isi desfiinteaza grupul 
		   (crtMemTipCod.equals("SEFGRUP")  && newMemTipCod.equals("MEMACTNFL")) ||
		   (crtMemTipCod.equals("SEFGRUP")  && newMemTipCod.equals("MEMEXPNFL")) ||
		   //-- un membrul incepator sau activ sau experimentat se dezafiliaza de la grup
		   (crtMemTipCod.equals("MEMINCAFL") && newMemTipCod.equals("MEMINCNFL")) ||
		   (crtMemTipCod.equals("MEMACTAFL") && newMemTipCod.equals("MEMACTNFL")) ||
		   (crtMemTipCod.equals("MEMEXPAFL") && newMemTipCod.equals("MEMEXPNFL"))
	     )
	  {
		//MemTip memCrtTip = memTipRepository.loadByMemTipCod(crtMemTipCod);
		MemTip memNewTip = memTipRepository.loadByMemTipCod(newMemTipCod);
		//--
		memMembruRepository.schimbaMembruTip(userid, memNewTip.getMemTipId(), memNewTip.getMemTipCod());
		MemMembru memMembru = memMembruRepository.loadByMemMembruUserid(userid);
		//--
        memMembruTipRepository.dezactiveazaMemMembruTip(userid, crtMemTipCod);
		creazaSiSalveazaMemMembruTip(memMembru, memNewTip);
		//--
		//MemTipRol memCrtTipRol = memTipRolRepository.loadByMemTiprolCod(crtMemTiprolCod);
		MemTipRol memNewTipRol = memTipRolRepository.loadByMemTiprolCod(newMemTiprolCod);
		GenAcoperireGeografica newGenAcoperireGeografica = 
		                genAcoperireGeograficaRepository.loadByGenAcoperiregeograficaCod("TOATE");

        memMembruRolRepository.dezactiveazaMemMembruRol(userid, crtMemTiprolCod);
		creazaSiSalveazaMemMembruRol(memMembru, memNewTipRol, newGenAcoperireGeografica);
		return resp;
	  }
	  throw new CartapiException(HttpStatus.BAD_REQUEST, "Nu se poate schimba tipul membrului de la : "
	                                                             + crtMemTipCod + " la: " + newMemTipCod);
	}


	@Override
	public MembruRolResponse_Creare membruRol_Creare(Long userid, MembruRolRequest_Creare membruRolRequestCreare)
	{
	  MembruRolResponse_Creare resp = new MembruRolResponse_Creare();	
	  return resp;
	}

	@Override
	public MembruRolResponse_Stergere membruRol_Stergere(Long userid, MembruRolRequest_Stergere membruRolRequestStergere)
	{
	  MembruRolResponse_Stergere resp = new MembruRolResponse_Stergere();	
	  return resp;
	}
  
	
    //used
	@Override
	public MembruGrupResponse_CerereAfiliere membruGrup_CerereAfiliere(Long userid, 
                                             MembruGrupRequest_CerereAfiliere membruGrupRequestCerereAfiliere)
	{
	  MemMembru memMembru = memMembruRepository.loadByMemMembruUserid(userid);
	  String   crtMemTipCod = memMembru.getMemMembruTipCod();
	  MembruGrupResponse_CerereAfiliere resp = new MembruGrupResponse_CerereAfiliere();	
	  //--  
	  if ( //-- un membru incepator sau activ sau experimentat Neafiliat se poate afilia la un grup
	      (crtMemTipCod.equals("MEMINCNFL")) || 
		  (crtMemTipCod.equals("MEMACTNFL")) || 
		  (crtMemTipCod.equals("MEMEXPNFL"))
		 )		
	  {
		//---
		String grupCodunic = membruGrupRequestCerereAfiliere.getGrupcodunic();
		MemGrup memGrup = memGrupRepository.loadByMemGrupCodunic(grupCodunic);
		//---//ma
		//MemMembruGrup newMembruGrup = 
		creazaSiSalveazaMemMembruGrup(memMembru, memGrup);
		//---
		mesService.creazaSiSalveazaMesaj( userid,  crtMemTipCod,
		                                  memGrup.getMemGrupSefgrupuserid(), "SEFGRUP",
	                                      "CERAFLGRUP");
		return resp;
	  }
	  throw new CartapiException(HttpStatus.BAD_REQUEST, "Nu aveti dreptul sa va afiliati la un Grup");
	}


	//used
	@Override
	public MembruGrupResponse_AcceptareAfiliere membruGrup_AcceptareAfiliere(Long userid, 
                                                 MembruGrupRequest_AcceptareAfiliere  membruGrupRequestAcceptareAfiliere)
	{
	  Long newMembruId = membruGrupRequestAcceptareAfiliere.getMembruId();
	  MemMembru memMembru = memMembruRepository.loadByMemMembruId(newMembruId);
	  String   crtMemTipCod = memMembru.getMemMembruTipCod();
	  MembruGrupResponse_AcceptareAfiliere resp = new MembruGrupResponse_AcceptareAfiliere();	
	  //--  
	  if ( //-- un membru incepator sau activ sau experimentat Neafiliat se poate afilia la un grup
	      (crtMemTipCod.equals("MEMINCNFL")) || 
		  (crtMemTipCod.equals("MEMACTNFL")) || 
		  (crtMemTipCod.equals("MEMEXPNFL"))
		 )		
	  {
		//---
		String acceptareyn = membruGrupRequestAcceptareAfiliere.getAcceptareyn();
		String tipMesajCod;
		if (acceptareyn.equals("y"))
		  tipMesajCod = "ACCAFLGRUP";
		else
		  tipMesajCod = "REFAFLGRUP";
        //--
		Long memMembruUserid = memMembru.getMemMembruUserid();
		//--
		memMembruGrupRepository.acceptareAfiliere(memMembruUserid, acceptareyn);
        //---
		mesService.creazaSiSalveazaMesaj( userid,  "SEFGRUP",
		                                  memMembruUserid,  crtMemTipCod,
	                                      tipMesajCod);
		return resp;
	  }
	  throw new CartapiException(HttpStatus.BAD_REQUEST, "Nu aveti dreptul sa acceptati afilierea acestui Membru la Grup");
	}


	//used
	@Override
    public MembruGrupResponse_Activare membruGrup_Activare(Long userid, 
	                                                MembruGrupRequest_Activare membruGrupRequestActivare)
  	{
	  MemMembru     memMembru     = memMembruRepository.loadByMemMembruUserid(userid);
	  MemMembruGrup memMembruGrup = memMembruGrupRepository.loadByMemMembrugrupUserid(userid);
	  String crtMemTipCod         = memMembru.getMemMembruTipCod();
	  MemTip memTip               = memTipRepository.loadByMemTipCod(crtMemTipCod);
	  String crtMemRolCod         = crtMemTipCod;
	  String newMemTipCod         = null;
	  String newMemRolCod         = null;
	  MembruGrupResponse_Activare resp = new MembruGrupResponse_Activare();	
	  //--  
	  if ( //-- un membru incepator sau activ sau experimentat Neafiliat se poate afilia la un grup
	      (crtMemTipCod.equals("MEMINCNFL")) || 
		  (crtMemTipCod.equals("MEMACTNFL")) || 
		  (crtMemTipCod.equals("MEMEXPNFL"))
		 )		
	  {
		crtMemRolCod = crtMemTipCod;
		newMemTipCod = null;
		if (crtMemTipCod.equals("MEMINCNFL"))
		  newMemTipCod = "MEMINCAFL";
		if (crtMemTipCod.equals("MEMACTNFL"))
		  newMemTipCod = "MEMACTAFL";
		if (crtMemTipCod.equals("MEMEXPNFL"))
		  newMemTipCod = "MEMEXPAFL";
	    //--
		Long    memNewTipid    = memTip.getMemTipId();
		String  memNewTipcod   = memTip.getMemTipCod();
		Long    memGrupId      = memMembruGrup.getMemMembrugrupGrupid();
		String  memGrupNume    = memMembruGrup.getMemMembrugrupGrupnume();
		String  memGrupCodunic = memMembruGrup.getMemMembrugrupGrupcodunic();
		memMembruRepository.afiliereGrup(userid, memNewTipid, memNewTipcod, memGrupId, memGrupNume, memGrupCodunic);
        //memMembruRepository.dezafiliereGrup(userid, memNewTipid, memNewTipcod);
		//--
		schimbaretipMemMembru( userid, crtMemTipCod, crtMemRolCod,
		                               newMemTipCod, newMemRolCod);
		//--
		memMembruGrupRepository.activare(userid);
        //---
		//mesService.creazaSiSalveazaMesaj( userid,  "SEFGRUP",
		//                                  memMembruUserid,  crtMemTipCod,
	    //                                  tipMesajCod);
		return resp;
	  }
	  throw new CartapiException(HttpStatus.BAD_REQUEST, "Nu aveti dreptul sa activați afilierea la Grup");
	}

	
	//used
	@Override
    public MembruGrupResponse_Plecare membruGrup_Plecare(Long userid, 
	                                                MembruGrupRequest_Plecare  membruGrupRequestPlecare)
  	{
	  MemMembru memMembru         = memMembruRepository.loadByMemMembruUserid(userid);
	  String crtMemTipCod         = memMembru.getMemMembruTipCod();
	  String crtMemRolCod         = crtMemTipCod;
	  String newMemTipCod         = null;
	  String newMemRolCod         = null;
	  MembruGrupResponse_Plecare resp = new MembruGrupResponse_Plecare();	
	  //--  
	  if ( //-- un membru incepator sau activ sau experimentat Neafiliat se poate afilia la un grup
	      (crtMemTipCod.equals("MEMINCAFL")) || 
		  (crtMemTipCod.equals("MEMACTAFL")) || 
		  (crtMemTipCod.equals("MEMEXPAFL"))
		 )		
	  {
		crtMemRolCod = crtMemTipCod;
		newMemTipCod = null;
		if (crtMemTipCod.equals("MEMINCAFL"))
		  newMemTipCod = "MEMINCNFL";
		if (crtMemTipCod.equals("MEMACTAFL"))
		  newMemTipCod = "MEMACTNFL";
		if (crtMemTipCod.equals("MEMEXPAFL"))
		  newMemTipCod = "MEMEXPNFL";
	    //--
		MemTip  newMemTip      = memTipRepository.loadByMemTipCod(newMemTipCod);
		Long    memNewTipid    = newMemTip.getMemTipId();
		String  memNewTipcod   = newMemTip.getMemTipCod();
        memMembruRepository.dezafiliereGrup(userid, memNewTipid, memNewTipcod);
		//--
		schimbaretipMemMembru( userid, crtMemTipCod, crtMemRolCod,
		                               newMemTipCod, newMemRolCod);
		//--
		memMembruGrupRepository.plecare(userid);
        //---
		//mesService.creazaSiSalveazaMesaj( userid,  "SEFGRUP",
		//                                  memMembruUserid,  crtMemTipCod,
	    //                                  tipMesajCod);
		return resp;
	  }
	  throw new CartapiException(HttpStatus.BAD_REQUEST, "Nu aveti dreptul sa activați plecarea din Grup");	  
	}


	//used
	@Override
    public MembruGrupResponse_Excludere membruGrup_Excludere(Long userid, 
	                                                MembruGrupRequest_Excludere  membruGrupRequestExcludere)
  	{
	  Long membruId = membruGrupRequestExcludere.getMembruId();
	  MemMembru memMembru         = memMembruRepository.loadByMemMembruId(membruId);
	  String crtMemTipCod         = memMembru.getMemMembruTipCod();
	  String crtMemRolCod         = crtMemTipCod;
	  String newMemTipCod         = null;
	  String newMemRolCod         = null;
	  MembruGrupResponse_Excludere resp = new MembruGrupResponse_Excludere();	
	  //--  
	  if ( //-- un membru incepator sau activ sau experimentat Neafiliat se poate afilia la un grup
	      (crtMemTipCod.equals("MEMINCAFL")) || 
		  (crtMemTipCod.equals("MEMACTAFL")) || 
		  (crtMemTipCod.equals("MEMEXPAFL"))
		 )		
	  {
		crtMemRolCod = crtMemTipCod;
		newMemTipCod = null;
		if (crtMemTipCod.equals("MEMINCAFL"))
		  newMemTipCod = "MEMINCNFL";
		if (crtMemTipCod.equals("MEMACTAFL"))
		  newMemTipCod = "MEMACTNFL";
		if (crtMemTipCod.equals("MEMEXPAFL"))
		  newMemTipCod = "MEMEXPNFL";
	    //--
		MemTip  newMemTip      = memTipRepository.loadByMemTipCod(newMemTipCod);
		Long    memNewTipid    = newMemTip.getMemTipId();
		String  memNewTipcod   = newMemTip.getMemTipCod();
        memMembruRepository.dezafiliereGrup(userid, memNewTipid, memNewTipcod);
		//--
		schimbaretipMemMembru( userid, crtMemTipCod, crtMemRolCod,
		                               newMemTipCod, newMemRolCod);
		//--
		memMembruGrupRepository.excludere(userid);
        //---
		//mesService.creazaSiSalveazaMesaj( userid,  "SEFGRUP",
		//                                  memMembruUserid,  crtMemTipCod,
	    //                                  tipMesajCod);
		return resp;
	  }
	  throw new CartapiException(HttpStatus.BAD_REQUEST, "Nu aveti dreptul sa activați plecarea din Grup");	  
	}


	@Override
	public MembruGrupResponse_Creare membruGrup_Creare(Long userid, MembruGrupRequest_Creare membruGrupRequestCreare)
	{
	  MembruGrupResponse_Creare resp = new MembruGrupResponse_Creare();	
	  return resp;
	}

	
	@Override
	public MembruGrupResponse_Stergere membruGrup_Stergere(Long userid, MembruGrupRequest_Stergere membruGrupRequestStergere)
	{
	  MembruGrupResponse_Stergere resp = new MembruGrupResponse_Stergere();	
	  return resp;
	}


	@Override
	public MembruGrupResponse_Vizualizare membruGrup_Vizualizare(Long userid, MembruGrupRequest_Vizualizare membruGrupRequestVizualizare)
	{
	  MembruGrupResponse_Vizualizare resp = new MembruGrupResponse_Vizualizare();	
	  return resp;
	}
  

	@Override
	public SefGrupResponse_Creare sefGrup_Creare(Long userid, SefGrupRequest_Creare sefGrupRequestCreare)
	{
	  SefGrupResponse_Creare resp = new SefGrupResponse_Creare();	
	  return resp;
	}

	@Override
	public SefGrupResponse_Stergere sefGrup_Stergere(Long userid, SefGrupRequest_Stergere sefGrupRequestStergere)
	{
	  SefGrupResponse_Stergere resp = new SefGrupResponse_Stergere();	
	  return resp;
	}

	@Override
	public SefGrupResponse_Vizualizare sefGrup_Vizualizare(Long userid, SefGrupRequest_Vizualizare sefGrupRequestVizualizare)
	{
	  SefGrupResponse_Vizualizare resp = new SefGrupResponse_Vizualizare();	
	  return resp;
	}
  

	@Override
	public GrupResponse_Vizualizare  grup_Vizualizare(Long userid, GrupRequest_Vizualizare grupRequestVizualizare)
  	{
	  MemMembru memMembru   = memMembruRepository.loadByMemMembruUserid(userid);
	  MemSefGrup memSefGrup = memSefGrupRepository.loadByMemSefgrupUserid(userid);
	  Long grupId           = memSefGrup.getMemSefgrupGrupid();
	  String   crtMemTipCod = memMembru.getMemMembruTipCod();
	  GrupResponse_Vizualizare resp = new GrupResponse_Vizualizare();	
	  //--  
	  if ( //-- un sef grup isi desfiinteaza grupul
		  (crtMemTipCod.equals("SEFGRUP"))
		 )		
	  {
		//---
		MemGrup memGrup = memGrupRepository.loadByMemGrupId(grupId);
		List<MemMembruGrup> membriGrup = memMembruGrupRepository.loadMembriGrup(grupId); //findByMemMembrugrupGrupid(grupId);	
		//---
		resp.setMembriGrup(membriGrup);
		resp.setMembru(memMembru);
		resp.setGrup(memGrup);
		resp.setSefGrup(memSefGrup);
	    return resp;
	  }
	  throw new CartapiException(HttpStatus.BAD_REQUEST, "Nu aveti dreptul sa Vizualizați Grupul.");

	}


	//used
	@Override
	public GrupResponse_Creare grup_Creare(Long userid, GrupRequest_Creare grupRequestCreare)
  	{
	  String numeGrup = grupRequestCreare.getGrupnume();
	  MemMembru memMembru = memMembruRepository.loadByMemMembruUserid(userid);
	  String   crtMemTipCod = memMembru.getMemMembruTipCod();
	  String   crtMemTiprolCod = crtMemTipCod;
	  GrupResponse_Creare resp = new GrupResponse_Creare();	
	  //--  
	  if ( //-- un membru activ sau experimentat neafiliat poate crea un grup
		  (crtMemTipCod.equals("MEMACTNFL")) ||
		  (crtMemTipCod.equals("MEMEXPNFL"))
		 )		
	  {
		//--
		schimbaretipMemMembru(userid, crtMemTipCod, "SEFGRUP", crtMemTiprolCod, "SEFGRUP");
		//--
		MemSefGrup newMemSefGrup = creazaSiSalveazaMemSefGrup(memMembru);
        //--
		MemGrup newMemGrup = creazaSiSalveazaMemGrup(newMemSefGrup, grupRequestCreare);
		//--
	    MemTip  newMemTip      = memTipRepository.loadByMemTipCod("SEFGRUP");
		Long    memNewTipid    = newMemTip.getMemTipId();
		String  memNewTipcod   = newMemTip.getMemTipCod();
		Long    memGrupId      = newMemGrup.getMemGrupId();
		String  memGrupNume    = newMemGrup.getMemGrupNume();
		String  memGrupCodunic = newMemGrup.getMemGrupCodunic();
		memMembruRepository.afiliereGrup(userid, memNewTipid, memNewTipcod, memGrupId, memGrupNume, memGrupCodunic);
	    //---
		memSefGrupRepository.actualizaregrupMemSefGrup( userid, memGrupId, memGrupNume, memGrupCodunic);
        //---
		MemMembruGrup newMemMembruGrup = creazaMemMembruGrup(memMembru, newMemGrup);
		newMemMembruGrup.setMemMembrugrupActivyn("y");
		newMemMembruGrup.setMemMembrugrupCerereyn("n");
		memMembruGrupRepository.save(newMemMembruGrup);
		//---
		resp.setMemgrup(newMemGrup);
		return resp;
	  }
	  throw new CartapiException(HttpStatus.BAD_REQUEST, "Nu aveti dreptul sa creați Grupul  : "
																+ numeGrup );
	}


	@Override
	public GrupResponse_Stergere grup_Stergere(Long userid, GrupRequest_Stergere grupRequestStergere)
	{
	  String numeGrup = grupRequestStergere.getGrupnume();
	  MemMembru memMembru = memMembruRepository.loadByMemMembruUserid(userid);
	  String   crtMemTipCod = memMembru.getMemMembruTipCod();
	  //String   crtMemTiprolCod = crtMemTipCod;
	  GrupResponse_Stergere resp = new GrupResponse_Stergere();	
	  //--  
	  if ( //-- un sef grup isi desfiinteaza grupul
		  (crtMemTipCod.equals("SEFGRUP"))
		 )		
	  {
		//--
		schimbaretipMemMembru(userid, "SEFGRUP", "MEMEXPNFL", 
		                              "SEFGRUP", "MEMEXPNFL");
		//--
		memSefGrupRepository.dezactiveazaMemSefGrup(userid);
		//--
		memGrupRepository.dezactiveazaMemGrup(userid);		
		//--
		Long grupId  = memMembru.getMemMembruGrupid();
		List<MemMembruGrup> listaMembriGrup = memMembruGrupRepository.loadMembriGrup(grupId); //findByMemMembrugrupGrupid(grupId);	
		for (MemMembruGrup memMembruGrup : listaMembriGrup)
		{	
          membruGrup_Plecare(memMembruGrup.getMemMembrugrupUserid(), null);
		}	  
	    return resp;
	  }
	  throw new CartapiException(HttpStatus.BAD_REQUEST, "Nu aveti dreptul sa stergeti Grupul  : "
	                                                     + numeGrup );
	}
  

	//------------------------------------------------
	//
	@Override
	public MembriGrupResponse_Vizualizare membriGrup_Vizualizare(Long userid, MembriGrupRequest_Vizualizare grupRequestVizualizare)
	{
	  return null;
	}
  

	//=============================================
	// Basic Functionalities
	//=============================================


	// -----------------------------------------------------------
    public String genereazaCodUnic(String prefix, String value1, String value2)
	{
	  Random random = new Random();
	  String codUnic = prefix;	
	  //---
      if (value1.length() <= 1)
	    codUnic = codUnic + value1;
	  else if (value1.length() <= 2)
	    codUnic = codUnic + value1;
	  else if (value1.length() <= 3)
	    codUnic = codUnic + value1;
      else
	    codUnic = codUnic + value1.substring(0, 3);
	  //---
      if (value1.length() <= 1)
	    codUnic = codUnic + value2;
	  else if (value2.length() <= 2)
	    codUnic = codUnic + value2;
	  else if (value2.length() <= 3)
	    codUnic = codUnic + value2;
      else
	    codUnic = codUnic + value2.substring(0, 1);
	  //---
	  int rnd = random.nextInt(1000000);
	  if (rnd < 10)
	    codUnic = codUnic + "00000" + rnd;
	  else if (rnd < 100)
	    codUnic = codUnic + "0000" + rnd;
	  else if (rnd < 1000)
	    codUnic = codUnic + "000" + rnd;
	  else if (rnd < 10000)
	    codUnic = codUnic + "00" + rnd;
	  else if (rnd < 100000)
	    codUnic = codUnic + "0" + rnd;
	  else
	    codUnic = codUnic + rnd;
	  return codUnic;
	}


	// -----------------------------------------------------------
	@Override
	public MemMembru creazaMemMembru(AutUser autUser, AutUserInfo autUserInfo, MemTip memTip)
	{
		Long   memid                = null; 
		String memCodunic           = genereazaCodUnic("M", autUserInfo.getAutUserInfoNume(),
		                                                            autUserInfo.getAutUserInfoPrenume()) ;

		Long   memUserid            = autUser.getAutUserId();
		String memUsernume          = autUser.getAutUserNume();
		Long   memUserinfoid        = autUserInfo.getAutUserInfoId();

		Long   memTipid             = memTip.getMemTipId();
		String memTipcod            = memTip.getMemTipCod();

		Long   memGrupid            = null;
		String memGrupnume          = null;
		String memGrupcodunic       = null;

		String memAdrrezidentayn    = autUserInfo.getAutUserInfoRezdifdedom();
		Long   memZonataraid        = autUserInfo.getAutUserInfoDomZonaTaraid();
		String memZonataracod       = autUserInfo.getAutUserInfoDomZonaTaracod();
		Long   memJudetid           = autUserInfo.getAutUserInfoDomJudetid();
		String memJudetcod          = autUserInfo.getAutUserInfoDomJudetcod();
		Long   memUatid             = autUserInfo.getAutUserInfoDomUatid();
		Long   memUatcod            = autUserInfo.getAutUserInfoDomUatcod();
		Long   memLocalitateid      = autUserInfo.getAutUserInfoDomLocalitateid();
		Long   memLocalitatecod     = autUserInfo.getAutUserInfoDomLocalitatecod();
		Long   memZonajudetid       = 0l;
		String memZonajudetcod      = "0";
		Long   memZonauatid         = 0l;
		String memZonauatcod        = "0";
		Long   memZonalocalitateid  = 0l;
		String memZonalocalitatecod = "0";
		Long   memSectievotareid    = 0l;
		Long   memSectievotarenr    = 0l;
		Long   memCodpostalid       = 0l;
		String memCodpostalcod      = "0";
        if (autUserInfo.getAutUserInfoRezdifdedom().equals("y"))
		{
		  memZonataraid    = autUserInfo.getAutUserInfoRezZonaTaraid();
		  memZonataracod   = autUserInfo.getAutUserInfoRezZonaTaracod();
		  memJudetid       = autUserInfo.getAutUserInfoRezJudetid();
		  memJudetcod      = autUserInfo.getAutUserInfoRezJudetcod();
	      memUatid         = autUserInfo.getAutUserInfoRezUatid();
		  memUatcod        = autUserInfo.getAutUserInfoRezUatcod();
	      memLocalitateid  = autUserInfo.getAutUserInfoRezLocalitateid();
		  memLocalitatecod = autUserInfo.getAutUserInfoRezLocalitatecod();
		}

		String memActivyn           = "y";
		String memStartdt           = null;
		String memEnddt             = null;

		String memComplciyn         = "n";
		String memCompladryn        = "n";
		String memPlatitcotizyn     = "n";
		String memComplSkillsyn     = "n";

		String memSuspendedyn       = "n";

		MemMembru newMemMembru = new MemMembru(memid, memCodunic,
		                                       memUserid, memUsernume, memUserinfoid,
		                                       memTipid, memTipcod, 
		                                       memGrupid, memGrupnume, memGrupcodunic,
		                                       memAdrrezidentayn,
		                                       memZonataraid, memZonataracod, memJudetid, memJudetcod, 
		                                       memUatid, memUatcod, 
		                                       memLocalitateid, memLocalitatecod, 
		                                       memZonajudetid, memZonajudetcod, 
		                                       memZonauatid, memZonauatcod, 
		                                       memZonalocalitateid, memZonalocalitatecod,  
		                                       memSectievotareid, memSectievotarenr, 
		                                       memCodpostalid, memCodpostalcod,
		                                       memActivyn, memStartdt,  memEnddt,
		                                       memComplciyn, memCompladryn,  memPlatitcotizyn,
		                                       memComplSkillsyn, memSuspendedyn); 
		return newMemMembru;
	}


	// -----------------------------------------------------------
	@Override
	public MemMembru creazaSiSalveazaMemMembru(AutUser autUser, AutUserInfo autUserInfo, MemTip memTip)
	{
	  MemMembru newMemMembru  = this.creazaMemMembru(autUser, autUserInfo, memTip);
	  memMembruRepository.save(newMemMembru);
	  return newMemMembru;
	}

	


	// -----------------------------------------------------------
	@Override
	public MemMembruTip  creazaMemMembruTip(MemMembru memMembru, MemTip memTip)
    {
		Long memMembruTipId = null;
		
		Long memMembruTipMembruid        = memMembru.getMemMembruId();
		String memMembruTipMembrucodunic = memMembru.getMemMembruCodunic();

		Long memMembruTipUserid          = memMembru.getMemMembruUserid();
		String memMembruTipUsernume      = memMembru.getMemMembruUsernume();
		Long memMembruTipUserinfoid      = memMembru.getMemMembruUserinfoid();

		Long memMembruTipTipid           = memTip.getMemTipId(); 
		String memMembruTipTipcod        = memTip.getMemTipCod();

		String memMembruTipActivyn       = "y";
		String memMembruTipStartdt       = null;
		String memMembruTipEnddt         = null;

		Long   memMembruTipZonataraid        = memMembru.getMemMembruZonataraid();
		String memMembruTipZonataracod       = memMembru.getMemMembruZonataracod();
		Long   memMembruTipJudetid           = memMembru.getMemMembruJudetid();
		String memMembruTipJudetcod          = memMembru.getMemMembruJudetcod();
		Long   memMembruTipUatid             = memMembru.getMemMembruUatid();
		Long   memMembruTipUatcod            = memMembru.getMemMembruUatcod();
		Long   memMembruTipLocalitateid      = memMembru.getMemMembruLocalitateid();
		Long   memMembruTipLocalitatecod     = memMembru.getMemMembruLocalitatecod();
		Long   memMembruTipZonajudetid       = 0l;
		String memMembruTipZonajudetcod      = "0";
		Long   memMembruTipZonauatid         = 0l;
		String memMembruTipZonauatcod        = "0";
		Long   memMembruTipZonalocalitateid  = 0l;
		String memMembruTipZonalocalitatecod = "0";
		Long   memMembruTipSectievotareid    = 0l;
		Long   memMembruTipSectievotarenr    = 0l;
		Long   memMembruTipCodpostalid       = 0l;
		String memMembruTipCodpostalcod      = "0";

		MemMembruTip newAutMemMembruTip = new MemMembruTip( memMembruTipId, 
		                                                memMembruTipMembruid, memMembruTipMembrucodunic,
		                                                memMembruTipUserid, memMembruTipUsernume, memMembruTipUserinfoid,
		                                                memMembruTipTipid, memMembruTipTipcod, 
		                                                memMembruTipActivyn, memMembruTipStartdt, memMembruTipEnddt,
		                                                memMembruTipZonataraid, memMembruTipZonataracod, 
		                                                memMembruTipJudetid, memMembruTipJudetcod, 
		                                                memMembruTipUatid, memMembruTipUatcod, 
		                                                memMembruTipLocalitateid, memMembruTipLocalitatecod, 
		                                                memMembruTipZonajudetid, memMembruTipZonajudetcod, 
		                                                memMembruTipZonauatid, memMembruTipZonauatcod, 
		                                                memMembruTipZonalocalitateid, memMembruTipZonalocalitatecod,  
		                                                memMembruTipSectievotareid, memMembruTipSectievotarenr, 
		                                                memMembruTipCodpostalid, memMembruTipCodpostalcod); 		
	    return newAutMemMembruTip;
	}

	
	// -----------------------------------------------------------
	@Override
	public MemMembruTip  creazaSiSalveazaMemMembruTip(MemMembru memMembru, MemTip memTip)
    {
	  MemMembruTip newMemMembruTip  = this.creazaMemMembruTip(memMembru, memTip);
	  memMembruTipRepository.save(newMemMembruTip);
	  return newMemMembruTip;
	}
	
	
	
	// -----------------------------------------------------------
	@Override
	public MemMembruRol creazaMemMembruRol(MemMembru memMembru, MemTipRol memTipRol, GenAcoperireGeografica acoperireGeografica)
    {
		Long memMembruRolId               = null;

		Long memMembruRolMembruid         = memMembru.getMemMembruId();
		String memMembruRolMembrucodunic  = memMembru.getMemMembruCodunic();

		Long memMembruRolUserid           = memMembru.getMemMembruUserid();
		String memMembruRolUsernume       = memMembru.getMemMembruUsernume();
		Long memMembruRolUserinfoid       = memMembru.getMemMembruUserinfoid();

		Long memMembruRolTiprolid         = memTipRol.getMemTipRolId(); 
		String memMembruRolTiprolcod      = memTipRol.getMemTipRolCod();
		
		Long memMembruRolAcopgeoid        = acoperireGeografica.getGenAcoperiregeograficaId();
		String memMembruRolAcopgeocod     = acoperireGeografica.getGenAcoperiregeograficaCod();

		String memMembruRolActivyn        = "y";
		String memMembruRolStartdt        = null;
		String memMembruRolEnddt          = null;

		Long   memMembruRolZonataraid        = memMembru.getMemMembruZonataraid();
		String memMembruRolZonataracod       = memMembru.getMemMembruZonataracod();
		Long   memMembruRolJudetid           = memMembru.getMemMembruJudetid();
		String memMembruRolJudetcod          = memMembru.getMemMembruJudetcod();
		Long   memMembruRolUatid             = memMembru.getMemMembruUatid();
		Long   memMembruRolUatcod            = memMembru.getMemMembruUatcod();
		Long   memMembruRolLocalitateid      = memMembru.getMemMembruLocalitateid();
		Long   memMembruRolLocalitatecod     = memMembru.getMemMembruLocalitatecod();
		Long   memMembruRolZonajudetid       = 0l;
		String memMembruRolZonajudetcod      = "0";
		Long   memMembruRolZonauatid         = 0l;
		String memMembruRolZonauatcod        = "0";
		Long   memMembruRolZonalocalitateid  = 0l;
		String memMembruRolZonalocalitatecod = "0";
		Long   memMembruRolSectievotareid    = 0l;
		Long   memMembruRolSectievotarenr    = 0l;
		Long   memMembruRolCodpostalid       = 0l;
		String memMembruRolCodpostalcod      = "0";

		String memMembrurolInvitatieyn       = "n";
		String memMembrurolAcceptareyn       = "n";
		String memMembrurolPlecareyn         = "n";
		String memMembrurolEliberareyn       = "n";

		MemMembruRol newMemMembruRol =  new MemMembruRol( memMembruRolId, 
		                                                  memMembruRolMembruid, memMembruRolMembrucodunic,
		                                                  memMembruRolUserid, memMembruRolUsernume, memMembruRolUserinfoid, 
		                                                  memMembruRolTiprolid, memMembruRolTiprolcod, 
		                                                  memMembruRolAcopgeoid, memMembruRolAcopgeocod, 
		                                                  memMembruRolActivyn, memMembruRolStartdt, memMembruRolEnddt,
		                                                  memMembruRolZonataraid, memMembruRolZonataracod, 
		                                                  memMembruRolJudetid, memMembruRolJudetcod, 
		                                                  memMembruRolUatid, memMembruRolUatcod, 
		                                                  memMembruRolLocalitateid, memMembruRolLocalitatecod, 
		                                                  memMembruRolZonajudetid, memMembruRolZonajudetcod, 
		                                                  memMembruRolZonauatid, memMembruRolZonauatcod, 
		                                                  memMembruRolZonalocalitateid, memMembruRolZonalocalitatecod,  
		                                                  memMembruRolSectievotareid, memMembruRolSectievotarenr, 
		                                                  memMembruRolCodpostalid, memMembruRolCodpostalcod,
														  memMembrurolInvitatieyn, memMembrurolAcceptareyn,
														  memMembrurolPlecareyn, memMembrurolEliberareyn 																										
														  ) ;
	    return newMemMembruRol;
	}
  
	// -----------------------------------------------------------
	@Override
	public MemMembruRol creazaSiSalveazaMemMembruRol(MemMembru memMembru, MemTipRol memTipRol, 
	                                                 GenAcoperireGeografica acoperireGeografica)
	{
	  MemMembruRol newMemMembruRol = this.creazaMemMembruRol(memMembru, memTipRol, acoperireGeografica);
	  memMembruRolRepository.save(newMemMembruRol);
	  return newMemMembruRol;
	}
  
	
	
	// -----------------------------------------------------------
	@Override
	public MemSefGrup creazaMemSefGrup(MemMembru memMembru)
    {
		Long memSefGrupId              = null;

		Long memSefGrupMembruid        = memMembru.getMemMembruId();
		String memSefGrupMembrucodunic = memMembru.getMemMembruCodunic();

		Long memSefGrupUserid          = memMembru.getMemMembruUserid();
		String memSefGrupUsernume      = memMembru.getMemMembruUsernume();
		Long memSefGrupUserinfoid      = memMembru.getMemMembruUserinfoid();

		Long memSefGrupGrupid          = 0l;
		String memSefGrupGrupnume      = "0";
		String memSefGrupGrupcodunic   = "0";

		String memSefGrupActivyn       = "y";
		String memSefGrupStartdt       = null;
		String memSefGrupEnddt         = null;

		Long   memSefGrupZonataraid        = memMembru.getMemMembruZonataraid();
		String memSefGrupZonataracod       = memMembru.getMemMembruZonataracod();
		Long   memSefGrupJudetid           = memMembru.getMemMembruJudetid();
		String memSefGrupJudetcod          = memMembru.getMemMembruJudetcod();
		Long   memSefGrupUatid             = memMembru.getMemMembruUatid();
		Long   memSefGrupUatcod            = memMembru.getMemMembruUatcod();
		Long   memSefGrupLocalitateid      = memMembru.getMemMembruLocalitateid();
		Long   memSefGrupLocalitatecod     = memMembru.getMemMembruLocalitatecod();
		Long   memSefGrupZonajudetid       = 0l;
		String memSefGrupZonajudetcod      = "0";
		Long   memSefGrupZonauatid         = 0l;
		String memSefGrupZonauatcod        = "0";
		Long   memSefGrupZonalocalitateid  = 0l;
		String memSefGrupZonalocalitatecod = "0";
		Long   memSefGrupSectievotareid    = 0l;
		Long   memSefGrupSectievotarenr    = 0l;
		Long   memSefGrupCodpostalid       = 0l;
		String memSefGrupCodpostalcod      = "0";
		
		MemSefGrup newMemSefGrup = new MemSefGrup( memSefGrupId, 
		                                           memSefGrupMembruid, memSefGrupMembrucodunic,
		                                           memSefGrupUserid, memSefGrupUsernume, memSefGrupUserinfoid,
												   memSefGrupGrupid, memSefGrupGrupnume, memSefGrupGrupcodunic,
		                                           memSefGrupActivyn, memSefGrupStartdt, memSefGrupEnddt,
		                                           memSefGrupZonataraid, memSefGrupZonataracod, 
		                                           memSefGrupJudetid, memSefGrupJudetcod, 
		                                           memSefGrupUatid, memSefGrupUatcod, 
		                                           memSefGrupLocalitateid, memSefGrupLocalitatecod, 
		                                           memSefGrupZonajudetid, memSefGrupZonajudetcod, 
		                                           memSefGrupZonauatid, memSefGrupZonauatcod, 
		                                           memSefGrupZonalocalitateid, memSefGrupZonalocalitatecod,  
		                                           memSefGrupSectievotareid, memSefGrupSectievotarenr, 
		                                           memSefGrupCodpostalid, memSefGrupCodpostalcod
	                                           ) ;
	    return newMemSefGrup;
	}
	  

	// -----------------------------------------------------------
	@Override
	public MemSefGrup creazaSiSalveazaMemSefGrup(MemMembru memMembru)
    {
	  MemSefGrup newMemSefGrup  = this.creazaMemSefGrup(memMembru);
	  memSefGrupRepository.save(newMemSefGrup);
	  return newMemSefGrup;
	}	
	
	
	// -----------------------------------------------------------
	@Override
	public MemGrup creazaMemGrup(MemSefGrup memSefGrup, GrupRequest_Creare grupRequestCreare)
    {
		Long memGrupId                = null ;

		String memGrupNume            = grupRequestCreare.getGrupnume();
		String memGrupCodunic         = genereazaCodUnic("G", grupRequestCreare.getGrupnume(),
		                                                     memSefGrup.getMemSefgrupUsernume()) ;

		Long memGrupSefgrupid         = memSefGrup.getMemSefgrupId();
		String memGrupSefgrupcodunic  = memSefGrup.getMemSefgrupMembrucodunic();

		Long memGrupSefgrupuserid     = memSefGrup.getMemSefgrupUserid();
		String memGrupSefgrupusernume = memSefGrup.getMemSefgrupUsernume();
		Long memGrupSefgrupuserinfoid = memSefGrup.getMemSefgrupUserinfoid();

		String memGrupActivyn         = "y" ;
		String memGrupStartdt         = null ;
		String memGrupEnddt           = null ;
		
		Long   memGrupZonataraid        = memSefGrup.getMemSefgrupZonataraid();
		String memGrupZonataracod       = memSefGrup.getMemSefgrupZonataracod();
		Long   memGrupJudetid           = memSefGrup.getMemSefgrupJudetid();
		String memGrupJudetcod          = memSefGrup.getMemSefgrupJudetcod();
		Long   memGrupUatid             = memSefGrup.getMemSefgrupUatid();
		Long   memGrupUatcod            = memSefGrup.getMemSefgrupUatcod();
		Long   memGrupLocalitateid      = memSefGrup.getMemSefgrupLocalitateid();
		Long   memGrupLocalitatecod     = memSefGrup.getMemSefgrupLocalitatecod();
		Long   memGrupZonajudetid       = 0l;
		String memGrupZonajudetcod      = "0";
		Long   memGrupZonauatid         = 0l;
		String memGrupZonauatcod        = "0";
		Long   memGrupZonalocalitateid  = 0l;
		String memGrupZonalocalitatecod = "0";
		Long   memGrupSectievotareid    = 0l;
		Long   memGrupSectievotarenr    = 0l;
		Long   memGrupCodpostalid       = 0l;
		String memGrupCodpostalcod      = "0";

		MemGrup newMemGrup = new MemGrup( memGrupId, memGrupNume, memGrupCodunic,
		                               memGrupSefgrupid, memGrupSefgrupcodunic,
		                               memGrupSefgrupuserid, memGrupSefgrupusernume, memGrupSefgrupuserinfoid, 
		                               memGrupActivyn, memGrupStartdt, memGrupEnddt,
		                               memGrupZonataraid, memGrupZonataracod, 
		                               memGrupJudetid, memGrupJudetcod, 
		                               memGrupUatid, memGrupUatcod, 
		                               memGrupLocalitateid, memGrupLocalitatecod, 
		                               memGrupZonajudetid, memGrupZonajudetcod, 
		                               memGrupZonauatid, memGrupZonauatcod, 
		                               memGrupZonalocalitateid, memGrupZonalocalitatecod,  
		                               memGrupSectievotareid, memGrupSectievotarenr, 
		                               memGrupCodpostalid, memGrupCodpostalcod
	                                ) ;

	  return newMemGrup;
	}
	
	
	// -----------------------------------------------------------
	@Override
	public MemGrup creazaSiSalveazaMemGrup(MemSefGrup memSefGrup, GrupRequest_Creare grupRequestCreare)
	{
	  MemGrup newMemGrup  = this.creazaMemGrup(memSefGrup, grupRequestCreare);
	  memGrupRepository.save(newMemGrup);
	  return newMemGrup;
	}  
	
	
	// -----------------------------------------------------------
	@Override
	public MemMembruGrup creazaMemMembruGrup(MemMembru memMembru, MemGrup memGrup)
    {

		Long memMembrugrupId              = null;

		Long   memMembrugrupMembruid      = memMembru.getMemMembruId();
		String memMembrugrupMembrucodunic = memMembru.getMemMembruCodunic();

		Long   memMembrugrupUserid        = memMembru.getMemMembruUserid();
		String memMembrugrupUsernume      = memMembru.getMemMembruUsernume();
		Long   memMembrugrupUserinfoid    = memMembru.getMemMembruUserinfoid();

		Long memMembrugrupGrupid          = memGrup.getMemGrupId();
		String memMembrugrupGrupnume      = memGrup.getMemGrupNume();
		String memMembrugrupGrupcodunic   = memGrup.getMemGrupCodunic();

		Long memMembrugrupSefgrupid         = memGrup.getMemGrupSefgrupid();
		String memMembrugrupSefgrupcodunic  = memGrup.getMemGrupSefgrupcodunic(); 
		Long memMembrugrupSefgrupuserid     = memGrup.getMemGrupSefgrupuserid();
		String memMembrugrupSefgrupusernume = memGrup.getMemGrupSefgrupusernume();
		Long memMembrugrupSefgrupuserinfoid = memGrup.getMemGrupSefgrupuserinfoid();

		Long   memMembrugrupZonataraid        = memGrup.getMemGrupZonataraid();
		String memMembrugrupZonataracod       = memGrup.getMemGrupZonataracod();
		Long   memMembrugrupJudetid           = memGrup.getMemGrupJudetid();
		String memMembrugrupJudetcod          = memGrup.getMemGrupJudetcod();
		Long   memMembrugrupUatid             = memGrup.getMemGrupUatid();
		Long   memMembrugrupUatcod            = memGrup.getMemGrupUatcod();
		Long   memMembrugrupLocalitateid      = memGrup.getMemGrupLocalitateid();
		Long   memMembrugrupLocalitatecod     = memGrup.getMemGrupLocalitatecod();
		Long   memMembrugrupZonajudetid       = 0l;
		String memMembrugrupZonajudetcod      = "0";
		Long   memMembrugrupZonauatid         = 0l;
		String memMembrugrupZonauatcod        = "0";
		Long   memMembrugrupZonalocalitateid  = 0l;
		String memMembrugrupZonalocalitatecod = "0";
		Long   memMembrugrupSectievotareid    = 0l;
		Long   memMembrugrupSectievotarenr    = 0l;
		Long   memMembrugrupCodpostalid       = 0l;
		String memMembrugrupCodpostalcod      = "0";

		String memMembrugrupActivyn       = "n";
		String memMembrugrupStartdt       = null;
		String memMembrugrupEnddt         = null;

		String memMembrugrupCerereyn      = "y";
		String memMembrugrupCereredt      = null;
		String memMembrugrupAcceptareyn   = null;
		String memMembrugrupAcceptaredt   = null;
		String memMembrugrupPlecareyn     = null;
		String memMembrugrupExcludereyn   = null;

		MemMembruGrup newMemMembruGrup = new MemMembruGrup( memMembrugrupId, 
                                                            memMembrugrupMembruid, memMembrugrupMembrucodunic,
                                                            memMembrugrupUserid, memMembrugrupUsernume, memMembrugrupUserinfoid,
															memMembrugrupGrupid, memMembrugrupGrupnume, memMembrugrupGrupcodunic,
															memMembrugrupSefgrupid, memMembrugrupSefgrupcodunic,
															memMembrugrupSefgrupuserid, memMembrugrupSefgrupusernume, memMembrugrupSefgrupuserinfoid,									 
                                                            memMembrugrupActivyn, memMembrugrupStartdt, memMembrugrupEnddt,
                                                            memMembrugrupZonataraid, memMembrugrupZonataracod, 
                                                            memMembrugrupJudetid, memMembrugrupJudetcod, 
                                                            memMembrugrupUatid, memMembrugrupUatcod, 
                                                            memMembrugrupLocalitateid, memMembrugrupLocalitatecod, 
                                                            memMembrugrupZonajudetid, memMembrugrupZonajudetcod, 
                                                            memMembrugrupZonauatid, memMembrugrupZonauatcod, 
                                                            memMembrugrupZonalocalitateid, memMembrugrupZonalocalitatecod,  
                                                            memMembrugrupSectievotareid, memMembrugrupSectievotarenr, 
                                                            memMembrugrupCodpostalid, memMembrugrupCodpostalcod,
															memMembrugrupCerereyn, memMembrugrupCereredt,
															memMembrugrupAcceptareyn, memMembrugrupAcceptaredt,
															memMembrugrupPlecareyn, memMembrugrupExcludereyn												
                                                         ) ;
	  return newMemMembruGrup;
	}
	  

	// -----------------------------------------------------------
	@Override
	public MemMembruGrup creazaSiSalveazaMemMembruGrup(MemMembru memMembru, MemGrup memGrup)
    {
	  MemMembruGrup newMemMembruGrup  = this.creazaMemMembruGrup(memMembru, memGrup);
	  memMembruGrupRepository.save(newMemMembruGrup);
	  return newMemMembruGrup;
	}

	
	
	// -----------------------------------------------------------
	@Override
	public MemMembruCI creazaMemMembruCI(MemMembru memMembru, MembruCIRequest_Creare membruCIRequestCreare)
	{
	  return null;
	}
  

	// -----------------------------------------------------------
	@Override
	public MemMembruCI creazaSiSalveazaMemMembruCI(MemMembru memMembru, MembruCIRequest_Creare membruCIRequestCreare)
    {
	  MemMembruCI newMemMembruCI  = this.creazaMemMembruCI(memMembru, membruCIRequestCreare);
	  memMembruCIRepository.save(newMemMembruCI);
	  return newMemMembruCI;
	}
	  
	
	
	// -----------------------------------------------------------
	@Override
	public MemMembruCotizatie creazaMemMembruCotizatie(MemMembru memMembru,
	                                                   MembruCotizatieRequest_Creare membruCotizatieRequestCreare)
    {
	  return null;
	}

	  
	// -----------------------------------------------------------
	@Override
	public MemMembruCotizatie  creazaSiSalveazaMemMembruCotizatie(MemMembru memMembru, 
	                                                              MembruCotizatieRequest_Creare membruCotizatieRequestCreare)
	{
	  MemMembruCotizatie newMemMembruCotizatie  = this.creazaMemMembruCotizatie(memMembru, membruCotizatieRequestCreare);
	  memMembruCotizatieRepository.save(newMemMembruCotizatie);
	  return newMemMembruCotizatie;
	}

}




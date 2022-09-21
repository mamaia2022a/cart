package com.potsoft.cart2api.service.impl;

import com.potsoft.cart2api.model.aut.AutUser;
import com.potsoft.cart2api.model.aut.AutUserInfo;
import com.potsoft.cart2api.model.aut.AutUserRol;
import com.potsoft.cart2api.model.mem.MemMembru;
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
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.MembruRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruRolRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruRolRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.MembruTipRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruTipRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.SefGrupRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.SefGrupRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.SefGrupRequest_Vizualizare;
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
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.MembruResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruRolResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruRolResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.MembruTipResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruTipResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.SefGrupResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.SefGrupResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.SefGrupResponse_Vizualizare;
import com.potsoft.cart2api.repository.mem.MemMembruRepository;
//import com.potsoft.cart2api.repository.mem.MemGrupRepository;
//import com.potsoft.cart2api.repository.mem.MemMembruCIRepository;
//import com.potsoft.cart2api.repository.mem.MemMembruCotizatieRepository;
//import com.potsoft.cart2api.repository.mem.MemMembruGrupRepository;
//import com.potsoft.cart2api.repository.mem.MemMembruRepository;
//import com.potsoft.cart2api.repository.mem.MemMembruRolRepository;
//import com.potsoft.cart2api.repository.mem.MemMembruTipRepository;
//import com.potsoft.cart2api.repository.mem.MemSefGrupRepository;
//import com.potsoft.cart2api.repository.mem.MemTipRepository;
//import com.potsoft.cart2api.repository.mem.MemTipRolRepository;
//import com.potsoft.cart2api.repository.mem.MemMembruRepository;
import com.potsoft.cart2api.service.MemService;

import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.beans.factory.annotation.Autowired;

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemServiceImpl implements MemService 
{
	@Autowired
	private MemMembruRepository memMembruRepository;

	//@Autowired
	//private MemMembruCIRepository memMembruCIRepository;

	//@Autowired
	//private MemMembruCotizatieRepository memMembruCotizatieRepository;

	//@Autowired
	//private MemMembruTipRepository memMembruTipRepository;

	//@Autowired
	//private MemMembruRolRepository memMembruRolRepository;

	//@Autowired
	//private MemMembruGrupRepository memMembruGrupRepository;

	//@Autowired
	//private MemSefGrupRepository memSefGrupRepository;

	//@Autowired
	//private MemGrupRepository memGrupRepository;

	//@Autowired
	//private MemTipRepository memTipRepository;

	//@Autowired
	//private MemTipRolRepository memTipRolRepository;

	

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
	  GrupResponse_Vizualizare resp = new GrupResponse_Vizualizare();	
	  return resp;
	}

	@Override
	public MembriGrupResponse_Vizualizare membriGrup_Vizualizare(Long userid, MembriGrupRequest_Vizualizare grupRequestVizualizare)
	{
	  MembriGrupResponse_Vizualizare resp = new MembriGrupResponse_Vizualizare();	
	  return resp;
	}
  
    public String genereazaCodUnic(String prefix, String value1, String value2)
	{
      return "aaaaaaaa";
	}


	// -----------------------------------------------------------
	@Override
	public MemMembru creazaMemMembru(AutUser autUser, AutUserInfo autUserInfo, AutUserRol autUserRol)
	{
		Long   memid                = null; 
		String memCodunic           = null;

		Long   memUserid            = autUser.getAutUserId();
		String memUsernume          = autUser.getAutUserNume();

		Long   memTipid             = autUserRol.getAutUserrolRolid();
		String memTipcod            = autUserRol.getAutUserrolRolcod();

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
		Long   memLocalitateid      = autUserInfo.getAutUserInfoRezLocalitateid();
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
        if (autUserInfo.getAutUserInfoRezdifdedom() == "y")
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
		                                       memUserid, memUsernume, 
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
	public MemMembru creazaSiSalveazaMemMembru(AutUser autUser, AutUserInfo autUserInfo, AutUserRol autUserRol)
	{
	  MemMembru newMemMembru  = this.creazaMemMembru(autUser, autUserInfo, autUserRol);
	  memMembruRepository.save(newMemMembru);
	  return newMemMembru;
	}

    //============================================================
	/** 
	// -----------------------------------------------------------
	@Override
	public AutUserInfo creazaAutUserInfo(Long userId, RegisterRequest registerRequest)
	{
	  Long userinfoid          = null; 
	  Long userid              = userId;
	  String nume              = registerRequest.getNume().toLowerCase();
	  String prenume           = registerRequest.getPrenume().toLowerCase();
	  String telefon           = registerRequest.getTelefon().toLowerCase();
	  String sex               = registerRequest.getSex().toLowerCase();
	  Long   datanasterii      = registerRequest.getDatanasterii();
	  String email             = registerRequest.getEmail().toLowerCase();
	  Long domZonaTaraid       = registerRequest.getDomZonataraid();
	  String domZonaTaracod    = registerRequest.getDomZonataracod();
	  Long domJudetid          = registerRequest.getDomJudetid();
	  String domJudetcod       = registerRequest.getDomJudetcod();
	  Long domUatid            = registerRequest.getDomUatid();
	  Long domUatcod           = registerRequest.getDomUatcod();
	  Long domLocalitateid     = registerRequest.getDomLocalitateid();
	  Long domLocalitatecod    = registerRequest.getDomLocalitatecod();
	  String domCodpostal      = registerRequest.getDomCodpostal();
	  String domAdresa         = registerRequest.getDomAdresa();
	  String rezdifdedom       = registerRequest.getRezdifdedom();
	  Long rezZonaTaraid       = registerRequest.getRezZonataraid();
	  String rezZonaTaracod    = registerRequest.getRezZonataracod();
	  Long rezJudetid          = registerRequest.getRezJudetid();
	  String rezJudetcod       = registerRequest.getRezJudetcod();
	  Long rezUatid            = registerRequest.getRezUatid();
	  Long rezUatcod           = registerRequest.getRezUatcod();
	  Long rezLocalitateid     = registerRequest.getRezLocalitateid();
	  Long rezLocalitatecod    = registerRequest.getRezLocalitatecod();
	  String rezCodpostal      = registerRequest.getRezCodpostal();
	  String rezAdresa         = registerRequest.getRezAdresa();
  
	  AutUserInfo autUserInfo = new AutUserInfo(userinfoid, userid, nume, prenume, telefon, sex, email,
											  domZonaTaraid, domZonaTaracod, domJudetid, domJudetcod, 
											  domUatid, domUatcod,
											  domLocalitateid, domLocalitatecod, domCodpostal, domAdresa,
											  rezdifdedom,
											  rezZonaTaraid, rezZonaTaracod, rezJudetid, rezJudetcod,
											  rezUatid, rezUatcod,
											  rezLocalitateid, rezLocalitatecod, rezCodpostal, rezAdresa,
											  datanasterii);
	  return autUserInfo;										
	}
  
  
	// -----------------------------------------------------------
	@Override
	public AutUserInfo creazaSiSalveazaAutUserInfo(Long userId, RegisterRequest registerRequest)
	{
	  AutUserInfo newAutUserInfo  = this.creazaAutUserInfo(userId, registerRequest);
	  autUserInfoRepository.save(newAutUserInfo);
	  return newAutUserInfo;
	}
    */
	
}




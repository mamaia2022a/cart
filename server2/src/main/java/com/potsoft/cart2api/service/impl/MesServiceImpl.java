package com.potsoft.cart2api.service.impl;

//import com.potsoft.cart2api.exception.CartapiException;
import com.potsoft.cart2api.model.aut.AutRol;
import com.potsoft.cart2api.model.aut.AutUser;
import com.potsoft.cart2api.model.aut.AutUserInfo;
//import com.potsoft.cart2api.model.aut.AutUserRol;
import com.potsoft.cart2api.model.gen.GenAcoperireGeografica;
import com.potsoft.cart2api.model.mes.MesExpeditor;
import com.potsoft.cart2api.model.mes.MesDestinMesaj;
import com.potsoft.cart2api.model.mes.MesDestinatar;
import com.potsoft.cart2api.model.mes.MesMesaj;
import com.potsoft.cart2api.model.mes.MesTipMesaj;
import com.potsoft.cart2api.repository.mes.MesDestinatarRepository;
import com.potsoft.cart2api.repository.mes.MesExpeditorRepository;
import com.potsoft.cart2api.repository.mes.MesMesajRepository;
//import com.potsoft.cart2api.repository.aut.AutUserInfoRepository;
//import com.potsoft.cart2api.repository.aut.AutUserRepository;
//import com.potsoft.cart2api.repository.aut.AutUserRolRepository;
//import com.potsoft.cart2api.repository.gen.GenAcoperireGeograficaRepository;
import com.potsoft.cart2api.service.MesService;

import java.util.List;
//import java.util.Random;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MesServiceImpl implements MesService 
{
	@Autowired
	private MesExpeditorRepository mesExpeditorRepository;

	@Autowired
	private MesDestinatarRepository mesDestinatarRepository;

	@Autowired
	private MesMesajRepository mesMesajRepository;
	


	// -----------------------------------------------------------
	@Override
	public MesExpeditor creazaMesExpeditor(Long userId, String userRolcod)                        
    {
	  return null;
	}
	// -----------------------------------------------------------
	@Override
    public MesExpeditor creazaSiSalveazaMesExpeditor(Long userId, String userRolcod)
    {
	  return null;
	}


	// -----------------------------------------------------------
	@Override
	public MesExpeditor creazaMesExpeditor(AutUser autUser, AutUserInfo autUserInfo, AutRol autRol)                      
    {
		Long mesExpeditorid            = null;
		Long mesExpeditorUserid        = autUser.getAutUserId();
		String mesExpeditorUsernume    = autUser.getAutUserNume();
		Long mesExpeditorRolid         = autRol.getAutRolId();
		String mesExpeditorRolcod      = autRol.getAutRolCod();

		String mesExpeditorAdrrezidentayn    = autUserInfo.getAutUserInfoRezdifdedom();
		Long   mesExpeditorZonataraid        = autUserInfo.getAutUserInfoDomZonaTaraid();
		String mesExpeditorZonataracod       = autUserInfo.getAutUserInfoDomZonaTaracod();
		Long   mesExpeditorJudetid           = autUserInfo.getAutUserInfoDomJudetid();
		String mesExpeditorJudetcod          = autUserInfo.getAutUserInfoDomJudetcod();
		Long   mesExpeditorUatid             = autUserInfo.getAutUserInfoDomUatid();
		Long   mesExpeditorUatcod            = autUserInfo.getAutUserInfoDomUatcod();
		Long   mesExpeditorLocalitateid      = autUserInfo.getAutUserInfoDomLocalitateid();
		Long   mesExpeditorLocalitatecod     = autUserInfo.getAutUserInfoDomLocalitatecod();
		Long   mesExpeditorZonajudetid       = 0l;
		String mesExpeditorZonajudetcod      = "0";
		Long   mesExpeditorZonauatid         = 0l;
		String mesExpeditorZonauatcod        = "0";
		Long   mesExpeditorZonalocalitateid  = 0l;
		String mesExpeditorZonalocalitatecod = "0";
		Long   mesExpeditorSectievotareid    = 0l;
		Long   mesExpeditorSectievotarenr    = 0l;
		Long   mesExpeditorCodpostalid       = 0l;
		String mesExpeditorCodpostalcod      = "0";
        if (autUserInfo.getAutUserInfoRezdifdedom() == "y")
		{
		  mesExpeditorZonataraid    = autUserInfo.getAutUserInfoRezZonaTaraid();
		  mesExpeditorZonataracod   = autUserInfo.getAutUserInfoRezZonaTaracod();
		  mesExpeditorJudetid       = autUserInfo.getAutUserInfoRezJudetid();
		  mesExpeditorJudetcod      = autUserInfo.getAutUserInfoRezJudetcod();
	      mesExpeditorUatid         = autUserInfo.getAutUserInfoRezUatid();
		  mesExpeditorUatcod        = autUserInfo.getAutUserInfoRezUatcod();
	      mesExpeditorLocalitateid  = autUserInfo.getAutUserInfoRezLocalitateid();
		  mesExpeditorLocalitatecod = autUserInfo.getAutUserInfoRezLocalitatecod();
		}

		String mesExpeditorActivyn = "y";
		String mesExpeditorStartdt = null;
		String mesExpeditorEnddt   = null;

		MesExpeditor newMesExpeditor =  new MesExpeditor( mesExpeditorid, 
		                                              mesExpeditorUserid, mesExpeditorUsernume, 
		                                              mesExpeditorRolid, mesExpeditorRolcod, 
		                                              mesExpeditorAdrrezidentayn,
		                                              mesExpeditorZonataraid, mesExpeditorZonataracod, 
		                                              mesExpeditorJudetid, mesExpeditorJudetcod, 
		                                              mesExpeditorUatid, mesExpeditorUatcod, 
		                                              mesExpeditorLocalitateid, mesExpeditorLocalitatecod, 
		                                              mesExpeditorZonajudetid, mesExpeditorZonajudetcod, 
		                                              mesExpeditorZonauatid,  mesExpeditorZonauatcod, 
		                                              mesExpeditorZonalocalitateid, mesExpeditorZonalocalitatecod,  
		                                              mesExpeditorSectievotareid, mesExpeditorSectievotarenr, 
		                                              mesExpeditorCodpostalid, mesExpeditorCodpostalcod,
		                                              mesExpeditorActivyn, mesExpeditorStartdt, mesExpeditorEnddt
	                                             ) ;		
	  return newMesExpeditor;
	}
	
	
	// -----------------------------------------------------------
	@Override
    public MesExpeditor creazaSiSalveazaMesExpeditor(AutUser autUser, AutUserInfo autUserInfo, AutRol autRol)
    {
	  MesExpeditor newMesExpeditor  = this.creazaMesExpeditor(autUser, autUserInfo, autRol);
	  mesExpeditorRepository.save(newMesExpeditor);
	  return newMesExpeditor;
	}
	



	// -----------------------------------------------------------
	@Override
	public MesDestinatar creazaMesDestinatar(Long userId, String userRolcod)                        
    {
	  return null;
	}
	
	
    // -----------------------------------------------------------
	@Override
    public MesDestinatar creazaSiSalveazaMesDestinatar(Long userId, String userRolcod)
    {
	  return null;
	}
	
	
	// -----------------------------------------------------------
	@Override
    public MesDestinatar creazaMesDestinatar(AutUser autUser, AutUserInfo autUserInfo, AutRol autRol)                      
    {
		Long mesDestinatarid            = null;
		Long mesDestinatarUserid        = autUser.getAutUserId();
		String mesDestinatarUsernume    = autUser.getAutUserNume();
		Long mesDestinatarRolid         = autRol.getAutRolId();
		String mesDestinatarRolcod      = autRol.getAutRolCod();

		String mesDestinatarAdrrezidentayn    = autUserInfo.getAutUserInfoRezdifdedom();
		Long   mesDestinatarZonataraid        = autUserInfo.getAutUserInfoDomZonaTaraid();
		String mesDestinatarZonataracod       = autUserInfo.getAutUserInfoDomZonaTaracod();
		Long   mesDestinatarJudetid           = autUserInfo.getAutUserInfoDomJudetid();
		String mesDestinatarJudetcod          = autUserInfo.getAutUserInfoDomJudetcod();
		Long   mesDestinatarUatid             = autUserInfo.getAutUserInfoDomUatid();
		Long   mesDestinatarUatcod            = autUserInfo.getAutUserInfoDomUatcod();
		Long   mesDestinatarLocalitateid      = autUserInfo.getAutUserInfoDomLocalitateid();
		Long   mesDestinatarLocalitatecod     = autUserInfo.getAutUserInfoDomLocalitatecod();
		Long   mesDestinatarZonajudetid       = 0l;
		String mesDestinatarZonajudetcod      = "0";
		Long   mesDestinatarZonauatid         = 0l;
		String mesDestinatarZonauatcod        = "0";
		Long   mesDestinatarZonalocalitateid  = 0l;
		String mesDestinatarZonalocalitatecod = "0";
		Long   mesDestinatarSectievotareid    = 0l;
		Long   mesDestinatarSectievotarenr    = 0l;
		Long   mesDestinatarCodpostalid       = 0l;
		String mesDestinatarCodpostalcod      = "0";
        if (autUserInfo.getAutUserInfoRezdifdedom() == "y")
		{
		  mesDestinatarZonataraid    = autUserInfo.getAutUserInfoRezZonaTaraid();
		  mesDestinatarZonataracod   = autUserInfo.getAutUserInfoRezZonaTaracod();
		  mesDestinatarJudetid       = autUserInfo.getAutUserInfoRezJudetid();
		  mesDestinatarJudetcod      = autUserInfo.getAutUserInfoRezJudetcod();
	      mesDestinatarUatid         = autUserInfo.getAutUserInfoRezUatid();
		  mesDestinatarUatcod        = autUserInfo.getAutUserInfoRezUatcod();
	      mesDestinatarLocalitateid  = autUserInfo.getAutUserInfoRezLocalitateid();
		  mesDestinatarLocalitatecod = autUserInfo.getAutUserInfoRezLocalitatecod();
		}

		String mesDestinatarActivyn = "y";
		String mesDestinatarStartdt = null;
		String mesDestinatarEnddt   = null;

		MesDestinatar newMesDestinatar =  new MesDestinatar( mesDestinatarid, 
		                                              mesDestinatarUserid, mesDestinatarUsernume, 
		                                              mesDestinatarRolid, mesDestinatarRolcod, 
		                                              mesDestinatarAdrrezidentayn,
		                                              mesDestinatarZonataraid, mesDestinatarZonataracod, 
		                                              mesDestinatarJudetid, mesDestinatarJudetcod, 
		                                              mesDestinatarUatid, mesDestinatarUatcod, 
		                                              mesDestinatarLocalitateid, mesDestinatarLocalitatecod, 
		                                              mesDestinatarZonajudetid, mesDestinatarZonajudetcod, 
		                                              mesDestinatarZonauatid,  mesDestinatarZonauatcod, 
		                                              mesDestinatarZonalocalitateid, mesDestinatarZonalocalitatecod,  
		                                              mesDestinatarSectievotareid, mesDestinatarSectievotarenr, 
		                                              mesDestinatarCodpostalid, mesDestinatarCodpostalcod,
		                                              mesDestinatarActivyn, mesDestinatarStartdt, mesDestinatarEnddt
	                                             ) ;		
	  return newMesDestinatar;
	}
	

	// -----------------------------------------------------------
	@Override
    public MesDestinatar creazaSiSalveazaMesDestinatar(AutUser autUser, AutUserInfo autUserInfo, AutRol autRol)
    {
	  MesDestinatar newMesDestinatar  = this.creazaMesDestinatar(autUser, autUserInfo, autRol);
	  mesDestinatarRepository.save(newMesDestinatar);
	  return newMesDestinatar;
	}
	
  
	
	
	
	// -----------------------------------------------------------
	@Override
    public MesMesaj creazaMesMesaj(String mesText, String mesTipMesajCod, 
                          MesExpeditor mesExpeditor, List<MesDestinatar> mesDestinari,
                          String genAcoperireGeograficCod)
	{
	  return null;
	}


	// -----------------------------------------------------------
	@Override
    public MesMesaj creazaSiSalveazaMesMesaj(String mesText, String mesTipMesajCod, 
                                    MesExpeditor mesExpeditor, List<MesDestinatar> mesDestinari,
                                    String genAcoperireGeograficaCod)
	{
	  return null;
	}



	
	// -----------------------------------------------------------
	@Override
	public MesMesaj creazaMesMesaj(String mesText, MesTipMesaj mesTipMesaj, 
	                        MesExpeditor mesExpeditor, List<MesDestinatar> mesDestinari,
	                        GenAcoperireGeografica genAcoperireGeografica)
	{
		Long mesMesajid             = null;

		Long mesMesajTipmesajid     = null;
		String mesMesajTipmesajcod  = null; 
		String mesMesajReloginyn    = null;

		Long mesMesajExpid          = null;
		Long mesMesajExpuserid      = null;
		String mesMesajExpusernume  = null;
		Long mesMesajExprolid       = null;
		String mesMesajExprolcod    = null;

		Long mesMesajAcopgeoid      = genAcoperireGeografica.getGenAcoperiregeograficaId();
		String mesMesajAcopgeocod   = genAcoperireGeografica.getGenAcoperiregeograficaCod();
		
		// va fi setat la o zona geografica 
		String mesMesajAdrrezidentayn    = mesExpeditor.getMesExpeditorAdrrezidentayn();
		Long   mesMesajZonataraid        = mesExpeditor.getMesExpeditorZonataraid();
		String mesMesajZonataracod       = mesExpeditor.getMesExpeditorZonataracod();
		Long   mesMesajJudetid           = mesExpeditor.getMesExpeditorJudetid();
		String mesMesajJudetcod          = mesExpeditor.getMesExpeditorJudetcod();
		Long   mesMesajUatid             = mesExpeditor.getMesExpeditorUatid();
		Long   mesMesajUatcod            = mesExpeditor.getMesExpeditorUatcod();
		Long   mesMesajLocalitateid      = mesExpeditor.getMesExpeditorLocalitateid();
		Long   mesMesajLocalitatecod     = mesExpeditor.getMesExpeditorLocalitatecod();
		Long   mesMesajZonajudetid       = 0l;
		String mesMesajZonajudetcod      = "0";
		Long   mesMesajZonauatid         = 0l;
		String mesMesajZonauatcod        = "0";
		Long   mesMesajZonalocalitateid  = 0l;
		String mesMesajZonalocalitatecod = "0";
		Long   mesMesajSectievotareid    = 0l;
		Long   mesMesajSectievotarenr    = 0l;
		Long   mesMesajCodpostalid       = 0l;
		String mesMesajCodpostalcod      = "0";

		Long mesMesajAn = 0l;
		Long mesMesajLuna = 0l;
		Long mesMesajZi = 0l;
		String mesMesajDatagenerarii = null;

		String mesMesajText = null;

	    MesMesaj  newMesMesaj = new MesMesaj(  mesMesajid, 
                                               mesMesajTipmesajid, mesMesajTipmesajcod, 
                                               mesMesajReloginyn,
                                               mesMesajExpid,
                                               mesMesajExpuserid, mesMesajExpusernume, 
                                               mesMesajExprolid, mesMesajExprolcod, 
                                               mesMesajAcopgeoid, mesMesajAcopgeocod, 
                                               mesMesajAdrrezidentayn,
                                               mesMesajZonataraid, mesMesajZonataracod, 
                                               mesMesajJudetid, mesMesajJudetcod, 
                                               mesMesajUatid, mesMesajUatcod, 
                                               mesMesajLocalitateid, mesMesajLocalitatecod, 
                                               mesMesajZonajudetid, mesMesajZonajudetcod, 
                                               mesMesajZonauatid, mesMesajZonauatcod, 
                                               mesMesajZonalocalitateid, mesMesajZonalocalitatecod,  
                                               mesMesajSectievotareid, mesMesajSectievotarenr, 
                                               mesMesajCodpostalid, mesMesajCodpostalcod,
                                               mesMesajAn, mesMesajLuna,  mesMesajZi,  mesMesajDatagenerarii,
                                               mesMesajText
                                            ) ;
		return newMesMesaj;
	}


	// -----------------------------------------------------------
	@Override
	public MesMesaj creazaSiSalveazaMesMesaj(String mesText, MesTipMesaj  mesTipMesaj,
	                                         MesExpeditor mesExpeditor, List<MesDestinatar> mesDestinari,
	                                         GenAcoperireGeografica genAcoperireGeografica)
	{
		MesMesaj newMesMesaj  = this.creazaMesMesaj(mesText, mesTipMesaj,
		                                                 mesExpeditor, mesDestinari,
		                                                 genAcoperireGeografica);
		mesMesajRepository.save(newMesMesaj);
		return newMesMesaj;
	}




	public List<MesDestinMesaj> creazaListaMesDestinMesaj(MesMesaj  mesMesaj, List<MesDestinatar> mesDestinari)
	{
	  return null;	
	}
  
	public List<MesDestinMesaj> creazaSiSalveazaListaMesDestinMesaj(MesMesaj  mesMesaj, List<MesDestinatar> mesDestinari)
	{
	  return null;	
	}
  
	


	public MesDestinMesaj creazaMesDestinMesaj(MesMesaj  mesMesaj, MesDestinatar mesDestinar)
	{

		Long mesDestinmesajid = null;

		Long mesDestinmesajMesajid = mesMesaj.getMesMesajId();

		String mesDestinmesajPrimityn = "n";

		Long mesDestinmesajDestid         = mesDestinar.getMesDestinatarId();
		Long mesDestinmesajDestuserid     = mesDestinar.getMesDestinatarUserid();
		String mesDestinmesajDestusernume = mesDestinar.getMesDestinatarUsernume();
		Long mesDestinmesajDestrolid      = mesDestinar.getMesDestinatarRolid();
		String mesDestinmesajDestrolcod   = mesDestinar.getMesDestinatarRolcod();

		Long mesDestinmesajAn   = 0l;
		Long mesDestinmesajLuna = 0l;
		Long mesDestinmesajZi   = 0l;
		String mesDestinmesajDataprimirii = null;	

		MesDestinMesaj mesDestinMesaj = new MesDestinMesaj(mesDestinmesajid, 
		                                                   mesDestinmesajMesajid, 
		                                                   mesDestinmesajPrimityn,
		                                                   mesDestinmesajDestid,
		                                                   mesDestinmesajDestuserid, mesDestinmesajDestusernume, 
		                                                   mesDestinmesajDestrolid, mesDestinmesajDestrolcod, 
		                                                   mesDestinmesajAn, mesDestinmesajLuna, mesDestinmesajZi, 
		                                                   mesDestinmesajDataprimirii
	         );

	  return mesDestinMesaj;	
	}

	
	public MesDestinMesaj creazaSiSalveazaMesDestinMesaj(MesMesaj  mesMesaj, MesDestinatar mesDestinar)
    {
	  return null;	
	}


}




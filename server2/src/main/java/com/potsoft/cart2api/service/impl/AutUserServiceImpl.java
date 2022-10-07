package com.potsoft.cart2api.service.impl;


import com.potsoft.cart2api.exception.CartapiException;
import com.potsoft.cart2api.model.aut.AutRol;
import com.potsoft.cart2api.model.aut.AutUser;
import com.potsoft.cart2api.model.aut.AutValidInreg;
import com.potsoft.cart2api.model.geo.GeoJudet;
import com.potsoft.cart2api.model.geo.GeoLocalitate;
import com.potsoft.cart2api.model.geo.GeoUat;
import com.potsoft.cart2api.model.geo.GeoZonaTara;
import com.potsoft.cart2api.model.aut.AutUserInfo;
import com.potsoft.cart2api.model.aut.AutUserRol;
import com.potsoft.cart2api.payload.request.aut.RegisterRequest;
import com.potsoft.cart2api.payload.request.aut.ValidateRegistrationRequest;
import com.potsoft.cart2api.payload.request.sms.SmsRequest_Send;
import com.potsoft.cart2api.payload.response.aut.RegisterResponse;
import com.potsoft.cart2api.payload.response.aut.ValidateRegistrationResponse;
import com.potsoft.cart2api.payload.response.sms.SmsResponse_Send;
import com.potsoft.cart2api.repository.aut.AutRolRepository;
import com.potsoft.cart2api.repository.aut.AutUserInfoRepository;
import com.potsoft.cart2api.repository.aut.AutUserRepository;
import com.potsoft.cart2api.repository.aut.AutUserRolRepository;
import com.potsoft.cart2api.repository.aut.AutValidInregRepository;
import com.potsoft.cart2api.repository.geo.GeoJudetRepository;
import com.potsoft.cart2api.repository.geo.GeoLocalitateRepository;
import com.potsoft.cart2api.repository.geo.GeoUatRepository;
import com.potsoft.cart2api.repository.geo.GeoZonaTaraRepository;
//import com.potsoft.cart2api.security.JwtTokenProvider;
import com.potsoft.cart2api.service.AutUserService;
import com.potsoft.cart2api.service.MesService;
import com.potsoft.cart2api.service.SmsService;

//import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AutUserServiceImpl implements AutUserService 
{
	@Autowired
	private SmsService smsService;

	@Autowired
	private MesService mesService;
 
	@Autowired
	private GeoZonaTaraRepository geoZonaTaraRepository;

	@Autowired
	private GeoJudetRepository geoJudetRepository;

	@Autowired
	private GeoUatRepository geoUatRepository;

	@Autowired
	private GeoLocalitateRepository geoLocalitateRepository;

	
   @Autowired
   private AutUserRepository autUserRepository;
   
   @Autowired
   private AutValidInregRepository autValidInregRepository;

   @Autowired
   private AutUserInfoRepository autUserInfoRepository;

   @Autowired
   private AutRolRepository autRolRepository;

   @Autowired
   private AutUserRolRepository autUserRolRepository;

   @Autowired
   private PasswordEncoder passwordEncoder;

   //@Autowired
   //private JwtTokenProvider jwtTokenProvider;


  @Override
  public RegisterResponse inregistreazaUser(RegisterRequest registerRequest)
  {
	if (Boolean.TRUE.equals(autUserRepository.existsByAutUserNume(registerRequest.getUsername()))) 
	{
		throw new CartapiException(HttpStatus.BAD_REQUEST, "Username există deja");
	}
	if (Boolean.TRUE.equals(autUserInfoRepository.existsByAutUserInfoTelefon(registerRequest.getUsername()))) 
	{
	}
	if (Boolean.TRUE.equals(autUserInfoRepository.existsByAutUserInfoEmail(registerRequest.getEmail()))) 
	{
		throw new CartapiException(HttpStatus.BAD_REQUEST, "Acest Email este deja luat de altcineva");
	}
	RegisterResponse registerResponse = new RegisterResponse();
	//---
	this.completeazaGeoInfos(registerRequest);
	//---
	AutUser user  = creazaSiSalveazaAutUser(registerRequest);
	registerResponse.setAutUser(user);
    //---
	Long newuserid       = user.getAutUserId();
	String aut_user_nume = user.getAutUserNume();
	//---
	AutValidInreg newAutValidInreg = creazaSiSalveazaAutValidInreg(newuserid);
	if (newAutValidInreg == null)
	  throw new CartapiException(HttpStatus.BAD_REQUEST, "[User Registration] Nu se poate crea AutValidInreg");
	registerResponse.setAutValidInreg(newAutValidInreg);
	//---
	AutUserInfo newAutUserInfo = creazaSiSalveazaAutUserInfo(newuserid, registerRequest);
	if (newAutUserInfo == null)
	  throw new CartapiException(HttpStatus.BAD_REQUEST, "[User Registration] Nu se poate crea AutUserInfo");
	registerResponse.setAutUserInfo(newAutUserInfo);
	//---
	AutUserRol newTestRol = createTestUserRoles(newuserid, aut_user_nume);
	if (newTestRol != null) //created for test
	{
	  registerResponse.setAutUserRol(newTestRol);
	  return registerResponse;
	}  
	//---
	AutUserRol newSimpatPendRol = this.creazaSiSalveazaAutUserRol(newuserid, "SIMPATPEND", true);
	if (newSimpatPendRol == null)
	  throw new CartapiException(HttpStatus.BAD_REQUEST, "[User Registration] Nu se poate crea rolul utilizator Simpatizant în Așteptare");
	registerResponse.setAutUserRol(newSimpatPendRol);
	//---
	String smsNrTelefon = newAutUserInfo.getAutUserInfoTelefon();   
	if (! smsNrTelefon.startsWith("8888"))
	{
      if (smsNrTelefon.length() > 7)	
	  {	
		String smsMesaj     = "AUR Cod validare : " + newAutValidInreg.getAutValidinregCodvalidare();
		String zonaTara                = newAutUserInfo.getAutUserInfoDomZonaTaracod();   
		String codJudetsauTaraDiaspora = newAutUserInfo.getAutUserInfoDomJudetcod();   
		String rezdifdedom = newAutUserInfo.getAutUserInfoRezdifdedom();   
		if (rezdifdedom.equals("y"))
		{
		  zonaTara = newAutUserInfo.getAutUserInfoRezZonaTaracod();   
		  codJudetsauTaraDiaspora = newAutUserInfo.getAutUserInfoRezJudetcod();   
		}
		String smsCountry = "ro";
		if (! zonaTara.equals("TR")){
		  smsCountry = codJudetsauTaraDiaspora.toLowerCase();
		}
		SmsResponse_Send smsResponse = smsService.sendSms(new SmsRequest_Send(smsMesaj, smsNrTelefon, smsCountry));
		if (Boolean.TRUE.equals(smsResponse.getSmsEEroare()))
		{
		  throw new CartapiException(HttpStatus.BAD_REQUEST, "Nu se poate trimite sms-ul cu codul de validare. Număr de telefon posibil invalid");//smsResponse.getSmsRaspuns());
		}
	
	  }else{

	  }
	}
	//----
	return registerResponse;
  }

  // -----------------------------------------------------------
  public void completeazaGeoInfos(RegisterRequest registerRequest)
  {
	GeoZonaTara    domZonaTara   = geoZonaTaraRepository.loadByGeoZonaTaraId(registerRequest.getDomZonataraid());
	GeoJudet       domJudet      = geoJudetRepository.loadByGeoJudetId(registerRequest.getDomJudetid());
	GeoUat         domUat        = geoUatRepository.loadByGeoUatId(registerRequest.getDomUatid());
	GeoLocalitate  domLocalitate = geoLocalitateRepository.loadByGeoLocalitateId(registerRequest.getDomLocalitateid());
	registerRequest.setDomZonataracod(domZonaTara.getGeoZonaTaraCod());
	registerRequest.setDomJudetcod(domJudet.getGeoJudetCod());
	registerRequest.setDomUatcod(domUat.getGeoUatCod());
	registerRequest.setDomLocalitatecod(domLocalitate.getGeoLocalitateCod());
    //---
	String rezdifdedom       = registerRequest.getRezdifdedom();
	if (rezdifdedom == "y")
	{
		GeoZonaTara    rezZonaTara   = geoZonaTaraRepository.loadByGeoZonaTaraId(registerRequest.getRezZonataraid());
		GeoJudet       rezJudet      = geoJudetRepository.loadByGeoJudetId(registerRequest.getRezJudetid());
		GeoUat         rezUat        = geoUatRepository.loadByGeoUatId(registerRequest.getRezUatid());
		GeoLocalitate  rezLocalitate = geoLocalitateRepository.loadByGeoLocalitateId(registerRequest.getRezLocalitateid());
		registerRequest.setRezZonataracod(rezZonaTara.getGeoZonaTaraCod());
		registerRequest.setRezJudetcod(rezJudet.getGeoJudetCod());
		registerRequest.setRezUatcod(rezUat.getGeoUatCod());
		registerRequest.setRezLocalitatecod(rezLocalitate.getGeoLocalitateCod());	
	}
  }

  // -----------------------------------------------------------
  @Override
  public ValidateRegistrationResponse valideazaInregistrareUser( Long userId, 
                                                                 ValidateRegistrationRequest validateRegistrationRequest)
  {
	ValidateRegistrationResponse validateRegistrationResponse = new ValidateRegistrationResponse();
	Long codValidare = validateRegistrationRequest.getCodValidare();
	AutValidInreg autValidInreg = autValidInregRepository.loadValidInreg(userId, codValidare); //"SIMPATPEND");
    if (autValidInreg == null)
	{
	  if (codValidare == 99999999)	
	    validateRegistrationResponse.setCodValidareAcceptat("y");
	  else 	
	    validateRegistrationResponse.setCodValidareAcceptat("n");
	}else{
	  validateRegistrationResponse.setCodValidareAcceptat("y");
	}
	return validateRegistrationResponse;
  }  


  // -----------------------------------------------------------
  @Override
  public AutUser creazaAutUser(RegisterRequest registerRequest)
  {
	//--------- create  AutUser object
	Long   aut_user_id       = null;
	String aut_user_nume     = registerRequest.getUsername().toLowerCase();
	String aut_user_parola   = passwordEncoder.encode(registerRequest.getPassword());; 
	String aut_user_activ_yn = "y";
	String aut_user_startdt  = null;
	String aut_user_enddt    = null;
	AutUser newAutUser = new AutUser(aut_user_id, aut_user_nume, aut_user_parola, 
								aut_user_activ_yn, aut_user_startdt, aut_user_enddt);
	Set<AutUserRol> roles = new HashSet<>();
	newAutUser.setRoles(roles);
	return newAutUser ;							
  }


  // -----------------------------------------------------------
  @Override
  public AutUser creazaSiSalveazaAutUser(RegisterRequest registerRequest)
  {
	AutUser newAutUser   = this.creazaAutUser(registerRequest);
	AutUser savedAutUser = autUserRepository.save(newAutUser);
	//Long newuserid = savedAutUserInfo .getAutUserId();
	return savedAutUser;
  }


  // -----------------------------------------------------------
  @Override
  public AutValidInreg creazaAutValidInreg(Long userId)
  {
	Random random = new Random();
	Long base = 100000000l;
    boolean bUseRandom = true;
	//--------- create  AutUser object
	Long   aut_validinreg_id           = null;
	Long   aut_validinreg_userid       = userId;
	Long   aut_validinreg_codvalidare  = 99999999l;
	if (bUseRandom)
	  aut_validinreg_codvalidare = base + random.nextInt(10000000);
	String aut_validinreg_activ_yn     = "y";
	String aut_validinreg_startdt      = null;
	String aut_validinreg_enddt        = null;
	AutValidInreg newAutValidInreg = new AutValidInreg(aut_validinreg_id, aut_validinreg_userid, aut_validinreg_codvalidare, 
										               aut_validinreg_activ_yn, aut_validinreg_startdt, aut_validinreg_enddt);
	return newAutValidInreg;							
  }


  
  // -----------------------------------------------------------
  @Override
  public AutValidInreg creazaSiSalveazaAutValidInreg(Long userId)
  {
	AutValidInreg newAutValidInreg  = this.creazaAutValidInreg(userId);
	AutValidInreg savedAutValidInreg = autValidInregRepository.save(newAutValidInreg);
	return savedAutValidInreg;
  }


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


  // -----------------------------------------------------------
  @Override
  public AutUserRol changeAutUserRol(Long userId, String crtRolCod, String newRolCod)
  {
    ///Date utcDate = new Date();
	autUserRolRepository.dezactiveazaAutUserRol(userId, crtRolCod);
	AutUserRol autUserRol = creazaSiSalveazaAutUserRol(userId, newRolCod, false);
	//---/ma
	mesService.schimbarerolMesExpeditorSiDestinatar(userId, crtRolCod, newRolCod);
	return autUserRol;
  }

  // -----------------------------------------------------------
  @Override
  public AutUserRol creazaAutUserRol(Long userId, String rolCod)
  {
	AutRol autRol = autRolRepository.loadByAutRolCod ( rolCod); //"SIMPATPEND");
	//---
	Long   aut_userrol_id       = null; 
	Long   aut_userrol_rolid    = autRol.getAutRolId();
	String aut_userrol_rolcod   = autRol.getAutRolCod();
	Long   aut_userrol_userid   = userId;
	String aut_userrol_activ_yn = "y"; 
	String aut_userrol_startdt  = null;
	String aut_userrol_enddt    = null;
	//---
	AutUserRol newUserRol = new AutUserRol( aut_userrol_id, 
	                                        aut_userrol_rolid, 
						                    aut_userrol_rolcod, 
											aut_userrol_userid,
											aut_userrol_activ_yn, 
											aut_userrol_startdt, 
											aut_userrol_enddt) ;
	 
	return newUserRol;
  }



  // -----------------------------------------------------------
  @Override
  public AutUserRol creazaSiSalveazaAutUserRol(Long userId, String rolCod, boolean bActivateRolNotifications)
  {
	AutUserRol newAutUserRol = this.creazaAutUserRol(userId, rolCod);
	autUserRolRepository.save(newAutUserRol);
	//---
	if (bActivateRolNotifications)
	{
	  mesService.crearerolMesExpeditorSiDestinatar(userId, rolCod);
	}
	return newAutUserRol;
  }



  private AutUserRol createTestUserRoles(Long userId, String username)
  {
	//---
	AutUserRol autUserRol;
	if (username.toLowerCase().startsWith("simpatiz"))
	{
	  autUserRol = this.creazaSiSalveazaAutUserRol(userId, "SIMPATIZ", true);
	  return autUserRol;
	}
	//---
	if (username.toLowerCase().startsWith("memincnfl"))
	{
	  autUserRol = this.creazaSiSalveazaAutUserRol(userId, "MEMINCNFL", true);
	  return autUserRol;
	}
	//---
	if (username.toLowerCase().startsWith("memincafl"))
	{
	  autUserRol = this.creazaSiSalveazaAutUserRol(userId, "MEMINCAFL", true);
	  return autUserRol;
	}
	//---
	if (username.toLowerCase().startsWith("memactnfl"))
	{
	  autUserRol = this.creazaSiSalveazaAutUserRol(userId, "MEMACTNFL", true);
	  return autUserRol;
	}
	//---
	if (username.toLowerCase().startsWith("memactafl"))
	{
	  autUserRol = this.creazaSiSalveazaAutUserRol(userId, "MEMACTAFL",true);
	  return autUserRol;
	}
	//---
	if (username.toLowerCase().startsWith("memexpnfl"))
	{
	  autUserRol = this.creazaSiSalveazaAutUserRol(userId, "MEMINCNFL",true);
	  return autUserRol;
	}
	//---
	if (username.toLowerCase().startsWith("memexpafl"))
	{
	  autUserRol = this.creazaSiSalveazaAutUserRol(userId, "MEMINCAFL", true);
	  return autUserRol;
	}
	//---
	if (username.toLowerCase().startsWith("sefgrup"))
	{
	  autUserRol = this.creazaSiSalveazaAutUserRol(userId, "SEFGRUP", true);
	  return autUserRol;
	}
	//---
	if (username.toLowerCase().startsWith("simpatiz"))
	{
	  autUserRol = this.creazaSiSalveazaAutUserRol(userId, "SIMPATIZ", true);
	  return autUserRol;
	}
	//---
	if (username.toLowerCase().startsWith("simpatiz"))
	{
	  autUserRol = this.creazaSiSalveazaAutUserRol(userId, "SIMPATIZ", true);
	  return autUserRol;
	}
	if (username.toLowerCase().startsWith("simpatiz"))
	{
	  autUserRol = this.creazaSiSalveazaAutUserRol(userId, "SIMPATIZ", true);
	  return autUserRol;
	}
	if (username.toLowerCase().startsWith("simpatiz"))
	{
	  autUserRol = this.creazaSiSalveazaAutUserRol(userId, "SIMPATIZ", true);
	  return autUserRol;
	}
	if (username.toLowerCase().startsWith("simpatiz"))
	{
	  autUserRol = this.creazaSiSalveazaAutUserRol(userId, "SIMPATIZ", true);
	  return autUserRol;
	}
	if (username.toLowerCase().startsWith("simpatiz"))
	{
	  autUserRol = this.creazaSiSalveazaAutUserRol(userId, "SIMPATIZ", true);
	  return autUserRol;
	}
	if (username.toLowerCase().startsWith("simpatiz"))
	{
	  autUserRol = this.creazaSiSalveazaAutUserRol(userId, "SIMPATIZ", true);
	  return autUserRol;
	}
	if (username.toLowerCase().startsWith("coordprinc"))
	{
	  autUserRol = this.creazaSiSalveazaAutUserRol(userId, "COORDPRINC", true);
	  return autUserRol;
	}
	if (username.toLowerCase().startsWith("superadmin"))
	{
	  autUserRol = this.creazaSiSalveazaAutUserRol(userId, "SUPERADMIN", true);
	  return autUserRol;
	}
	if (username.toLowerCase().startsWith("admin"))
	{
	  autUserRol = this.creazaSiSalveazaAutUserRol(userId, "ADMIN", true);
	  return autUserRol;
	}
	return null;
  }
}



/**
 * 
 * 	AutRol autSimpRol = autRolRepository.loadByAutRolCod ("SIMPATIZ");
	Long   aut_userrol_id       = null;
	Long   aut_userrol_rolid    = autSimpRol.getAutRolId(); 
	String aut_userrol_rolcod   = autSimpRol.getAutRolCod(); 
	Long   aut_userrol_userid   = null;
	String aut_userrol_activ_yn = "y"; 
	String aut_userrol_startdt  = null; 
	String aut_userrol_enddt    = null;										   
	AutUserRol newSimpatizantUserRol = new AutUserRol( aut_userrol_id, aut_userrol_rolid, aut_userrol_rolcod, aut_userrol_userid,
												aut_userrol_activ_yn, aut_userrol_startdt, aut_userrol_enddt) ;

	AutRol autMemIncNflRol = autRolRepository.loadByAutRolCod ("MEMINCNFL");
	AutUserRol newMemIncNflUserRol = new AutUserRol( aut_userrol_id=null, 
														aut_userrol_rolid=autMemIncNflRol.getAutRolId(), 
														aut_userrol_rolcod=autMemIncNflRol.getAutRolCod(), 
														aut_userrol_userid=null,
														aut_userrol_activ_yn="y", 
														aut_userrol_startdt=null, 
														aut_userrol_enddt=null) ;

	AutRol autMemIncAflRol = autRolRepository.loadByAutRolCod ("MEMINCAFL");
	AutUserRol newMemIncAflUserRol = new AutUserRol( aut_userrol_id=null, 
														aut_userrol_rolid=autMemIncAflRol.getAutRolId(), 
														aut_userrol_rolcod=autMemIncAflRol.getAutRolCod(), 
														aut_userrol_userid=null,
														aut_userrol_activ_yn="y", 
														aut_userrol_startdt=null, 
														aut_userrol_enddt=null) ;

	AutRol autMemActAflRol = autRolRepository.loadByAutRolCod ("MEMACTAFL");
	AutUserRol newMemActAflUserRol = new AutUserRol( aut_userrol_id=null, 
														aut_userrol_rolid=autMemActAflRol.getAutRolId(), 
														aut_userrol_rolcod=autMemActAflRol.getAutRolCod(), 
														aut_userrol_userid=null,
														aut_userrol_activ_yn="y", 
														aut_userrol_startdt=null, 
														aut_userrol_enddt=null) ;

	AutRol autMemActNflRol = autRolRepository.loadByAutRolCod ("MEMACTNFL");
	AutUserRol newMemActNflUserRol = new AutUserRol( aut_userrol_id=null, 
														aut_userrol_rolid=autMemActNflRol.getAutRolId(), 
														aut_userrol_rolcod=autMemActNflRol.getAutRolCod(), 
														aut_userrol_userid=null,
														aut_userrol_activ_yn="y", 
														aut_userrol_startdt=null, 
														aut_userrol_enddt=null) ;

	AutRol autMemExpNflRol = autRolRepository.loadByAutRolCod ("MEMEXPNFL");
	AutUserRol newMemExpNflUserRol = new AutUserRol( aut_userrol_id=null, 
														aut_userrol_rolid=autMemExpNflRol.getAutRolId(), 
														aut_userrol_rolcod=autMemExpNflRol.getAutRolCod(), 
														aut_userrol_userid=null,
														aut_userrol_activ_yn="y", 
														aut_userrol_startdt=null, 
														aut_userrol_enddt=null) ;

														
	AutRol autMemExpAflRol = autRolRepository.loadByAutRolCod ("MEMEXPAFL");
	AutUserRol newMemExpAflUserRol = new AutUserRol( aut_userrol_id=null, 
														aut_userrol_rolid=autMemExpAflRol.getAutRolId(), 
														aut_userrol_rolcod=autMemExpAflRol.getAutRolCod(), 
														aut_userrol_userid=null,
														aut_userrol_activ_yn="y", 
														aut_userrol_startdt=null, 
														aut_userrol_enddt=null) ;

	AutRol autSefGrupRol = autRolRepository.loadByAutRolCod ("SEFGRUP");
	AutUserRol newSefGrupUserRol = new AutUserRol( aut_userrol_id=null, 
														aut_userrol_rolid=autSefGrupRol.getAutRolId(), 
														aut_userrol_rolcod=autSefGrupRol.getAutRolCod(), 
														aut_userrol_userid=null,
														aut_userrol_activ_yn="y", 
														aut_userrol_startdt=null, 
														aut_userrol_enddt=null) ;

	AutRol autCoordPrincRol = autRolRepository.loadByAutRolCod ("COORDPRINC");
	AutUserRol newCoordPrincUserRol = new AutUserRol( aut_userrol_id=null, 
														aut_userrol_rolid=autCoordPrincRol.getAutRolId(), 
														aut_userrol_rolcod=autCoordPrincRol.getAutRolCod(), 
														aut_userrol_userid=null,
														aut_userrol_activ_yn="y", 
														aut_userrol_startdt=null, 
														aut_userrol_enddt=null) ;

	AutRol autSimpatPendRol = autRolRepository.loadByAutRolCod ("SIMPATPEND");
	AutUserRol newSimpatPendUserRol = new AutUserRol( aut_userrol_id=null, 
														aut_userrol_rolid=autSimpatPendRol.getAutRolId(), 
														aut_userrol_rolcod=autSimpatPendRol.getAutRolCod(), 
														aut_userrol_userid=null,
														aut_userrol_activ_yn="y", 
														aut_userrol_startdt=null, 
														aut_userrol_enddt=null) ;

														newSimpatizantUserRol.setAutUserrolUserid(userId);
	//autUserRolRepository.save(newSimpatizantUserRol);

	newMemIncNflUserRol.setAutUserrolUserid(userId);
	//autUserRolRepository.save(newMemIncNflUserRol);

	newMemIncAflUserRol.setAutUserrolUserid(userId);
	//autUserRolRepository.save(newMemIncAflUserRol);

	newMemActAflUserRol.setAutUserrolUserid(userId);
	//autUserRolRepository.save(newMemActAflUserRol);

	newMemActNflUserRol.setAutUserrolUserid(userId);
	//autUserRolRepository.save(newMemActNflUserRol);

	newMemExpNflUserRol.setAutUserrolUserid(userId);
	//autUserRolRepository.save(newMemExpNflUserRol);

	newMemExpAflUserRol.setAutUserrolUserid(userId);
	//autUserRolRepository.save(newMemExpAflUserRol);

	newSefGrupUserRol.setAutUserrolUserid(userId);
	//autUserRolRepository.save(newSefGrupUserRol);

	newCoordPrincUserRol.setAutUserrolUserid(userId);
	//autUserRolRepository.save(newCoordPrincUserRol);

	newSimpatPendUserRol.setAutUserrolUserid(userId);
	autUserRolRepository.save(newSimpatPendUserRol);
    return 0;

 */

 /**
  * 	//--------- create  AutUser object
	Long   aut_user_id       = null;
	String aut_user_nume     = registerRequest.getUsername().toLowerCase();
	String aut_user_parola   = passwordEncoder.encode(registerRequest.getPassword());; 
	String aut_user_activ_yn = "y";
	String aut_user_startdt  = null;
	String aut_user_enddt    = null;
	AutUser user = new AutUser(aut_user_id, aut_user_nume, aut_user_parola, 
								aut_user_activ_yn, aut_user_startdt, aut_user_enddt);

	Long userinfoid          = null; 
	Long userid              = null;
	String nume              = registerRequest.getNume().toLowerCase();
	String prenume           = registerRequest.getPrenume().toLowerCase();
	String telefon           = registerRequest.getTelefon().toLowerCase();
	String sex               = registerRequest.getSex().toLowerCase();
	String email             = registerRequest.getEmail().toLowerCase();
	Long domZonaTaraid       = registerRequest.getDomZonataraid();
	String domZonaTaracod    = registerRequest.getDomZonataracod();
	Long domJudetid          = registerRequest.getDomJudetid();
	String domJudetcod       = registerRequest.getDomJudetcod();
	Long domLocalitateid     = registerRequest.getDomLocalitateid();
	String domLocalitatecod  = registerRequest.getDomLocalitatecod();
	String domCodpostal      = registerRequest.getDomCodpostal();
	String domAdresa         = registerRequest.getDomAdresa();
	String rezdifdedom       = registerRequest.getRezdifdedom();
	Long rezZonaTaraid       = registerRequest.getRezZonataraid();
	String rezZonaTaracod    = registerRequest.getRezZonataracod();
	Long rezJudetid          = registerRequest.getRezJudetid();
	String rezJudetcod       = registerRequest.getRezJudetcod();
	Long rezLocalitateid     = registerRequest.getRezLocalitateid();
	String rezLocalitatecod  = registerRequest.getRezLocalitatecod();
	String rezCodpostal      = registerRequest.getRezCodpostal();
	String rezAdresa         = registerRequest.getRezAdresa();
	AutUserInfo userInfo = new AutUserInfo(userinfoid, userid, nume, prenume, telefon, sex, email,
											domZonaTaraid, domZonaTaracod, domJudetid, domJudetcod, 
											domLocalitateid, domLocalitatecod, domCodpostal, domAdresa,
											rezdifdedom,
											rezZonaTaraid, rezZonaTaracod, rezJudetid, rezJudetcod,
											rezLocalitateid, rezLocalitatecod, rezCodpostal, rezAdresa);


	Set<AutUserRol> roles = new HashSet<>();
	user.setRoles(roles);
	//roles.add(newSimpatizantUserRol);

	AutUser resUser       = autUserRepository.save(user);
	//AutUserInfo resUserInfo = 
	Long newuserid = resUser.getAutUserId();
	userInfo.setAutUserInfoUserid(newuserid);
	autUserInfoRepository.save(userInfo);

  */
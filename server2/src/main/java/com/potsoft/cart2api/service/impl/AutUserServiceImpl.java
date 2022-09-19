package com.potsoft.cart2api.service.impl;


import com.potsoft.cart2api.exception.CartapiException;
import com.potsoft.cart2api.model.aut.AutRol;
import com.potsoft.cart2api.model.aut.AutUser;
import com.potsoft.cart2api.model.aut.AutUserInfo;
import com.potsoft.cart2api.model.aut.AutUserRol;
import com.potsoft.cart2api.payload.request.aut.RegisterRequest;
import com.potsoft.cart2api.repository.aut.AutRolRepository;
import com.potsoft.cart2api.repository.aut.AutUserInfoRepository;
import com.potsoft.cart2api.repository.aut.AutUserRepository;
import com.potsoft.cart2api.repository.aut.AutUserRolRepository;
//import com.potsoft.cart2api.security.JwtTokenProvider;
import com.potsoft.cart2api.service.AutUserService;

import java.util.HashSet;
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
   private AutUserRepository autUserRepository;
   
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
  public AutUser inregistreazaUser(RegisterRequest registerRequest)
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
	//---
	AutUser user  = creazaSiSalveazaAutUser(registerRequest);
    //---
	Long newuserid       = user.getAutUserId();
	String aut_user_nume = user.getAutUserNume();
	//---
	AutUserInfo newAutUserInfo = creazaSiSalveazaAutUserInfo(newuserid, registerRequest);
	if (newAutUserInfo == null)
	  throw new CartapiException(HttpStatus.BAD_REQUEST, "[User Registration] Nu se poate crea AutUserInfo");
	//---
	int errorNo = createTestUserRoles(newuserid, aut_user_nume);
	if (errorNo == 0) //not created for test
	  return user;
	//---
	AutUserRol newSimpatPendRol = this.creazaSiSalveazaAutUserRol(newuserid, "SIMPATPEND");
	if (newSimpatPendRol == null)
	  throw new CartapiException(HttpStatus.BAD_REQUEST, "[User Registration] Nu se poate crea rolul utilizator Simpatizant în Așteptare");
	//---
	return user;
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
	AutUser newAutUser  = this.creazaAutUser(registerRequest);
	AutUser savedAutUserInfo = autUserRepository.save(newAutUser);
	//Long newuserid = savedAutUserInfo .getAutUserId();
	return savedAutUserInfo;
  }



  // -----------------------------------------------------------
  @Override
  public AutUserInfo creazaAutUserInfo(Long userId, RegisterRequest registerRequest)
  {
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
	AutUserInfo autUserInfo = new AutUserInfo(userinfoid, userid, nume, prenume, telefon, sex, email,
											domZonaTaraid, domZonaTaracod, domJudetid, domJudetcod, 
											domLocalitateid, domLocalitatecod, domCodpostal, domAdresa,
											rezdifdedom,
											rezZonaTaraid, rezZonaTaracod, rezJudetid, rezJudetcod,
											rezLocalitateid, rezLocalitatecod, rezCodpostal, rezAdresa);
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
  public AutUserRol creazaSiSalveazaAutUserRol(Long userId, String rolCod)
  {
	AutUserRol newAutUserRol = this.creazaAutUserRol(userId, rolCod);
	autUserRolRepository.save(newAutUserRol);
	return newAutUserRol;
  }



  private int createTestUserRoles(Long userId, String username)
  {
	//---
	if (username.toLowerCase().startsWith("simpatiz"))
	{
	  this.creazaSiSalveazaAutUserRol(userId, "SIMPATIZ");
	  return 0;
	}
	//---
	if (username.toLowerCase().startsWith("memincnfl"))
	{
	  this.creazaSiSalveazaAutUserRol(userId, "MEMINCNFL");
	  return 0;
	}
	//---
	if (username.toLowerCase().startsWith("memincafl"))
	{
	  this.creazaSiSalveazaAutUserRol(userId, "MEMINCAFL");
	  return 0;
	}
	//---
	if (username.toLowerCase().startsWith("memactnfl"))
	{
	  this.creazaSiSalveazaAutUserRol(userId, "MEMACTNFL");
	  return 0;
	}
	//---
	if (username.toLowerCase().startsWith("memactafl"))
	{
	  this.creazaSiSalveazaAutUserRol(userId, "MEMACTAFL");
	  return 0;
	}
	//---
	if (username.toLowerCase().startsWith("memexpnfl"))
	{
	  this.creazaSiSalveazaAutUserRol(userId, "MEMINCNFL");
	  return 0;
	}
	//---
	if (username.toLowerCase().startsWith("memexpafl"))
	{
	  this.creazaSiSalveazaAutUserRol(userId, "MEMINCAFL");
	  return 0;
	}
	//---
	if (username.toLowerCase().startsWith("sefgrup"))
	{
	  this.creazaSiSalveazaAutUserRol(userId, "SEFGRUP");
	  return 0;
	}
	//---
	if (username.toLowerCase().startsWith("simpatiz"))
	{
	  this.creazaSiSalveazaAutUserRol(userId, "SIMPATIZ");
	  return 0;
	}
	//---
	if (username.toLowerCase().startsWith("simpatiz"))
	{
	  this.creazaSiSalveazaAutUserRol(userId, "SIMPATIZ");
	  return 0;
	}
	if (username.toLowerCase().startsWith("simpatiz"))
	{
	  this.creazaSiSalveazaAutUserRol(userId, "SIMPATIZ");
	  return 0;
	}
	if (username.toLowerCase().startsWith("simpatiz"))
	{
	  this.creazaSiSalveazaAutUserRol(userId, "SIMPATIZ");
	  return 0;
	}
	if (username.toLowerCase().startsWith("simpatiz"))
	{
	  this.creazaSiSalveazaAutUserRol(userId, "SIMPATIZ");
	  return 0;
	}
	if (username.toLowerCase().startsWith("simpatiz"))
	{
	  this.creazaSiSalveazaAutUserRol(userId, "SIMPATIZ");
	  return 0;
	}
	if (username.toLowerCase().startsWith("simpatiz"))
	{
	  this.creazaSiSalveazaAutUserRol(userId, "SIMPATIZ");
	  return 0;
	}
	if (username.toLowerCase().startsWith("coordprinc"))
	{
	  this.creazaSiSalveazaAutUserRol(userId, "COORDPRINC");
	  return 0;
	}
	if (username.toLowerCase().startsWith("superadmin"))
	{
	  this.creazaSiSalveazaAutUserRol(userId, "SUPERADMIN");
	  return 0;
	}
	if (username.toLowerCase().startsWith("admin"))
	{
	  this.creazaSiSalveazaAutUserRol(userId, "ADMIN");
	  return 0;
	}
	return 1;
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
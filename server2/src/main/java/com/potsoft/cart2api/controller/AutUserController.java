package com.potsoft.cart2api.controller;

//import java.util.stream.Collectors;

import com.potsoft.cart2api.security.UserDetailsImpl;
import com.potsoft.cart2api.service.AutUserService;
import com.potsoft.cart2api.service.MemService;
import com.potsoft.cart2api.exception.CartapiException;
//import com.potsoft.cart2api.exception.AppException;
//import com.potsoft.cart2api.exception.CartapiException;
import com.potsoft.cart2api.model.aut.AutUser;
import com.potsoft.cart2api.model.aut.AutUserRol;
import com.potsoft.cart2api.model.mes.MesDestinMesaj;
//import com.potsoft.cart2api.model.aut.rol.AutRoleName;
import com.potsoft.cart2api.payload.response.general.ApiResponse;
//import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Activare;
import com.potsoft.cart2api.payload.response.mes.MesMesajePrimiteResponse;
//import com.potsoft.cart2api.payload.response.aut.JwtAuthenticationResponse;
import com.potsoft.cart2api.payload.request.aut.LoginRequest;
import com.potsoft.cart2api.payload.request.aut.RegisterRequest;
import com.potsoft.cart2api.payload.request.aut.ValidateRegistrationRequest;
//import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Activare;
import com.potsoft.cart2api.repository.aut.AutUserRepository;
import com.potsoft.cart2api.repository.aut.AutUserRolRepository;
import com.potsoft.cart2api.repository.mes.MesDestinMesajRepository;
import com.potsoft.cart2api.payload.response.aut.JwtResponse;
import com.potsoft.cart2api.payload.response.aut.RegisterResponse;
import com.potsoft.cart2api.payload.response.aut.ValidateRegistrationResponse;
import com.potsoft.cart2api.security.CurrentUser;
//import com.potsoft.cart2api.security.CurrentUser;
import com.potsoft.cart2api.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.net.URI;
//import java.nio.file.attribute.UserPrincipal;
//import java.nio.file.attribute.UserPrincipal;
import java.sql.SQLException;
//import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;
//import java.util.HashSet;
//import java.util.Set;

@RestController
@RequestMapping("/api/aut/user")
public class AutUserController {
	//private static final String USER_ROLE_NOT_SET = "User role not set";

	@Autowired
	private MesDestinMesajRepository mesDestinMesajRepository;

	@Autowired
	private AutUserService autUserService;
	
	@Autowired
	private MemService memService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private AutUserRepository autUserRepository;

	@Autowired
	private AutUserRolRepository autUserRolRepository;

	//@Autowired
	//private PasswordEncoder passwordEncoder;

	//@Autowired
	//private PasswordDecoder passwordDecoder;

	@Autowired
	private JwtTokenProvider jwtTokenProvider;

	
	//------------------------------------------------
	@CrossOrigin(origins = "*")
	@PostMapping("/logout")
	@Transactional(rollbackFor = { SQLException.class })
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) 
	{  
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();  
		if (auth != null){      
		   new SecurityContextLogoutHandler().logout(request, response, auth);  
		}  
		return "/login";  
	}  

	//------------------------------------------------
	@CrossOrigin(origins = "*")
	@PostMapping("/login")
	@Transactional(rollbackFor = { SQLException.class })
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
  
	  Authentication authentication = authenticationManager.authenticate(
		  new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
  
	  SecurityContextHolder.getContext().setAuthentication(authentication);
	  //String jwt = jwtUtils.generateJwtToken(authentication);
	  String jwt = jwtTokenProvider.generateToken(authentication);

	  UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();    
	  /**
	   * List<String> roles = userDetails.getAuthorities().stream()
		  .map(item -> item.getAuthority())
		  .collect(Collectors.toList());
		  */
		 ///passwordEncoder. "$2a$10$kWdnlFGDvqV6UzqY7M3leeJXZ4nnGy6VU2ufmyZca";
	  Long userId = userDetails.getId();
	  String username = userDetails.getUsername();
	  AutUser newUser = autUserRepository.loadByAutUserId(userId);
	  //--------
      //AutUser crtUser = autUserRepository.loadByAutUserId(userId);
      //---
	  MesMesajePrimiteResponse mesaje = new MesMesajePrimiteResponse();
	  List<MesDestinMesaj> noimesajeprimite = mesDestinMesajRepository.loadListaMesajeNeprimiteDeUser(userId);
      mesaje.setNoiMesajePrimite(noimesajeprimite);
	  if (mesaje.getAcceptatingrup())
	  {
		//MembruGrupRequest_Activare membruGrupRequestActivare = new MembruGrupRequest_Activare();
		//MembruGrupResponse_Activare respActivare = memService.membruGrup_Activare(userId, membruGrupRequestActivare);
		//autUserService.changeAutUserRol(userId, respActivare.getCrtrol(),respActivare.getNewrol());
		
	  }
	  mesDestinMesajRepository.seteazaMesajeleNoiCaPrimite(userId);

	  
	  ///autUserRepository.refresh();
	  //crtUser.setAutUserParola("");

	  List<AutUserRol> userrolList = autUserRolRepository.loadUserRoluriActive(userId);
	  newUser.setRoles(userrolList);
	  return ResponseEntity.ok(new JwtResponse(jwt, 
	                       userId, 
						   username, 
						   null,
						   newUser,
						   mesaje));
	}

    //-----------------------------------------------------------
	@CrossOrigin(origins = "*")
	@PostMapping("/register")
	@Transactional(rollbackFor = { SQLException.class })
	public ResponseEntity<ApiResponse> registerUser(@Valid @RequestBody RegisterRequest registerRequest) 
	{
	  //--
      RegisterResponse registerResponse = autUserService.inregistreazaUser(registerRequest);
	  AutUser newUser = registerResponse.getAutUser();
	  //---
	  URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/users/{userId}")
				.buildAndExpand(newUser.getAutUserId()).toUri();

	  return ResponseEntity.created(location).body(
			              new ApiResponse(Boolean.TRUE, "V-ați înregistrat cu succes"));
	}


    //-----------------------------------------------------------
	@CrossOrigin(origins = "*")
	@PostMapping("/validate_registration")
	@Transactional(rollbackFor = { SQLException.class })
	public ResponseEntity<ValidateRegistrationResponse> validateRegistration(
		                                               @Valid @RequestBody ValidateRegistrationRequest validateRegistrationRequest,
		                                               @CurrentUser UserDetails currentUser) 
    {
       UserDetailsImpl crtuser = (UserDetailsImpl) currentUser;    		
	  //--
      ValidateRegistrationResponse validateRegistrationResponse = autUserService.valideazaInregistrareUser(
		                                                                                crtuser.getId(),
		                                                                                validateRegistrationRequest);
	  if (validateRegistrationResponse.getCodValidareAcceptat() == "y")
	  {
		Long userid = crtuser.getId();
		String username = crtuser.getUsername();
		autUserService.changeAutUserRol(crtuser.getId(), "SIMPATPEND", "SIMPATIZ");
		memService.membru_Creare(crtuser.getId(), "SIMPATIZ");
			//----
		if (username.equals("superadmin"))
		{
		  AutUserRol newSuperadminRol = autUserService.creazaSiSalveazaAutUserRol(userid, "SUPERADMIN", 
		                                                                                  true);
		  if (newSuperadminRol == null)
			throw new CartapiException(HttpStatus.BAD_REQUEST, "[User Registration] Nu se poate crea rolul utilizator Superadmin");
		  //registerResponse.setAutUserRol(newSuperadminRol);	
		}

	  }
	  //---
	  return ResponseEntity.ok(validateRegistrationResponse);
	}

	/** 
	@CrossOrigin(origins = "*")
	@PostMapping("/registerold")
	@Transactional(rollbackFor = { SQLException.class })
	public ResponseEntity<ApiResponse> registerUserOld(@Valid @RequestBody RegisterRequest registerRequest) 
	{
		if (Boolean.TRUE.equals(autUserRepository.existsByAutUserNume(registerRequest.getUsername()))) 
		{
			throw new CartapiException(HttpStatus.BAD_REQUEST, "Username există deja");
		}
		if (Boolean.TRUE.equals(autUserInfoRepository.existsByAutUserInfoTelefon(registerRequest.getUsername()))) 
		{
			throw new CartapiException(HttpStatus.BAD_REQUEST, "Acest Telefon este deja înregistrat");
		}
		if (Boolean.TRUE.equals(autUserInfoRepository.existsByAutUserInfoEmail(registerRequest.getEmail()))) 
		{
			throw new CartapiException(HttpStatus.BAD_REQUEST, "Email is already taken");
        }
		//--------- create  AutUser object
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

		AutRol autSimpRol = autRolRepository.loadByAutRolCod ("SIMPATIZ");
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

		Set<AutUserRol> roles = new HashSet<>();
		user.setRoles(roles);
        //roles.add(newSimpatizantUserRol);

		AutUser resUser       = autUserRepository.save(user);
		//AutUserInfo resUserInfo = 
		Long newuserid = resUser.getAutUserId();
		userInfo.setAutUserInfoUserid(newuserid);
		autUserInfoRepository.save(userInfo);

		newSimpatizantUserRol.setAutUserrolUserid(newuserid);
		//autUserRolRepository.save(newSimpatizantUserRol);

		newMemIncNflUserRol.setAutUserrolUserid(newuserid);
		//autUserRolRepository.save(newMemIncNflUserRol);

		newMemIncAflUserRol.setAutUserrolUserid(newuserid);
		//autUserRolRepository.save(newMemIncAflUserRol);

		newMemActAflUserRol.setAutUserrolUserid(newuserid);
		//autUserRolRepository.save(newMemActAflUserRol);

		newMemActNflUserRol.setAutUserrolUserid(newuserid);
		//autUserRolRepository.save(newMemActNflUserRol);

		newMemExpNflUserRol.setAutUserrolUserid(newuserid);
		//autUserRolRepository.save(newMemExpNflUserRol);

		newMemExpAflUserRol.setAutUserrolUserid(newuserid);
		//autUserRolRepository.save(newMemExpAflUserRol);

		newSefGrupUserRol.setAutUserrolUserid(newuserid);
		//autUserRolRepository.save(newSefGrupUserRol);

		newCoordPrincUserRol.setAutUserrolUserid(newuserid);
		//autUserRolRepository.save(newCoordPrincUserRol);

		newSimpatPendUserRol.setAutUserrolUserid(newuserid);
		autUserRolRepository.save(newSimpatPendUserRol);

		URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/users/{userId}")
				.buildAndExpand(resUser.getAutUserId()).toUri();

		return ResponseEntity.created(location).body(
			              new ApiResponse(Boolean.TRUE, "User registered successfully"));
	}
    */

    /**
	@PostMapping("/register")
	public ResponseEntity<?> registerUser(@Valid @RequestBody RegisterRequest registerRequest) {
  
	  if (autUserRepository.existsByAutUserEmail(registerRequest.getEmail())) {
		return ResponseEntity
			.badRequest()
			.body(new MessageResponse("Error: Email is already in use!"));
	  }
  
	  // Create new user's account
	  User user = new User(
				 signUpRequest.getEmail(),
				 signUpRequest.getFirstname(),
				 signUpRequest.getLastname(),
				 signUpRequest.getMobilenumber(),
				 encoder.encode(signUpRequest.getPassword()
						 ));
  
	  Set<String> strRoles = signUpRequest.getRole();
	  Set<Role> roles = new HashSet<>();
  
	  if (strRoles == null) {
		Role userRole = roleRepository.findByName(ERole.PASSENGER)
			.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
		roles.add(userRole);
	  } else {
		strRoles.forEach(role -> {
		  switch (role) {
		  case "admin":
			Role adminRole = roleRepository.findByName(ERole.ADMIN)
				.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
			roles.add(adminRole);
		  case "owner":
			  Role ownerRole = roleRepository.findByName(ERole.OWNER)
				  .orElseThrow(() -> new RuntimeException("Error: Role is not found."));
			  roles.add(ownerRole);
			
			break;
			
		  default:
			Role userRole = roleRepository.findByName(ERole.PASSENGER)
				.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
			roles.add(userRole);
		  }
		});
	  }
  
	  user.setRoles(roles);
	  autUserRepository.save(user);
  
	  return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
	}
	*/
	
	/**
	@PostMapping("/auth/logout")
	public String logoutPage(HttpServletRequest request, HttpServletResponse response) 
	{  
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();  
		if (auth != null){      
		   new SecurityContextLogoutHandler().logout(request, response, auth);  
		}  
		return "/login";  
	}  
    */ 


}
	/** 
	@PostMapping("/login2")
	public ResponseEntity<JwtAuthenticationResponse> authenticateUser2(@Valid @RequestBody LoginRequest loginRequest) {
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);

		String jwt = jwtTokenProvider.generateToken(authentication);
		return ResponseEntity.ok(new JwtAuthenticationResponse(jwt));
	}
    */

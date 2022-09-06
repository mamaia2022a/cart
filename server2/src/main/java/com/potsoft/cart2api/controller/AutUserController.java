package com.potsoft.cart2api.controller;

import java.util.stream.Collectors;

import com.potsoft.cart2api.security.UserDetailsImpl;

//import com.potsoft.cart2api.exception.AppException;
import com.potsoft.cart2api.exception.CartapiException;
import com.potsoft.cart2api.model.aut.AutUser;
import com.potsoft.cart2api.model.aut.AutUserRol;
import com.potsoft.cart2api.model.aut.AutUserInfo;
import com.potsoft.cart2api.model.aut.AutRol;

//import com.potsoft.cart2api.model.aut.rol.AutRoleName;
import com.potsoft.cart2api.payload.response.general.ApiResponse;
//import com.potsoft.cart2api.payload.response.aut.JwtAuthenticationResponse;
import com.potsoft.cart2api.payload.request.aut.LoginRequest;
import com.potsoft.cart2api.payload.request.aut.RegisterRequest;

import com.potsoft.cart2api.repository.aut.AutUserRepository;
import com.potsoft.cart2api.repository.aut.AutRolRepository;
import com.potsoft.cart2api.repository.aut.AutUserInfoRepository;
import com.potsoft.cart2api.repository.aut.AutUserRolRepository;

import com.potsoft.cart2api.payload.response.aut.JwtResponse;

import com.potsoft.cart2api.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.sql.SQLException;
//import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/api/aut/user")
public class AutUserController {
	//private static final String USER_ROLE_NOT_SET = "User role not set";

	@Autowired
	private AuthenticationManager authenticationManager;

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

	@Autowired
	private JwtTokenProvider jwtTokenProvider;

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
	
	@CrossOrigin(origins = "*")
	@PostMapping("/login")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
  
	  Authentication authentication = authenticationManager.authenticate(
		  new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
  
	  SecurityContextHolder.getContext().setAuthentication(authentication);
	  //String jwt = jwtUtils.generateJwtToken(authentication);
	  String jwt = jwtTokenProvider.generateToken(authentication);

	  UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();    
	  List<String> roles = userDetails.getAuthorities().stream()
		  .map(item -> item.getAuthority())
		  .collect(Collectors.toList());
	  
      AutUser crtUser = autUserRepository.loadByAutUserId(userDetails.getId());
	  crtUser.setAutUserParola("");
	  return ResponseEntity.ok(new JwtResponse(jwt, 
						   userDetails.getId(), 
						   userDetails.getUsername(), 
						   roles,
						   crtUser));
	}
  
	@CrossOrigin(origins = "*")
	@PostMapping("/register")
	@Transactional(rollbackFor = { SQLException.class })
	public ResponseEntity<ApiResponse> registerUser(@Valid @RequestBody RegisterRequest registerRequest) 
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

		Set<AutUserRol> roles = new HashSet<>();
		user.setRoles(roles);
        //roles.add(newSimpatizantUserRol);

		AutUser resUser       = autUserRepository.save(user);
		//AutUserInfo resUserInfo = 
		Long newuserid = resUser.getAutUserId();
		userInfo.setAutUserInfoUserid(newuserid);
		autUserInfoRepository.save(userInfo);

		newSimpatizantUserRol.setAutUserrolUserid(newuserid);
		autUserRolRepository.save(newSimpatizantUserRol);

		URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/users/{userId}")
				.buildAndExpand(resUser.getAutUserId()).toUri();

		return ResponseEntity.created(location).body(new ApiResponse(Boolean.TRUE, "User registered successfully"));
	}


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

package com.potsoft.cart2api.controller;

import java.util.stream.Collectors;

import com.potsoft.cart2api.security.UserDetailsImpl;

//import com.potsoft.cart2api.exception.AppException;
//import com.potsoft.cart2api.exception.CartapiException;
//import com.potsoft.cart2api.model.aut.user.AutUser;
//import com.potsoft.cart2api.model.aut.rol.AutRol;
//import com.potsoft.cart2api.model.aut.rol.AutRoleName;
//import com.potsoft.cart2api.payload.response.ApiResponse;
import com.potsoft.cart2api.payload.response.JwtAuthenticationResponse;
import com.potsoft.cart2api.payload.request.LoginRequest;
//import com.potsoft.cart2api.payload.SignUpRequest;
//import com.potsoft.cart2api.repository.RoleRepository;
//import com.potsoft.cart2api.repository.UserRepository;
import com.potsoft.cart2api.payload.response.JwtResponse;

import com.potsoft.cart2api.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
///import java.net.URI;
//import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/aut/user")
public class AutUserController {
	//private static final String USER_ROLE_NOT_SET = "User role not set";

	@Autowired
	private AuthenticationManager authenticationManager;

	//@Autowired
	//private UserRepository userRepository;

	//@Autowired
	//private RoleRepository roleRepository;

	//@Autowired
	//private PasswordEncoder passwordEncoder;

	@Autowired
	private JwtTokenProvider jwtTokenProvider;

	@PostMapping("/login2")
	public ResponseEntity<JwtAuthenticationResponse> authenticateUser2(@Valid @RequestBody LoginRequest loginRequest) {
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);

		String jwt = jwtTokenProvider.generateToken(authentication);
		return ResponseEntity.ok(new JwtAuthenticationResponse(jwt));
	}

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
	  
  
	  return ResponseEntity.ok(new JwtResponse(jwt, 
						   userDetails.getId(), 
						   userDetails.getUsername(), 
						   roles));
	}
  

	@PostMapping("/register2")
	public ResponseEntity<ApiResponse> registerUser(@Valid @RequestBody SignUpRequest signUpRequest) {
		if (Boolean.TRUE.equals(userRepository.existsByUsername(signUpRequest.getUsername()))) {
			throw new CartapiException(HttpStatus.BAD_REQUEST, "Username is already taken");
		}

		if (Boolean.TRUE.equals(userRepository.existsByEmail(signUpRequest.getEmail()))) {
			throw new CartapiException(HttpStatus.BAD_REQUEST, "Email is already taken");
		}

		String firstName = signUpRequest.getFirstName().toLowerCase();

		String lastName = signUpRequest.getLastName().toLowerCase();

		String username = signUpRequest.getUsername().toLowerCase();

		String email = signUpRequest.getEmail().toLowerCase();

		String password = passwordEncoder.encode(signUpRequest.getPassword());

		AutUser user = new AutUser(firstName, lastName, username, email, password);

		List<Role> roles = new ArrayList<>();

		if (userRepository.count() == 0) {
			roles.add(roleRepository.findByName(RoleName.ROLE_USER)
					.orElseThrow(() -> new AppException(USER_ROLE_NOT_SET)));
			roles.add(roleRepository.findByName(RoleName.ROLE_ADMIN)
					.orElseThrow(() -> new AppException(USER_ROLE_NOT_SET)));
		} else {
			roles.add(roleRepository.findByName(RoleName.ROLE_USER)
					.orElseThrow(() -> new AppException(USER_ROLE_NOT_SET)));
		}

		user.setRoles(roles);

		AutUser result = userRepository.save(user);

		URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/users/{userId}")
				.buildAndExpand(result.getAutUserId()).toUri();

		return ResponseEntity.created(location).body(new ApiResponse(Boolean.TRUE, "User registered successfully"));
	}


	@PostMapping("/register")
	public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signUpRequest) {
  
	  if (userRepository.existsByEmail(signUpRequest.getEmail())) {
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
	  userRepository.save(user);
  
	  return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
	}
	
	
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

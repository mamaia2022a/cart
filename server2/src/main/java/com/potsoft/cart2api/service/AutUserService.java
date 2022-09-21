package com.potsoft.cart2api.service;

import com.potsoft.cart2api.model.aut.AutUser;
import com.potsoft.cart2api.model.aut.AutUserInfo;
import com.potsoft.cart2api.model.aut.AutUserRol;
import com.potsoft.cart2api.model.aut.AutValidInreg;
import com.potsoft.cart2api.payload.request.aut.RegisterRequest;
import com.potsoft.cart2api.payload.request.aut.ValidateRegistrationRequest;
import com.potsoft.cart2api.payload.response.aut.RegisterResponse;
import com.potsoft.cart2api.payload.response.aut.ValidateRegistrationResponse;

//import com.potsoft.cart2api.model.aut.AutRolGrupAct;

//import java.util.List;

//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;


public interface AutUserService 
{
   RegisterResponse inregistreazaUser(RegisterRequest registerRequest);
   
   AutUser    creazaAutUser(RegisterRequest registerRequest);
   AutUser    creazaSiSalveazaAutUser(RegisterRequest registerRequest);

   AutValidInreg creazaAutValidInreg(Long userId);
   AutValidInreg creazaSiSalveazaAutValidInreg(Long userId);

   AutUserRol creazaAutUserRol(Long userId, String rolCod);
   AutUserRol creazaSiSalveazaAutUserRol(Long userId, String rolCod);

   AutUserInfo creazaAutUserInfo(Long userId, RegisterRequest registerRequest);
   AutUserInfo creazaSiSalveazaAutUserInfo(Long userId, RegisterRequest registerRequest);

   ValidateRegistrationResponse valideazaInregistrareUser(Long userid, ValidateRegistrationRequest validateRegistrationRequest);
}


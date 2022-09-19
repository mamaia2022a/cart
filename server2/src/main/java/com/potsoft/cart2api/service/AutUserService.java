package com.potsoft.cart2api.service;

import com.potsoft.cart2api.model.aut.AutUser;
import com.potsoft.cart2api.model.aut.AutUserInfo;
import com.potsoft.cart2api.model.aut.AutUserRol;
import com.potsoft.cart2api.payload.request.aut.RegisterRequest;

//import com.potsoft.cart2api.model.aut.AutRolGrupAct;

//import java.util.List;

//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;


public interface AutUserService 
{
   AutUser inregistreazaUser(RegisterRequest registerRequest);
   
   AutUser    creazaAutUser(RegisterRequest registerRequest);
   AutUser    creazaSiSalveazaAutUser(RegisterRequest registerRequest);

   AutUserRol creazaAutUserRol(Long userId, String rolCod);
   AutUserRol creazaSiSalveazaAutUserRol(Long userId, String rolCod);

   AutUserInfo creazaAutUserInfo(Long userId, RegisterRequest registerRequest);
   AutUserInfo creazaSiSalveazaAutUserInfo(Long userId, RegisterRequest registerRequest);

}


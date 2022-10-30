package com.potsoft.cart2api.payload.response.aut;

import lombok.Data;


import com.potsoft.cart2api.model.aut.AutUser;
import com.potsoft.cart2api.model.aut.AutUserInfo;
import com.potsoft.cart2api.model.aut.AutUserRol;
import com.potsoft.cart2api.model.aut.AutValidInreg;

@Data
public class RegisterResponse 
{
	private AutUser autUser;

	private AutValidInreg autValidInreg;

	private AutUserInfo autUserInfo;

	private AutUserRol autUserRol;



	public AutUser getAutUser() 
	{
	  return this.autUser;
	}
  
	public void setAutUser(AutUser autUser) 
	{
	  this.autUser = autUser;
	}
  

	public AutValidInreg getAutValidInreg() 
	{
	  return this.autValidInreg;
	}
  
	public void setAutValidInreg(AutValidInreg autValidInreg) 
	{
	  this.autValidInreg = autValidInreg;
	}

  
  	public AutUserInfo getAutUserInfo() 
	{
	  return this.autUserInfo;
	}
  
	public void setAutUserInfo(AutUserInfo autUserInfo) 
	{
	  this.autUserInfo = autUserInfo;
	}



	public AutUserRol getAutUserRol() 
	{
	  return this.autUserRol;
	}
  
	public void setAutUserRol(AutUserRol autUserRol) 
	{
	  this.autUserRol = autUserRol;
	}


}

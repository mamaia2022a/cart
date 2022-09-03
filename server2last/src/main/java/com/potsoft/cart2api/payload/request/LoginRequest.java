package com.potsoft.cart2api.payload.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginRequest 
{
	@NotBlank
	private String username;

	@NotBlank
	private String password;


	public String getUsername() 
	{
	  return this.username;
	}
  
	public void setUsername(String username) 
	{
	  this.username = username;
	}
  

	public String getPassword() 
	{
	  return this.password;
	}
  
	public void setPassword(String password) 
	{
	  this.password = password;
	}
}

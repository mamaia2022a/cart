package com.potsoft.cart2api.payload.request.mem;

import lombok.Data;


@Data
public class MembruRolRequest_Stergere
{
	private String username;


	public String getUsername() 
	{
	  return this.username;
	}
  
	public void setUsername(String username) 
	{
	  this.username = username;
	}
  
}

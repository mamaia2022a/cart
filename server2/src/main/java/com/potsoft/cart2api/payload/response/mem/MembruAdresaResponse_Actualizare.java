package com.potsoft.cart2api.payload.response.mem;

import lombok.Data;


@Data
public class MembruAdresaResponse_Actualizare
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

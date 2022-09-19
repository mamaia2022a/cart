package com.potsoft.cart2api.payload.request.mem;

import lombok.Data;


@Data
public class GrupRequest_Vizualizare
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


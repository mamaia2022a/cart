package com.potsoft.cart2api.payload.request.mem;

import lombok.Data;


@Data
public class MembruCotizatieRequest_Creare 
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

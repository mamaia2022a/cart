package com.potsoft.cart2api.payload.response.mem;

import lombok.Data;


@Data
public class MembruGrupResponse_Excludere 
{
	
	private String membrucodunic;

	public String getMembrucodunic() 
	{
	  return this.membrucodunic;
	}
  
	public void setUsername(String membrucodunic) 
	{
	  this.membrucodunic = membrucodunic;
	}
  

}

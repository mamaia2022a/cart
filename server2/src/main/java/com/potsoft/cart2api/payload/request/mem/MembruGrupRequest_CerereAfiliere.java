package com.potsoft.cart2api.payload.request.mem;

import lombok.Data;


@Data
public class MembruGrupRequest_CerereAfiliere
{
	
	private String grupcodunic;

	public String getGrupcodunic() 
	{
	  return this.grupcodunic;
	}
  
	public void setUsername(String grupcodunic) 
	{
	  this.grupcodunic = grupcodunic;
	}
  

}

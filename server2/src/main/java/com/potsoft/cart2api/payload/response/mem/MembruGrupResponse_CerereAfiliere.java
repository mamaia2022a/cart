package com.potsoft.cart2api.payload.response.mem;

import lombok.Data;


@Data
public class MembruGrupResponse_CerereAfiliere
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

package com.potsoft.cart2api.payload.response.mem;

import lombok.Data;


@Data
public class GrupResponse_Creare
{
	private String grupnume;
	private String grupcodunic;


	public String getGrupnume() 
	{
	  return this.grupnume;
	}
  
	public void setGrupnume(String grupnume) 
	{
	  this.grupnume = grupnume;
	}


	public String getGrupcodunic() 
	{
	  return this.grupcodunic;
	}
  
	public void setGrupcodunic(String grupcodunic) 
	{
	  this.grupcodunic = grupcodunic;
	}
	
}


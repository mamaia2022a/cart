package com.potsoft.cart2api.payload.request.mem;

import lombok.Data;


@Data
public class GrupRequest_Stergere
{
	private String grupnume;


	public String getGrupnume() 
	{
	  return this.grupnume;
	}
  
	public void setGrupnume(String grupnume) 
	{
	  this.grupnume = grupnume;
	}
  
}


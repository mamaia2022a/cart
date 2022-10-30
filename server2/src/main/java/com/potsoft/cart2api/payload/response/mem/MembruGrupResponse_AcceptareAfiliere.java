package com.potsoft.cart2api.payload.response.mem;

import lombok.Data;


@Data
public class MembruGrupResponse_AcceptareAfiliere 
{
	
	private String membrucodunic;
	private String acceptareyn;

	public String getMembrucodunic() 
	{
	  return this.membrucodunic;
	}
  
	public void setMembrucodunic(String membrucodunic) 
	{
	  this.membrucodunic = membrucodunic;
	}
  
	public String getAcceptareyn() 
	{
	  return this.acceptareyn;
	}
  
	public void setAcceptareyn(String acceptareyn) 
	{
	  this.acceptareyn = acceptareyn;
	}

}

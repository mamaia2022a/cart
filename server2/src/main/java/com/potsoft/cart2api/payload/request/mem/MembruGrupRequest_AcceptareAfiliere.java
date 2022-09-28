package com.potsoft.cart2api.payload.request.mem;

import lombok.Data;


@Data
public class MembruGrupRequest_AcceptareAfiliere 
{
	private Long   membruid;
	private Long   membrugrupid;
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
  

	public Long getMembruId() 
	{
	  return this.membruid;
	}
  
	public void setMembruId(Long membruid) 
	{
	  this.membruid = membruid;
	}


	public Long getMembrugrupId() 
	{
	  return this.membrugrupid;
	}
  
	public void setMembrugrupId(Long membrugrupid) 
	{
	  this.membrugrupid = membrugrupid;
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

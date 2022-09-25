package com.potsoft.cart2api.payload.request.mem;

import lombok.Data;


@Data
public class MembruGrupRequest_AcceptareAfiliere 
{
	private String membrugrupid;
	private String membrucodunic;

	public String getMembrucodunic() 
	{
	  return this.membrucodunic;
	}
  
	public void setMembrucodunic(String membrucodunic) 
	{
	  this.membrucodunic = membrucodunic;
	}
  
	public String getMembrugrupId() 
	{
	  return this.membrugrupid;
	}
  
	public void setMembrugrupId(String membrugrupid) 
	{
	  this.membrugrupid = membrugrupid;
	}

}

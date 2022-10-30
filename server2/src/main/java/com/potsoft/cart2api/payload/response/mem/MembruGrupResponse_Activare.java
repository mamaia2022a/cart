package com.potsoft.cart2api.payload.response.mem;

import lombok.Data;


@Data
public class MembruGrupResponse_Activare
{
	
	private String membrucodunic;
	private String crtrol;
	private String newrol;

	public String getMembrucodunic() 
	{
	  return this.membrucodunic;
	}
  
	public void setUsername(String membrucodunic) 
	{
	  this.membrucodunic = membrucodunic;
	}
  

	public String getCrtrol() 
	{
	  return this.crtrol;
	}
  
	public void setCrtrol(String crtrol) 
	{
	  this.crtrol = crtrol;
	}


	public String getNewrol() 
	{
	  return this.newrol;
	}
  
	public void setNewrol(String newrol) 
	{
	  this.newrol = newrol;
	}

  
}

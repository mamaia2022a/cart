package com.potsoft.cart2api.payload.request.mem;

import lombok.Data;


@Data
public class MembruTipRequest_Schimbare
{
	private String crtmemtipcod;
	private String newmemtipcod;

	private String crtmemrolcod;
	private String newmemrolcod;


	public String getCrtmemtipcod() 
	{
	  return this.crtmemtipcod;
	}
  
	public void setCrtmemtipcod(String crtmemtipcod) 
	{
	  this.crtmemtipcod = crtmemtipcod;
	}
  

	public String getNewmemtipcod() 
	{
	  return this.newmemtipcod;
	}
  
	public void setNewmemtipcod(String newmemtipcod) 
	{
	  this.newmemtipcod = newmemtipcod;
	}



	public String getCrtmemrolcod() 
	{
	  return this.crtmemrolcod;
	}
  
	public void setCrtmemrolcod(String crtmemrolcod) 
	{
	  this.crtmemrolcod = crtmemrolcod;
	}
  

	public String getNewmemrolcod() 
	{
	  return this.newmemrolcod;
	}
  
	public void setNewmemrolcod(String newmemrolcod) 
	{
	  this.newmemrolcod = newmemrolcod;
	}


}

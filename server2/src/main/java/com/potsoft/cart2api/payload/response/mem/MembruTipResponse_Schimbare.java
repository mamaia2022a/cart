package com.potsoft.cart2api.payload.response.mem;

import lombok.Data;


@Data
public class MembruTipResponse_Schimbare
{
	private String result;

	public String getResult() 
	{
	  return this.result;
	}
  
	public void setResult(String result) 
	{
	  this.result = result;
	}
  

}

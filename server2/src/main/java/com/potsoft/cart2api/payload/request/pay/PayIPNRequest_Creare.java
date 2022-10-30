package com.potsoft.cart2api.payload.request.pay;

import lombok.Data;


@Data
public class PayIPNRequest_Creare
{
	private Object data;


	public Object getData() 
	{
	  return this.data;
	}
  
	public void setData(Object data) 
	{
	  this.data = data;
	}
  

  
}


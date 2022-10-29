package com.potsoft.cart2api.payload.response.pay;

import lombok.Data;


@Data
public class PayIPNResponse_Creare
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


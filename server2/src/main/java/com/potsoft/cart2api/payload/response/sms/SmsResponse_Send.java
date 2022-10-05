package com.potsoft.cart2api.payload.response.sms;

import lombok.Data;


@Data
public class SmsResponse_Send
{
	private boolean smsEEroare;
	private String  smsRaspuns;


	public SmsResponse_Send()
	{
      this.smsEEroare = false;
	  this.smsRaspuns = "";
	}


	public boolean getSmsEEroare() 
	{
	  return this.smsEEroare;
	}
  
	public void setSmsEEroare(boolean smsEEroare) 
	{
	  this.smsEEroare = smsEEroare;
	}
  

	public String getSmsRaspuns() 
	{
	  return this.smsRaspuns;
	}
  
	public void setSmsRaspuns(String smsRaspuns)
	{
	  this.smsRaspuns = smsRaspuns;
	}


  
}


package com.potsoft.cart2api.payload.request.sms;

import lombok.Data;


@Data
public class SmsRequest_Send
{
	private String smsText;
	private String smsNrTelefon;

	private String smsApplicationId;
    private String smsApplicationToken;

	private String smsUnicode;
	private String smsSenderIdValue;
	private String smsCountry;
	String smsSenderId;

	public SmsRequest_Send(String smsText, String smsNrTelefon, String smsCountry)
	{
      this.smsText             = smsText;
	  this.smsNrTelefon        = smsNrTelefon;

	  this.smsApplicationId    = null;
	  this.smsApplicationToken = null;

	  this.smsUnicode        = null;
	  this.smsSenderId       = null;
	  this.smsSenderIdValue  = null;
	  this.smsCountry        = smsCountry;
	}


	public String getSmsText() 
	{
	  return this.smsText;
	}
  
	public void setSmsText(String smsText) 
	{
	  this.smsText = smsText;
	}
  

	public String getSmsNrTelefon() 
	{
	  return this.smsNrTelefon;
	}
  
	public void setSmsNrTelefon(String smsNrTelefon) 
	{
	  this.smsNrTelefon = smsNrTelefon;
	}


	public String getSmsCountry() 
	{
	  return this.smsCountry;
	}
  
	public void setSmsCountry(String smsCountry) 
	{
	  this.smsCountry = smsCountry;
	}


	public String getSmsSenderid() 
	{
	  return this.smsSenderId;
	}
  
	public void setSmsSenderid(String smsSenderId) 
	{
	  this.smsSenderId = smsSenderId;
	}
  
}


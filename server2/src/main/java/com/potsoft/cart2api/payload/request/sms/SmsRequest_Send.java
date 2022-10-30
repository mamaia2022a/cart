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
	private String smsSenderId;

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


	public String getSmsSenderId() 
	{
	  return this.smsSenderId;
	}
  
	public void setSmsSenderId(String smsSenderId) 
	{
	  this.smsSenderId = smsSenderId;
	}
  

	public String getSmsSenderIdValue() 
	{
	  return this.smsSenderIdValue;
	}
  
	public void setSmsSenderIdValue(String smsSenderIdValue) 
	{
	  this.smsSenderIdValue = smsSenderIdValue;
	}

  
  public String getSmsApplicationId() 
	{
	  return this.smsApplicationId;
	}
  
	public void setSmsApplicationId(String smsApplicationId) 
	{
	  this.smsApplicationId = smsApplicationId;
	}
  

  public String getSmsApplicationToken() 
	{
	  return this.smsApplicationToken;
	}
  
	public void setSmsApplicationToken(String smsApplicationToken) 
	{
	  this.smsApplicationToken = smsApplicationToken;
	}


  public String getSmsUnicode() 
	{
	  return this.smsUnicode;
	}
  
	public void setSmsUnicode(String smsUnicode) 
	{
	  this.smsUnicode = smsUnicode;
	}

}


package com.potsoft.cart2api.payload.request.sms;

import lombok.Data;


@Data
public class SmsRequest_Send
{
  public static String SMS_PROVIDER_BULKGATE   = "bulkgate";
  public static String SMS_PROVIDER_CLICKPHONE = "clickphone";

	private String smsText;
	private String smsNrTelefon;

	private String smsApplicationId;
  private String smsApplicationToken;

	private String smsUnicode;
	private String smsSenderIdValue;
	private String smsCountry;
	private String smsSenderId;

	private String smsUser;
	private String smsParola;

  private String smsProvider;
	

	public SmsRequest_Send(String smsProvider, String smsText, String smsNrTelefon, String smsCountry)
	{
    this.smsProvider         = smsProvider;

    this.smsText             = smsText;
	  this.smsNrTelefon        = smsNrTelefon;

	  this.smsApplicationId    = null;
	  this.smsApplicationToken = null;

	  this.smsUnicode        = null;
	  this.smsSenderId       = null;
	  this.smsSenderIdValue  = null;
	  this.smsCountry        = smsCountry;

    this.smsUser           = null;
	  this.smsParola         = null;

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


  public String getSmsUser() 
	{
	  return this.smsUser;
	}
  
	public void setSmsUser(String smsUser) 
	{
	  this.smsUser = smsUser;
	}


  public String getSmsParola() 
	{
	  return this.smsParola;
	}
  
	public void setSmsParola(String smsParola) 
	{
	  this.smsParola = smsParola;
	}


  public String getSmsProvider() 
	{
	  return this.smsProvider;
	}
  
	public void setSmsProvider(String smsProvider) 
	{
	  this.smsProvider = smsProvider;
	}

}


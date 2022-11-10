package com.potsoft.cart2api.payload.response.pay;

import lombok.Data;


@Data
public class PayDataResponse_Creare
{

  public double amount;	    //Numeric	1-12	Order total amount in float format with decimal point (thousand separator not allowed). Ex: 1234.56
  public String curr;       //String	3	Order currency: 3-character currency code (RON, USD, EUR)
  public String invoice_id;	//String	1-32	Merchant order ID
  public String order_desc;	//String	1-127	Order description
  public String merch_id;	  //String	8-50	Merchant ID assigned by EuPlatesc.ro
  public String timestamp;	//YYYYMMDDHHmmSS	14	Current timestamp in GMT: 20221106203255
  public String nonce;      //	16-64	Merchant nonce. Must be filled with unpredictable random bytes in hexadecimal format
  public String fp_hash;    //	1-256	Merchant MAC in hexadecimal form

  public String ipnurl;
  public String backtositeurl;
  public String successurl;
  public String failedurl;


	public double getAmount() 
	{
	  return this.amount;
	}
  
	public void setAmount(double amount) 
	{
	  this.amount = amount;
	}
  

  public String getCurr() 
	{
	  return this.curr;
	}
  
	public void setCurr(String curr) 
	{
	  this.curr = curr;
	}


  public String getInvoiceId() 
	{
	  return this.invoice_id;
	}
  
	public void setInvoiceId(String invoice_id) 
	{
	  this.invoice_id = invoice_id;
	}

  
  public String getOrderDesc() 
	{
	  return this.order_desc;
	}
  
	public void setOrderDesc(String order_desc) 
	{
	  this.order_desc = order_desc;
	}


  public String getMerchId() 
	{
	  return this.merch_id;
	}
  
	public void setMerchId(String merch_id) 
	{
	  this.merch_id = merch_id;
	}


  public String getTimestamp() 
	{
	  return this.timestamp;
	}
  
	public void setTimestamp(String timestamp) 
	{
	  this.timestamp  = timestamp;
	}


  public String getNonce() 
	{
	  return this.nonce;
	}
  
	public void setNonce(String nonce) 
	{
	  this.nonce  = nonce;
	}


  public String getFpHash()
	{
	  return this.fp_hash;
	}
  
	public void setFpHash(String fp_hash) 
	{
	  this.fp_hash  = fp_hash;
	}


  public String getIpnUrl()
	{
	  return this.ipnurl;
	}
  
	public void setIpnUrl(String ipnurl) 
	{
	  this.ipnurl  = ipnurl;
	}


  public String getBacktositeUrl()
	{
	  return this.backtositeurl;
	}
  
	public void setBacktositeUrl(String backtositeurl) 
	{
	  this.backtositeurl = backtositeurl;
	}


  public String getSuccessUrl()
	{
	  return this.successurl;
	}
  
	public void setSuccessUrl(String successurl) 
	{
	  this.successurl = successurl;
	}



  public String getFailedUrl()
	{
	  return this.failedurl;
	}
  
  public void setFailedUrl(String failedurl) 
	{
	  this.failedurl = failedurl;
	}



}


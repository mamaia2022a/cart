package com.potsoft.cart2api.service.impl;

import com.potsoft.cart2api.model.aut.AutUser;
import com.potsoft.cart2api.model.aut.AutUserInfo;
import com.potsoft.cart2api.model.pay.PayTransaction;
import com.potsoft.cart2api.payload.request.pay.PayDataRequest_Creare;
import com.potsoft.cart2api.payload.response.pay.PayDataResponse_Creare;
import com.potsoft.cart2api.repository.aut.AutUserInfoRepository;
import com.potsoft.cart2api.repository.aut.AutUserRepository;
import com.potsoft.cart2api.repository.pay.PayTransactionRepository;
import com.potsoft.cart2api.service.PayService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.util.*;
import java.text.*;
import java.util.ArrayList;    
    
@Service
public class PayServiceImpl implements PayService 
{

  @Value("${plataonline.ipnurl}")
  private String ipnurl;

  @Value("${plataonline.backtositeurl}")
  private String backtositeurl;

  @Value("${plataonline.successurl}")
  private String successurl;

  @Value("${plataonline.failedurl}")
  private String failedurl;


  @Autowired
	private PayTransactionRepository payTransactionRepository;

	@Autowired
	private AutUserRepository autUserRepository;

	@Autowired
	private AutUserInfoRepository autUserInfoRepository;

  private static String EUPLATESC_MERCHANT_ID  = "44840999634";
  private static String EUPLATESC_MERCHANT_KEY = "b995c4fa172705c1a5333136c71e34bc7b0bf1e1";//"00112233445566778899AABBCCDDEEFF";

  @Override
	public PayDataResponse_Creare createTransactionData(Long userid, PayDataRequest_Creare payDataRequest)
  {
    
    PayDataResponse_Creare payDataResponse = new PayDataResponse_Creare();

    
    String mid       = EUPLATESC_MERCHANT_ID;   //"testaccount";
    String key       = EUPLATESC_MERCHANT_KEY;  //"00112233445566778899AABBCCDDEEFF";

    //---------------------------
    double amount    = payDataRequest.getAmount();
    String strAmount = "" + amount;
    String curr      = payDataRequest.getCurr();
    String orderdesc = payDataRequest.getOrderDesc();
    //---------------------------
    Date date = new Date();
    String dateString = new SimpleDateFormat("yyyyMMddHHmmss").format(date);
    ArrayList<String> s = new ArrayList<String>();  
    s.add(strAmount);                      //"100.00"
    s.add(curr);                           //"RON"
    String invoiceid = Long.toString(date.getTime());
    s.add(invoiceid);  
    s.add(orderdesc);                      //"Order " + Long.toString(date.getTime()));  
    s.add(mid);  
    String timestamp = dateString;
    s.add(timestamp);
    String nonce = nonceGen(32);
    s.add("ABCDEF0123456789");//nonce);
    String fphash = fp_hash(s,key);
    s.add(fphash);
    //--------------------------------
    payDataResponse.setAmount(amount);
    payDataResponse.setCurr(curr);
    payDataResponse.setInvoiceId(invoiceid);
    payDataResponse.setOrderDesc(orderdesc);
    payDataResponse.setMerchId(mid);
    payDataResponse.setTimestamp(timestamp);
    payDataResponse.setNonce(nonce);
    payDataResponse.setNonce("ABCDEF0123456789");
    payDataResponse.setFpHash(fphash);
    //--
    payDataResponse.setIpnUrl(this.ipnurl);
    payDataResponse.setBacktositeUrl(this.backtositeurl);
    payDataResponse.setSuccessUrl(this.successurl);
    payDataResponse.setFailedUrl(this.failedurl);
    //--------------------------------
    AutUser     autUser     = autUserRepository.loadByAutUserId(userid);
	  AutUserInfo autUserInfo = autUserInfoRepository.loadByAutUserInfoUserid(userid);
    PayTransaction payTransaction = this.creazaSiSalveazaPayTransaction(autUser, autUserInfo, payDataResponse);
    if (payTransaction == null)
      return payDataResponse;
    //--------------------------------
    return payDataResponse;
  }


  public static String nonceGen(int len){
    String AlphaNumericString = "ABCDEF0123456789";
    StringBuilder sb = new StringBuilder(len); 
    for (int i = 0; i < len; i++) { 
        int index = (int)(AlphaNumericString.length() * Math.random()); 
        sb.append(AlphaNumericString.charAt(index)); 
    } 
    return sb.toString();
  }
 
  public static byte[] hex2byte(String key){
      int len = key.length();
      byte[] bkey = new byte[len / 2];
      for (int i = 0; i < len; i += 2) {
          bkey[i / 2] = (byte) ((Character.digit(key.charAt(i), 16) << 4) + Character.digit(key.charAt(i+1), 16));
      }
      return bkey;
  }

  //RFC2104HMAC
  public String fp_hash(ArrayList<String> s, String key)
  {
    try
    {
      StringBuffer ret = new StringBuffer();
      Formatter formatter = new Formatter();
      String t;
      Integer l;
      for(int i = 0; i < s.size(); i++)
      {
        t = ((String)s.get(i)).trim();
        if(t.length() == 0)
          ret.append("-");
        else
        {
          l = t.length();
          ret.append(l.toString());
          ret.append(t.toString());
        }
      }
      String data=ret.toString();
      try
      {
        SecretKeySpec secretKeySpec = new SecretKeySpec(hex2byte(key), "HmacMD5");
        Mac mac = Mac.getInstance("HmacMD5");
        mac.init(secretKeySpec);
        for (byte b : mac.doFinal(data.getBytes())) 
        {
          formatter.format("%02x", b);
        }
      
      }catch(InvalidKeyException e)
      {
        formatter.close();
        return "error";
      }catch (NoSuchAlgorithmException e) 
      {
        formatter.close();
        return "error";
      }
      
      String resp = formatter.toString().toUpperCase();
      formatter.close();
      return resp;

    }catch(Exception e)
    {
      return "error";
    }
  }  



  // -----------------------------------------------------------
	@Override
	public PayTransaction creazaPayTransaction(AutUser autUser, AutUserInfo autUserInfo, PayDataResponse_Creare payDataResponse)
	{
    Long payTransactionId                       = Long.parseLong(payDataResponse.getInvoiceId());
    Long payTransactionUserid                   = autUser.getAutUserId();
    String payTransactionUsernume               = autUser.getAutUserNume();
    Long payTransactionUserinfoid               = autUserInfo.getAutUserInfoId();
    String payTransactionSuccesyn               = null;
    String payTransactionDate                   = null;
    double payTransactionAmount                 = payDataResponse.getAmount();
    String payTransactionCurr                   = payDataResponse.getCurr();
    String payTransactionOrderdesc              = payDataResponse.getOrderDesc();
    String payTransactionMerchid                = payDataResponse.getMerchId();
    String payTransactionYyyymmddhhmmddreq      = payDataResponse.getTimestamp();
    String payTransactionNoncereq               = payDataResponse.getNonce();
    String payTransactionFphashreq              = payDataResponse.getFpHash();
    String payTransactionNonceresp              = null;
    String payTransactionFphashresp             = null;
    String payTransactionEpiidresp              = null;
    String payTransactionMessageresp            = null;
    String payTransactionApprovalresp           = null;
    String payTransactionYyyymmddhhmmddresp     = null;;
    PayTransaction newPayTransaction = new PayTransaction( payTransactionId,
                                            payTransactionUserid, payTransactionUsernume, payTransactionUserinfoid,
                                            payTransactionSuccesyn, payTransactionDate,
                                            payTransactionAmount, payTransactionCurr,
                                            payTransactionOrderdesc, payTransactionMerchid,
                                            payTransactionYyyymmddhhmmddreq,
                                            payTransactionNoncereq, payTransactionFphashreq,
                                            payTransactionNonceresp, payTransactionFphashresp,
                                            payTransactionEpiidresp,
                                            payTransactionMessageresp, payTransactionApprovalresp, 
                                            payTransactionYyyymmddhhmmddresp);
		return newPayTransaction;

	}


	// -----------------------------------------------------------
	@Override
	public PayTransaction creazaSiSalveazaPayTransaction(AutUser autUser, AutUserInfo autUserInfo, 
                                                      PayDataResponse_Creare payDataResponse)
	{
	  PayTransaction newPayTransaction  = this.creazaPayTransaction(autUser, autUserInfo, payDataResponse);
	  payTransactionRepository.save(newPayTransaction);
	  return newPayTransaction;
	}



}

/** 
public class ep_demo{

    public static void main(String []args){
        String mid="testaccount";
        String key="00112233445566778899AABBCCDDEEFF";
        
        Date date = new Date();
        String dateString = new SimpleDateFormat("yyyyMMddHHmmss").format(date);
        ArrayList s=new ArrayList();  
        s.add("100.00");
        s.add("RON");  
        s.add(Long.toString(date.getTime()));  
        s.add("Order " + Long.toString(date.getTime()));  
        s.add(mid);  
        s.add(dateString);
        s.add(nonceGen(32));
        s.add(fp_hash(s,key));
    }
    
    public static String nonceGen(int len){
        String AlphaNumericString = "ABCDEF0123456789";
        StringBuilder sb = new StringBuilder(len); 
        for (int i = 0; i < len; i++) { 
            int index = (int)(AlphaNumericString.length() * Math.random()); 
            sb.append(AlphaNumericString.charAt(index)); 
        } 
        return sb.toString();
    }
     
    public static byte[] hex2byte(String key){
        int len = key.length();
        byte[] bkey = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            bkey[i / 2] = (byte) ((Character.digit(key.charAt(i), 16) << 4) + Character.digit(key.charAt(i+1), 16));
        }
        return bkey;
    }
    
    //RFC2104HMAC
    public static String fp_hash(ArrayList s, String key){
        StringBuffer ret = new StringBuffer();
        Formatter formatter = new Formatter();
    	String t;
    	Integer l;
    	for(int i = 0; i < s.size(); i++)
    	{
    		t = s.get(i).trim();
    		if(t.length() == 0)
    			ret.append("-");
    		else
    		{
    			l = t.length();
    			ret.append(l.toString());
    			ret.append(t.toString());
    		}
    	}
        String data=ret.toString();
        try
        {
            SecretKeySpec secretKeySpec = new SecretKeySpec(hex2byte(key), "HmacMD5");
            Mac mac = Mac.getInstance("HmacMD5");
            mac.init(secretKeySpec);
            for (byte b : mac.doFinal(data.getBytes())) {
                formatter.format("%02x", b);
            }
        }
        catch(InvalidKeyException e){}
        catch (NoSuchAlgorithmException e) {}
        
        return formatter.toString().toUpperCase();
    }
}



}
*/





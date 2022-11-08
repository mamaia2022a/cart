package com.potsoft.cart2api.service.impl;

import com.potsoft.cart2api.payload.request.sms.SmsRequest_Send;
import com.potsoft.cart2api.payload.response.sms.SmsResponse_Send;
import com.potsoft.cart2api.service.SmsService;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Reader;
import java.util.Iterator;

import org.springframework.stereotype.Service;


@Service
public class SmsServiceImpl implements SmsService 
{
	private static String   BULKGATE_DEFAULT_SMS_PROVIDER_BASE_URL = "https://portal.bulkgate.com/api/1.0/simple/transactional";
  private static String   BULKGATE_DEFAULT_APPLICATION_ID        =  "28297";
	private static String   BULKGATE_DEFAULT_APPLICATION_TOKEN     =  "PZGQC2SvyYB8VNFXUdJwScSSsNrRe0nd0v0V61Pl0HYwRfB755";
	private static String   BULKGATE_DEFAULT_UNICODE               =  "yes";
	private static String   BULKGATE_DEFAULT_SENDER_ID             =  "gText";
	private static String   BULKGATE_DEFAULT_SENDER_ID_VALUE       =  "BulkGate";
	private static String   BULKGATE_DEFAULT_COUNTRY               =  "ro";

  //https://www.clickphone.ro/api/sms?user=secretariatgeneral@partidulaur.ro&parola=4nRMeC9FY2NA5X&telefon=0723906431&text=text
	private static String   CLICKPHONE_DEFAULT_SMS_PROVIDER_BASE_URL = "https://www.clickphone.ro/api/sms";
	private static String   CLICKPHONE_DEFAULT_SMS_USER   = "580986";//"secretariatgeneral@partidulaur.ro";
	private static String   CLICKPHONE_DEFAULT_SMS_PAROLA = "0d3a9ba5224b06281397db0db86ec429";//"4nRMeC9FY2NA5X";
	
  @Override
  public SmsResponse_Send sendSms(SmsRequest_Send smsSendRequest)
	{
    if (smsSendRequest.getSmsProvider().equals(SmsRequest_Send.SMS_PROVIDER_BULKGATE))
      return sendSms_usingBulkgate(smsSendRequest);
    else if (smsSendRequest.getSmsProvider().equals(SmsRequest_Send.SMS_PROVIDER_CLICKPHONE))
      return sendSms_usingClickPhone(smsSendRequest);
    SmsResponse_Send smsResponseSend = new SmsResponse_Send();     
    smsResponseSend.setSmsEEroare(true); 
    return smsResponseSend;
  }


  //============================================
	public SmsResponse_Send sendSms_usingClickPhone(SmsRequest_Send smsSendRequest)
	{
	   String application_user = smsSendRequest.getSmsUser();
	   if (application_user == null)
	   {
	     application_user = CLICKPHONE_DEFAULT_SMS_USER;
	   }
	   String application_parola = smsSendRequest.getSmsParola();
	   if (application_parola == null)
	   {
	     application_parola = CLICKPHONE_DEFAULT_SMS_PAROLA ;
	   }
	   String text            = smsSendRequest.getSmsText();
	   String number          = smsSendRequest.getSmsNrTelefon();

     //---
	   Map<String, String> parameters = new HashMap<>();
	   parameters.put("user",   application_user);
	   parameters.put("parola", application_parola);
	   parameters.put("telefon", number);
	   parameters.put("text", text);

	   SmsResponse_Send smsResponseSend = new SmsResponse_Send();

     try{
	     URL url = new URL(CLICKPHONE_DEFAULT_SMS_PROVIDER_BASE_URL);
	     HttpURLConnection con = (HttpURLConnection) url.openConnection();
	     con.setRequestMethod("POST"); //"GET");
	     con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
	     con.setDoOutput(true);

	     DataOutputStream out = new DataOutputStream(con.getOutputStream());
	     String strParameters = getParamsString(parameters); //
		   out.writeBytes(strParameters);
	     out.flush();
     	 out.close();

	     int status = con.getResponseCode();
		 String resp = getFullResponse(con);
       System.out.println(resp);
		 if (status == 200){
        if (resp.contains("<result>success</result>"))      
		      smsResponseSend.setSmsEEroare(false);
        else
          smsResponseSend.setSmsEEroare(true);
     }else  
		   smsResponseSend.setSmsEEroare(true);
		 smsResponseSend.setSmsRaspuns(resp);  
       }catch(Exception e){
		 smsResponseSend.setSmsEEroare(true);
	   }
	   return smsResponseSend;

    }

  //============================================
	public SmsResponse_Send sendSms_usingBulkgate(SmsRequest_Send smsSendRequest)
	{
     String application_id = smsSendRequest.getSmsApplicationId();
	   if (application_id == null)
	   {
	     application_id = BULKGATE_DEFAULT_APPLICATION_ID;
	   }
	   String application_token = smsSendRequest.getSmsApplicationToken();
	   if (application_token == null)
	   {
	     application_token = BULKGATE_DEFAULT_APPLICATION_TOKEN;
	   }
	   String text            = smsSendRequest.getSmsText();
	   String number          = smsSendRequest.getSmsNrTelefon();
	   String unicode         = BULKGATE_DEFAULT_UNICODE;
	   String sender_id       = BULKGATE_DEFAULT_SENDER_ID;
	   String sender_id_value = BULKGATE_DEFAULT_SENDER_ID_VALUE;
	   String country = smsSendRequest.getSmsCountry();
	   if (country == null)
	   {
	     country = BULKGATE_DEFAULT_COUNTRY;
	   }
	   //---
	   Map<String, String> parameters = new HashMap<>();
	   parameters.put("application_id", application_id);
	   parameters.put("application_token", application_token);
	   parameters.put("number", number);
	   parameters.put("text", text);
	   parameters.put("unicode", unicode);
	   parameters.put("sender_id", sender_id);
	   parameters.put("sender_id_value", sender_id_value);
	   parameters.put("country", country);

	   SmsResponse_Send smsResponseSend = new SmsResponse_Send();
	   //unicode=yes&sender_id=gText&sender_id_value=BulkGate&country=ro
       // number=0723906431&text=%22Am%20pus%20direct%20in%20browser%20ca%20nu%20pot%20instala%20curl%20-%20nu%20ma%20lasa%20antivirusul%22&unicode=yes&sender_id=gText&sender_id_value=BulkGate&country=ro
	   //"https://portal.bulkgate.com/api/1.0/simple/transactional?application_id=28297&application_token=PZGQC2SvyYB8VNFXUdJwScSSsNrRe0nd0v0V61Pl0HYwRfB755&number=0723906431&text=%22Am%20pus%20direct%20in%20browser%20ca%20nu%20pot%20instala%20curl%20-%20nu%20ma%20lasa%20antivirusul%22&unicode=yes&sender_id=gText&sender_id_value=BulkGate&country=ro
       try{
	     URL url = new URL(BULKGATE_DEFAULT_SMS_PROVIDER_BASE_URL);
	     HttpURLConnection con = (HttpURLConnection) url.openConnection();
	     con.setRequestMethod("GET"); //"POST");
	     //con.setRequestProperty("Content-Type", "application/json");

	     con.setDoOutput(true);
	     DataOutputStream out = new DataOutputStream(con.getOutputStream());
	     String strParameters = getParamsString(parameters); //
		 out.writeBytes(strParameters);
	     out.flush();
     	 out.close();

	     int status = con.getResponseCode();
		 String resp = getFullResponse(con);
		 if (status == 200)
		   smsResponseSend.setSmsEEroare(false);
		 else  
		   smsResponseSend.setSmsEEroare(true);
		 smsResponseSend.setSmsRaspuns(resp);  
       }catch(Exception e){
		 smsResponseSend.setSmsEEroare(true);
	   }
	   return smsResponseSend;

    }

	public static String getParamsString(Map<String, String> params) throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            result.append("&");
        }
        String resultString = result.toString();
        return resultString.length() > 0 ? resultString.substring(0, resultString.length() - 1) : resultString;
    }

	public static String getFullResponse(HttpURLConnection con) throws IOException {
        StringBuilder fullResponseBuilder = new StringBuilder();

        fullResponseBuilder.append(con.getResponseCode())
            .append(" ")
            .append(con.getResponseMessage())
            .append("\n");

        con.getHeaderFields()
            .entrySet()
            .stream()
            .filter(entry -> entry.getKey() != null)
            .forEach(entry -> {

                fullResponseBuilder.append(entry.getKey())
                    .append(": ");

                List<String> headerValues = entry.getValue();
                Iterator<String> it = headerValues.iterator();
                if (it.hasNext()) {
                    fullResponseBuilder.append(it.next());

                    while (it.hasNext()) {
                        fullResponseBuilder.append(", ")
                            .append(it.next());
                    }
                }

                fullResponseBuilder.append("\n");
            });

        Reader streamReader = null;

        if (con.getResponseCode() > 299) {
            streamReader = new InputStreamReader(con.getErrorStream());
        } else {
            streamReader = new InputStreamReader(con.getInputStream());
        }

        BufferedReader in = new BufferedReader(streamReader);
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }

        in.close();

        fullResponseBuilder.append("Response: ")
            .append(content);

        return fullResponseBuilder.toString();
    }

}



		 /** 
	     BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	     String inputLine;
	     StringBuilder content = new StringBuilder();
	     while ((inputLine = in.readLine()) != null) 
		 {
		   content.append(inputLine);
	     }
	     in.close();
		 */

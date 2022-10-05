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
	private static String DEFAULT_SMS_PROVIDER_BASE_URL = "https://portal.bulkgate.com/api/1.0/simple/transactional";
    private static String DEFAULT_APPLICATION_ID        =  "28297";
	private static String DEFAULT_APPLICATION_TOKEN     =  "PZGQC2SvyYB8VNFXUdJwScSSsNrRe0nd0v0V61Pl0HYwRfB755";
	private static String DEFAULT_UNICODE               =  "yes";
	private static String DEFAULT_SENDER_ID             =  "gText";
	private static String DEFAULT_SENDER_ID_VALUE       =  "BulkGate";
	private static String DEFAULT_COUNTRY               =  "ro";

	@Override
	public SmsResponse_Send sendSms(SmsRequest_Send smsSendRequest)
	{
       String application_id = smsSendRequest.getSmsApplicationId();
	   if (application_id == null)
	   {
	     application_id = DEFAULT_APPLICATION_ID;
	   }
	   String application_token = smsSendRequest.getSmsApplicationToken();
	   if (application_token == null)
	   {
	     application_token = DEFAULT_APPLICATION_TOKEN;
	   }
	   String text            = smsSendRequest.getSmsText();
	   String number          = smsSendRequest.getSmsNrTelefon();
	   String unicode         = DEFAULT_UNICODE;
	   String sender_id       = DEFAULT_SENDER_ID;
	   String sender_id_value = DEFAULT_SENDER_ID_VALUE;
	   String country = smsSendRequest.getSmsCountry();
	   if (country == null)
	   {
	     country = DEFAULT_COUNTRY;
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
	     URL url = new URL(DEFAULT_SMS_PROVIDER_BASE_URL);
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

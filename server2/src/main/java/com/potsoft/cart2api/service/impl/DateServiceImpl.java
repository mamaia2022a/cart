package com.potsoft.cart2api.service.impl;

import com.potsoft.cart2api.service.DateService;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.stereotype.Service;


@Service
public class DateServiceImpl implements DateService 
{

	@Override
	public String localDateToString(LocalDate localDate, String dateFormat)
	{
	  LocalDate crtLocalDate = localDate;
	  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	  if (localDate ==null)
		crtLocalDate = LocalDate.now();
      String formattedDate = crtLocalDate.format(formatter);
	  return formattedDate;
	}

	@Override
	public String utcDateToString(Date date, String dateFormat)
	{
	  SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      format.setTimeZone(TimeZone.getTimeZone("UTC"));
      Date crtDate = date;
	  if (crtDate == null)
	    crtDate = new Date();
      String formattedDate = format.format(crtDate);
	  return formattedDate;
	  //SimpleDateFormat dateParser = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      //Date dateTime= dateParser.parse(format.format(date));
      //long gmtMilliSeconds = dateTime.getTime();
	}
}




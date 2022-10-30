package com.potsoft.cart2api.service;

import java.time.LocalDate;
import java.util.Date;


public interface DateService {

  String localDateToString(LocalDate localDate, String dateFormat);
  String utcDateToString(Date date, String dateFormat);

}


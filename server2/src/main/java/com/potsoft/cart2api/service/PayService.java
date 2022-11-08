package com.potsoft.cart2api.service;

import com.potsoft.cart2api.model.aut.AutUser;
import com.potsoft.cart2api.model.aut.AutUserInfo;
import com.potsoft.cart2api.model.pay.PayTransaction;
import com.potsoft.cart2api.payload.request.pay.PayDataRequest_Creare;
import com.potsoft.cart2api.payload.response.pay.PayDataResponse_Creare;

public interface PayService {

  PayDataResponse_Creare createTransactionData(Long userid, PayDataRequest_Creare payDataRequest);

  
  PayTransaction creazaPayTransaction(AutUser autUser, AutUserInfo autUserInfo, PayDataResponse_Creare payDataResponse);
  PayTransaction creazaSiSalveazaPayTransaction(AutUser autUser, AutUserInfo autUserInfo, PayDataResponse_Creare payDataResponse);


}


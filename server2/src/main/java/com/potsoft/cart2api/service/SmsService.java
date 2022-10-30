package com.potsoft.cart2api.service;

import com.potsoft.cart2api.payload.request.sms.SmsRequest_Send;
import com.potsoft.cart2api.payload.response.sms.SmsResponse_Send;

public interface SmsService {

  SmsResponse_Send sendSms(SmsRequest_Send smsSendRequest);

}


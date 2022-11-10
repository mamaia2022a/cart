
export class PayDataResponse_Creare
{
  amount     : string;	//Numeric	1-12	Order total amount in float format with decimal point (thousand separator not allowed). Ex: 1234.56
  curr       : string;  //String	3	Order currency: 3-character currency code (RON, USD, EUR)
  invoice_id : string;	//String	1-32	Merchant order ID
  order_desc : string;	//String	1-127	Order description
  merch_id   : string;	//String	8-50	Merchant ID assigned by EuPlatesc.ro
  timestamp  : string;	//YYYYMMDDHHmmSS	14	Current timestamp in GMT: 20221106203255
  nonce      : string;  //	16-64	Merchant nonce. Must be filled with unpredictable random bytes in hexadecimal format
  fp_hash    : string;  //	1-256	Merchant MAC in hexadecimal form

  ipnurl         : string;
  backtositeurl  : string;
  successurl     : string;
  failedurl      : string;

  constructor()
  {
  }
  
}

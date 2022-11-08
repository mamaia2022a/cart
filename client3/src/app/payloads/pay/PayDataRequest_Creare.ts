
export class PayDataRequest_Creare
{
  amount : number;	    //Numeric	1-12	Order total amount in float format with decimal point (thousand separator not allowed). Ex: 1234.56
  curr : string;       //String	3	Order currency: 3-character currency code (RON, USD, EUR)
  //public String invoice_id;	//String	1-32	Merchant order ID
  order_desc : string ;	//String	1-127	Order description
  //public String merch_id;	  //String	8-50	Merchant ID assigned by EuPlatesc.ro
  //public String timestamp;	//YYYYMMDDHHmmSS	14	Current timestamp in GMT: 20221106203255
  //public String nonce;      //	16-64	Merchant nonce. Must be filled with unpredictable random bytes in hexadecimal format
  //public String fp_hash;    //	1-256	Merchant MAC in hexadecimal form

  constructor()
  {
  }
  
}

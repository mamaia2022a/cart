package com.potsoft.cart2api.model.pay;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*
`pay_transaction_id`        int NOT NULL AUTO_INCREMENT,
`pay_transaction_userid`    int	not null,
`pay_transaction_usernume`  varchar(20)	not null,
`pay_transaction_succes_yn` varchar(1) NULL,
`pay_transaction_date`      datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
`pay_transaction_amount`         float not null,  	     -- Numeric	1-12	Order total amount in float format with decimal point (thousand separator not allowed). Ex: 1234.56
`pay_transaction_curr`           varchar(3)	not null,    -- String	3	Order currency: 3-character currency code (RON, USD, EUR)
`pay_transaction_orderdesc`      varchar(128)	not null,	   -- String	1-127	Order description
`pay_transaction_merchid`        varchar(20)	not null,	  -- String	8-50	Merchant ID assigned by EuPlatesc.ro
`pay_transaction_YYYYMMDDHHmmSSreq` varchar(14)	null,	   -- YYYYMMDDHHmmSS	14	Current timestamp in GMT: 20221106203255
`pay_transaction_noncereq`       varchar(64)	not null,   --	16-64	Merchant nonce. Must be filled with unpredictable random bytes in hexadecimal format
`pay_transaction_fphashreq`      varchar(256)	not null,  --	1-256	Merchant MAC in hexadecimal form
`pay_transaction_nonceresp`       varchar(64)	 null,   --	16-64	Merchant nonce. Must be filled with unpredictable random bytes in hexadecimal format
`pay_transaction_fphashresp`      varchar(256) null,  --	1-256	Merchant MAC in hexadecimal form
`pay_transaction_epidresp`        varchar(40) null,  -- String	40	Gateway unique id for each transaction
`pay_transaction_messageresp`     varchar(6)	 null,  -- String	6	Response code text message
`pay_transaction_approvalresp`    varchar(6)	 null,  --	String	6	Client bank’s approval code. Can be empty if not provided by gateway
`pay_transaction_YYYYMMDDHHmmSSresp` varchar(14)	null,	 -- timestamp	YYYYMMDD HHmmSS	14	Merchant transaction timestamp in GMT: 20221107143859
*/

@Entity
@Table(name = "pay_transaction")
public class PayTransaction {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "pay_transaction_id")
  private Long payTransactionId;

  @NotNull
  @Column(name = "pay_transaction_userid")
  private Long payTransactionUserid;
  
  @NotNull
  @Size(max = 20)
  @Column(name = "pay_transaction_usernume")
  private String payTransactionUsernume;

  @NotNull
  @Column(name = "pay_transaction_userinfoid")
  private Long payTransactionUserinfoid;

  
  @Size(max = 1)
  @Column(name = "pay_transaction_succes_yn")
  private String payTransactionSuccesyn;

  @Size(max = 20)
  @Column(name = "pay_transaction_date")
  private String payTransactionDate;

  @NotNull
  @Column(name = "pay_transaction_amount")
  private double payTransactionAmount;

  @NotBlank
  @Size(max = 3)
  @Column(name = "pay_transaction_curr")
  private String payTransactionCurr;

  @NotBlank
  @Size(max = 120)
  @Column(name = "pay_transaction_orderdesc")
  private String payTransactionOrderdesc;

  
  @NotBlank
  @Size(max = 20)
  @Column(name = "pay_transaction_merchid")
  private String payTransactionMerchid;

 
  @NotBlank
  @Size(max = 14)
  @Column(name = "pay_transaction_YYYYMMDDHHmmSSreq")
  private String payTransactionYyyymmddhhmmddreq;

  @NotBlank
  @Size(max = 64)
  @Column(name = "pay_transaction_noncereq")
  private String payTransactionNoncereq;

  @NotBlank
  @Size(max = 256)
  @Column(name = "pay_transaction_fphashreq")
  private String payTransactionFphashreq;


  @Size(max = 64)
  @Column(name = "pay_transaction_nonceresp")
  private String payTransactionNonceresp;

  @Size(max = 256)
  @Column(name = "pay_transaction_fphashresp")
  private String payTransactionFphashresp;

  @Size(max = 40)
  @Column(name = "pay_transaction_epidresp")
  private String payTransactionEpiidresp;

  @Size(max = 6)
  @Column(name = "pay_transaction_messageresp")
  private String payTransactionMessageresp;

  @Size(max = 6)
  @Column(name = "pay_transaction_approvalresp")
  private String payTransactionApprovalresp;

  
  @Size(max = 14)
  @Column(name = "pay_transaction_YYYYMMDDHHmmSSresp")
  private String payTransactionYyyymmddhhmmddresp;


	public PayTransaction() 
  {
	}

	public PayTransaction(  Long payTransactionId,
                          Long payTransactionUserid, String payTransactionUsernume, Long payTransactionUserinfoid,
                          String payTransactionSuccesyn, String payTransactionDate,
                          double payTransactionAmount, String payTransactionCurr,
                          String payTransactionOrderdesc, String payTransactionMerchid,
                          String payTransactionYyyymmddhhmmddreq,
                          String payTransactionNoncereq, String payTransactionFphashreq,
                          String payTransactionNonceresp, String payTransactionFphashresp,
                          String payTransactionEpiidresp,
                          String payTransactionMessageresp, String payTransactionApprovalresp, 
                          String payTransactionYyyymmddhhmmddresp
                        ) 
  {
    this.payTransactionId                 = payTransactionId;
    this.payTransactionUserid             = payTransactionUserid;
    this.payTransactionUsernume           = payTransactionUsernume;    
    this.payTransactionUserinfoid         = payTransactionUserinfoid;
    this.payTransactionSuccesyn           = payTransactionSuccesyn;
    this.payTransactionDate               = payTransactionDate;
    this.payTransactionAmount             = payTransactionAmount;
    this.payTransactionCurr               = payTransactionCurr;
    this.payTransactionOrderdesc          = payTransactionOrderdesc;
    this.payTransactionMerchid            = payTransactionMerchid;
    this.payTransactionYyyymmddhhmmddreq  = payTransactionYyyymmddhhmmddreq;
    this.payTransactionNoncereq           = payTransactionNoncereq;
    this.payTransactionFphashreq          = payTransactionFphashreq;
    this.payTransactionNonceresp          = payTransactionNonceresp;
    this.payTransactionFphashresp         = payTransactionFphashresp;
    this.payTransactionEpiidresp          = payTransactionEpiidresp;
    this.payTransactionMessageresp        = payTransactionMessageresp;
    this.payTransactionApprovalresp       = payTransactionApprovalresp;
    this.payTransactionYyyymmddhhmmddresp = payTransactionYyyymmddhhmmddresp;
  }


  public Long getPayTransactionId() 
  {
    return this.payTransactionId;
  }

  public void setPayTransactionId(Long payTransactionId) 
  {
    this.payTransactionId = payTransactionId;
  }


  public Long getPayTransactionUserid() 
  {
    return this.payTransactionUserid;
  }

  public void setPayTransactionUserid(Long payTransactionUserid) 
  {
    this.payTransactionUserid = payTransactionUserid;
  }


  public String getPayTransactionUsernume() 
  {
    return this.payTransactionUsernume;
  }

  public void setPayTransactionUsernume(String payTransactionUsernume) 
  {
    this.payTransactionUsernume = payTransactionUsernume;
  }


  public Long getPayTransactionUserinfoid() 
  {
    return this.payTransactionUserinfoid;
  }

  public void setPayTransactionUserinfoid(Long payTransactionUserinfoid) 
  {
    this.payTransactionUserinfoid = payTransactionUserinfoid;
  }


  public String getPayTransactionSuccesyn() 
  {
    return this.payTransactionSuccesyn;
  }

  public void setPayTransactionSuccesyn(String payTransactionSuccesyn) 
  {
    this.payTransactionSuccesyn = payTransactionSuccesyn;
  }


  public String getPayTransactionDate() 
  {
    return this.payTransactionDate;
  }

  public void setPayTransactionDate(String payTransactionDate) 
  {
    this.payTransactionDate = payTransactionDate;
  }


  public double getPayTransactionAmount() 
  {
    return this.payTransactionAmount;
  }

  public void setPayTransactionAmount(double payTransactionAmount) 
  {
    this.payTransactionAmount = payTransactionAmount;
  }


  public String getPayTransactionCurr() 
  {
    return this.payTransactionCurr;
  }

  public void setPayTransactionCurr(String payTransactionCurr) 
  {
    this.payTransactionCurr = payTransactionCurr;
  }


  public String getPayTransactionOrderdesc() 
  {
    return this.payTransactionOrderdesc;
  }

  public void setPayTransactionOrderdesc(String payTransactionOrderdesc) 
  {
    this.payTransactionOrderdesc = payTransactionOrderdesc;
  }


  public String getPayTransactionMerchid() 
  {
    return this.payTransactionMerchid;
  }

  public void setPayTransactionMerchid(String payTransactionMerchid) 
  {
    this.payTransactionMerchid = payTransactionMerchid;
  }


  public String getPayTransactionYyyymmddhhmmddreq() 
  {
    return this.payTransactionYyyymmddhhmmddreq;
  }

  public void setPayTransactionYyyymmddhhmmddreq(String payTransactionYyyymmddhhmmddreq) 
  {
    this.payTransactionYyyymmddhhmmddreq = payTransactionYyyymmddhhmmddreq;
  }


  public String getPayTransactionNoncereq() 
  {
    return this.payTransactionNoncereq;
  }

  public void setPayTransactionNoncereq(String payTransactionNoncereq) 
  {
    this.payTransactionNoncereq = payTransactionNoncereq;
  }


  public String getPayTransactionFphashreq() 
  {
    return this.payTransactionFphashreq;
  }

  public void setPayTransactionFphashreq(String payTransactionFphashreq) 
  {
    this.payTransactionFphashreq = payTransactionFphashreq;
  }


  public String getPayTransactionNonceresp() 
  {
    return this.payTransactionNonceresp;
  }

  public void setPayTransactionNonceresp(String payTransactionNonceresp) 
  {
    this.payTransactionNonceresp = payTransactionNonceresp;
  }


  public String getPayTransactionFphashresp() 
  {
    return this.payTransactionFphashresp;
  }

  public void setPayTransactionFphashresp(String payTransactionFphashresp) 
  {
    this.payTransactionFphashresp = payTransactionFphashresp;
  }


  public String getPayTransactionEpiidresp() 
  {
    return this.payTransactionEpiidresp;
  }

  public void setPayTransactionEpiidresp(String payTransactionEpiidresp) 
  {
    this.payTransactionEpiidresp = payTransactionEpiidresp;
  }


  public String getPayTransactionMessageresp() 
  {
    return this.payTransactionMessageresp;
  }

  public void setPayTransactionMessageresp(String payTransactionMessageresp) 
  {
    this.payTransactionMessageresp = payTransactionMessageresp;
  }


  public String getPayTransactionApprovalresp() 
  {
    return this.payTransactionApprovalresp;
  }

  public void setPayTransactionApprovalresp(String payTransactionApprovalresp) 
  {
    this.payTransactionApprovalresp = payTransactionApprovalresp;
  }


  public String getPayTransactionYyyymmddhhmmddresp() 
  {
    return this.payTransactionYyyymmddhhmmddresp;
  }

  public void setPayTransactionYyyymmddhhmmddresp(String payTransactionYyyymmddhhmmddresp) 
  {
    this.payTransactionYyyymmddhhmmddresp = payTransactionYyyymmddhhmmddresp;
  }


}

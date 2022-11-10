package com.potsoft.cart2api.model.mem;

//import com.potsoft.cart2api.model.aut.userrol.MemMembrucotizatieRol;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/*
  `mem_membrucotizatie_id` int NOT NULL AUTO_INCREMENT,
  `mem_membrucotizatie_membruid` int	not null,
  `mem_membrucotizatie_membrucodunic` varchar(16) not null,
  `mem_membrucotizatie_userid` int	not null,
  `mem_membrucotizatie_usernume` varchar(20)	not null,
  `mem_membrucotizatie_userinfoid` int	not null,
  `mem_membrucotizatie_tipcotizatie` varchar(10) not null, -- 100, 1000, 5000
  `mem_membrucotizatie_anul`    int	not null,
  `mem_membrucotizatie_ancomplet_yn` char(1) not null,
  `mem_membrucotizatie_ian_yn`  char(1)	not null,
  `mem_membrucotizatie_feb_yn`  char(1)	not null,
  `mem_membrucotizatie_mar_yn`  char(1)	not null,
  `mem_membrucotizatie_apr_yn`  char(1)	not null,
  `mem_membrucotizatie_mai_yn`  char(1)	not null,
  `mem_membrucotizatie_iun_yn`  char(1)	not null,
  `mem_membrucotizatie_iul_yn`  char(1)	not null,
  `mem_membrucotizatie_aug_yn`  char(1)	not null,
  `mem_membrucotizatie_sep_yn`  char(1)	not null,
  `mem_membrucotizatie_oct_yn`  char(1)	not null,
  `mem_membrucotizatie_nov_yn`  char(1)	not null,
  `mem_membrucotizatie_dec_yn`  char(1)	not null,
  `mem_membrucotizatie_plataonlinesauvouchersaudocplata_123` varchar(1),	
  `mem_membrucotizatie_paytransactionid` int,	
  `mem_membrucotizatie_voucherserienr` varchar(64),		
  `mem_membrucotizatie_docplataurl` varchar(512),	
  `mem_membrucotizatie_docplatalocalpath` varchar(512),	
*/


@Entity
@Table(name = "mem_membrucotizatie")
public class MemMembruCotizatie{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mem_membrucotizatie_id")
  private Long memMembrucotizatieId;


  @NotNull
  @Column(name = "mem_membrucotizatie_membruid")
  private Long memMembrucotizatieMembruid;

  @Size(max = 16)
  @Column(name = "mem_membrucotizatie_membrucodunic")
  private String memMembrucotizatieMembrucodunic;



  @NotNull
  @Column(name = "mem_membrucotizatie_userid")
  private Long memMembrucotizatieUserid;
  
  @Size(max = 20)
  @Column(name = "mem_membrucotizatie_usernume")
  private String memMembrucotizatieUsernume;

  @NotNull
  @Column(name = "mem_membrucotizatie_userinfoid")
  private Long memMembrucotizatieUserinfoid;



  @NotBlank
  @Size(max = 10)
  @Column(name = "mem_membrucotizatie_tipcotizatie")
  private String memMembrucotizatieTipCotizatie;

  @NotNull
  @Column(name = "mem_membrucotizatie_an")
  private Long memMembrucotizatieAn;

  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_membrucotizatie_ancompletyn")
  private String memMembrucotizatieAncompletyn;



  @Size(max = 1)
  @Column(name = "mem_membrucotizatie_ian_yn")
  private String memMembrucotizatieIanyn;

  @Size(max = 1)
  @Column(name = "mem_membrucotizatie_feb_yn")
  private String memMembrucotizatieFebyn;

  @Size(max = 1)
  @Column(name = "mem_membrucotizatie_mar_yn")
  private String memMembrucotizatieMaryn;

  @Size(max = 1)
  @Column(name = "mem_membrucotizatie_apr_yn")
  private String memMembrucotizatieApryn;

  @Size(max = 1)
  @Column(name = "mem_membrucotizatie_mai_yn")
  private String memMembrucotizatieMaiyn;

  @Size(max = 1)
  @Column(name = "mem_membrucotizatie_iun_yn")
  private String memMembrucotizatieIunyn;

  @Size(max = 1)
  @Column(name = "mem_membrucotizatie_iul_yn")
  private String memMembrucotizatieIulyn;

  @Size(max = 1)
  @Column(name = "mem_membrucotizatie_aug_yn")
  private String memMembrucotizatieAugyn;

  @Size(max = 1)
  @Column(name = "mem_membrucotizatie_sep_yn")
  private String memMembrucotizatieSepyn;

  @Size(max = 1)
  @Column(name = "mem_membrucotizatie_oct_yn")
  private String memMembrucotizatieOctyn;

  @Size(max = 1)
  @Column(name = "mem_membrucotizatie_nov_yn")
  private String memMembrucotizatieNovyn;

  @Size(max = 1)
  @Column(name = "mem_membrucotizatie_dec_yn")
  private String memMembrucotizatieDecyn;


  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_membru_plataonlinesauvouchesaudocplata_123")
  private String memMembrucotizatiePlataonlinesauvouchersaudocplata123;


  @NotNull
  @Column(name = "mem_membrucotizatie_paytransactionid")
  private String memMembrucotizatiePaytransactionid;

  @NotBlank
  @Size(max = 64)
  @Column(name = "mem_membrucotizatie_voucherserienr")
  private String memMembrucotizatieVoucherserienr;


  @Size(max = 512)
  @Column(name = "mem_membrucotizatie_docplataurl")
  private String memMembrucotizatieDocplataurl;
 
  @Size(max = 512)
  @Column(name = "mem_membrucotizatie_docplatalocalpath")
  private String memMembrucotizatieDocplatalocalpath;

  
	public MemMembruCotizatie() 
  {
	}

	public MemMembruCotizatie( Long memMembruCotizatieId, 
                       Long memMembruCotizatieMembruid,  String memMembruCotizatieMembrucodunic,
                       Long memMembruCotizatieUserid, String memMembruCotizatieUsernume, Long memMembruCotizatieUserinfoid,
                       String memMembruCotizatieTipcotizatie, Long memMembruCotizatieAn, String memMembruCotizatieAncompletyn,
                       String memMembruCotizatieIanyn, String memMembruCotizatieFebyn, String memMembruCotizatieMaryn,
                       String memMembruCotizatieApryn, String memMembruCotizatieMaiyn, String memMembruCotizatieIunyn,
                       String memMembruCotizatieIulyn, String memMembruCotizatieAugyn, String memMembruCotizatieSepyn,
                       String memMembruCotizatieOctyn, String memMembruCotizatieNovyn, String memMembruCotizatieDecyn,
                       String memMembrucotizatiePlataonlinesauvouchersaudocplata123,
                       String memMembrucotizatiePaytransactionid,
                       String memMembrucotizatieVoucherserienr,
                       String memMembrucotizatieDocplataurl, String memMembrucotizatieDocplatalocalpath
                     ) 
  {
    this.memMembrucotizatieId                = memMembruCotizatieId;

    this.memMembrucotizatieMembruid          = memMembruCotizatieMembruid;
    this.memMembrucotizatieMembrucodunic     = memMembruCotizatieMembrucodunic;

    this.memMembrucotizatieUserid            = memMembruCotizatieUserid;
    this.memMembrucotizatieUsernume          = memMembruCotizatieUsernume;
    this.memMembrucotizatieUserinfoid        = memMembruCotizatieUserinfoid;
    
    this.memMembrucotizatieTipCotizatie      = memMembruCotizatieTipcotizatie;
    this.memMembrucotizatieAn                = memMembruCotizatieAn;
    this.memMembrucotizatieAncompletyn       = memMembruCotizatieAncompletyn;

    this.memMembrucotizatieIanyn             = memMembruCotizatieIanyn;
    this.memMembrucotizatieIanyn             = memMembruCotizatieFebyn;
    this.memMembrucotizatieIanyn             = memMembruCotizatieMaryn;
    this.memMembrucotizatieIanyn             = memMembruCotizatieApryn;
    this.memMembrucotizatieIanyn             = memMembruCotizatieMaiyn;
    this.memMembrucotizatieIanyn             = memMembruCotizatieIunyn;
    this.memMembrucotizatieIanyn             = memMembruCotizatieIulyn;
    this.memMembrucotizatieIanyn             = memMembruCotizatieAugyn;
    this.memMembrucotizatieIanyn             = memMembruCotizatieSepyn;
    this.memMembrucotizatieIanyn             = memMembruCotizatieOctyn;
    this.memMembrucotizatieIanyn             = memMembruCotizatieNovyn;
    this.memMembrucotizatieFebyn             = memMembruCotizatieDecyn;

    this.memMembrucotizatiePlataonlinesauvouchersaudocplata123 = memMembrucotizatiePlataonlinesauvouchersaudocplata123;
    this.memMembrucotizatiePaytransactionid  = memMembrucotizatiePaytransactionid;
    this.memMembrucotizatieVoucherserienr    = memMembrucotizatieVoucherserienr;
    this.memMembrucotizatieDocplataurl       = memMembrucotizatieDocplataurl;
    this.memMembrucotizatieDocplatalocalpath = memMembrucotizatieDocplatalocalpath;
  }


  public Long getMemMembrucotizatieId() 
  {
    return this.memMembrucotizatieId;
  }

  public void setMemMembrucotizatieId(Long memMembrucotizatieId) 
  {
    this.memMembrucotizatieId = memMembrucotizatieId;
  }

  
  
  public Long getMemMembrucotizatieMembruid() 
  {
    return this.memMembrucotizatieMembruid;
  }

  public void setMemMembrucotizatieMembruid(Long memMembrucotizatieMembruid) 
  {
    this.memMembrucotizatieMembruid = memMembrucotizatieMembruid;
  }


  public String getMemMembrucotizatieMembruCodunic() 
  {
    return this.memMembrucotizatieMembrucodunic;
  }

  public void setMemMembrucotizatieMembruCodunic(String memMembrucotizatieMembrucodunic) 
  {
    this.memMembrucotizatieMembrucodunic = memMembrucotizatieMembrucodunic;
  }



  public Long getMemMembrucotizatieUserid() 
  {
    return this.memMembrucotizatieUserid;
  }

  public void setMemMembrucotizatieUserid(Long memMembrucotizatieUserid) 
  {
    this.memMembrucotizatieUserid = memMembrucotizatieUserid;
  }


  public String getMemMembrucotizatieUsernume() 
  {
    return this.memMembrucotizatieUsernume;
  }

  public void setMemMembrucotizatieUsernume(String memMembrucotizatieUsernume) 
  {
    this.memMembrucotizatieUsernume = memMembrucotizatieUsernume;
  }


  public Long getMemMembrucotizatieUserinfoid() 
  {
    return this.memMembrucotizatieUserinfoid;
  }

  public void setMemMembrucotizatieUserinfoid(Long memMembrucotizatieUserinfoid) 
  {
    this.memMembrucotizatieUserid = memMembrucotizatieUserinfoid;
  }


  public Long getMemMembrucotizatieAn() 
  {
    return this.memMembrucotizatieAn;
  }

  public void setMemMembrucotizatieAn(Long memMembrucotizatieAn) 
  {
    this.memMembrucotizatieAn = memMembrucotizatieAn;
  }


  public String getMemMembrucotizatieAncompletyn() 
  {
    return this.memMembrucotizatieAncompletyn;
  }

  public void setMemMembrucotizatieAncompletyn(String memMembrucotizatieAncompletyn) 
  {
    this.memMembrucotizatieAncompletyn = memMembrucotizatieAncompletyn;
  }



  public String getMemMembrucotizatieIanyn() 
  {
    return this.memMembrucotizatieIanyn;
  }

  public void setMemMembrucotizatieIanyn(String memMembrucotizatieIanyn) 
  {
    this.memMembrucotizatieIanyn = memMembrucotizatieIanyn;
  }


  public String getMemMembrucotizatieFebyn() 
  {
    return this.memMembrucotizatieFebyn;
  }

  public void setMemMembrucotizatieFebyn(String memMembrucotizatieFebyn) 
  {
    this.memMembrucotizatieFebyn = memMembrucotizatieFebyn;
  }


  public String getMemMembrucotizatieMaryn() 
  {
    return this.memMembrucotizatieMaryn;
  }

  public void setMemMembrucotizatieMaryn(String memMembrucotizatieMaryn) 
  {
    this.memMembrucotizatieMaryn = memMembrucotizatieMaryn;
  }


  public String getMemMembrucotizatieApryn() 
  {
    return this.memMembrucotizatieApryn;
  }

  public void setMemMembrucotizatieApryn(String memMembrucotizatieApryn) 
  {
    this.memMembrucotizatieApryn = memMembrucotizatieApryn;
  }


  public String getMemMembrucotizatieMaiyn() 
  {
    return this.memMembrucotizatieMaiyn;
  }

  public void setMemMembrucotizatieMaiyn(String memMembrucotizatieMaiyn) 
  {
    this.memMembrucotizatieMaiyn = memMembrucotizatieMaiyn;
  }


  public String getMemMembrucotizatieIunyn() 
  {
    return this.memMembrucotizatieIunyn;
  }

  public void setMemMembrucotizatieIunyn(String memMembrucotizatieIunyn) 
  {
    this.memMembrucotizatieIunyn = memMembrucotizatieIunyn;
  }


  public String getMemMembrucotizatieIulyn() 
  {
    return this.memMembrucotizatieIulyn;
  }

  public void setMemMembrucotizatieIulyn(String memMembrucotizatieIulyn) 
  {
    this.memMembrucotizatieIulyn = memMembrucotizatieIulyn;
  }


  public String getMemMembrucotizatieAugyn() 
  {
    return this.memMembrucotizatieAugyn;
  }

  public void setMemMembrucotizatieAugyn(String memMembrucotizatieAugyn) 
  {
    this.memMembrucotizatieAugyn = memMembrucotizatieAugyn;
  }


  public String getMemMembrucotizatieSepyn() 
  {
    return this.memMembrucotizatieSepyn;
  }

  public void setMemMembrucotizatieSepyn(String memMembrucotizatieSepyn) 
  {
    this.memMembrucotizatieSepyn = memMembrucotizatieSepyn;
  }


  public String getMemMembrucotizatieOctyn() 
  {
    return this.memMembrucotizatieOctyn;
  }

  public void setMemMembrucotizatieOctyn(String memMembrucotizatieOctyn) 
  {
    this.memMembrucotizatieOctyn = memMembrucotizatieOctyn;
  }


  public String getMemMembrucotizatieNovyn() 
  {
    return this.memMembrucotizatieNovyn;
  }

  public void setMemMembrucotizatieNovyn(String memMembrucotizatieNovyn) 
  {
    this.memMembrucotizatieNovyn = memMembrucotizatieNovyn;
  }


  public String getMemMembrucotizatieDecyn() 
  {
    return this.memMembrucotizatieDecyn;
  }

  public void setMemMembrucotizatieDecyn(String memMembrucotizatieDecyn) 
  {
    this.memMembrucotizatieDecyn = memMembrucotizatieDecyn;
  }


  public String getMemMembrucotizatiePlataonlinesauvouchersaudocplata123() 
  {
    return this.memMembrucotizatiePlataonlinesauvouchersaudocplata123;
  }

  public void setMemMembrucotizatiePlataonlinesauvouchersaudocplata123(String memMembrucotizatiePlataonlinesauvouchersaudocplata123) 
  {
    this.memMembrucotizatiePlataonlinesauvouchersaudocplata123 = memMembrucotizatiePlataonlinesauvouchersaudocplata123;
  }


  public String getMemMembrucotizatiePaytransactionid() 
  {
    return this.memMembrucotizatiePaytransactionid;
  }

  public void setMemMembrucotizatiePaytransactionid(String memMembrucotizatiePaytransactionid) 
  {
    this.memMembrucotizatiePaytransactionid = memMembrucotizatiePaytransactionid;
  }



  public String getMemMembrucotizatieVoucherserienr() 
  {
    return this.memMembrucotizatieVoucherserienr;
  }

  public void setMemMembrucotizatieVoucherserienr(String memMembrucotizatieVoucherserienr) 
  {
    this.memMembrucotizatieVoucherserienr = memMembrucotizatieVoucherserienr;
  }



  public String getMemMembrucotizatieDocplataurl() 
  {
    return this.memMembrucotizatieDocplataurl;
  }

  public void setMemMembrucotizatieDocplataurl(String memMembrucotizatieDocplataurl) 
  {
    this.memMembrucotizatieDocplataurl = memMembrucotizatieDocplataurl;
  }


  public String getMemMembrucotizatieDocplatalocalpath() 
  {
    return this.memMembrucotizatieDocplatalocalpath;
  }

  public void setMemMembrucotizatieDocplatalocalpath(String memMembrucotizatieDocplatalocalpath) 
  {
    this.memMembrucotizatieDocplatalocalpath = memMembrucotizatieDocplatalocalpath;
  }


}

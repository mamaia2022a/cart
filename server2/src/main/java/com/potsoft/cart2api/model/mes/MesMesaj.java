package com.potsoft.cart2api.model.mes;

//import com.potsoft.cart2api.model.aut.userrol.MesMesajRol;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "mes_mesaj")
public class MesMesaj {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mes_mesaj_id")
  private Long mesMesajId;

  
  @NotNull
  @Column(name = "mes_mesaj_tipmesajid")
  private Long mesMesajTipmesajid;

  @Size(max = 10)
  @Column(name = "mes_mesaj_tipmesajcod")
  private String mesMesajTipmesajcod;


  @NotBlank
  @Size(max = 1)
  @Column(name = "mes_mesaj_relogin_yn")
  private String mesMesajReloginyn;

  @NotNull
  @Column(name = "mes_mesaj_expid")
  private Long mesMesajExpid;

  @NotNull
  @Column(name = "mes_mesaj_expuserid")
  private Long mesMesajExpuserid;
  
  @NotNull
  @Size(max = 20)
  @Column(name = "mes_mesaj_expusernume")
  private String mesMesajExpusernume;


  @NotNull
  @Column(name = "mes_mesaj_exprolid")
  private Long mesMesajExprolid;

  @Size(max = 10)
  @Column(name = "mes_mesaj_exprolcod")
  private String mesMesajExprolcod;


  @NotNull
  @Column(name = "mes_mesaj_acopgeoid")
  private Long mesMesajAcopgeoid;
  
  @NotBlank
  @Size(max = 16)
  @Column(name = "mes_mesaj_acopgeocod")
  private String mesMesajAcopgeocod;


  @NotBlank
  @Size(max = 1)
  @Column(name = "mes_mesaj_adrrezidenta_yn")
  private String mesMesajAdrrezidentayn;

  
  @Column(name = "mes_mesaj_zonataraid")
  private Long mesMesajZonataraid;
  
  @Size(max = 2)
  @Column(name = "mes_mesaj_zonataracod")
  private String mesMesajZonataracod;
  
  @Column(name = "mes_mesaj_judetid")
  private Long mesMesajJudetid;
  
  @Size(max = 2)
  @Column(name = "mes_mesaj_judetcod")
  private String mesMesajJudetcod;
  
  @Column(name = "mes_mesaj_uatid")
  private Long mesMesajUatid;
  
  @Column(name = "mes_mesaj_uatcod")
  private Long mesMesajUatcod;

  @Column(name = "mes_mesaj_localitateid")
  private Long mesMesajLocalitateid;
  
  @Column(name = "mes_mesaj_localitatecod")
  private Long mesMesajLocalitatecod;
  
  
  @Column(name = "mes_mesaj_zonajudetid")
  private Long mesMesajZonajudetid;
  
  @Size(max = 2)
  @Column(name = "mes_mesaj_zonajudetcod")
  private String mesMesajZonajudetcod;

  @Column(name = "mes_mesaj_zonauatid")
  private Long mesMesajZonauatid;
  
  @Size(max = 9)
  @Column(name = "mes_mesaj_zonauatcod")
  private String mesMesajZonauatcod;
  
  @Column(name = "mes_mesaj_zonalocalitateid")
  private Long mesMesajZonalocalitateid;
  
  @Size(max = 9)
  @Column(name = "mes_mesaj_zonalocalitatecod")
  private String mesMesajZonalocalitatecod;

  @Column(name = "mes_mesaj_sectievotareid")
  private Long mesMesajSectievotareid;
  
  @Column(name = "mes_mesaj_sectievotarenr")
  private Long mesMesajSectievotarenr;

  @Column(name = "mes_mesaj_codpostalid")
  private Long mesMesajCodpostalid;
 
  @Size(max = 16)
  @Column(name = "mes_mesaj_codpostalcod")
  private String mesMesajCodpostalcod;

 
  /**
   *   `mes_mesaj_an` int null,
  `mes_mesaj_luna` int null,
  `mes_mesaj_zi` int null,
  `mes_mesaj_datagenerarii` datetime not null,	
  
  `mes_mesaj_text` varchar(1024)	null,	

   */
  @NotNull
  @Column(name = "mes_mesaj_an")
  private Long mesMesajAn;

  @NotNull
  @Column(name = "mes_mesaj_luna")
  private Long mesMesajLuna;

  @NotNull
  @Column(name = "mes_mesaj_zi")
  private Long mesMesajZi;


  @Size(max = 20)
  @Column(name = "mes_mesaj_datagenerarii", insertable = false, updatable = false)
  private String mesMesajDatagenerarii;


  @Size(max = 1024)
  @Column(name = "mes_mesaj_text")
  private String mesMesajText;



	public MesMesaj() 
  {
	}

	public MesMesaj(  Long mesMesajid, 
                    Long mesMesajTipmesajid, String mesMesajTipmesajcod, 
                    String mesMesajReloginyn,
                    Long mesMesajExpid,
                    Long mesMesajExpuserid, String mesMesajExpusernume, 
                    Long mesMesajExprolid, String mesMesajExprolcod, 
                    Long mesMesajAcopgeoid, String mesMesajAcopgeocod, 
                    String mesMesajAdrrezidentayn,
                    Long mesMesajZonataraid, String mesMesajZonataracod, 
                    Long mesMesajJudetid, String mesMesajJudetcod, 
                    Long mesMesajUatid, Long mesMesajUatcod, 
                    Long mesMesajLocalitateid, Long mesMesajLocalitatecod, 
                    Long mesMesajZonajudetid, String mesMesajZonajudetcod, 
                    Long mesMesajZonauatid, String mesMesajZonauatcod, 
                    Long mesMesajZonalocalitateid, String mesMesajZonalocalitatecod,  
                    Long mesMesajSectievotareid, Long mesMesajSectievotarenr, 
                    Long mesMesajCodpostalid, String mesMesajCodpostalcod,
                    Long mesMesajAn, Long mesMesajLuna,  Long mesMesajZi, String mesMesajDatagenerarii,
                    String mesMesajText
                  ) 
  {
    this.mesMesajId                = mesMesajid;

    this.mesMesajTipmesajid        = mesMesajTipmesajid;
    this.mesMesajTipmesajcod       = mesMesajTipmesajcod;
    this.mesMesajReloginyn         = mesMesajReloginyn;

    this.mesMesajExpid             = mesMesajExpid;

    this.mesMesajExpuserid         = mesMesajExpuserid;
    this.mesMesajExpusernume       = mesMesajExpusernume;

    this.mesMesajExprolid          = mesMesajExprolid;
    this.mesMesajExprolcod         = mesMesajExprolcod;

    this.mesMesajAcopgeoid          = mesMesajAcopgeoid;
    this.mesMesajAcopgeocod         = mesMesajAcopgeocod;

    this.mesMesajAdrrezidentayn    = mesMesajAdrrezidentayn;

    this.mesMesajZonataraid        = mesMesajZonataraid;
    this.mesMesajZonataracod       = mesMesajZonataracod;
    this.mesMesajJudetid           = mesMesajJudetid;
    this.mesMesajJudetcod          = mesMesajJudetcod;
    this.mesMesajUatid             = mesMesajUatid;
    this.mesMesajUatcod            = mesMesajUatcod;
    this.mesMesajLocalitateid      = mesMesajLocalitateid;
    this.mesMesajLocalitatecod     = mesMesajLocalitatecod;
    this.mesMesajZonajudetid       = mesMesajZonajudetid;    
    this.mesMesajZonajudetcod      = mesMesajZonajudetcod;  
    this.mesMesajZonauatid         = mesMesajZonauatid;    
    this.mesMesajZonauatcod        = mesMesajZonauatcod;  
    this.mesMesajZonalocalitateid  = mesMesajZonalocalitateid;    
    this.mesMesajZonalocalitatecod = mesMesajZonalocalitatecod;  
    this.mesMesajSectievotareid    = mesMesajSectievotareid;    
    this.mesMesajSectievotarenr    = mesMesajSectievotarenr;
    this.mesMesajCodpostalid       = mesMesajCodpostalid;
    this.mesMesajCodpostalcod      = mesMesajCodpostalcod;

    this.mesMesajAn                = mesMesajAn;
    this.mesMesajLuna              = mesMesajLuna;
    this.mesMesajZi                = mesMesajZi;
    this.mesMesajDatagenerarii     = mesMesajDatagenerarii;
    this.mesMesajText              = mesMesajText;

  }


  public Long getMesMesajId() 
  {
    return this.mesMesajId;
  }

  public void setMesMesajId(Long mesMesajId) 
  {
    this.mesMesajId = mesMesajId;
  }



  public Long getMesMesajeTipmesajid() 
  {
    return this.mesMesajTipmesajid;
  }

  public void setMesMesajTipmesajid(Long mesMesajTipmesajid) 
  {
    this.mesMesajTipmesajid = mesMesajTipmesajid;
  }
  

  public String getMesMesajTipmesajcod() 
  {
    return this.mesMesajTipmesajcod;
  }

  public void setMesMesajTipmesajcod(String mesMesajTipmesajcod) 
  {
    this.mesMesajTipmesajcod = mesMesajTipmesajcod;
  }



  public Long getMesMesajExpid() 
  {
    return this.mesMesajExpid;
  }

  public void setMesMesajExpid(Long mesMesajExpid) 
  {
    this.mesMesajExpid = mesMesajExpid;
  }



  public Long getMesMesajExpserid() 
  {
    return this.mesMesajExpuserid;
  }

  public void setMesMesajExpuserid(Long mesMesajExpuserid) 
  {
    this.mesMesajExpuserid = mesMesajExpuserid;
  }


  public String getMesMesajExpusernume() 
  {
    return this.mesMesajExpusernume;
  }

  public void setMesMesajExpusernume(String mesMesajExpusernume) 
  {
    this.mesMesajExpusernume = mesMesajExpusernume;
  }



  public Long getMesMesajExprolid() 
  {
    return this.mesMesajExprolid;
  }

  public void setMesMesajExprolid(Long mesMesajExprolid) 
  {
    this.mesMesajExprolid = mesMesajExprolid;
  }
  

  public String getMesMesajExprolcod() 
  {
    return this.mesMesajExprolcod;
  }

  public void setMesMesajExprolcod(String mesMesajExprolcod) 
  {
    this.mesMesajExprolcod = mesMesajExprolcod;
  }



  public Long getMesMesajAcopgeoid() 
  {
    return this.mesMesajAcopgeoid;
  }

  public void setMesMesajAcopgeoid(Long mesMesajAcopgeoid) 
  {
    this.mesMesajAcopgeoid = mesMesajAcopgeoid;
  }
  

  public String getMesMesajAcopgeocod() 
  {
    return this.mesMesajAcopgeocod;
  }

  public void setMesMesajAcopgeocod(String mesMesajAcopgeocod) 
  {
    this.mesMesajAcopgeocod = mesMesajAcopgeocod;
  }



  public String getMesMesajAdrrezidentayn() 
  {
    return this.mesMesajAdrrezidentayn;
  }

  public void setMesMesajAdrrezidentayn(String mesMesajAdrrezidentayn) 
  {
    this.mesMesajAdrrezidentayn = mesMesajAdrrezidentayn;
  }
 


  public Long getMesMesajZonataraid() 
  {
    return this.mesMesajZonataraid;
  }

  public void setMesMesajZonaTaraid(Long mesMesajZonataraid) 
  {
    this.mesMesajZonataraid = mesMesajZonataraid;
  }

  public String getMesMesajZonataracod() 
  {
    return this.mesMesajZonataracod;
  }

  public void setMesMesajZonaTaracod(String mesMesajZonataracod) 
  {
    this.mesMesajZonataracod = mesMesajZonataracod;
  }




  public Long getMesMesajJudetid() 
  {
    return this.mesMesajJudetid;
  }

  public void setMesMesajJudetid(Long mesMesajJudetid) 
  {
    this.mesMesajJudetid = mesMesajJudetid;
  }

  public String getMesMesajJudetcod() 
  {
    return this.mesMesajJudetcod;
  }

  public void setMesMesajJudetcod(String mesMesajJudetcod) 
  {
    this.mesMesajJudetcod = mesMesajJudetcod;
  }


  public Long getMesMesajUatid() 
  {
    return this.mesMesajUatid;
  }

  public void setMesMesajUatid(Long mesMesajUatid) 
  {
    this.mesMesajUatid = mesMesajUatid;
  }

  public Long getMesMesajUatcod() 
  {
    return this.mesMesajUatcod;
  }

  public void setMesMesajUatcod(Long mesMesajUatcod) 
  {
    this.mesMesajUatcod = mesMesajUatcod;
  }



  public Long getMesMesajLocalitateid() 
  {
    return this.mesMesajLocalitateid;
  }

  public void setMesMesajLocalitateid(Long mesMesajLocalitateid) 
  {
    this.mesMesajLocalitateid = mesMesajLocalitateid;
  }

  public Long getMesMesajLocalitatecod() 
  {
    return this.mesMesajLocalitatecod;
  }

  public void setMesMesajLocalitatecod(Long mesMesajLocalitatecod) 
  {
    this.mesMesajLocalitatecod = mesMesajLocalitatecod;
  }



  public Long getMesMesajZonajudetid() 
  {
    return this.mesMesajZonajudetid;
  }

  public void setMesMesajZonajudetid(Long mesMesajZonajudetid) 
  {
    this.mesMesajZonajudetid = mesMesajZonajudetid;
  }

  public String getMesMesajZonajudetcod() 
  {
    return this.mesMesajZonajudetcod;
  }

  public void setMesMesajZonajudetcod(String mesMesajZonajudetcod) 
  {
    this.mesMesajZonajudetcod = mesMesajZonajudetcod;
  }


  public Long getMesMesajZonauatid() 
  {
    return this.mesMesajZonauatid;
  }

  public void setMesMesajZonauatid(Long mesMesajZonauatid) 
  {
    this.mesMesajZonauatid = mesMesajZonauatid;
  }

  public String getMesMesajZonauatcod() 
  {
    return this.mesMesajZonauatcod;
  }

  public void setMesMesajZonauatcod(String mesMesajZonauatcod) 
  {
    this.mesMesajZonauatcod = mesMesajZonauatcod;
  }



  public Long getMesMesajZonalocalitateid() 
  {
    return this.mesMesajZonalocalitateid;
  }

  public void setMesMesajZonalocalitateid(Long mesMesajZonalocalitateid) 
  {
    this.mesMesajZonalocalitateid = mesMesajZonalocalitateid;
  }

  public String getMesMesajZonalocalitatecod() 
  {
    return this.mesMesajZonalocalitatecod;
  }

  public void setMesMesajZonalocalitatecod(String mesMesajZonalocalitatecod) 
  {
    this.mesMesajZonalocalitatecod = mesMesajZonalocalitatecod;
  }



  public Long getMesMesajSectievotareid() 
  {
    return this.mesMesajSectievotareid;
  }

  public void setMesMesajSectievotareid(Long mesMesajSectievotareid) 
  {
    this.mesMesajSectievotareid = mesMesajSectievotareid;
  }
  
  public Long getMesMesajSectievotarenr() 
  {
    return this.mesMesajSectievotarenr;
  }

  public void setMesMesajSectievotarenr(Long mesMesajSectievotarenr) 
  {
    this.mesMesajSectievotarenr = mesMesajSectievotarenr;
  }

  


  public Long getMesMesajCodpostalid() 
  {
    return this.mesMesajCodpostalid;
  }

  public void setMesMesajCodpostalid(Long mesMesajCodpostalid) 
  {
    this.mesMesajCodpostalid = mesMesajCodpostalid;
  }


  public String getMesMesajCodpostalcod() 
  {
    return this.mesMesajCodpostalcod;
  }

  public void setMesMesajCodpostalcod(String mesMesajCodpostalcod) 
  {
    this.mesMesajCodpostalcod = mesMesajCodpostalcod;
  }



  public Long getMesMesajAn() 
  {
    return this.mesMesajAn;
  }

  public void setMesMesajAn(Long mesMesajAn) 
  {
    this.mesMesajAn = mesMesajAn;
  }


  public Long getMesMesajLuna() 
  {
    return this.mesMesajLuna;
  }

  public void setMesMesajLuna(Long mesMesajLuna) 
  {
    this.mesMesajLuna = mesMesajLuna;
  }


  public Long getMesMesajZi() 
  {
    return this.mesMesajZi;
  }

  public void setMesMesajZi(Long mesMesajZi) 
  {
    this.mesMesajZi = mesMesajZi;
  }


  public String getMesMesajDatagenerarii() 
  {
    return this.mesMesajDatagenerarii;
  }

  public void setMesMesajDatagenerarii(String mesMesajDatagenerarii) 
  {
    this.mesMesajDatagenerarii = mesMesajDatagenerarii;
  }



  public String getMesMesajText() 
  {
    return this.mesMesajText;
  }

  public void setMesMesajText(String mesMesajText) 
  {
    this.mesMesajText = mesMesajText;
  }

 
}

package com.potsoft.cart2api.model.mes;

//import com.potsoft.cart2api.model.aut.userrol.MesExpeditorRol;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "mes_expeditor")
public class MesExpeditor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mes_expeditor_id")
  private Long mesExpeditorId;


  @NotNull
  @Column(name = "mes_expeditor_userid")
  private Long mesExpeditorUserid;
  
  @NotNull
  @Size(max = 20)
  @Column(name = "mes_expeditor_usernume")
  private String mesExpeditorUsernume;


  @NotNull
  @Column(name = "mes_expeditor_rolid")
  private Long mesExpeditorRolid;

  @Size(max = 10)
  @Column(name = "mes_expeditor_rolcod")
  private String mesExpeditorRolcod;



  @NotBlank
  @Size(max = 1)
  @Column(name = "mes_expeditor_adrrezidenta_yn")
  private String mesExpeditorAdrrezidentayn;

  
  @Column(name = "mes_expeditor_zonataraid")
  private Long mesExpeditorZonataraid;
  
  @Size(max = 2)
  @Column(name = "mes_expeditor_zonataracod")
  private String mesExpeditorZonataracod;
  
  @Column(name = "mes_expeditor_judetid")
  private Long mesExpeditorJudetid;
  
  @Size(max = 2)
  @Column(name = "mes_expeditor_judetcod")
  private String mesExpeditorJudetcod;
  
  @Column(name = "mes_expeditor_uatid")
  private Long mesExpeditorUatid;
  
  @Column(name = "mes_expeditor_uatcod")
  private Long mesExpeditorUatcod;

  @Column(name = "mes_expeditor_localitateid")
  private Long mesExpeditorLocalitateid;
  
  @Column(name = "mes_expeditor_localitatecod")
  private Long mesExpeditorLocalitatecod;
  
  
  @Column(name = "mes_expeditor_zonajudetid")
  private Long mesExpeditorZonajudetid;
  
  @Size(max = 2)
  @Column(name = "mes_expeditor_zonajudetcod")
  private String mesExpeditorZonajudetcod;

  @Column(name = "mes_expeditor_zonauatid")
  private Long mesExpeditorZonauatid;
  
  @Size(max = 9)
  @Column(name = "mes_expeditor_zonauatcod")
  private String mesExpeditorZonauatcod;
  
  @Column(name = "mes_expeditor_zonalocalitateid")
  private Long mesExpeditorZonalocalitateid;
  
  @Size(max = 9)
  @Column(name = "mes_expeditor_zonalocalitatecod")
  private String mesExpeditorZonalocalitatecod;

  @Column(name = "mes_expeditor_sectievotareid")
  private Long mesExpeditorSectievotareid;
  
  @Column(name = "mes_expeditor_sectievotarenr")
  private Long mesExpeditorSectievotarenr;

  @Column(name = "mes_expeditor_codpostalid")
  private Long mesExpeditorCodpostalid;
 
  @Size(max = 16)
  @Column(name = "mes_expeditor_codpostalcod")
  private String mesExpeditorCodpostalcod;

 
  @NotBlank
  @Size(max = 1)
  @Column(name = "mes_expeditor_activ_yn")
  private String mesExpeditorActivyn;

  @Size(max = 20)
  @Column(name = "mes_expeditor_startdt", insertable = false, updatable = false)
  private String mesExpeditorStartdt;


  @Size(max = 20)
  @Column(name = "mes_expeditor_enddt")
  private String mesExpeditorEnddt;


	public MesExpeditor() 
  {
	}

	public MesExpeditor( Long mesExpeditorid, 
                    Long mesExpeditorUserid, String mesExpeditorUsernume, 
                    Long mesExpeditorRolid, String mesExpeditorRolcod, 
                    String mesExpeditorAdrrezidentayn,
                    Long mesExpeditorZonataraid, String mesExpeditorZonataracod, 
                    Long mesExpeditorJudetid, String mesExpeditorJudetcod, 
                    Long mesExpeditorUatid, Long mesExpeditorUatcod, 
                    Long mesExpeditorLocalitateid, Long mesExpeditorLocalitatecod, 
                    Long mesExpeditorZonajudetid, String mesExpeditorZonajudetcod, 
                    Long mesExpeditorZonauatid, String mesExpeditorZonauatcod, 
                    Long mesExpeditorZonalocalitateid, String mesExpeditorZonalocalitatecod,  
                    Long mesExpeditorSectievotareid, Long mesExpeditorSectievotarenr, 
                    Long mesExpeditorCodpostalid, String mesExpeditorCodpostalcod,
                    String mesExpeditorActivyn, String mesExpeditorStartdt,  String mesExpeditorEnddt
                  ) 
  {
    this.mesExpeditorId                = mesExpeditorid;

    this.mesExpeditorUserid            = mesExpeditorUserid;
    this.mesExpeditorUsernume          = mesExpeditorUsernume;

    this.mesExpeditorRolid             = mesExpeditorRolid;
    this.mesExpeditorRolcod            = mesExpeditorRolcod;

    this.mesExpeditorAdrrezidentayn    = mesExpeditorAdrrezidentayn;

    this.mesExpeditorZonataraid        = mesExpeditorZonataraid;
    this.mesExpeditorZonataracod       = mesExpeditorZonataracod;
    this.mesExpeditorJudetid           = mesExpeditorJudetid;
    this.mesExpeditorJudetcod          = mesExpeditorJudetcod;
    this.mesExpeditorUatid             = mesExpeditorUatid;
    this.mesExpeditorUatcod            = mesExpeditorUatcod;
    this.mesExpeditorLocalitateid      = mesExpeditorLocalitateid;
    this.mesExpeditorLocalitatecod     = mesExpeditorLocalitatecod;
    this.mesExpeditorZonajudetid       = mesExpeditorZonajudetid;    
    this.mesExpeditorZonajudetcod      = mesExpeditorZonajudetcod;  
    this.mesExpeditorZonauatid         = mesExpeditorZonauatid;    
    this.mesExpeditorZonauatcod        = mesExpeditorZonauatcod;  
    this.mesExpeditorZonalocalitateid  = mesExpeditorZonalocalitateid;    
    this.mesExpeditorZonalocalitatecod = mesExpeditorZonalocalitatecod;  
    this.mesExpeditorSectievotareid    = mesExpeditorSectievotareid;    
    this.mesExpeditorSectievotarenr    = mesExpeditorSectievotarenr;
    this.mesExpeditorCodpostalid       = mesExpeditorCodpostalid;
    this.mesExpeditorCodpostalcod      = mesExpeditorCodpostalcod;
    
    this.mesExpeditorActivyn           = mesExpeditorActivyn;
    this.mesExpeditorStartdt           = mesExpeditorStartdt;
    this.mesExpeditorEnddt             = mesExpeditorEnddt;

  }


  public Long getMesExpeditorId() 
  {
    return this.mesExpeditorId;
  }

  public void setMesExpeditorId(Long mesExpeditorId) 
  {
    this.mesExpeditorId = mesExpeditorId;
  }



  public Long getMesExpeditorUserid() 
  {
    return this.mesExpeditorUserid;
  }

  public void setMesExpeditorUserid(Long mesExpeditorUserid) 
  {
    this.mesExpeditorUserid = mesExpeditorUserid;
  }


  public String getMesExpeditorUsernume() 
  {
    return this.mesExpeditorUsernume;
  }

  public void setMesExpeditorUsernume(String mesExpeditorUsernume) 
  {
    this.mesExpeditorUsernume = mesExpeditorUsernume;
  }



  public Long getMesExpeditorRolid() 
  {
    return this.mesExpeditorRolid;
  }

  public void setMesExpeditorRolid(Long mesExpeditorRolid) 
  {
    this.mesExpeditorRolid = mesExpeditorRolid;
  }
  

  public String getMesExpeditorRolcod() 
  {
    return this.mesExpeditorRolcod;
  }

  public void setMesExpeditorRolcod(String mesExpeditorRolcod) 
  {
    this.mesExpeditorRolcod = mesExpeditorRolcod;
  }




  public String getMesExpeditorAdrrezidentayn() 
  {
    return this.mesExpeditorAdrrezidentayn;
  }

  public void setMesExpeditorAdrrezidentayn(String mesExpeditorAdrrezidentayn) 
  {
    this.mesExpeditorAdrrezidentayn = mesExpeditorAdrrezidentayn;
  }
 


  public Long getMesExpeditorZonataraid() 
  {
    return this.mesExpeditorZonataraid;
  }

  public void setMesExpeditorZonaTaraid(Long mesExpeditorZonataraid) 
  {
    this.mesExpeditorZonataraid = mesExpeditorZonataraid;
  }

  public String getMesExpeditorZonataracod() 
  {
    return this.mesExpeditorZonataracod;
  }

  public void setMesExpeditorZonaTaracod(String mesExpeditorZonataracod) 
  {
    this.mesExpeditorZonataracod = mesExpeditorZonataracod;
  }




  public Long getMesExpeditorJudetid() 
  {
    return this.mesExpeditorJudetid;
  }

  public void setMesExpeditorJudetid(Long mesExpeditorJudetid) 
  {
    this.mesExpeditorJudetid = mesExpeditorJudetid;
  }

  public String getMesExpeditorJudetcod() 
  {
    return this.mesExpeditorJudetcod;
  }

  public void setMesExpeditorJudetcod(String mesExpeditorJudetcod) 
  {
    this.mesExpeditorJudetcod = mesExpeditorJudetcod;
  }


  public Long getMesExpeditorUatid() 
  {
    return this.mesExpeditorUatid;
  }

  public void setMesExpeditorUatid(Long mesExpeditorUatid) 
  {
    this.mesExpeditorUatid = mesExpeditorUatid;
  }

  public Long getMesExpeditorUatcod() 
  {
    return this.mesExpeditorUatcod;
  }

  public void setMesExpeditorUatcod(Long mesExpeditorUatcod) 
  {
    this.mesExpeditorUatcod = mesExpeditorUatcod;
  }



  public Long getMesExpeditorLocalitateid() 
  {
    return this.mesExpeditorLocalitateid;
  }

  public void setMesExpeditorLocalitateid(Long mesExpeditorLocalitateid) 
  {
    this.mesExpeditorLocalitateid = mesExpeditorLocalitateid;
  }

  public Long getMesExpeditorLocalitatecod() 
  {
    return this.mesExpeditorLocalitatecod;
  }

  public void setMesExpeditorLocalitatecod(Long mesExpeditorLocalitatecod) 
  {
    this.mesExpeditorLocalitatecod = mesExpeditorLocalitatecod;
  }



  public Long getMesExpeditorZonajudetid() 
  {
    return this.mesExpeditorZonajudetid;
  }

  public void setMesExpeditorZonajudetid(Long mesExpeditorZonajudetid) 
  {
    this.mesExpeditorZonajudetid = mesExpeditorZonajudetid;
  }

  public String getMesExpeditorZonajudetcod() 
  {
    return this.mesExpeditorZonajudetcod;
  }

  public void setMesExpeditorZonajudetcod(String mesExpeditorZonajudetcod) 
  {
    this.mesExpeditorZonajudetcod = mesExpeditorZonajudetcod;
  }


  public Long getMesExpeditorZonauatid() 
  {
    return this.mesExpeditorZonauatid;
  }

  public void setMesExpeditorZonauatid(Long mesExpeditorZonauatid) 
  {
    this.mesExpeditorZonauatid = mesExpeditorZonauatid;
  }

  public String getMesExpeditorZonauatcod() 
  {
    return this.mesExpeditorZonauatcod;
  }

  public void setMesExpeditorZonauatcod(String mesExpeditorZonauatcod) 
  {
    this.mesExpeditorZonauatcod = mesExpeditorZonauatcod;
  }



  public Long getMesExpeditorZonalocalitateid() 
  {
    return this.mesExpeditorZonalocalitateid;
  }

  public void setMesExpeditorZonalocalitateid(Long mesExpeditorZonalocalitateid) 
  {
    this.mesExpeditorZonalocalitateid = mesExpeditorZonalocalitateid;
  }

  public String getMesExpeditorZonalocalitatecod() 
  {
    return this.mesExpeditorZonalocalitatecod;
  }

  public void setMesExpeditorZonalocalitatecod(String mesExpeditorZonalocalitatecod) 
  {
    this.mesExpeditorZonalocalitatecod = mesExpeditorZonalocalitatecod;
  }



  public Long getMesExpeditorSectievotareid() 
  {
    return this.mesExpeditorSectievotareid;
  }

  public void setMesExpeditorSectievotareid(Long mesExpeditorSectievotareid) 
  {
    this.mesExpeditorSectievotareid = mesExpeditorSectievotareid;
  }
  
  public Long getMesExpeditorSectievotarenr() 
  {
    return this.mesExpeditorSectievotarenr;
  }

  public void setMesExpeditorSectievotarenr(Long mesExpeditorSectievotarenr) 
  {
    this.mesExpeditorSectievotarenr = mesExpeditorSectievotarenr;
  }

  


  public Long getMesExpeditorCodpostalid() 
  {
    return this.mesExpeditorCodpostalid;
  }

  public void setMesExpeditorCodpostalid(Long mesExpeditorCodpostalid) 
  {
    this.mesExpeditorCodpostalid = mesExpeditorCodpostalid;
  }


  public String getMesExpeditorCodpostalcod() 
  {
    return this.mesExpeditorCodpostalcod;
  }

  public void setMesExpeditorCodpostalcod(String mesExpeditorCodpostalcod) 
  {
    this.mesExpeditorCodpostalcod = mesExpeditorCodpostalcod;
  }





  public String getMesExpeditorActivyn() 
  {
    return this.mesExpeditorActivyn;
  }

  public void setMesExpeditorActivyn(String mesExpeditorActivyn) 
  {
    this.mesExpeditorActivyn = mesExpeditorActivyn;
  }


  public String getMesExpeditorStartdt() 
  {
    return this.mesExpeditorStartdt;
  }

  public void setMemExpeditorStartdt(String mesExpeditorStartdt) 
  {
    this.mesExpeditorStartdt = mesExpeditorStartdt;
  }


  public String getMesExpeditorEnddt() 
  {
    return this.mesExpeditorEnddt;
  }

  public void setMesExpeditorEnddt(String mesExpeditorEnddt) 
  {
    this.mesExpeditorEnddt = mesExpeditorEnddt;
  }

 

}

package com.potsoft.cart2api.model.mem;

//import com.potsoft.cart2api.model.aut.userrol.MemMembrutipRol;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "mem_membrutip")
public class MemMembruTip{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mem_membrutip_id")
  private Long memMembrutipId;


  @NotNull
  @Column(name = "mem_membrutip_membruid")
  private Long memMembrutipMembruid;

  @Size(max = 16)
  @Column(name = "mem_membrutip_membrucodunic")
  private String memMembrutipMembrucodunic;


  @NotNull
  @Column(name = "mem_membrutip_userid")
  private Long memMembrutipUserid;
  
  @Size(max = 20)
  @Column(name = "mem_membrutip_usernume")
  private String memMembrutipUsernume;


  @NotNull
  @Column(name = "mem_membrutip_tipid")
  private Long memMembrutipTipid;

  @Size(max = 10)
  @Column(name = "mem_membrutip_tipcod")
  private String memMembrutipTipcod;

 
  
  @Column(name = "mem_membrutip_zonataraid")
  private Long memMembrutipZonataraid;
  
  @Size(max = 2)
  @Column(name = "mem_membrutip_zonataracod")
  private String memMembrutipZonataracod;
  
  @Column(name = "mem_membrutip_judetid")
  private Long memMembrutipJudetid;
  
  @Size(max = 2)
  @Column(name = "mem_membrutip_judetcod")
  private String memMembrutipJudetcod;
  
  @Column(name = "mem_membrutip_uatid")
  private Long memMembrutipUatid;
  
  @Column(name = "mem_membrutip_uatcod")
  private Long memMembrutipUatcod;

  @Column(name = "mem_membrutip_localitateid")
  private Long memMembrutipLocalitateid;
  
  @Column(name = "mem_membrutip_localitatecod")
  private Long memMembrutipLocalitatecod;
  

  @Column(name = "mem_membrutip_zonajudetid")
  private Long memMembrutipZonajudetid;
  
  @Size(max = 2)
  @Column(name = "mem_membrutip_zonajudetcod")
  private String memMembrutipZonajudetcod;

  @Column(name = "mem_membrutip_zonauatid")
  private Long memMembrutipZonauatid;
  
  @Size(max = 9)
  @Column(name = "mem_membrutip_zonauatcod")
  private String memMembrutipZonauatcod;

  @Column(name = "mem_membrutip_zonalocalitateid")
  private Long memMembrutipZonalocalitateid;
  
  @Size(max = 9)
  @Column(name = "mem_membrutip_zonalocalitatecod")
  private String memMembrutipZonalocalitatecod;

  @Column(name = "mem_membrutip_sectievotareid")
  private Long memMembrutipSectievotareid;
  
  @Column(name = "mem_membrutip_sectievotarenr")
  private Long memMembrutipSectievotarenr;

  @Column(name = "mem_membrutip_codpostalid")
  private Long memMembrutipCodpostalid;
 
  @Size(max = 16)
  @Column(name = "mem_membrutip_codpostalcod")
  private String memMembrutipCodpostalcod;

 
  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_membrutip_activ_yn")
  private String memMembrutipActivyn;

  @Size(max = 20)
  @Column(name = "mem_membrutip_startdt", insertable = false, updatable = false)
  private String memMembrutipStartdt;

  @Size(max = 20)
  @Column(name = "mem_membrutip_enddt")
  private String memMembrutipEnddt;


 

	public MemMembruTip() 
  {
	}

	public MemMembruTip( Long memMembruTipId, 
                       Long memMembruTipMembruid, String memMembruTipMembrucodunic,
                       Long memMembruTipUserid, String memMembruTipUsernume, 
                       Long memMembruTipTipid, String memMembruTipTipcod, 
                       String memMembruTipActivyn, String memMembruTipStartdt, String memMembruTipEnddt,
                       Long memMembruTipZonataraid, String memMembruTipZonataracod, 
                       Long memMembruTipJudetid, String memMembruTipJudetcod, 
                       Long memMembruTipUatid, Long memMembruTipUatcod, 
                       Long memMembruTipLocalitateid, Long memMembruTipLocalitatecod, 
                       Long memMembruTipZonajudetid, String memMembruTipZonajudetcod, 
                       Long memMembruTipZonauatid, String memMembruTipZonauatcod, 
                       Long memMembruTipZonalocalitateid, String memMembruTipZonalocalitatecod,  
                       Long memMembruTipSectievotareid, Long memMembruTipSectievotarenr, 
                       Long memMembruTipCodpostalid, String memMembruTipCodpostalcod
                     ) 
  {
    this.memMembrutipId                = memMembruTipId;

    this.memMembrutipMembruid          = memMembruTipMembruid;
    this.memMembrutipMembrucodunic     = memMembruTipMembrucodunic;

    this.memMembrutipUserid            = memMembruTipUserid;
    this.memMembrutipUsernume          = memMembruTipUsernume;

    this.memMembrutipTipid             = memMembruTipTipid;
    this.memMembrutipTipcod            = memMembruTipTipcod;

    this.memMembrutipActivyn           = memMembruTipActivyn;
    this.memMembrutipStartdt           = memMembruTipStartdt;
    this.memMembrutipEnddt             = memMembruTipEnddt;

    this.memMembrutipZonataraid        = memMembruTipZonataraid;
    this.memMembrutipZonataracod       = memMembruTipZonataracod;
    this.memMembrutipJudetid           = memMembruTipJudetid;
    this.memMembrutipJudetcod          = memMembruTipJudetcod;
    this.memMembrutipUatid             = memMembruTipUatid;
    this.memMembrutipUatcod            = memMembruTipUatcod;
    this.memMembrutipLocalitateid      = memMembruTipLocalitateid;
    this.memMembrutipLocalitatecod     = memMembruTipLocalitatecod;
    this.memMembrutipZonajudetid       = memMembruTipZonajudetid;    
    this.memMembrutipZonajudetcod      = memMembruTipZonajudetcod;  
    this.memMembrutipZonauatid         = memMembruTipZonauatid;    
    this.memMembrutipZonauatcod        = memMembruTipZonauatcod;  
    this.memMembrutipZonalocalitateid  = memMembruTipZonalocalitateid;    
    this.memMembrutipZonalocalitatecod = memMembruTipZonalocalitatecod;  
    this.memMembrutipSectievotareid    = memMembruTipSectievotareid;    
    this.memMembrutipSectievotarenr    = memMembruTipSectievotarenr;
    this.memMembrutipCodpostalid       = memMembruTipCodpostalid;
    this.memMembrutipCodpostalcod      = memMembruTipCodpostalcod;
    
  }


  public Long getMemMembrutipId() 
  {
    return this.memMembrutipId;
  }

  public void setMemMembrutipId(Long memMembrutipId) 
  {
    this.memMembrutipId = memMembrutipId;
  }

  
  
  public Long getMemMembrutipMembruid() 
  {
    return this.memMembrutipMembruid;
  }

  public void setMemMembrutipMembruid(Long memMembrutipMembruid) 
  {
    this.memMembrutipMembruid = memMembrutipMembruid;
  }


  public String getMemMembrutipMembruCodunic() 
  {
    return this.memMembrutipMembrucodunic;
  }

  public void setMemMembrutipMembruCodunic(String memMembrutipMembrucodunic) 
  {
    this.memMembrutipMembrucodunic = memMembrutipMembrucodunic;
  }



  public Long getMemMembrutipUserid() 
  {
    return this.memMembrutipUserid;
  }

  public void setMemMembrutipUserid(Long memMembrutipUserid) 
  {
    this.memMembrutipUserid = memMembrutipUserid;
  }


  public String getMemMembrutipUsernume() 
  {
    return this.memMembrutipUsernume;
  }

  public void setMemMembrutipUsernume(String memMembrutipUsernume) 
  {
    this.memMembrutipUsernume = memMembrutipUsernume;
  }



  public Long getMemMembrutipTipid() 
  {
    return this.memMembrutipTipid;
  }

  public void setMemMembrutipTipid(Long memMembrutipTipid) 
  {
    this.memMembrutipTipid = memMembrutipTipid;
  }
  

  public String getMemMembrutipTipcod() 
  {
    return this.memMembrutipTipcod;
  }

  public void setMemMembrutipTipcod(String memMembrutipTipcod) 
  {
    this.memMembrutipTipcod = memMembrutipTipcod;
  }




  public Long getMemMembrutipZonataraid() 
  {
    return this.memMembrutipZonataraid;
  }

  public void setMemMembrutipZonataraid(Long memMembrutipZonataraid) 
  {
    this.memMembrutipZonataraid = memMembrutipZonataraid;
  }

  public String getMemMembrutipZonataracod() 
  {
    return this.memMembrutipZonataracod;
  }

  public void setMemMembrutipZonataracod(String memMembrutipZonataracod) 
  {
    this.memMembrutipZonataracod = memMembrutipZonataracod;
  }




  public Long getMemMembrutipJudetid() 
  {
    return this.memMembrutipJudetid;
  }

  public void setMemMembrutipJudetid(Long memMembrutipJudetid) 
  {
    this.memMembrutipJudetid = memMembrutipJudetid;
  }

  public String getMemMembrutipJudetcod() 
  {
    return this.memMembrutipJudetcod;
  }

  public void setMemMembrutipJudetcod(String memMembrutipJudetcod) 
  {
    this.memMembrutipJudetcod = memMembrutipJudetcod;
  }


  public Long getMemMembrutipUatid() 
  {
    return this.memMembrutipUatid;
  }

  public void setMemMembrutipUatid(Long memMembrutipUatid) 
  {
    this.memMembrutipUatid = memMembrutipUatid;
  }

  public Long getMemMembrutipUatcod() 
  {
    return this.memMembrutipUatcod;
  }

  public void setMemMembrutipUatcod(Long memMembrutipUatcod) 
  {
    this.memMembrutipUatcod = memMembrutipUatcod;
  }



  public Long getMemMembrutipLocalitateid() 
  {
    return this.memMembrutipLocalitateid;
  }

  public void setMemMembrutipLocalitateid(Long memMembrutipLocalitateid) 
  {
    this.memMembrutipLocalitateid = memMembrutipLocalitateid;
  }

  public Long getMemMembrutipLocalitatecod() 
  {
    return this.memMembrutipLocalitatecod;
  }

  public void setMemMembrutipLocalitatecod(Long memMembrutipLocalitatecod) 
  {
    this.memMembrutipLocalitatecod = memMembrutipLocalitatecod;
  }



  public Long getMemMembrutipZonajudetid() 
  {
    return this.memMembrutipZonajudetid;
  }

  public void setMemMembrutipZonajudetid(Long memMembrutipZonajudetid) 
  {
    this.memMembrutipZonajudetid = memMembrutipZonajudetid;
  }

  public String getMemMembrutipZonajudetcod() 
  {
    return this.memMembrutipZonajudetcod;
  }

  public void setMemMembrutipZonajudetcod(String memMembrutipZonajudetcod) 
  {
    this.memMembrutipZonajudetcod = memMembrutipZonajudetcod;
  }


  public Long getMemMembrutipZonauatid() 
  {
    return this.memMembrutipZonauatid;
  }

  public void setMemMembrutipZonauatid(Long memMembrutipZonauatid) 
  {
    this.memMembrutipZonauatid = memMembrutipZonauatid;
  }

  public String getMemMembrutipZonauatcod() 
  {
    return this.memMembrutipZonauatcod;
  }

  public void setMemMembrutipZonauatcod(String memMembrutipZonauatcod) 
  {
    this.memMembrutipZonauatcod = memMembrutipZonauatcod;
  }



  public Long getMemMembrutipZonalocalitateid() 
  {
    return this.memMembrutipZonalocalitateid;
  }

  public void setMemMembrutipZonalocalitateid(Long memMembrutipZonalocalitateid) 
  {
    this.memMembrutipZonalocalitateid = memMembrutipZonalocalitateid;
  }

  public String getMemMembrutipZonalocalitatecod() 
  {
    return this.memMembrutipZonalocalitatecod;
  }

  public void setMemMembrutipZonalocalitatecod(String memMembrutipZonalocalitatecod) 
  {
    this.memMembrutipZonalocalitatecod = memMembrutipZonalocalitatecod;
  }



  public Long getMemMembrutipSectievotareid() 
  {
    return this.memMembrutipSectievotareid;
  }

  public void setMemMembrutipSectievotareid(Long memMembrutipSectievotareid) 
  {
    this.memMembrutipSectievotareid = memMembrutipSectievotareid;
  }
  
  public Long getMemMembrutipSectievotarenr() 
  {
    return this.memMembrutipSectievotarenr;
  }

  public void setMemMembrutipSectievotarenr(Long memMembrutipSectievotarenr) 
  {
    this.memMembrutipSectievotarenr = memMembrutipSectievotarenr;
  }


  
  public Long getMemMembrutipCodpostalid() 
  {
    return this.memMembrutipCodpostalid;
  }

  public void setMemMembrutipCodpostalid(Long memMembrutipCodpostalid) 
  {
    this.memMembrutipCodpostalid = memMembrutipCodpostalid;
  }


  public String getMemMembrutipCodpostalcod() 
  {
    return this.memMembrutipCodpostalcod;
  }

  public void setMemMembrutipCodpostalcod(String memMembrutipCodpostalcod) 
  {
    this.memMembrutipCodpostalcod = memMembrutipCodpostalcod;
  }



  public String getMemMembrutipActivyn() 
  {
    return this.memMembrutipActivyn;
  }

  public void setMemMembrutipActivyn(String memMembrutipActivyn) 
  {
    this.memMembrutipActivyn = memMembrutipActivyn;
  }


  public String getMemMembrutipStartdt() 
  {
    return this.memMembrutipStartdt;
  }

  public void setMemMebrutipStartdt(String memMembrutipStartdt) 
  {
    this.memMembrutipStartdt = memMembrutipStartdt;
  }


  public String getMemMembrutipEnddt() 
  {
    return this.memMembrutipEnddt;
  }

  public void setMemMembrutipEnddt(String memMembrutipEnddt) 
  {
    this.memMembrutipEnddt = memMembrutipEnddt;
  }

}

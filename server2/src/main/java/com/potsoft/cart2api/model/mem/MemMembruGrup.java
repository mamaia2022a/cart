package com.potsoft.cart2api.model.mem;

//import com.potsoft.cart2api.model.aut.userrol.MemMembrugrupRol;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "mem_membrugrup")
public class MemMembruGrup{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mem_membrugrup_id")
  private Long memMembrugrupId;


  @NotNull
  @Column(name = "mem_membrugrup_membruid")
  private Long memMembrugrupMembruid;

  @Size(max = 16)
  @Column(name = "mem_membrugrup_membrucodunic")
  private String memMembrugrupMembrucodunic;


  
  @NotNull
  @Column(name = "mem_membrugrup_userid")
  private Long memMembrugrupUserid;
  
  @Size(max = 20)
  @Column(name = "mem_membrugrup_usernume")
  private String memMembrugrupUsernume;



  @NotNull
  @Column(name = "mem_membrugrup_grupid")
  private Long memMembrugrupGrupid;

  @Size(max = 20)
  @Column(name = "mem_membrugrup_grupnume")
  private String memMembrugrupGrupnume;

  @Size(max = 16)
  @Column(name = "mem_membrugrup_grupcodunic")
  private String memMembrugrupGrupcodunic;
 

  
  @Column(name = "mem_membrugrup_zonataraid")
  private Long memMembrugrupZonataraid;
  
  @Size(max = 2)
  @Column(name = "mem_membrugrup_zonataracod")
  private String memMembrugrupZonataracod;
  
  @Column(name = "mem_membrugrup_judetid")
  private Long memMembrugrupJudetid;
  
  @Size(max = 2)
  @Column(name = "mem_membrugrup_judetcod")
  private String memMembrugrupJudetcod;
  
  @Column(name = "mem_membrugrup_uatid")
  private Long memMembrugrupUatid;
  
  @Size(max = 10)
  @Column(name = "mem_membrugrup_uatcod")
  private Long memMembrugrupUatcod;
 
  @Column(name = "mem_membrugrup_localitateid")
  private Long memMembrugrupLocalitateid;
  
  @Size(max = 10)
  @Column(name = "mem_membrugrup_localitatecod")
  private String memMembrugrupLocalitatecod;
  

  @Column(name = "mem_membrugrup_zonajudetid")
  private Long memMembrugrupZonajudetid;
  
  @Size(max = 2)
  @Column(name = "mem_membrugrup_zonajudetcod")
  private String memMembrugrupZonajudetcod;

  @Column(name = "mem_membrugrup_zonauatid")
  private Long memMembrugrupZonauatid;
  
  @Size(max = 9)
  @Column(name = "mem_membrugrup_zonauatcod")
  private String memMembrugrupZonauatcod;

  @Column(name = "mem_membrugrup_zonalocalitateid")
  private Long memMembrugrupZonalocalitateid;
  
  @Size(max = 9)
  @Column(name = "mem_membrugrup_zonalocalitatecod")
  private String memMembrugrupZonalocalitatecod;

  @Column(name = "mem_membrugrup_sectievotareid")
  private Long memMembrugrupSectievotareid;
  
  @Size(max = 9)
  @Column(name = "mem_membrugrup_sectievotarenr")
  private Long memMembrugrupSectievotarenr;

  @Column(name = "mem_membrugrup_codpostalid")
  private Long memMembrugrupCodpostalid;
 
  @Size(max = 16)
  @Column(name = "mem_membrugrup_codpostalcod")
  private String memMembrugrupCodpostalcod;

 
  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_membrugrup_activ_yn")
  private String memMembrugrupActivyn;

  @Size(max = 20)
  @Column(name = "mem_membrugrup_startdt", insertable = false, updatable = false)
  private String memMembrugrupStartdt;

  @Size(max = 20)
  @Column(name = "mem_membrugrup_enddt")
  private String memMembrugrupEnddt;


 

	public MemMembruGrup() 
  {
	}

	public MemMembruGrup( Long memMembrugrupId, 
                       Long memMembrugrupMembruid, String memMembrugrupMembrucodunic,
                       Long memMembrugrupUserid, String memMembrugrupUsernume, 
                       String memMembrugrupActivyn, String memMembrugrupStartdt,  String memMembrugrupEnddt,
                       Long memMembrugrupZonataraid, String memMembrugrupZonataracod, 
                       Long memMembrugrupJudetid, String memMembrugrupJudetcod, 
                       Long memMembrugrupUatid, Long memMembrugrupUatcod, 
                       Long memMembrugrupLocalitateid, String memMembrugrupLocalitatecod, 
                       Long memMembrugrupZonajudetid, String memMembrugrupZonajudetcod, 
                       Long memMembrugrupZonauatid, String memMembrugrupZonauatcod, 
                       Long memMembrugrupZonalocalitateid, String memMembrugrupZonalocalitatecod,  
                       Long memMembrugrupSectievotareid, Long memMembrugrupSectievotarenr, 
                       Long memMembrugrupCodpostalid, String memMembrugrupCodpostalcod
                     ) 
  {
    this.memMembrugrupId                = memMembrugrupId;

    this.memMembrugrupMembruid          = memMembrugrupMembruid;
    this.memMembrugrupMembrucodunic     = memMembrugrupMembrucodunic;

    this.memMembrugrupUserid            = memMembrugrupUserid;
    this.memMembrugrupUsernume          = memMembrugrupUsernume;

    this.memMembrugrupActivyn           = memMembrugrupActivyn;
    this.memMembrugrupStartdt           = memMembrugrupStartdt;
    this.memMembrugrupEnddt             = memMembrugrupEnddt;

    this.memMembrugrupZonataraid        = memMembrugrupZonataraid;
    this.memMembrugrupZonataracod       = memMembrugrupZonataracod;
    this.memMembrugrupJudetid           = memMembrugrupJudetid;
    this.memMembrugrupJudetcod          = memMembrugrupJudetcod;
    this.memMembrugrupUatid             = memMembrugrupUatid;
    this.memMembrugrupUatcod            = memMembrugrupUatcod;
    this.memMembrugrupLocalitateid      = memMembrugrupLocalitateid;
    this.memMembrugrupLocalitatecod     = memMembrugrupLocalitatecod;
    this.memMembrugrupZonajudetid       = memMembrugrupZonajudetid;    
    this.memMembrugrupZonajudetcod      = memMembrugrupZonajudetcod;  
    this.memMembrugrupZonalocalitateid  = memMembrugrupZonalocalitateid;    
    this.memMembrugrupZonalocalitatecod = memMembrugrupZonalocalitatecod;  
    this.memMembrugrupSectievotareid    = memMembrugrupSectievotareid;    
    this.memMembrugrupSectievotarenr    = memMembrugrupSectievotarenr;
    this.memMembrugrupCodpostalid       = memMembrugrupCodpostalid;
    this.memMembrugrupCodpostalcod      = memMembrugrupCodpostalcod;
    
  }


  public Long getMemMembrugrupId() 
  {
    return this.memMembrugrupId;
  }

  public void setMemMembrugrupId(Long memMembrugrupId) 
  {
    this.memMembrugrupId = memMembrugrupId;
  }

  
  
  public Long getMemMembrugrupMembruid() 
  {
    return this.memMembrugrupMembruid;
  }

  public void setMemMembrugrupMembruid(Long memMembrugrupMembruid) 
  {
    this.memMembrugrupMembruid = memMembrugrupMembruid;
  }


  public String getMemMembrugrupMembrucodunic() 
  {
    return this.memMembrugrupMembrucodunic;
  }

  public void setMemMembrugrupMembrucodunic(String memMembrugrupMembrucodunic) 
  {
    this.memMembrugrupMembrucodunic = memMembrugrupMembrucodunic;
  }



  public Long getMemMembrugrupUserid() 
  {
    return this.memMembrugrupUserid;
  }

  public void setMemMembrugrupUserid(Long memMembrugrupUserid) 
  {
    this.memMembrugrupUserid = memMembrugrupUserid;
  }


  public String getMemMembrugrupUsernume() 
  {
    return this.memMembrugrupUsernume;
  }

  public void setMemMembrugrupUsernume(String memMembrugrupUsernume) 
  {
    this.memMembrugrupUsernume = memMembrugrupUsernume;
  }



  public Long getMemMembrugrupGrupid() 
  {
    return this.memMembrugrupGrupid;
  }

  public void setMemMembrugrupGrupid(Long memMembrugrupGrupid) 
  {
    this.memMembrugrupGrupid = memMembrugrupGrupid;
  }
  

  public String getMemMembrugrupGrupnume() 
  {
    return this.memMembrugrupGrupnume;
  }

  public void setMemMembrugrupGrupnume(String memMembrugrupGrupnume) 
  {
    this.memMembrugrupGrupnume = memMembrugrupGrupnume;
  }


  public String getMemMembrugrupGrupcodunic() 
  {
    return this.memMembrugrupGrupcodunic;
  }

  public void setMemMembrugrupGrupcodunic(String memMembrugrupGrupcodunic) 
  {
    this.memMembrugrupGrupcodunic = memMembrugrupGrupcodunic;
  }
 


  public Long getMemMembrugrupZonataraid() 
  {
    return this.memMembrugrupZonataraid;
  }

  public void setMemMembrugrupZonataraid(Long memMembrugrupZonataraid) 
  {
    this.memMembrugrupZonataraid = memMembrugrupZonataraid;
  }

  public String getMemMembrugrupZonataracod() 
  {
    return this.memMembrugrupZonataracod;
  }

  public void setMemMembrugrupZonataracod(String memMembrugrupZonataracod) 
  {
    this.memMembrugrupZonataracod = memMembrugrupZonataracod;
  }




  public Long getMemMembrugrupJudetid() 
  {
    return this.memMembrugrupJudetid;
  }

  public void setMemMembrugrupJudetid(Long memMembrugrupJudetid) 
  {
    this.memMembrugrupJudetid = memMembrugrupJudetid;
  }

  public String getMemMembrugrupJudetcod() 
  {
    return this.memMembrugrupJudetcod;
  }

  public void setMemMembrugrupJudetcod(String memMembrugrupJudetcod) 
  {
    this.memMembrugrupJudetcod = memMembrugrupJudetcod;
  }



  public Long getMemMembrugrupLocalitateid() 
  {
    return this.memMembrugrupLocalitateid;
  }

  public void setMemMembrugrupLocalitateid(Long memMembrugrupLocalitateid) 
  {
    this.memMembrugrupLocalitateid = memMembrugrupLocalitateid;
  }

  public String getMemMembrugrupLocalitatecod() 
  {
    return this.memMembrugrupLocalitatecod;
  }

  public void setMemMembrugrupLocalitatecod(String memMembrugrupLocalitatecod) 
  {
    this.memMembrugrupLocalitatecod = memMembrugrupLocalitatecod;
  }



  public Long getMemMembrugrupZonajudetid() 
  {
    return this.memMembrugrupZonajudetid;
  }

  public void setMemMembrugrupZonajudetid(Long memMembrugrupZonajudetid) 
  {
    this.memMembrugrupZonajudetid = memMembrugrupZonajudetid;
  }

  public String getMemMembrugrupZonajudetcod() 
  {
    return this.memMembrugrupZonajudetcod;
  }

  public void setMemMembrugrupZonajudetcod(String memMembrugrupZonajudetcod) 
  {
    this.memMembrugrupZonajudetcod = memMembrugrupZonajudetcod;
  }



  public Long getMemMembrugrupZonalocalitateid() 
  {
    return this.memMembrugrupZonalocalitateid;
  }

  public void setMemMembrugrupZonalocalitateid(Long memMembrugrupZonalocalitateid) 
  {
    this.memMembrugrupZonalocalitateid = memMembrugrupZonalocalitateid;
  }

  public String getMemMembrugrupZonalocalitatecod() 
  {
    return this.memMembrugrupZonalocalitatecod;
  }

  public void setMemMembrugrupZonalocalitatecod(String memMembrugrupZonalocalitatecod) 
  {
    this.memMembrugrupZonalocalitatecod = memMembrugrupZonalocalitatecod;
  }



  public Long getMemMembrugrupSectievotareid() 
  {
    return this.memMembrugrupSectievotareid;
  }

  public void setMemMembrugrupSectievotareid(Long memMembrugrupSectievotareid) 
  {
    this.memMembrugrupSectievotareid = memMembrugrupSectievotareid;
  }
  
  public Long getMemMembrugrupSectievotarenr() 
  {
    return this.memMembrugrupSectievotarenr;
  }

  public void setMemMembrugrupSectievotarenr(Long memMembrugrupSectievotarenr) 
  {
    this.memMembrugrupSectievotarenr = memMembrugrupSectievotarenr;
  }


  
  public Long getMemMembrugrupCodpostalid() 
  {
    return this.memMembrugrupCodpostalid;
  }

  public void setMemMembrugrupCodpostalid(Long memMembrugrupCodpostalid) 
  {
    this.memMembrugrupCodpostalid = memMembrugrupCodpostalid;
  }


  public String getMemMembrugrupCodpostalcod() 
  {
    return this.memMembrugrupCodpostalcod;
  }

  public void setMemMembrugrupCodpostalcod(String memMembrugrupCodpostalcod) 
  {
    this.memMembrugrupCodpostalcod = memMembrugrupCodpostalcod;
  }



  public String getMemMembrugrupActivyn() 
  {
    return this.memMembrugrupActivyn;
  }

  public void setMemMembrugrupActivyn(String memMembrugrupActivyn) 
  {
    this.memMembrugrupActivyn = memMembrugrupActivyn;
  }


  public String getMemMembrugrupStartdt() 
  {
    return this.memMembrugrupStartdt;
  }

  public void setMemMembruGrupStartdt(String memMembrugrupStartdt) 
  {
    this.memMembrugrupStartdt = memMembrugrupStartdt;
  }


  public String getMemMembrugrupEnddt() 
  {
    return this.memMembrugrupEnddt;
  }

  public void setMemMembrugrupEnddt(String memMembrugrupEnddt) 
  {
    this.memMembrugrupEnddt = memMembrugrupEnddt;
  }

}

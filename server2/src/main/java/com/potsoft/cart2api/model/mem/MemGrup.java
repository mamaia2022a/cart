package com.potsoft.cart2api.model.mem;

//import com.potsoft.cart2api.model.aut.userrol.MemSefgrupRol;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "mem_grup")
public class MemGrup{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mem_grup_id")
  private Long memGrupId;

  @Size(max = 20)
  @Column(name = "mem_grup_nume")
  private String memGrupNume;

  @Size(max = 16)
  @Column(name = "mem_grup_codunic")
  private String memGrupCodunic;


  
  @NotNull
  @Column(name = "mem_grup_sefgrupid")
  private Long memGrupSefgrupid;

  @Size(max = 16)
  @Column(name = "mem_grup_sefgrupcodunic")
  private String memGrupSefgrupcodunic;

  @NotNull
  @Column(name = "mem_grup_sefgrupuserid")
  private Long memGrupSefgrupuserid;
  
  @Size(max = 20)
  @Column(name = "mem_grup_sefgrupusernume")
  private String memGrupSefgrupusernume;

  @NotNull
  @Column(name = "mem_grup_sefgrupuserinfoid")
  private Long memGrupSefgrupuserinfoid;

  
  @Column(name = "mem_grup_zonataraid")
  private Long memGrupZonataraid;
  
  @Size(max = 2)
  @Column(name = "mem_grup_zonataracod")
  private String memGrupZonataracod;
  
  @Column(name = "mem_grup_judetid")
  private Long memGrupJudetid;
  
  @Size(max = 2)
  @Column(name = "mem_grup_judetcod")
  private String memGrupJudetcod;
  
  @Column(name = "mem_grup_uatid")
  private Long memGrupUatid;
  
  @Column(name = "mem_grup_uatcod")
  private Long memGrupUatcod;
  
  @Column(name = "mem_grup_localitateid")
  private Long memGrupLocalitateid;
  
  @Column(name = "mem_grup_localitatecod")
  private Long memGrupLocalitatecod;
  

  @Column(name = "mem_grup_zonajudetid")
  private Long memGrupZonajudetid;
  
  @Size(max = 2)
  @Column(name = "mem_grup_zonajudetcod")
  private String memGrupZonajudetcod;

  @Column(name = "mem_grup_zonauatid")
  private Long memGrupZonauatid;
  
  @Size(max = 9)
  @Column(name = "mem_grup_zonauatcod")
  private String memGrupZonauatcod;
  
  @Column(name = "mem_grup_zonalocalitateid")
  private Long memGrupZonalocalitateid;
  
  @Size(max = 9)
  @Column(name = "mem_grup_zonalocalitatecod")
  private String memGrupZonalocalitatecod;

  @Column(name = "mem_grup_sectievotareid")
  private Long memGrupSectievotareid;
  
  @Column(name = "mem_grup_sectievotarenr")
  private Long memGrupSectievotarenr;

  @Column(name = "mem_grup_codpostalid")
  private Long memGrupCodpostalid;
 
  @Size(max = 16)
  @Column(name = "mem_grup_codpostalcod")
  private String memGrupCodpostalcod;

 
  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_grup_activ_yn")
  private String memGrupActivyn;

  @Size(max = 20)
  @Column(name = "mem_grup_startdt", insertable = false, updatable = false)
  private String memGrupStartdt;

  @Size(max = 20)
  @Column(name = "mem_grup_enddt")
  private String memGrupEnddt;


 

	public MemGrup() 
  {
	}

	public MemGrup( Long memGrupId, String memGrupNume, String memGrupCodunic,
                       Long memGrupSefgrupid, String memGrupSefgrupcodunic,
                       Long memGrupSefgrupuserid, String memGrupSefgrupusernume, Long memGrupSefgrupuserinfoid,
                       String memGrupActivyn, String memGrupStartdt,  String memGrupEnddt,
                       Long memGrupZonataraid, String memGrupZonataracod, 
                       Long memGrupJudetid, String memGrupJudetcod, 
                       Long memGrupUatid, Long memGrupUatcod, 
                       Long memGrupLocalitateid, Long memGrupLocalitatecod, 
                       Long memGrupZonajudetid, String memGrupZonajudetcod, 
                       Long memGrupZonauatid, String memGrupZonauatcod, 
                       Long memGrupZonalocalitateid, String memGrupZonalocalitatecod,  
                       Long memGrupSectievotareid, Long memGrupSectievotarenr, 
                       Long memGrupCodpostalid, String memGrupCodpostalcod
                     ) 
  {
    this.memGrupId                = memGrupId;
    this.memGrupNume              = memGrupNume;
    this.memGrupCodunic           = memGrupCodunic;

    this.memGrupSefgrupid         = memGrupSefgrupid;
    this.memGrupSefgrupcodunic    = memGrupSefgrupcodunic;
    this.memGrupSefgrupuserid     = memGrupSefgrupuserid;
    this.memGrupSefgrupusernume   = memGrupSefgrupusernume;
    this.memGrupSefgrupuserinfoid = memGrupSefgrupuserinfoid;

    this.memGrupActivyn           = memGrupActivyn;
    this.memGrupStartdt           = memGrupStartdt;
    this.memGrupEnddt             = memGrupEnddt;

    this.memGrupZonataraid        = memGrupZonataraid;
    this.memGrupZonataracod       = memGrupZonataracod;
    this.memGrupJudetid           = memGrupJudetid;
    this.memGrupJudetcod          = memGrupJudetcod;
    this.memGrupUatid             = memGrupUatid;
    this.memGrupUatcod            = memGrupUatcod;        
    this.memGrupLocalitateid      = memGrupLocalitateid;
    this.memGrupLocalitatecod     = memGrupLocalitatecod;
    this.memGrupZonajudetid       = memGrupZonajudetid;    
    this.memGrupZonajudetcod      = memGrupZonajudetcod;  
    this.memGrupZonauatid         = memGrupZonauatid;    
    this.memGrupZonauatcod        = memGrupZonauatcod;  
    this.memGrupZonalocalitateid  = memGrupZonalocalitateid;    
    this.memGrupZonalocalitatecod = memGrupZonalocalitatecod;  
    this.memGrupSectievotareid    = memGrupSectievotareid;    
    this.memGrupSectievotarenr    = memGrupSectievotarenr;
    this.memGrupCodpostalid       = memGrupCodpostalid;
    this.memGrupCodpostalcod      = memGrupCodpostalcod;
    
  }


  public Long getMemGrupId() 
  {
    return this.memGrupId;
  }

  public void setMemGrupId(Long memGrupId) 
  {
    this.memGrupId = memGrupId;
  }


  public String getMemGrupNume() 
  {
    return this.memGrupNume;
  }

  public void setMemGrupNume(String memGrupNume) 
  {
    this.memGrupNume = memGrupNume;
  }
  

  public String getMemGrupCodunic() 
  {
    return this.memGrupCodunic;
  }

  public void setMemGrupCodunic(String memGrupCodunic) 
  {
    this.memGrupCodunic = memGrupCodunic;
  }
  


  
  public Long getMemGrupSefgrupid() 
  {
    return this.memGrupSefgrupid;
  }

  public void setGrupSefgrupid(Long memGrupSefgrupid) 
  {
    this.memGrupSefgrupid = memGrupSefgrupid;
  }


  public String getMemGrupSefgrupcodunic() 
  {
    return this.memGrupSefgrupcodunic;
  }

  public void setMemGrupSefgrupcodunic(String memGrupSefgrupcodunic) 
  {
    this.memGrupSefgrupcodunic = memGrupSefgrupcodunic;
  }



  public Long getMemGrupSefgrupuserid() 
  {
    return this.memGrupSefgrupuserid;
  }

  public void setMemGrupSefgrupuserid(Long memGrupSefgrupuserid) 
  {
    this.memGrupSefgrupuserid = memGrupSefgrupuserid;
  }


  public String getMemGrupSefgrupusernume() 
  {
    return this.memGrupSefgrupusernume;
  }

  public void setMemGrupSefgrupusernume(String memGrupSefgrupusernume) 
  {
    this.memGrupSefgrupusernume = memGrupSefgrupusernume;
  }


  public Long getMemGrupSefgrupuserinfoid() 
  {
    return this.memGrupSefgrupuserinfoid;
  }

  public void setMemGrupSefgrupuserinfoid(Long memGrupSefgrupuserinfoid) 
  {
    this.memGrupSefgrupuserid = memGrupSefgrupuserinfoid;
  }


  public String getMemGrupActivyn() 
  {
    return this.memGrupActivyn;
  }

  public void setMemGrupActivyn(String memGrupActivyn) 
  {
    this.memGrupActivyn = memGrupActivyn;
  }


  public String getMemGrupStartdt() 
  {
    return this.memGrupStartdt;
  }

  public void setMemGrupStartdt(String memGrupStartdt) 
  {
    this.memGrupStartdt = memGrupStartdt;
  }



  public String getMemGrupEnddt() 
  {
    return this.memGrupEnddt;
  }

  public void setMemGrupEnddt(String memGrupEnddt) 
  {
    this.memGrupEnddt = memGrupEnddt;
  }



  public Long getMemGrupZonataraid() 
  {
    return this.memGrupZonataraid;
  }

  public void setMemGrupZonataraid(Long memGrupZonataraid) 
  {
    this.memGrupZonataraid = memGrupZonataraid;
  }

  public String getMemGrupZonataracod() 
  {
    return this.memGrupZonataracod;
  }

  public void setMemGrupZonataracod(String memGrupZonataracod) 
  {
    this.memGrupZonataracod = memGrupZonataracod;
  }




  public Long getMemGrupJudetid() 
  {
    return this.memGrupJudetid;
  }

  public void setMemGrupJudetid(Long memGrupJudetid) 
  {
    this.memGrupJudetid = memGrupJudetid;
  }

  public String getMemGrupJudetcod() 
  {
    return this.memGrupJudetcod;
  }

  public void setMemGrupJudetcod(String memGrupJudetcod) 
  {
    this.memGrupJudetcod = memGrupJudetcod;
  }


  public Long getMemGrupUatid() 
  {
    return this.memGrupUatid;
  }

  public void setMemGrupUatid(Long memGrupUatid) 
  {
    this.memGrupUatid = memGrupUatid;
  }

  public Long getMemGrupUatcod() 
  {
    return this.memGrupUatcod;
  }

  public void setMemGrupUatcod(Long memGrupUatcod) 
  {
    this.memGrupUatcod = memGrupUatcod;
  }



  public Long getMemGrupLocalitateid() 
  {
    return this.memGrupLocalitateid;
  }

  public void setMemGrupLocalitateid(Long memGrupLocalitateid) 
  {
    this.memGrupLocalitateid = memGrupLocalitateid;
  }

  public Long getMemGrupLocalitatecod() 
  {
    return this.memGrupLocalitatecod;
  }

  public void setMemGrupLocalitatecod(Long memGrupLocalitatecod) 
  {
    this.memGrupLocalitatecod = memGrupLocalitatecod;
  }



  public Long getMemGrupZonajudetid() 
  {
    return this.memGrupZonajudetid;
  }

  public void setMemGrupZonajudetid(Long memGrupZonajudetid) 
  {
    this.memGrupZonajudetid = memGrupZonajudetid;
  }

  public String getMemGrupZonajudetcod() 
  {
    return this.memGrupZonajudetcod;
  }

  public void setMemGrupZonajudetcod(String memGrupZonajudetcod) 
  {
    this.memGrupZonajudetcod = memGrupZonajudetcod;
  }


  public Long getMemGrupZonauatid() 
  {
    return this.memGrupZonauatid;
  }

  public void setMemGrupZonauatid(Long memGrupZonauatid) 
  {
    this.memGrupZonauatid = memGrupZonauatid;
  }

  public String getMemGrupZonauatcod() 
  {
    return this.memGrupZonauatcod;
  }

  public void setMemGrupZonauatcod(String memGrupZonauatcod) 
  {
    this.memGrupZonauatcod = memGrupZonauatcod;
  }



  public Long getMemGrupZonalocalitateid() 
  {
    return this.memGrupZonalocalitateid;
  }

  public void setMemGrupZonalocalitateid(Long memGrupZonalocalitateid) 
  {
    this.memGrupZonalocalitateid = memGrupZonalocalitateid;
  }

  public String getMemGrupZonalocalitatecod() 
  {
    return this.memGrupZonalocalitatecod;
  }

  public void setMemGrupZonalocalitatecod(String memGrupZonalocalitatecod) 
  {
    this.memGrupZonalocalitatecod = memGrupZonalocalitatecod;
  }



  public Long getMemGrupSectievotareid() 
  {
    return this.memGrupSectievotareid;
  }

  public void setMemGrupSectievotareid(Long memGrupSectievotareid) 
  {
    this.memGrupSectievotareid = memGrupSectievotareid;
  }
  
  public Long getMemGrupSectievotarenr() 
  {
    return this.memGrupSectievotarenr;
  }

  public void setMemGrupSectievotarenr(Long memGrupSectievotarenr) 
  {
    this.memGrupSectievotarenr = memGrupSectievotarenr;
  }


  
  public Long getMemGrupCodpostalid() 
  {
    return this.memGrupCodpostalid;
  }

  public void setMemGrupCodpostalid(Long memGrupCodpostalid) 
  {
    this.memGrupCodpostalid = memGrupCodpostalid;
  }


  public String getMemGrupCodpostalcod() 
  {
    return this.memGrupCodpostalcod;
  }

  public void setMemGrupCodpostalcod(String memGrupCodpostalcod) 
  {
    this.memGrupCodpostalcod = memGrupCodpostalcod;
  }




}

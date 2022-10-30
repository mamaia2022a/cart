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

import com.potsoft.cart2api.model.aut.AutUserInfo;


@Entity
@Table(name = "mem_sefgrup")
public class MemSefGrup{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mem_sefgrup_id")
  private Long memSefgrupId;


  @NotNull
  @Column(name = "mem_sefgrup_membruid")
  private Long memSefgrupMembruid;

  @Size(max = 16)
  @Column(name = "mem_sefgrup_membrucodunic")
  private String memSefgrupMembrucodunic;


  
  @NotNull
  @Column(name = "mem_sefgrup_userid")
  private Long memSefgrupUserid;
  
  @Size(max = 20)
  @Column(name = "mem_sefgrup_usernume")
  private String memSefgrupUsernume;

  @NotNull
  @Column(name = "mem_sefgrup_userinfoid")
  private Long memSefgrupUserinfoid;


  @NotNull
  @Column(name = "mem_sefgrup_grupid")
  private Long memSefgrupGrupid;

  @Size(max = 20)
  @Column(name = "mem_sefgrup_grupnume")
  private String memSefgrupGrupnume;

  @Size(max = 16)
  @Column(name = "mem_sefgrup_grupcodunic")
  private String memSefgrupGrupcodunic;
 

  
  @Column(name = "mem_sefgrup_zonataraid")
  private Long memSefgrupZonataraid;
  
  @Size(max = 2)
  @Column(name = "mem_sefgrup_zonataracod")
  private String memSefgrupZonataracod;
  
  @Column(name = "mem_sefgrup_judetid")
  private Long memSefgrupJudetid;
  
  @Size(max = 2)
  @Column(name = "mem_sefgrup_judetcod")
  private String memSefgrupJudetcod;
  
  @Column(name = "mem_sefgrup_uatid")
  private Long memSefgrupUatid;
  
  @Column(name = "mem_sefgrup_uatcod")
  private Long memSefgrupUatcod;

  @Column(name = "mem_sefgrup_localitateid")
  private Long memSefgrupLocalitateid;
  
  @Column(name = "mem_sefgrup_localitatecod")
  private Long memSefgrupLocalitatecod;

  @Column(name = "mem_sefgrup_zonajudetid")
  private Long memSefgrupZonajudetid;
  
  @Size(max = 2)
  @Column(name = "mem_sefgrup_zonajudetcod")
  private String memSefgrupZonajudetcod;

  @Column(name = "mem_sefgrup_zonalocalitateid")
  private Long memSefgrupZonalocalitateid;
  
  @Column(name = "mem_sefgrup_zonauatid")
  private Long memSefgrupZonauatid;
  
  @Size(max = 9)
  @Column(name = "mem_sefgrup_zonauatcod")
  private String memSefgrupZonauatcod;
  
  @Size(max = 9)
  @Column(name = "mem_sefgrup_zonalocalitatecod")
  private String memSefgrupZonalocalitatecod;

  @Column(name = "mem_sefgrup_sectievotareid")
  private Long memSefgrupSectievotareid;
  
  @Column(name = "mem_sefgrup_sectievotarenr")
  private Long memSefgrupSectievotarenr;

  @Column(name = "mem_sefgrup_codpostalid")
  private Long memSefgrupCodpostalid;
 
  @Size(max = 16)
  @Column(name = "mem_sefgrup_codpostalcod")
  private String memSefgrupCodpostalcod;

 
  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_sefgrup_activ_yn")
  private String memSefgrupActivyn;

  @Size(max = 20)
  @Column(name = "mem_sefgrup_startdt", insertable = false, updatable = false)
  private String memSefgrupStartdt;

  @Size(max = 20)
  @Column(name = "mem_sefgrup_enddt")
  private String memSefgrupEnddt;


 //@Where(clause = "aut_userrol_activ_yn = 'y'")
 @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
 //@JoinColumn(name = "mem_membrugrup_userid", referencedColumnName = "aut_userinfo_userid", insertable = false, updatable = false)
 @JoinColumn(name = "mem_sefgrup_userinfoid", referencedColumnName = "aut_userinfo_id", insertable = false, updatable = false)
 private AutUserInfo userinfo;


	public MemSefGrup() 
  {
	}

	public MemSefGrup( Long memSefGrupId, 
                       Long memSefGrupMembruid, String memSefGrupMembrucodunic,
                       Long memSefGrupUserid, String memSefGrupUsernume, Long memSefGrupUserinfoid,
                       Long memSefGrupGrupid, String memSefGrupGrupnume, String memSefGrupGrupcodunic,
                       String memSefGrupActivyn, String memSefGrupStartdt,  String memSefGrupEnddt,
                       Long memSefGrupZonataraid, String memSefGrupZonataracod, 
                       Long memSefGrupJudetid, String memSefGrupJudetcod, 
                       Long memSefGrupUatid, Long memSefGrupUatcod, 
                       Long memSefGrupLocalitateid, Long memSefGrupLocalitatecod, 
                       Long memSefGrupZonajudetid, String memSefGrupZonajudetcod, 
                       Long memSefGrupZonauatid, String memSefGrupZonauatcod, 
                       Long memSefGrupZonalocalitateid, String memSefGrupZonalocalitatecod,  
                       Long memSefGrupSectievotareid, Long memSefGrupSectievotarenr, 
                       Long memSefGrupCodpostalid, String memSefGrupCodpostalcod
                     ) 
  {
    this.memSefgrupId                = memSefGrupId;

    this.memSefgrupMembruid          = memSefGrupMembruid;
    this.memSefgrupMembrucodunic     = memSefGrupMembrucodunic;

    this.memSefgrupUserid            = memSefGrupUserid;
    this.memSefgrupUsernume          = memSefGrupUsernume;
    this.memSefgrupUserinfoid        = memSefGrupUserinfoid;

    this.memSefgrupGrupid            = memSefGrupGrupid;
    this.memSefgrupGrupnume          = memSefGrupGrupnume;
    this.memSefgrupGrupcodunic       = memSefGrupGrupcodunic;

    this.memSefgrupActivyn           = memSefGrupActivyn;
    this.memSefgrupStartdt           = memSefGrupStartdt;
    this.memSefgrupEnddt             = memSefGrupEnddt;

    this.memSefgrupZonataraid        = memSefGrupZonataraid;
    this.memSefgrupZonataracod       = memSefGrupZonataracod;
    this.memSefgrupJudetid           = memSefGrupJudetid;
    this.memSefgrupJudetcod          = memSefGrupJudetcod;
    this.memSefgrupUatid             = memSefGrupUatid;
    this.memSefgrupUatcod            = memSefGrupUatcod;
    this.memSefgrupLocalitateid      = memSefGrupLocalitateid;
    this.memSefgrupLocalitatecod     = memSefGrupLocalitatecod;
    this.memSefgrupZonajudetid       = memSefGrupZonajudetid;    
    this.memSefgrupZonajudetcod      = memSefGrupZonajudetcod;  
    this.memSefgrupZonauatid         = memSefGrupZonauatid;    
    this.memSefgrupZonauatcod        = memSefGrupZonauatcod;  
    this.memSefgrupZonalocalitateid  = memSefGrupZonalocalitateid;    
    this.memSefgrupZonalocalitatecod = memSefGrupZonalocalitatecod;  
    this.memSefgrupSectievotareid    = memSefGrupSectievotareid;    
    this.memSefgrupSectievotarenr    = memSefGrupSectievotarenr;
    this.memSefgrupCodpostalid       = memSefGrupCodpostalid;
    this.memSefgrupCodpostalcod      = memSefGrupCodpostalcod;
    
  }


  public Long getMemSefgrupId() 
  {
    return this.memSefgrupId;
  }

  public void setMemSefgrupId(Long memSefgrupId) 
  {
    this.memSefgrupId = memSefgrupId;
  }

  
  
  public Long getMemSefgrupMembruid() 
  {
    return this.memSefgrupMembruid;
  }

  public void setMemSefgrupMembruid(Long memSefgrupMembruid) 
  {
    this.memSefgrupMembruid = memSefgrupMembruid;
  }


  public String getMemSefgrupMembrucodunic() 
  {
    return this.memSefgrupMembrucodunic;
  }

  public void setMemSefgrupMembrucodunic(String memSefgrupMembrucodunic) 
  {
    this.memSefgrupMembrucodunic = memSefgrupMembrucodunic;
  }



  public Long getMemSefgrupUserid() 
  {
    return this.memSefgrupUserid;
  }

  public void setMemSefgrupUserid(Long memSefgrupUserid) 
  {
    this.memSefgrupUserid = memSefgrupUserid;
  }


  public String getMemSefgrupUsernume() 
  {
    return this.memSefgrupUsernume;
  }

  public void setMemSefgrupUsernume(String memSefgrupUsernume) 
  {
    this.memSefgrupUsernume = memSefgrupUsernume;
  }


  public Long getMemSefgrupUserinfoid() 
  {
    return this.memSefgrupUserinfoid;
  }

  public void setMemSefgrupUserinfoid(Long memSefgrupUserinfoid) 
  {
    this.memSefgrupUserinfoid = memSefgrupUserinfoid;
  }



  public Long getMemSefgrupGrupid() 
  {
    return this.memSefgrupGrupid;
  }

  public void setMemSefgrupGrupid(Long memSefgrupGrupid) 
  {
    this.memSefgrupGrupid = memSefgrupGrupid;
  }
  

  public String getMemSefgrupGrupnume() 
  {
    return this.memSefgrupGrupnume;
  }

  public void setMemSefgrupGrupnume(String memSefgrupGrupnume) 
  {
    this.memSefgrupGrupnume = memSefgrupGrupnume;
  }


  public String getMemSefgrupGrupcodunic() 
  {
    return this.memSefgrupGrupcodunic;
  }

  public void setMemSefgrupGrupcodunic(String memSefgrupGrupcodunic) 
  {
    this.memSefgrupGrupcodunic = memSefgrupGrupcodunic;
  }
 


  public Long getMemSefgrupZonataraid() 
  {
    return this.memSefgrupZonataraid;
  }

  public void setMemSefgrupZonataraid(Long memSefgrupZonaTaraid) 
  {
    this.memSefgrupZonataraid = memSefgrupZonaTaraid;
  }

  public String getMemSefgrupZonataracod() 
  {
    return this.memSefgrupZonataracod;
  }

  public void setMemSefgrupZonataracod(String memSefgrupZonataracod) 
  {
    this.memSefgrupZonataracod = memSefgrupZonataracod;
  }




  public Long getMemSefgrupJudetid() 
  {
    return this.memSefgrupJudetid;
  }

  public void setMemSefgrupJudetid(Long memSefgrupJudetid) 
  {
    this.memSefgrupJudetid = memSefgrupJudetid;
  }

  public String getMemSefgrupJudetcod() 
  {
    return this.memSefgrupJudetcod;
  }

  public void setMemSefgrupJudetcod(String memSefgrupJudetcod) 
  {
    this.memSefgrupJudetcod = memSefgrupJudetcod;
  }



  public Long getMemSefgrupUatid() 
  {
    return this.memSefgrupUatid;
  }

  public void setMemSefgrupUatid(Long memSefgrupUatid) 
  {
    this.memSefgrupUatid = memSefgrupUatid;
  }

  public Long getMemSefgrupUatcod() 
  {
    return this.memSefgrupUatcod;
  }

  public void setMemSefgrupUatcod(Long memSefgrupUatcod) 
  {
    this.memSefgrupUatcod = memSefgrupUatcod;
  }



  public Long getMemSefgrupLocalitateid() 
  {
    return this.memSefgrupLocalitateid;
  }

  public void setMemSefgrupLocalitateid(Long memSefgrupLocalitateid) 
  {
    this.memSefgrupLocalitateid = memSefgrupLocalitateid;
  }

  public Long getMemSefgrupLocalitatecod() 
  {
    return this.memSefgrupLocalitatecod;
  }

  public void setMemSefgrupLocalitatecod(Long memSefgrupLocalitatecod) 
  {
    this.memSefgrupLocalitatecod = memSefgrupLocalitatecod;
  }



  public Long getMemSefgrupZonajudetid() 
  {
    return this.memSefgrupZonajudetid;
  }

  public void setMemSefgrupZonajudetid(Long memSefgrupZonajudetid) 
  {
    this.memSefgrupZonajudetid = memSefgrupZonajudetid;
  }

  public String getMemSefgrupZonajudetcod() 
  {
    return this.memSefgrupZonajudetcod;
  }

  public void setMemSefgrupZonajudetcod(String memSefgrupZonajudetcod) 
  {
    this.memSefgrupZonajudetcod = memSefgrupZonajudetcod;
  }


  public Long getMemSefgrupZonauatid() 
  {
    return this.memSefgrupZonauatid;
  }

  public void setMemSefgrupZonauatid(Long memSefgrupZonauatid) 
  {
    this.memSefgrupZonauatid = memSefgrupZonauatid;
  }

  public String getMemSefgrupZonauatcod() 
  {
    return this.memSefgrupZonauatcod;
  }

  public void setMemSefgrupZonauatcod(String memSefgrupZonauatcod) 
  {
    this.memSefgrupZonauatcod = memSefgrupZonauatcod;
  }



  public Long getMemSefgrupZonalocalitateid() 
  {
    return this.memSefgrupZonalocalitateid;
  }

  public void setMemSefgrupZonalocalitateid(Long memSefgrupZonalocalitateid) 
  {
    this.memSefgrupZonalocalitateid = memSefgrupZonalocalitateid;
  }

  public String getMemSefgrupZonalocalitatecod() 
  {
    return this.memSefgrupZonalocalitatecod;
  }

  public void setMemSefgrupZonalocalitatecod(String memSefgrupZonalocalitatecod) 
  {
    this.memSefgrupZonalocalitatecod = memSefgrupZonalocalitatecod;
  }



  public Long getMemSefgrupSectievotareid() 
  {
    return this.memSefgrupSectievotareid;
  }

  public void setMemSefgrupSectievotareid(Long memSefgrupSectievotareid) 
  {
    this.memSefgrupSectievotareid = memSefgrupSectievotareid;
  }
  
  public Long getMemSefgrupSectievotarenr() 
  {
    return this.memSefgrupSectievotarenr;
  }

  public void setMemSefgrupSectievotarenr(Long memSefgrupSectievotarenr) 
  {
    this.memSefgrupSectievotarenr = memSefgrupSectievotarenr;
  }


  
  public Long getMemSefgrupCodpostalid() 
  {
    return this.memSefgrupCodpostalid;
  }

  public void setMemSefgrupCodpostalid(Long memSefgrupCodpostalid) 
  {
    this.memSefgrupCodpostalid = memSefgrupCodpostalid;
  }


  public String getMemSefgrupCodpostalcod() 
  {
    return this.memSefgrupCodpostalcod;
  }

  public void setMemSefgrupCodpostalcod(String memSefgrupCodpostalcod) 
  {
    this.memSefgrupCodpostalcod = memSefgrupCodpostalcod;
  }



  public String getMemSefgrupActivyn() 
  {
    return this.memSefgrupActivyn;
  }

  public void setMemSefgrupActivyn(String memSefgrupActivyn) 
  {
    this.memSefgrupActivyn = memSefgrupActivyn;
  }


  public String getMemSefgrupStartdt() 
  {
    return this.memSefgrupStartdt;
  }

  public void setMemSefgrupStartdt(String memSefgrupStartdt) 
  {
    this.memSefgrupStartdt = memSefgrupStartdt;
  }


  public String getMemSefgrupEnddt() 
  {
    return this.memSefgrupEnddt;
  }

  public void setMemSefgrupEnddt(String memSefgrupEnddt) 
  {
    this.memSefgrupEnddt = memSefgrupEnddt;
  }


  public AutUserInfo getUserinfo() 
  {
    return this.userinfo;
  }

  public void setUserinfo(AutUserInfo userinfo) 
  {
    this.userinfo = userinfo;
  }

}

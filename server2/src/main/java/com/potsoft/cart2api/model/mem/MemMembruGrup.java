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

import com.potsoft.cart2api.model.aut.AutUserInfo;


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
  @Column(name = "mem_membrugrup_userinfoid")
  private Long memMembrugrupUserinfoid;


  @NotNull
  @Column(name = "mem_membrugrup_grupid")
  private Long memMembrugrupGrupid;

  @Size(max = 20)
  @Column(name = "mem_membrugrup_grupnume")
  private String memMembrugrupGrupnume;

  @Size(max = 16)
  @Column(name = "mem_membrugrup_grupcodunic")
  private String memMembrugrupGrupcodunic;
 

  @NotNull
  @Column(name = "mem_membrugrup_sefgrupid")
  private Long memMembrugrupSefgrupid;

  @Size(max = 16)
  @Column(name = "mem_membrugrup_sefgrupcodunic")
  private String memMembrugrupSefgrupcodunic;

  @NotNull
  @Column(name = "mem_membrugrup_sefgrupuserid")
  private Long memMembrugrupSefgrupuserid;
  
  @Size(max = 20)
  @Column(name = "mem_membrugrup_sefgrupusernume")
  private String memMembrugrupSefgrupusernume;

  @NotNull
  @Column(name = "mem_membrugrup_sefgrupuserinfoid")
  private Long memMembrugrupSefgrupuserinfoid;

  
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
  
  @Column(name = "mem_membrugrup_uatcod")
  private Long memMembrugrupUatcod;
 
  @Column(name = "mem_membrugrup_localitateid")
  private Long memMembrugrupLocalitateid;
  
  @Column(name = "mem_membrugrup_localitatecod")
  private Long memMembrugrupLocalitatecod;
  

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
  
  @Column(name = "mem_membrugrup_sectievotarenr")
  private Long memMembrugrupSectievotarenr;

  @Column(name = "mem_membrugrup_codpostalid")
  private Long memMembrugrupCodpostalid;
 
  @Size(max = 16)
  @Column(name = "mem_membrugrup_codpostalcod")
  private String memMembrugrupCodpostalcod;

  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_membrugrup_cerere_yn")
  private String memMembrugrupCerereyn;

  @Size(max = 20)
  @Column(name = "mem_membrugrup_cereredt", insertable = false, updatable = false)
  private String memMembrugrupCereredt;

  @Size(max = 1)
  @Column(name = "mem_membrugrup_acceptare_yn")
  private String memMembrugrupAcceptareyn;

  @Size(max = 20)
  @Column(name = "mem_membrugrup_acceptaredt")
  private String memMembrugrupAcceptaredt;


  @Size(max = 1)
  @Column(name = "mem_membrugrup_plecare_yn")
  private String memMembrugrupPlecareyn;

  @Size(max = 1)
  @Column(name = "mem_membrugrup_excludere_yn")
  private String memMembrugrupExcludereyn;


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


  //@Where(clause = "aut_userrol_activ_yn = 'y'")
  @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
  //@JoinColumn(name = "mem_membrugrup_userid", referencedColumnName = "aut_userinfo_userid", insertable = false, updatable = false)
  @JoinColumn(name = "mem_membrugrup_userinfoid", referencedColumnName = "aut_userinfo_id", insertable = false, updatable = false)
  private AutUserInfo userinfo;
 

	public MemMembruGrup() 
  {
	}

	public MemMembruGrup( Long memMembrugrupId, 
                       Long memMembrugrupMembruid, String memMembrugrupMembrucodunic,
                       Long memMembrugrupUserid, String memMembrugrupUsernume, Long memMembrugrupUserinfoid,
                       Long memMembrugrupGrupid, String memMembrugrupGrupnume, String memMembrugrupGrupcodunic,
                       Long memMembrugrupSefgrupid, String memMembrugrupSefgrupcodunic,
                       Long memMembrugrupSefgrupuserid, String memMembrugrupSefgrupusernume, Long memMembrugrupSefgrupuserinfoid,
                       String memMembrugrupActivyn, String memMembrugrupStartdt,  String memMembrugrupEnddt,
                       Long memMembrugrupZonataraid, String memMembrugrupZonataracod, 
                       Long memMembrugrupJudetid, String memMembrugrupJudetcod, 
                       Long memMembrugrupUatid, Long memMembrugrupUatcod, 
                       Long memMembrugrupLocalitateid, Long memMembrugrupLocalitatecod, 
                       Long memMembrugrupZonajudetid, String memMembrugrupZonajudetcod, 
                       Long memMembrugrupZonauatid, String memMembrugrupZonauatcod, 
                       Long memMembrugrupZonalocalitateid, String memMembrugrupZonalocalitatecod,  
                       Long memMembrugrupSectievotareid, Long memMembrugrupSectievotarenr, 
                       Long memMembrugrupCodpostalid, String memMembrugrupCodpostalcod,
                       String memMembrugrupCerereyn, String memMembrugrupCereredt,
                       String memMembrugrupAcceptareyn, String memMembrugrupAcceptaredt,
                       String memMembrugrupPlecareyn, String memMembrugrupExcludereyn
                     ) 
  {
    this.memMembrugrupId                = memMembrugrupId;

    this.memMembrugrupMembruid          = memMembrugrupMembruid;
    this.memMembrugrupMembrucodunic     = memMembrugrupMembrucodunic;

    this.memMembrugrupUserid            = memMembrugrupUserid;
    this.memMembrugrupUsernume          = memMembrugrupUsernume;
    this.memMembrugrupUserinfoid        = memMembrugrupUserinfoid;

    this.memMembrugrupGrupid            = memMembrugrupGrupid;
    this.memMembrugrupGrupnume          = memMembrugrupGrupnume;
    this.memMembrugrupGrupcodunic       = memMembrugrupGrupcodunic;

    this.memMembrugrupSefgrupid         = memMembrugrupSefgrupid;
    this.memMembrugrupSefgrupcodunic    = memMembrugrupSefgrupcodunic;
    this.memMembrugrupSefgrupuserid     = memMembrugrupSefgrupuserid;
    this.memMembrugrupSefgrupusernume   = memMembrugrupSefgrupusernume;
    this.memMembrugrupSefgrupuserinfoid = memMembrugrupSefgrupuserinfoid;

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
    this.memMembrugrupZonauatid         = memMembrugrupZonauatid;    
    this.memMembrugrupZonauatcod        = memMembrugrupZonauatcod;  
    this.memMembrugrupZonalocalitateid  = memMembrugrupZonalocalitateid;    
    this.memMembrugrupZonalocalitatecod = memMembrugrupZonalocalitatecod;  
    this.memMembrugrupSectievotareid    = memMembrugrupSectievotareid;    
    this.memMembrugrupSectievotarenr    = memMembrugrupSectievotarenr;
    this.memMembrugrupCodpostalid       = memMembrugrupCodpostalid;
    this.memMembrugrupCodpostalcod      = memMembrugrupCodpostalcod;
   
    this.memMembrugrupCerereyn          = memMembrugrupCerereyn;
    this.memMembrugrupCereredt          = memMembrugrupCereredt;

    this.memMembrugrupAcceptareyn       = memMembrugrupAcceptareyn;
    this.memMembrugrupAcceptaredt       = memMembrugrupAcceptaredt;

    this.memMembrugrupPlecareyn         = memMembrugrupPlecareyn;
    this.memMembrugrupExcludereyn       = memMembrugrupExcludereyn;

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


  public Long getMemMembrugrupUserinfoid() 
  {
    return this.memMembrugrupUserinfoid;
  }

  public void setMemMembrugrupUserinfoid(Long memMembrugrupUserinfoid) 
  {
    this.memMembrugrupUserinfoid = memMembrugrupUserinfoid;
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
 


  public Long getMemMembrugrupSefgrupid() 
  {
    return this.memMembrugrupSefgrupid;
  }

  public void setMembrugrupSefgrupid(Long memMembrugrupSefgrupid) 
  {
    this.memMembrugrupSefgrupid = memMembrugrupSefgrupid;
  }


  public String getMemMembrugrupSefgrupcodunic() 
  {
    return this.memMembrugrupSefgrupcodunic;
  }

  public void setMemMembrugrupSefgrupcodunic(String memMembrugrupSefgrupcodunic) 
  {
    this.memMembrugrupSefgrupcodunic = memMembrugrupSefgrupcodunic;
  }



  public Long getMemMembrugrupSefgrupuserid() 
  {
    return this.memMembrugrupSefgrupuserid;
  }

  public void setMemMembrugrupSefgrupuserid(Long memMembrugrupSefgrupuserid) 
  {
    this.memMembrugrupSefgrupuserid = memMembrugrupSefgrupuserid;
  }


  public String getMemMembrugrupSefgrupusernume() 
  {
    return this.memMembrugrupSefgrupusernume;
  }

  public void setMemMembrugrupSefgrupusernume(String memMembrugrupSefgrupusernume) 
  {
    this.memMembrugrupSefgrupusernume = memMembrugrupSefgrupusernume;
  }


  public Long getMemMembrugrupSefgrupuserinfoid() 
  {
    return this.memMembrugrupSefgrupuserinfoid;
  }

  public void setMemMembrugrupSefgrupuserinfoid(Long memMembrugrupSefgrupuserinfoid) 
  {
    this.memMembrugrupSefgrupuserinfoid = memMembrugrupSefgrupuserinfoid;
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



  public Long getMemMembrugrupUatid() 
  {
    return this.memMembrugrupUatid;
  }

  public void setMemMembrugrupUatid(Long memMembrugrupUatid) 
  {
    this.memMembrugrupUatid = memMembrugrupUatid;
  }

  public Long getMemMembrugrupUatcod() 
  {
    return this.memMembrugrupUatcod;
  }

  public void setMemMembrugrupUatcod(Long memMembrugrupUatcod) 
  {
    this.memMembrugrupUatcod = memMembrugrupUatcod;
  }



  public Long getMemMembrugrupLocalitateid() 
  {
    return this.memMembrugrupLocalitateid;
  }

  public void setMemMembrugrupLocalitateid(Long memMembrugrupLocalitateid) 
  {
    this.memMembrugrupLocalitateid = memMembrugrupLocalitateid;
  }

  public Long getMemMembrugrupLocalitatecod() 
  {
    return this.memMembrugrupLocalitatecod;
  }

  public void setMemMembrugrupLocalitatecod(Long memMembrugrupLocalitatecod) 
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


  public Long getMemMembrugrupZonauatid() 
  {
    return this.memMembrugrupZonauatid;
  }

  public void setMemMembrugrupZonauatid(Long memMembrugrupZonauatid) 
  {
    this.memMembrugrupZonauatid = memMembrugrupZonauatid;
  }

  public String getMemMembrugrupZonauatcod() 
  {
    return this.memMembrugrupZonauatcod;
  }

  public void setMemMembrugrupZonauatcod(String memMembrugrupZonauatcod) 
  {
    this.memMembrugrupZonauatcod = memMembrugrupZonauatcod;
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


  public String getMemMembrugrupCerereyn() 
  {
    return this.memMembrugrupActivyn;
  }

  public void setMemMembrugrupCerereyn(String memMembrugrupCerereyn) 
  {
    this.memMembrugrupCerereyn = memMembrugrupCerereyn;
  }


  public String getMemMembrugrupCereredt() 
  {
    return this.memMembrugrupCereredt;
  }

  public void setMemMembrugrupCereredt(String memMembrugrupCereredt) 
  {
    this.memMembrugrupEnddt = memMembrugrupCereredt;
  }


  public String getMemMembrugrupAcceptareyn() 
  {
    return this.memMembrugrupActivyn;
  }

  public void setMemMembrugrupAcceptareyn(String memMembrugrupAcceptareyn) 
  {
    this.memMembrugrupAcceptareyn = memMembrugrupAcceptareyn;
  }


  public String getMemMembrugrupAcceptaredt() 
  {
    return this.memMembrugrupAcceptaredt;
  }

  public void setMemMembrugrupAcceptaredt(String memMembrugrupAcceptaredt) 
  {
    this.memMembrugrupAcceptaredt = memMembrugrupAcceptaredt;
  }


  public String getMemMembrugrupPlecareyn() 
  {
    return this.memMembrugrupPlecareyn;
  }

  public void setMemMembrugrupPlecareyn(String memMembrugrupPlecareyn) 
  {
    this.memMembrugrupPlecareyn = memMembrugrupPlecareyn;
  }


  public String getMemMembrugrupExcludereyn() 
  {
    return this.memMembrugrupExcludereyn;
  }

  public void setMemMembrugrupExcludereyn(String memMembrugrupExcludereyn) 
  {
    this.memMembrugrupExcludereyn = memMembrugrupExcludereyn;
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

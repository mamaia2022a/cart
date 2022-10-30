package com.potsoft.cart2api.model.mem;

//import com.potsoft.cart2api.model.aut.userrol.MemMembrurolRol;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "mem_membrurol")
public class MemMembruRol{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mem_membrurol_id")
  private Long memMembrurolId;


  @NotNull
  @Column(name = "mem_membrurol_membruid")
  private Long memMembrurolMembruid;

  @Size(max = 16)
  @Column(name = "mem_membrurol_membrucodunic")
  private String memMembrurolMembrucodunic;


  @NotNull
  @Column(name = "mem_membrurol_userid")
  private Long memMembrurolUserid;
  
  @Size(max = 20)
  @Column(name = "mem_membrurol_usernume")
  private String memMembrurolUsernume;

  @NotNull
  @Column(name = "mem_membrurol_userinfoid")
  private Long memMembrurolUserinfoid;


  @NotNull
  @Column(name = "mem_membrurol_tiprolid")
  private Long memMembrurolTiprolid;

  @Size(max = 10)
  @Column(name = "mem_membrurol_tiprolcod")
  private String memMembrurolTiprolcod;
 
  
  @NotNull
  @Column(name = "mem_membrurol_acopgeoid")
  private Long memMembrurolAcopgeoid;

  @Size(max = 10)
  @Column(name = "mem_membrurol_acopgeocod")
  private String memMembrurolAcopgeocod;
 
  
  
  @Column(name = "mem_membrurol_zonataraid")
  private Long memMembrurolZonataraid;
  
  @Size(max = 2)
  @Column(name = "mem_membrurol_zonataracod")
  private String memMembrurolZonataracod;
  
  @Column(name = "mem_membrurol_judetid")
  private Long memMembrurolJudetid;
  
  @Size(max = 2)
  @Column(name = "mem_membrurol_judetcod")
  private String memMembrurolJudetcod;
  
  @Column(name = "mem_membrurol_uatid")
  private Long memMembrurolUatid;
  
  @Column(name = "mem_membrurol_uatcod")
  private Long memMembrurolUatcod;

  @Column(name = "mem_membrurol_localitateid")
  private Long memMembrurolLocalitateid;
  
  @Column(name = "mem_membrurol_localitatecod")
  private Long memMembrurolLocalitatecod;

  @Column(name = "mem_membrurol_zonajudetid")
  private Long memMembrurolZonajudetid;
  
  @Size(max = 2)
  @Column(name = "mem_membrurol_zonajudetcod")
  private String memMembrurolZonajudetcod;

  @Column(name = "mem_membrurol_zonauatid")
  private Long memMembrurolZonauatid;
  
  @Size(max = 9)
  @Column(name = "mem_membrurol_zonauatcod")
  private String memMembrurolZonauatcod;

  @Column(name = "mem_membrurol_zonalocalitateid")
  private Long memMembrurolZonalocalitateid;
  
  @Size(max = 9)
  @Column(name = "mem_membrurol_zonalocalitatecod")
  private String memMembrurolZonalocalitatecod;

  @Column(name = "mem_membrurol_sectievotareid")
  private Long memMembrurolSectievotareid;
  
  @Column(name = "mem_membrurol_sectievotarenr")
  private Long memMembrurolSectievotarenr;

  @Column(name = "mem_membrurol_codpostalid")
  private Long memMembrurolCodpostalid;
 
  @Size(max = 16)
  @Column(name = "mem_membrurol_codpostalcod")
  private String memMembrurolCodpostalcod;


  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_membrurol_invitatie_yn")
  private String memMembrurolInvitatieyn;

  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_membrurol_acceptare_yn")
  private String memMembrurolAcceptareyn;

  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_membrurol_plecare_yn")
  private String memMembrurolPlecareyn;

  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_membrurol_eliberare_yn")
  private String memMembrurolEliberareyn;

  
  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_membrurol_activ_yn")
  private String memMembrurolActivyn;

  @Size(max = 20)
  @Column(name = "mem_membrurol_startdt", insertable = false, updatable = false)
  private String memMembrurolStartdt;

  @Size(max = 20)
  @Column(name = "mem_membrurol_enddt")
  private String memMembrurolEnddt;


 

	public MemMembruRol() 
  {
	}

	public MemMembruRol( Long memMembruRolId, 
                       Long memMembruRolMembruid, String memMembruRolMembrucodunic,
                       Long memMembruRolUserid, String memMembruRolUsernume, Long memMembruRolUserinfoid, 
                       Long memMembruRolTiprolid, String memMembruRolTiprolcod, 
                       Long memMembruRolAcopgeoid, String memMembruRolAcopgeocod, 
                       String memMembruRolActivyn, String memMembruRolStartdt,  String memMembruRolEnddt,
                       Long memMembruRolZonataraid, String memMembruRolZonataracod, 
                       Long memMembruRolJudetid, String memMembruRolJudetcod, 
                       Long memMembruRolUatid, Long memMembruRolUatcod, 
                       Long memMembruRolLocalitateid, Long memMembruRolLocalitatecod, 
                       Long memMembruRolZonajudetid, String memMembruRolZonajudetcod, 
                       Long memMembruRolZonauatid, String memMembruRolZonauatcod, 
                       Long memMembruRolZonalocalitateid, String memMembruRolZonalocalitatecod,  
                       Long memMembruRolSectievotareid, Long memMembruRolSectievotarenr, 
                       Long memMembruRolCodpostalid, String memMembruRolCodpostalcod,
                       String memMembrurolInvitatieyn, String memMembrurolAcceptareyn,
                       String memMembrurolPlecareyn, String memMembrurolEliberareyn
                     ) 
  {
    this.memMembrurolId                = memMembruRolId;

    this.memMembrurolMembruid          = memMembruRolMembruid;
    this.memMembrurolMembrucodunic     = memMembruRolMembrucodunic;

    this.memMembrurolUserid            = memMembruRolUserid;
    this.memMembrurolUsernume          = memMembruRolUsernume;
    this.memMembrurolUserinfoid        = memMembruRolUserinfoid;
 
    this.memMembrurolTiprolid          = memMembruRolTiprolid;
    this.memMembrurolTiprolcod         = memMembruRolTiprolcod;

    this.memMembrurolAcopgeoid          = memMembruRolAcopgeoid;
    this.memMembrurolAcopgeocod         = memMembruRolAcopgeocod;

    this.memMembrurolActivyn           = memMembruRolActivyn;
    this.memMembrurolStartdt           = memMembruRolStartdt;
    this.memMembrurolEnddt             = memMembruRolEnddt;

    this.memMembrurolZonataraid        = memMembruRolZonataraid;
    this.memMembrurolZonataracod       = memMembruRolZonataracod;
    this.memMembrurolJudetid           = memMembruRolJudetid;
    this.memMembrurolJudetcod          = memMembruRolJudetcod;
    this.memMembrurolUatid             = memMembruRolUatid;
    this.memMembrurolUatcod            = memMembruRolUatcod;
    this.memMembrurolLocalitateid      = memMembruRolLocalitateid;
    this.memMembrurolLocalitatecod     = memMembruRolLocalitatecod;
    this.memMembrurolZonajudetid       = memMembruRolZonajudetid;    
    this.memMembrurolZonajudetcod      = memMembruRolZonajudetcod;  
    this.memMembrurolZonauatid         = memMembruRolZonauatid;    
    this.memMembrurolZonauatcod        = memMembruRolZonauatcod;  
    this.memMembrurolZonalocalitateid  = memMembruRolZonalocalitateid;    
    this.memMembrurolZonalocalitatecod = memMembruRolZonalocalitatecod;  
    this.memMembrurolSectievotareid    = memMembruRolSectievotareid;    
    this.memMembrurolSectievotarenr    = memMembruRolSectievotarenr;
    this.memMembrurolCodpostalid       = memMembruRolCodpostalid;
    this.memMembrurolCodpostalcod      = memMembruRolCodpostalcod;
    
    this.memMembrurolInvitatieyn       = memMembrurolInvitatieyn;
    this.memMembrurolAcceptareyn       = memMembrurolAcceptareyn;
    this.memMembrurolPlecareyn         = memMembrurolPlecareyn;
    this.memMembrurolEliberareyn       = memMembrurolEliberareyn;
  }


  public Long getMemMembrurolId() 
  {
    return this.memMembrurolId;
  }

  public void setMemMembrurolId(Long memMembrurolId) 
  {
    this.memMembrurolId = memMembrurolId;
  }

  
  
  public Long getMemMembrurolMembruid() 
  {
    return this.memMembrurolMembruid;
  }

  public void setMemMembrurolMembruid(Long memMembrurolMembruid) 
  {
    this.memMembrurolMembruid = memMembrurolMembruid;
  }


  public String getMemMembrurolMembruCodunic() 
  {
    return this.memMembrurolMembrucodunic;
  }

  public void setMemMembrurolMembruCodunic(String memMembrurolMembrucodunic) 
  {
    this.memMembrurolMembrucodunic = memMembrurolMembrucodunic;
  }



  public Long getMemMembrurolUserid() 
  {
    return this.memMembrurolUserid;
  }

  public void setMemMembrurolUserid(Long memMembrurolUserid) 
  {
    this.memMembrurolUserid = memMembrurolUserid;
  }


  public String getMemMembrurolUsernume() 
  {
    return this.memMembrurolUsernume;
  }

  public void setMemMembrurolUsernume(String memMembrurolUsernume) 
  {
    this.memMembrurolUsernume = memMembrurolUsernume;
  }



  public Long getMemMembrurolUserinfoid() 
  {
    return this.memMembrurolUserinfoid;
  }

  public void setMemMembrurolUserinfoid(Long memMembrurolUserinfoid) 
  {
    this.memMembrurolUserinfoid = memMembrurolUserinfoid;
  }



  public Long getMemMembrurolTiprolid() 
  {
    return this.memMembrurolTiprolid;
  }

  public void setMemMembrurolTiprolid(Long memMembrurolTiprolid) 
  {
    this.memMembrurolTiprolid = memMembrurolTiprolid;
  }
  

  public String getMemMembrurolTiprolcod() 
  {
    return this.memMembrurolTiprolcod;
  }

  public void setMemMembrurolTiprolcod(String memMembrurolTiprolcod) 
  {
    this.memMembrurolTiprolcod = memMembrurolTiprolcod;
  }
 


  public Long getMemMembrurolAcopgeoid() 
  {
    return this.memMembrurolAcopgeoid;
  }

  public void setMemMembrurolAcopgeoid(Long memMembrurolAcopgeoid) 
  {
    this.memMembrurolAcopgeoid = memMembrurolAcopgeoid;
  }

  public String getMemMembrurolAcopgeocod() 
  {
    return this.memMembrurolAcopgeocod;
  }

  public void setMemMembrurolAcopgeocod(String memMembrurolAcopgeocod) 
  {
    this.memMembrurolAcopgeocod = memMembrurolAcopgeocod;
  }



  public Long getMemMembrurolZonataraid() 
  {
    return this.memMembrurolZonataraid;
  }

  public void setMemMembrurolZonataraid(Long memMembrurolZonataraid) 
  {
    this.memMembrurolZonataraid = memMembrurolZonataraid;
  }

  public String getMemMembrurolZonataracod() 
  {
    return this.memMembrurolZonataracod;
  }

  public void setMemMembrurolZonataracod(String memMembrurolZonataracod) 
  {
    this.memMembrurolZonataracod = memMembrurolZonataracod;
  }




  public Long getMemMembrurolJudetid() 
  {
    return this.memMembrurolJudetid;
  }

  public void setMemMembrurolJudetid(Long memMembrurolJudetid) 
  {
    this.memMembrurolJudetid = memMembrurolJudetid;
  }

  public String getMemMembrurolJudetcod() 
  {
    return this.memMembrurolJudetcod;
  }

  public void setMemMembrurolJudetcod(String memMembrurolJudetcod) 
  {
    this.memMembrurolJudetcod = memMembrurolJudetcod;
  }


  public Long getMemMembrurolUatid() 
  {
    return this.memMembrurolUatid;
  }

  public void setMemMembrurolUatid(Long memMembrurolUatid) 
  {
    this.memMembrurolUatid = memMembrurolUatid;
  }

  public Long getMemMembrurolUatcod() 
  {
    return this.memMembrurolUatcod;
  }

  public void setMemMembrurolUatcod(Long memMembrurolUatcod) 
  {
    this.memMembrurolUatcod = memMembrurolUatcod;
  }



  public Long getMemMembrurolLocalitateid() 
  {
    return this.memMembrurolLocalitateid;
  }

  public void setMemMembrurolLocalitateid(Long memMembrurolLocalitateid) 
  {
    this.memMembrurolLocalitateid = memMembrurolLocalitateid;
  }

  public Long getMemMembrurolLocalitatecod() 
  {
    return this.memMembrurolLocalitatecod;
  }

  public void setMemMembrurolLocalitatecod(Long memMembrurolLocalitatecod) 
  {
    this.memMembrurolLocalitatecod = memMembrurolLocalitatecod;
  }



  public Long getMemMembrurolZonajudetid() 
  {
    return this.memMembrurolZonajudetid;
  }

  public void setMemMembrurolZonajudetid(Long memMembrurolZonajudetid) 
  {
    this.memMembrurolZonajudetid = memMembrurolZonajudetid;
  }

  public String getMemMembrurolZonajudetcod() 
  {
    return this.memMembrurolZonajudetcod;
  }

  public void setMemMembrurolZonajudetcod(String memMembrurolZonajudetcod) 
  {
    this.memMembrurolZonajudetcod = memMembrurolZonajudetcod;
  }


  public Long getMemMembrurolZonauatid() 
  {
    return this.memMembrurolZonauatid;
  }

  public void setMemMembrurolZonauatid(Long memMembrurolZonauatid) 
  {
    this.memMembrurolZonauatid = memMembrurolZonauatid;
  }

  public String getMemMembrurolZonauatcod() 
  {
    return this.memMembrurolZonauatcod;
  }

  public void setMemMembrurolZonauatcod(String memMembrurolZonauatcod) 
  {
    this.memMembrurolZonauatcod = memMembrurolZonauatcod;
  }


  public Long getMemMembrurolZonalocalitateid() 
  {
    return this.memMembrurolZonalocalitateid;
  }

  public void setMemMembrurolZonalocalitateid(Long memMembrurolZonalocalitateid) 
  {
    this.memMembrurolZonalocalitateid = memMembrurolZonalocalitateid;
  }

  public String getMemMembrurolZonalocalitatecod() 
  {
    return this.memMembrurolZonalocalitatecod;
  }

  public void setMemMembrurolZonalocalitatecod(String memMembrurolZonalocalitatecod) 
  {
    this.memMembrurolZonalocalitatecod = memMembrurolZonalocalitatecod;
  }



  public Long getMemMembrurolSectievotareid() 
  {
    return this.memMembrurolSectievotareid;
  }

  public void setMemMembrurolSectievotareid(Long memMembrurolSectievotareid) 
  {
    this.memMembrurolSectievotareid = memMembrurolSectievotareid;
  }
  
  public Long getMemMembrurolSectievotarenr() 
  {
    return this.memMembrurolSectievotarenr;
  }

  public void setMemMembrurolSectievotarenr(Long memMembrurolSectievotarenr) 
  {
    this.memMembrurolSectievotarenr = memMembrurolSectievotarenr;
  }


  
  public Long getMemMembrurolCodpostalid() 
  {
    return this.memMembrurolCodpostalid;
  }

  public void setMemMembrurolCodpostalid(Long memMembrurolCodpostalid) 
  {
    this.memMembrurolCodpostalid = memMembrurolCodpostalid;
  }


  public String getMemMembrurolCodpostalcod() 
  {
    return this.memMembrurolCodpostalcod;
  }

  public void setMemMembrurolCodpostalcod(String memMembrurolCodpostalcod) 
  {
    this.memMembrurolCodpostalcod = memMembrurolCodpostalcod;
  }



  public String getMemMembrurolInvitatieyn() 
  {
    return this.memMembrurolInvitatieyn;
  }

  public void setMemMembrurolInvitatieyn(String memMembrurolInvitatieyn) 
  {
    this.memMembrurolInvitatieyn = memMembrurolInvitatieyn;
  }


  public String getMemMembrurolAcceptareyn() 
  {
    return this.memMembrurolAcceptareyn;
  }

  public void setMemMembrurolAcceptareyn(String memMembrurolAcceptareyn) 
  {
    this.memMembrurolAcceptareyn = memMembrurolAcceptareyn;
  }


  public String getMemMembrurolEliberareyn() 
  {
    return this.memMembrurolEliberareyn;
  }

  public void setMemMembrurolEliberareyn(String memMembrurolEliberareyn) 
  {
    this.memMembrurolEliberareyn = memMembrurolEliberareyn;
  }


  public String getMemMembrurolPlecareyn() 
  {
    return this.memMembrurolPlecareyn;
  }

  public void setMemMembrurolPlecareyn(String memMembrurolPlecareyn) 
  {
    this.memMembrurolPlecareyn = memMembrurolPlecareyn;
  }





  public String getMemMembrurolActivyn() 
  {
    return this.memMembrurolActivyn;
  }

  public void setMemMembrurolActivyn(String memMembrurolActivyn) 
  {
    this.memMembrurolActivyn = memMembrurolActivyn;
  }


  public String getMemMembrurolStartdt() 
  {
    return this.memMembrurolStartdt;
  }

  public void setMemMembrurolStartdt(String memMembrurolStartdt) 
  {
    this.memMembrurolStartdt = memMembrurolStartdt;
  }


  public String getMemMembrurolEnddt() 
  {
    return this.memMembrurolEnddt;
  }

  public void setMemMembrurolEnddt(String memMembrurolEnddt) 
  {
    this.memMembrurolEnddt = memMembrurolEnddt;
  }



}

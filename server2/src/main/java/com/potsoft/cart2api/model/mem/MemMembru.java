package com.potsoft.cart2api.model.mem;

//import com.potsoft.cart2api.model.aut.userrol.MemMembruRol;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "mem_membru")
public class MemMembru {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mem_membru_id")
  private Long memMembruId;

  @Size(max = 16)
  @Column(name = "mem_membru_codunic")
  private String memMembruCodunic;


  @NotNull
  @Column(name = "mem_membru_userid")
  private Long memMembruUserid;
  
  @NotNull
  @Size(max = 20)
  @Column(name = "mem_membru_usernume")
  private String memMembruUsernume;


  @NotNull
  @Column(name = "mem_membru_tipid")
  private Long memMembruTipid;

  @Size(max = 10)
  @Column(name = "mem_membru_tipcod")
  private String memMembruTipcod;


  @Column(name = "mem_membru_grupid")
  private Long memMembruGrupid;

  @Size(max = 20)
  @Column(name = "mem_membru_grupnume")
  private String memMembruGrupnume;

  @Size(max = 16)
  @Column(name = "mem_membru_grupcodunic")
  private String memMembruGrupcodunic;
 
  

  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_membru_adrrezidenta_yn")
  private String memMembruAdrrezidentayn;

  
  @Column(name = "mem_membru_zonataraid")
  private Long memMembruZonataraid;
  
  @Size(max = 2)
  @Column(name = "mem_membru_zonataracod")
  private String memMembruZonataracod;
  
  @Column(name = "mem_membru_judetid")
  private Long memMembruJudetid;
  
  @Size(max = 2)
  @Column(name = "mem_membru_judetcod")
  private String memMembruJudetcod;
  
  @Column(name = "mem_membru_uatid")
  private Long memMembruUatid;
  
  @Column(name = "mem_membru_uatcod")
  private Long memMembruUatcod;

  @Column(name = "mem_membru_localitateid")
  private Long memMembruLocalitateid;
  
  @Column(name = "mem_membru_localitatecod")
  private Long memMembruLocalitatecod;
  
  
  @Column(name = "mem_membru_zonajudetid")
  private Long memMembruZonajudetid;
  
  @Size(max = 2)
  @Column(name = "mem_membru_zonajudetcod")
  private String memMembruZonajudetcod;

  @Column(name = "mem_membru_zonauatid")
  private Long memMembruZonauatid;
  
  @Size(max = 9)
  @Column(name = "mem_membru_zonauatcod")
  private String memMembruZonauatcod;
  
  @Column(name = "mem_membru_zonalocalitateid")
  private Long memMembruZonalocalitateid;
  
  @Size(max = 9)
  @Column(name = "mem_membru_zonalocalitatecod")
  private String memMembruZonalocalitatecod;

  @Column(name = "mem_membru_sectievotareid")
  private Long memMembruSectievotareid;
  
  @Column(name = "mem_membru_sectievotarenr")
  private Long memMembruSectievotarenr;

  @Column(name = "mem_membru_codpostalid")
  private Long memMembruCodpostalid;
 
  @Size(max = 16)
  @Column(name = "mem_membru_codpostalcod")
  private String memMembruCodpostalcod;

 
  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_membru_activ_yn")
  private String memMembruActivyn;

  @Size(max = 20)
  @Column(name = "mem_membru_startdt", insertable = false, updatable = false)
  private String memMembruStartdt;


  @Size(max = 20)
  @Column(name = "mem_membru_enddt")
  private String memMembruEnddt;

  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_membru_complci_yn")
  private String memMembruComplciyn;

  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_membru_compladr_yn")
  private String memMembruCompladryn;

  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_membru_platitcotiz_yn")
  private String memMembruPlatitcotizyn;

  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_membru_complskills_yn")
  private String memMembruComplSkillsyn;


  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_membru_suspended_yn")
  private String memMembruSuspendedyn;



	public MemMembru() 
  {
	}

	public MemMembru( Long memid, String memCodunic,
                    Long memUserid, String memUsernume, 
                    Long memTipid, String memTipcod, 
                    Long memGrupid, String memGrupnume, String memGrupcodunic,
                    String memAdrrezidentayn,
                    Long memZonataraid, String memZonataracod, Long memJudetid, String memJudetcod, 
                    Long memUatid, Long memUatcod, 
                    Long memLocalitateid, Long memLocalitatecod, 
                    Long memZonajudetid, String memZonajudetcod, 
                    Long memZonauatid, String memZonauatcod, 
                    Long memZonalocalitateid, String memZonalocalitatecod,  
                    Long memSectievotareid, Long memSectievotarenr, 
                    Long memCodpostalid, String memCodpostalcod,
                    String memActivyn, String memStartdt,  String memEnddt,
                    String memComplciyn, String memCompladryn,  String memPlatitcotizyn,
                    String memComplSkillsyn, String memSuspendedyn
                  ) 
  {
    this.memMembruId                = memid;
    this.memMembruCodunic           = memCodunic;

    this.memMembruUserid            = memUserid;
    this.memMembruUsernume          = memUsernume;

    this.memMembruTipid             = memTipid;
    this.memMembruTipcod            = memTipcod;

    this.memMembruGrupid            = memGrupid;
    this.memMembruGrupnume          = memGrupnume;
    this.memMembruGrupcodunic       = memGrupcodunic;

    this.memMembruAdrrezidentayn    = memAdrrezidentayn;

    this.memMembruZonataraid        = memZonataraid;
    this.memMembruZonataracod       = memZonataracod;
    this.memMembruJudetid           = memJudetid;
    this.memMembruJudetcod          = memJudetcod;
    this.memMembruUatid             = memUatid;
    this.memMembruUatcod            = memUatcod;
    this.memMembruLocalitateid      = memLocalitateid;
    this.memMembruLocalitatecod     = memLocalitatecod;
    this.memMembruZonajudetid       = memZonajudetid;    
    this.memMembruZonajudetcod      = memZonajudetcod;  
    this.memMembruZonauatid         = memZonauatid;    
    this.memMembruZonauatcod        = memZonauatcod;  
    this.memMembruZonalocalitateid  = memZonalocalitateid;    
    this.memMembruZonalocalitatecod = memZonalocalitatecod;  
    this.memMembruSectievotareid    = memSectievotareid;    
    this.memMembruSectievotarenr    = memSectievotarenr;
    this.memMembruCodpostalid       = memCodpostalid;
    this.memMembruCodpostalcod      = memCodpostalcod;
    
    this.memMembruActivyn           = memActivyn;
    this.memMembruStartdt           = memStartdt;
    this.memMembruEnddt             = memEnddt;

    this.memMembruComplciyn         = memComplciyn;
    this.memMembruCompladryn        = memCompladryn;
    this.memMembruPlatitcotizyn     = memPlatitcotizyn;
    this.memMembruComplSkillsyn     = memComplSkillsyn;
    this.memMembruSuspendedyn       = memSuspendedyn;
  }


  public Long getMemMembruId() 
  {
    return this.memMembruId;
  }

  public void setMemMembruId(Long memMembruId) 
  {
    this.memMembruId = memMembruId;
  }

  public String getMemMembruCodunic() 
  {
    return this.memMembruCodunic;
  }

  public void setMemMembruCodunic(String memMembruCodunic) 
  {
    this.memMembruCodunic = memMembruCodunic;
  }



  public Long getMemMembruUserid() 
  {
    return this.memMembruUserid;
  }

  public void setMemMembruUserid(Long memMembruUserid) 
  {
    this.memMembruUserid = memMembruUserid;
  }


  public String getMemMembruUsernume() 
  {
    return this.memMembruUsernume;
  }

  public void setMemMembruUsernume(String memMembruUsernume) 
  {
    this.memMembruUsernume = memMembruUsernume;
  }



  public Long getMemMembruTipid() 
  {
    return this.memMembruTipid;
  }

  public void setMemMembruTipid(Long memMembruTipid) 
  {
    this.memMembruTipid = memMembruTipid;
  }
  

  public String getMemMembruTipCod() 
  {
    return this.memMembruTipcod;
  }

  public void setMemMembruTipcod(String memMembruTipcod) 
  {
    this.memMembruTipcod = memMembruTipcod;
  }



  public Long getMemMembruGrupid() 
  {
    return this.memMembruGrupid;
  }

  public void setMemMembruGrupid(Long memMembruGrupid) 
  {
    this.memMembruGrupid = memMembruGrupid;
  }
  

  public String getMemMembruGrupnume() 
  {
    return this.memMembruGrupnume;
  }

  public void setMemMembruGrupnume(String memMembruGrupnume) 
  {
    this.memMembruGrupnume = memMembruGrupnume;
  }


  public String getMemMembruGrupcodunic() 
  {
    return this.memMembruGrupcodunic;
  }

  public void setMemMembruGrupcodunic(String memMembruGrupcodunic) 
  {
    this.memMembruGrupcodunic = memMembruGrupcodunic;
  }



  public String getMemMembruAdrrezidentayn() 
  {
    return this.memMembruAdrrezidentayn;
  }

  public void setMemMembruAdrrezidentayn(String memMembruAdrrezidentayn) 
  {
    this.memMembruAdrrezidentayn = memMembruAdrrezidentayn;
  }
 


  public Long getMemMembruZonataraid() 
  {
    return this.memMembruZonataraid;
  }

  public void setMemMembruZonaTaraid(Long memMembruZonataraid) 
  {
    this.memMembruZonataraid = memMembruZonataraid;
  }

  public String getMemMembruZonataracod() 
  {
    return this.memMembruZonataracod;
  }

  public void setMemMembruZonaTaracod(String memMembruZonataracod) 
  {
    this.memMembruZonataracod = memMembruZonataracod;
  }




  public Long getMemMembruJudetid() 
  {
    return this.memMembruJudetid;
  }

  public void setMemMembruJudetid(Long memMembruJudetid) 
  {
    this.memMembruJudetid = memMembruJudetid;
  }

  public String getMemMembruJudetcod() 
  {
    return this.memMembruJudetcod;
  }

  public void setMemMembruJudetcod(String memMembruJudetcod) 
  {
    this.memMembruJudetcod = memMembruJudetcod;
  }


  public Long getMemMembruUatid() 
  {
    return this.memMembruUatid;
  }

  public void setMemMembruUatid(Long memMembruUatid) 
  {
    this.memMembruUatid = memMembruUatid;
  }

  public Long getMemMembruUatcod() 
  {
    return this.memMembruUatcod;
  }

  public void setMemMembruUatcod(Long memMembruUatcod) 
  {
    this.memMembruUatcod = memMembruUatcod;
  }



  public Long getMemMembruLocalitateid() 
  {
    return this.memMembruLocalitateid;
  }

  public void setMemMembruLocalitateid(Long memMembruLocalitateid) 
  {
    this.memMembruLocalitateid = memMembruLocalitateid;
  }

  public Long getMemMembruLocalitatecod() 
  {
    return this.memMembruLocalitatecod;
  }

  public void setMemMembruLocalitatecod(Long memMembruLocalitatecod) 
  {
    this.memMembruLocalitatecod = memMembruLocalitatecod;
  }



  public Long getMemMembruZonajudetid() 
  {
    return this.memMembruZonajudetid;
  }

  public void setMemMembruZonajudetid(Long memMembruZonajudetid) 
  {
    this.memMembruZonajudetid = memMembruZonajudetid;
  }

  public String getMemMembruZonajudetcod() 
  {
    return this.memMembruZonajudetcod;
  }

  public void setMemMembruZonajudetcod(String memMembruZonajudetcod) 
  {
    this.memMembruZonajudetcod = memMembruZonajudetcod;
  }


  public Long getMemMembruZonauatid() 
  {
    return this.memMembruZonauatid;
  }

  public void setMemMembruZonauatid(Long memMembruZonauatid) 
  {
    this.memMembruZonauatid = memMembruZonauatid;
  }

  public String getMemMembruZonauatcod() 
  {
    return this.memMembruZonauatcod;
  }

  public void setMemMembruZonauatcod(String memMembruZonauatcod) 
  {
    this.memMembruZonauatcod = memMembruZonauatcod;
  }



  public Long getMemMembruZonalocalitateid() 
  {
    return this.memMembruZonalocalitateid;
  }

  public void setMemMembruZonalocalitateid(Long memMembruZonalocalitateid) 
  {
    this.memMembruZonalocalitateid = memMembruZonalocalitateid;
  }

  public String getMemMembruZonalocalitatecod() 
  {
    return this.memMembruZonalocalitatecod;
  }

  public void setMemMembruZonalocalitatecod(String memMembruZonalocalitatecod) 
  {
    this.memMembruZonalocalitatecod = memMembruZonalocalitatecod;
  }



  public Long getMemMembruSectievotareid() 
  {
    return this.memMembruSectievotareid;
  }

  public void setMemMembruSectievotareid(Long memMembruSectievotareid) 
  {
    this.memMembruSectievotareid = memMembruSectievotareid;
  }
  
  public Long getMemMembruSectievotarenr() 
  {
    return this.memMembruSectievotarenr;
  }

  public void setMemMembruSectievotarenr(Long memMembruSectievotarenr) 
  {
    this.memMembruSectievotarenr = memMembruSectievotarenr;
  }

  


  public Long getMemMembruCodpostalid() 
  {
    return this.memMembruCodpostalid;
  }

  public void setMemMembruCodpostalid(Long memMembruCodpostalid) 
  {
    this.memMembruCodpostalid = memMembruCodpostalid;
  }


  public String getMemMembruCodpostalcod() 
  {
    return this.memMembruCodpostalcod;
  }

  public void setMemMembruCodpostalcod(String memMembruCodpostalcod) 
  {
    this.memMembruCodpostalcod = memMembruCodpostalcod;
  }





  public String getMemMembruActivyn() 
  {
    return this.memMembruActivyn;
  }

  public void setMemMembruActivyn(String memMembruActivyn) 
  {
    this.memMembruActivyn = memMembruActivyn;
  }


  public String getMemMembruStartdt() 
  {
    return this.memMembruStartdt;
  }

  public void setMemMebruStartdt(String memMembruStartdt) 
  {
    this.memMembruStartdt = memMembruStartdt;
  }


  public String getMemMembruEnddt() 
  {
    return this.memMembruEnddt;
  }

  public void setMemMembruEnddt(String memMembruEnddt) 
  {
    this.memMembruEnddt = memMembruEnddt;
  }

 


  public String getMemMembruComplciyn() 
  {
    return this.memMembruComplciyn;
  }

  public void setmemMembruComplciyn(String memMembruComplciyn) 
  {
    this.memMembruComplciyn = memMembruComplciyn;
  }


  public String getMemMembruCompladryn() 
  {
    return this.memMembruCompladryn;
  }

  public void setMemMembruCompladryn(String memMembruCompladryn) 
  {
    this.memMembruCompladryn = memMembruCompladryn;
  }




  public String getMemMembruPlatitcotizyn() 
  {
    return this.memMembruPlatitcotizyn;
  }

  public void setMemMembruPlatitcotizyn(String memMembruPlatitcotizyn) 
  {
    this.memMembruPlatitcotizyn = memMembruPlatitcotizyn;
  }




  public String memMembruComplSkillsyn() 
  {
    return this.memMembruComplSkillsyn;
  }

  public void setMemMembruComplSkillsyn(String memMembruComplSkillsyn) 
  {
    this.memMembruComplSkillsyn = memMembruComplSkillsyn;
  }



  public String getMemMembruSuspendedyn() 
  {
    return this.memMembruSuspendedyn;
  }

  public void setMemMembruSuspendedyn(String memMembruSuspendedyn) 
  {
    this.memMembruSuspendedyn = memMembruSuspendedyn;
  }

}

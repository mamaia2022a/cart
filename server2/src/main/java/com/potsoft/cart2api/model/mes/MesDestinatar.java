package com.potsoft.cart2api.model.mes;

//import com.potsoft.cart2api.model.aut.userrol.MesDestinatarRol;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "mes_destinatar")
public class MesDestinatar {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mes_destinatar_id")
  private Long mesDestinatarId;


  @NotNull
  @Column(name = "mes_destinatar_userid")
  private Long mesDestinatarUserid;
  
  @NotNull
  @Size(max = 20)
  @Column(name = "mes_destinatar_usernume")
  private String mesDestinatarUsernume;


  @NotNull
  @Column(name = "mes_destinatar_rolid")
  private Long mesDestinatarRolid;

  @Size(max = 10)
  @Column(name = "mes_destinatar_rolcod")
  private String mesDestinatarRolcod;



  @NotBlank
  @Size(max = 1)
  @Column(name = "mes_destinatar_adrrezidenta_yn")
  private String mesDestinatarAdrrezidentayn;

  
  @Column(name = "mes_destinatar_zonataraid")
  private Long mesDestinatarZonataraid;
  
  @Size(max = 2)
  @Column(name = "mes_destinatar_zonataracod")
  private String mesDestinatarZonataracod;
  
  @Column(name = "mes_destinatar_judetid")
  private Long mesDestinatarJudetid;
  
  @Size(max = 2)
  @Column(name = "mes_destinatar_judetcod")
  private String mesDestinatarJudetcod;
  
  @Column(name = "mes_destinatar_uatid")
  private Long mesDestinatarUatid;
  
  @Column(name = "mes_destinatar_uatcod")
  private Long mesDestinatarUatcod;

  @Column(name = "mes_destinatar_localitateid")
  private Long mesDestinatarLocalitateid;
  
  @Column(name = "mes_destinatar_localitatecod")
  private Long mesDestinatarLocalitatecod;
  
  
  @Column(name = "mes_destinatar_zonajudetid")
  private Long mesDestinatarZonajudetid;
  
  @Size(max = 2)
  @Column(name = "mes_destinatar_zonajudetcod")
  private String mesDestinatarZonajudetcod;

  @Column(name = "mes_destinatar_zonauatid")
  private Long mesDestinatarZonauatid;
  
  @Size(max = 9)
  @Column(name = "mes_destinatar_zonauatcod")
  private String mesDestinatarZonauatcod;
  
  @Column(name = "mes_destinatar_zonalocalitateid")
  private Long mesDestinatarZonalocalitateid;
  
  @Size(max = 9)
  @Column(name = "mes_destinatar_zonalocalitatecod")
  private String mesDestinatarZonalocalitatecod;

  @Column(name = "mes_destinatar_sectievotareid")
  private Long mesDestinatarSectievotareid;
  
  @Column(name = "mes_destinatar_sectievotarenr")
  private Long mesDestinatarSectievotarenr;

  @Column(name = "mes_destinatar_codpostalid")
  private Long mesDestinatarCodpostalid;
 
  @Size(max = 16)
  @Column(name = "mes_destinatar_codpostalcod")
  private String mesDestinatarCodpostalcod;

 
  @NotBlank
  @Size(max = 1)
  @Column(name = "mes_destinatar_activ_yn")
  private String mesDestinatarActivyn;

  @Size(max = 20)
  @Column(name = "mes_destinatar_startdt", insertable = false, updatable = false)
  private String mesDestinatarStartdt;


  @Size(max = 20)
  @Column(name = "mes_destinatar_enddt")
  private String mesDestinatarEnddt;


	public MesDestinatar() 
  {
	}

	public MesDestinatar( Long mesDestinatarid, 
                    Long mesDestinatarUserid, String mesDestinatarUsernume, 
                    Long mesDestinatarRolid, String mesDestinatarRolcod, 
                    String mesDestinatarAdrrezidentayn,
                    Long mesDestinatarZonataraid, String mesDestinatarZonataracod, 
                    Long mesDestinatarJudetid, String mesDestinatarJudetcod, 
                    Long mesDestinatarUatid, Long mesDestinatarUatcod, 
                    Long mesDestinatarLocalitateid, Long mesDestinatarLocalitatecod, 
                    Long mesDestinatarZonajudetid, String mesDestinatarZonajudetcod, 
                    Long mesDestinatarZonauatid, String mesDestinatarZonauatcod, 
                    Long mesDestinatarZonalocalitateid, String mesDestinatarZonalocalitatecod,  
                    Long mesDestinatarSectievotareid, Long mesDestinatarSectievotarenr, 
                    Long mesDestinatarCodpostalid, String mesDestinatarCodpostalcod,
                    String mesDestinatarActivyn, String mesDestinatarStartdt,  String mesDestinatarEnddt
                  ) 
  {
    this.mesDestinatarId                = mesDestinatarid;

    this.mesDestinatarUserid            = mesDestinatarUserid;
    this.mesDestinatarUsernume          = mesDestinatarUsernume;

    this.mesDestinatarRolid             = mesDestinatarRolid;
    this.mesDestinatarRolcod            = mesDestinatarRolcod;

    this.mesDestinatarAdrrezidentayn    = mesDestinatarAdrrezidentayn;

    this.mesDestinatarZonataraid        = mesDestinatarZonataraid;
    this.mesDestinatarZonataracod       = mesDestinatarZonataracod;
    this.mesDestinatarJudetid           = mesDestinatarJudetid;
    this.mesDestinatarJudetcod          = mesDestinatarJudetcod;
    this.mesDestinatarUatid             = mesDestinatarUatid;
    this.mesDestinatarUatcod            = mesDestinatarUatcod;
    this.mesDestinatarLocalitateid      = mesDestinatarLocalitateid;
    this.mesDestinatarLocalitatecod     = mesDestinatarLocalitatecod;
    this.mesDestinatarZonajudetid       = mesDestinatarZonajudetid;    
    this.mesDestinatarZonajudetcod      = mesDestinatarZonajudetcod;  
    this.mesDestinatarZonauatid         = mesDestinatarZonauatid;    
    this.mesDestinatarZonauatcod        = mesDestinatarZonauatcod;  
    this.mesDestinatarZonalocalitateid  = mesDestinatarZonalocalitateid;    
    this.mesDestinatarZonalocalitatecod = mesDestinatarZonalocalitatecod;  
    this.mesDestinatarSectievotareid    = mesDestinatarSectievotareid;    
    this.mesDestinatarSectievotarenr    = mesDestinatarSectievotarenr;
    this.mesDestinatarCodpostalid       = mesDestinatarCodpostalid;
    this.mesDestinatarCodpostalcod      = mesDestinatarCodpostalcod;
    
    this.mesDestinatarActivyn           = mesDestinatarActivyn;
    this.mesDestinatarStartdt           = mesDestinatarStartdt;
    this.mesDestinatarEnddt             = mesDestinatarEnddt;

  }


  public Long getMesDestinatarId() 
  {
    return this.mesDestinatarId;
  }

  public void setMesDestinatarId(Long mesDestinatarId) 
  {
    this.mesDestinatarId = mesDestinatarId;
  }



  public Long getMesDestinatarUserid() 
  {
    return this.mesDestinatarUserid;
  }

  public void setMesDestinatarUserid(Long mesDestinatarUserid) 
  {
    this.mesDestinatarUserid = mesDestinatarUserid;
  }


  public String getMesDestinatarUsernume() 
  {
    return this.mesDestinatarUsernume;
  }

  public void setMesDestinatarUsernume(String mesDestinatarUsernume) 
  {
    this.mesDestinatarUsernume = mesDestinatarUsernume;
  }



  public Long getMesDestinatarRolid() 
  {
    return this.mesDestinatarRolid;
  }

  public void setMesDestinatarRolid(Long mesDestinatarRolid) 
  {
    this.mesDestinatarRolid = mesDestinatarRolid;
  }
  

  public String getMesDestinatarRolcod() 
  {
    return this.mesDestinatarRolcod;
  }

  public void setMesDestinatarRolcod(String mesDestinatarRolcod) 
  {
    this.mesDestinatarRolcod = mesDestinatarRolcod;
  }




  public String getMesDestinatarAdrrezidentayn() 
  {
    return this.mesDestinatarAdrrezidentayn;
  }

  public void setMesDestinatarAdrrezidentayn(String mesDestinatarAdrrezidentayn) 
  {
    this.mesDestinatarAdrrezidentayn = mesDestinatarAdrrezidentayn;
  }
 


  public Long getMesDestinatarZonataraid() 
  {
    return this.mesDestinatarZonataraid;
  }

  public void setMesDestinatarZonaTaraid(Long mesDestinatarZonataraid) 
  {
    this.mesDestinatarZonataraid = mesDestinatarZonataraid;
  }

  public String getMesDestinatarZonataracod() 
  {
    return this.mesDestinatarZonataracod;
  }

  public void setMesDestinatarZonaTaracod(String mesDestinatarZonataracod) 
  {
    this.mesDestinatarZonataracod = mesDestinatarZonataracod;
  }




  public Long getMesDestinatarJudetid() 
  {
    return this.mesDestinatarJudetid;
  }

  public void setMesDestinatarJudetid(Long mesDestinatarJudetid) 
  {
    this.mesDestinatarJudetid = mesDestinatarJudetid;
  }

  public String getMesDestinatarJudetcod() 
  {
    return this.mesDestinatarJudetcod;
  }

  public void setMesDestinatarJudetcod(String mesDestinatarJudetcod) 
  {
    this.mesDestinatarJudetcod = mesDestinatarJudetcod;
  }


  public Long getMesDestinatarUatid() 
  {
    return this.mesDestinatarUatid;
  }

  public void setMesDestinatarUatid(Long mesDestinatarUatid) 
  {
    this.mesDestinatarUatid = mesDestinatarUatid;
  }

  public Long getMesDestinatarUatcod() 
  {
    return this.mesDestinatarUatcod;
  }

  public void setMesDestinatarUatcod(Long mesDestinatarUatcod) 
  {
    this.mesDestinatarUatcod = mesDestinatarUatcod;
  }



  public Long getMesDestinatarLocalitateid() 
  {
    return this.mesDestinatarLocalitateid;
  }

  public void setMesDestinatarLocalitateid(Long mesDestinatarLocalitateid) 
  {
    this.mesDestinatarLocalitateid = mesDestinatarLocalitateid;
  }

  public Long getMesDestinatarLocalitatecod() 
  {
    return this.mesDestinatarLocalitatecod;
  }

  public void setMesDestinatarLocalitatecod(Long mesDestinatarLocalitatecod) 
  {
    this.mesDestinatarLocalitatecod = mesDestinatarLocalitatecod;
  }



  public Long getMesDestinatarZonajudetid() 
  {
    return this.mesDestinatarZonajudetid;
  }

  public void setMesDestinatarZonajudetid(Long mesDestinatarZonajudetid) 
  {
    this.mesDestinatarZonajudetid = mesDestinatarZonajudetid;
  }

  public String getMesDestinatarZonajudetcod() 
  {
    return this.mesDestinatarZonajudetcod;
  }

  public void setMesDestinatarZonajudetcod(String mesDestinatarZonajudetcod) 
  {
    this.mesDestinatarZonajudetcod = mesDestinatarZonajudetcod;
  }


  public Long getMesDestinatarZonauatid() 
  {
    return this.mesDestinatarZonauatid;
  }

  public void setMesDestinatarZonauatid(Long mesDestinatarZonauatid) 
  {
    this.mesDestinatarZonauatid = mesDestinatarZonauatid;
  }

  public String getMesDestinatarZonauatcod() 
  {
    return this.mesDestinatarZonauatcod;
  }

  public void setMesDestinatarZonauatcod(String mesDestinatarZonauatcod) 
  {
    this.mesDestinatarZonauatcod = mesDestinatarZonauatcod;
  }



  public Long getMesDestinatarZonalocalitateid() 
  {
    return this.mesDestinatarZonalocalitateid;
  }

  public void setMesDestinatarZonalocalitateid(Long mesDestinatarZonalocalitateid) 
  {
    this.mesDestinatarZonalocalitateid = mesDestinatarZonalocalitateid;
  }

  public String getMesDestinatarZonalocalitatecod() 
  {
    return this.mesDestinatarZonalocalitatecod;
  }

  public void setMesDestinatarZonalocalitatecod(String mesDestinatarZonalocalitatecod) 
  {
    this.mesDestinatarZonalocalitatecod = mesDestinatarZonalocalitatecod;
  }



  public Long getMesDestinatarSectievotareid() 
  {
    return this.mesDestinatarSectievotareid;
  }

  public void setMesDestinatarSectievotareid(Long mesDestinatarSectievotareid) 
  {
    this.mesDestinatarSectievotareid = mesDestinatarSectievotareid;
  }
  
  public Long getMesDestinatarSectievotarenr() 
  {
    return this.mesDestinatarSectievotarenr;
  }

  public void setMesDestinatarSectievotarenr(Long mesDestinatarSectievotarenr) 
  {
    this.mesDestinatarSectievotarenr = mesDestinatarSectievotarenr;
  }

  


  public Long getMesDestinatarCodpostalid() 
  {
    return this.mesDestinatarCodpostalid;
  }

  public void setMesDestinatarCodpostalid(Long mesDestinatarCodpostalid) 
  {
    this.mesDestinatarCodpostalid = mesDestinatarCodpostalid;
  }


  public String getMesDestinatarCodpostalcod() 
  {
    return this.mesDestinatarCodpostalcod;
  }

  public void setMesDestinatarCodpostalcod(String mesDestinatarCodpostalcod) 
  {
    this.mesDestinatarCodpostalcod = mesDestinatarCodpostalcod;
  }





  public String getMesDestinatarActivyn() 
  {
    return this.mesDestinatarActivyn;
  }

  public void setMesDestinatarActivyn(String mesDestinatarActivyn) 
  {
    this.mesDestinatarActivyn = mesDestinatarActivyn;
  }


  public String getMesDestinatarStartdt() 
  {
    return this.mesDestinatarStartdt;
  }

  public void setMemDestinatarStartdt(String mesDestinatarStartdt) 
  {
    this.mesDestinatarStartdt = mesDestinatarStartdt;
  }


  public String getMesDestinatarEnddt() 
  {
    return this.mesDestinatarEnddt;
  }

  public void setMesDestinatarEnddt(String mesDestinatarEnddt) 
  {
    this.mesDestinatarEnddt = mesDestinatarEnddt;
  }

 

}

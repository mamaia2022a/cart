package com.potsoft.cart2api.model.gen;

//import com.potsoft.cart2api.model.aut.userrol.GenZonageograficaRol;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "gen_zonageografica")
public class GenZonaGeografica{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "gen_zonageografica_id")
  private Long genZonageograficaId;
 
  
  @NotNull
  @Column(name = "gen_zonageografica_acopgeoid")
  private Long genZonageograficaAcopgeoid;

  @Size(max = 10)
  @Column(name = "gen_zonageografica_acopgeocod")
  private String genZonageograficaAcopgeocod;
 
  
  
  @Column(name = "gen_zonageografica_zonataraid")
  private Long genZonageograficaZonataraid;
  
  @Size(max = 2)
  @Column(name = "gen_zonageografica_zonataracod")
  private String genZonageograficaZonataracod;
  
  @Column(name = "gen_zonageografica_judetid")
  private Long genZonageograficaJudetid;
  
  @Size(max = 2)
  @Column(name = "gen_zonageografica_judetcod")
  private String genZonageograficaJudetcod;
  
  @Column(name = "gen_zonageografica_uatid")
  private Long genZonageograficaUatid;
  
  @Column(name = "gen_zonageografica_uatcod")
  private Long genZonageograficaUatcod;

  @Column(name = "gen_zonageografica_localitateid")
  private Long genZonageograficaLocalitateid;
  
  @Column(name = "gen_zonageografica_localitatecod")
  private Long genZonageograficaLocalitatecod;

  @Column(name = "gen_zonageografica_zonajudetid")
  private Long genZonageograficaZonajudetid;
  
  @Size(max = 2)
  @Column(name = "gen_zonageografica_zonajudetcod")
  private String genZonageograficaZonajudetcod;

  @Column(name = "gen_zonageografica_zonauatid")
  private Long genZonageograficaZonauatid;
  
  @Size(max = 9)
  @Column(name = "gen_zonageografica_zonauatcod")
  private String genZonageograficaZonauatcod;

  @Column(name = "gen_zonageografica_zonalocalitateid")
  private Long genZonageograficaZonalocalitateid;
  
  @Size(max = 9)
  @Column(name = "gen_zonageografica_zonalocalitatecod")
  private String genZonageograficaZonalocalitatecod;

  @Column(name = "gen_zonageografica_sectievotareid")
  private Long genZonageograficaSectievotareid;
  
  @Column(name = "gen_zonageografica_sectievotarenr")
  private Long genZonageograficaSectievotarenr;

  @Column(name = "gen_zonageografica_codpostalid")
  private Long genZonageograficaCodpostalid;
 
  @Size(max = 16)
  @Column(name = "gen_zonageografica_codpostalcod")
  private String genZonageograficaCodpostalcod;
 

	public GenZonaGeografica() 
  {
	}

	public GenZonaGeografica( Long genZonaGeograficaId, 
                       Long genZonaGeograficaAcopgeoid, String genZonaGeograficaAcopgeocod, 
                       Long genZonaGeograficaZonataraid, String genZonaGeograficaZonataracod, 
                       Long genZonaGeograficaJudetid, String genZonaGeograficaJudetcod, 
                       Long genZonaGeograficaUatid, Long genZonaGeograficaUatcod, 
                       Long genZonaGeograficaLocalitateid, Long genZonaGeograficaLocalitatecod, 
                       Long genZonaGeograficaZonajudetid, String genZonaGeograficaZonajudetcod, 
                       Long genZonaGeograficaZonauatid, String genZonaGeograficaZonauatcod, 
                       Long genZonaGeograficaZonalocalitateid, String genZonaGeograficaZonalocalitatecod,  
                       Long genZonaGeograficaSectievotareid, Long genZonaGeograficaSectievotarenr, 
                       Long genZonaGeograficaCodpostalid, String genZonaGeograficaCodpostalcod
                     ) 
  {
    this.genZonageograficaId                = genZonaGeograficaId;

    this.genZonageograficaAcopgeoid          = genZonaGeograficaAcopgeoid;
    this.genZonageograficaAcopgeocod         = genZonaGeograficaAcopgeocod;

    this.genZonageograficaZonataraid        = genZonaGeograficaZonataraid;
    this.genZonageograficaZonataracod       = genZonaGeograficaZonataracod;
    this.genZonageograficaJudetid           = genZonaGeograficaJudetid;
    this.genZonageograficaJudetcod          = genZonaGeograficaJudetcod;
    this.genZonageograficaUatid             = genZonaGeograficaUatid;
    this.genZonageograficaUatcod            = genZonaGeograficaUatcod;
    this.genZonageograficaLocalitateid      = genZonaGeograficaLocalitateid;
    this.genZonageograficaLocalitatecod     = genZonaGeograficaLocalitatecod;
    this.genZonageograficaZonajudetid       = genZonaGeograficaZonajudetid;    
    this.genZonageograficaZonajudetcod      = genZonaGeograficaZonajudetcod;  
    this.genZonageograficaZonauatid         = genZonaGeograficaZonauatid;    
    this.genZonageograficaZonauatcod        = genZonaGeograficaZonauatcod;  
    this.genZonageograficaZonalocalitateid  = genZonaGeograficaZonalocalitateid;    
    this.genZonageograficaZonalocalitatecod = genZonaGeograficaZonalocalitatecod;  
    this.genZonageograficaSectievotareid    = genZonaGeograficaSectievotareid;    
    this.genZonageograficaSectievotarenr    = genZonaGeograficaSectievotarenr;
    this.genZonageograficaCodpostalid       = genZonaGeograficaCodpostalid;
    this.genZonageograficaCodpostalcod      = genZonaGeograficaCodpostalcod;
    
  }


  public Long getGenZonageograficaId() 
  {
    return this.genZonageograficaId;
  }

  public void setGenZonageograficaId(Long genZonageograficaId) 
  {
    this.genZonageograficaId = genZonageograficaId;
  }

  
  public Long getGenZonageograficaAcopgeoid() 
  {
    return this.genZonageograficaAcopgeoid;
  }

  public void setGenZonageograficaAcopgeoid(Long genZonageograficaAcopgeoid) 
  {
    this.genZonageograficaAcopgeoid = genZonageograficaAcopgeoid;
  }

  public String getGenZonageograficaAcopgeocod() 
  {
    return this.genZonageograficaAcopgeocod;
  }

  public void setGenZonageograficaAcopgeocod(String genZonageograficaAcopgeocod) 
  {
    this.genZonageograficaAcopgeocod = genZonageograficaAcopgeocod;
  }



  public Long getGenZonageograficaZonataraid() 
  {
    return this.genZonageograficaZonataraid;
  }

  public void setGenZonageograficaZonataraid(Long genZonageograficaZonataraid) 
  {
    this.genZonageograficaZonataraid = genZonageograficaZonataraid;
  }

  public String getGenZonageograficaZonataracod() 
  {
    return this.genZonageograficaZonataracod;
  }

  public void setGenZonageograficaZonataracod(String genZonageograficaZonataracod) 
  {
    this.genZonageograficaZonataracod = genZonageograficaZonataracod;
  }




  public Long getGenZonageograficaJudetid() 
  {
    return this.genZonageograficaJudetid;
  }

  public void setGenZonageograficaJudetid(Long genZonageograficaJudetid) 
  {
    this.genZonageograficaJudetid = genZonageograficaJudetid;
  }

  public String getGenZonageograficaJudetcod() 
  {
    return this.genZonageograficaJudetcod;
  }

  public void setGenZonageograficaJudetcod(String genZonageograficaJudetcod) 
  {
    this.genZonageograficaJudetcod = genZonageograficaJudetcod;
  }


  public Long getGenZonageograficaUatid() 
  {
    return this.genZonageograficaUatid;
  }

  public void setGenZonageograficaUatid(Long genZonageograficaUatid) 
  {
    this.genZonageograficaUatid = genZonageograficaUatid;
  }

  public Long getGenZonageograficaUatcod() 
  {
    return this.genZonageograficaUatcod;
  }

  public void setGenZonageograficaUatcod(Long genZonageograficaUatcod) 
  {
    this.genZonageograficaUatcod = genZonageograficaUatcod;
  }



  public Long getGenZonageograficaLocalitateid() 
  {
    return this.genZonageograficaLocalitateid;
  }

  public void setGenZonageograficaLocalitateid(Long genZonageograficaLocalitateid) 
  {
    this.genZonageograficaLocalitateid = genZonageograficaLocalitateid;
  }

  public Long getGenZonageograficaLocalitatecod() 
  {
    return this.genZonageograficaLocalitatecod;
  }

  public void setGenZonageograficaLocalitatecod(Long genZonageograficaLocalitatecod) 
  {
    this.genZonageograficaLocalitatecod = genZonageograficaLocalitatecod;
  }



  public Long getGenZonageograficaZonajudetid() 
  {
    return this.genZonageograficaZonajudetid;
  }

  public void setGenZonageograficaZonajudetid(Long genZonageograficaZonajudetid) 
  {
    this.genZonageograficaZonajudetid = genZonageograficaZonajudetid;
  }

  public String getGenZonageograficaZonajudetcod() 
  {
    return this.genZonageograficaZonajudetcod;
  }

  public void setGenZonageograficaZonajudetcod(String genZonageograficaZonajudetcod) 
  {
    this.genZonageograficaZonajudetcod = genZonageograficaZonajudetcod;
  }


  public Long getGenZonageograficaZonauatid() 
  {
    return this.genZonageograficaZonauatid;
  }

  public void setGenZonageograficaZonauatid(Long genZonageograficaZonauatid) 
  {
    this.genZonageograficaZonauatid = genZonageograficaZonauatid;
  }

  public String getGenZonageograficaZonauatcod() 
  {
    return this.genZonageograficaZonauatcod;
  }

  public void setGenZonageograficaZonauatcod(String genZonageograficaZonauatcod) 
  {
    this.genZonageograficaZonauatcod = genZonageograficaZonauatcod;
  }


  public Long getGenZonageograficaZonalocalitateid() 
  {
    return this.genZonageograficaZonalocalitateid;
  }

  public void setGenZonageograficaZonalocalitateid(Long genZonageograficaZonalocalitateid) 
  {
    this.genZonageograficaZonalocalitateid = genZonageograficaZonalocalitateid;
  }

  public String getGenZonageograficaZonalocalitatecod() 
  {
    return this.genZonageograficaZonalocalitatecod;
  }

  public void setGenZonageograficaZonalocalitatecod(String genZonageograficaZonalocalitatecod) 
  {
    this.genZonageograficaZonalocalitatecod = genZonageograficaZonalocalitatecod;
  }



  public Long getGenZonageograficaSectievotareid() 
  {
    return this.genZonageograficaSectievotareid;
  }

  public void setGenZonageograficaSectievotareid(Long genZonageograficaSectievotareid) 
  {
    this.genZonageograficaSectievotareid = genZonageograficaSectievotareid;
  }
  
  public Long getGenZonageograficaSectievotarenr() 
  {
    return this.genZonageograficaSectievotarenr;
  }

  public void setGenZonageograficaSectievotarenr(Long genZonageograficaSectievotarenr) 
  {
    this.genZonageograficaSectievotarenr = genZonageograficaSectievotarenr;
  }


  
  public Long getGenZonageograficaCodpostalid() 
  {
    return this.genZonageograficaCodpostalid;
  }

  public void setGenZonageograficaCodpostalid(Long genZonageograficaCodpostalid) 
  {
    this.genZonageograficaCodpostalid = genZonageograficaCodpostalid;
  }


  public String getGenZonageograficaCodpostalcod() 
  {
    return this.genZonageograficaCodpostalcod;
  }

  public void setGenZonageograficaCodpostalcod(String genZonageograficaCodpostalcod) 
  {
    this.genZonageograficaCodpostalcod = genZonageograficaCodpostalcod;
  }


}

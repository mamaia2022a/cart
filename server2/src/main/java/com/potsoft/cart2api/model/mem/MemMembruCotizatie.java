package com.potsoft.cart2api.model.mem;

//import com.potsoft.cart2api.model.aut.userrol.MemMembrucotizatieRol;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "mem_membrucotizatie")
public class MemMembruCotizatie{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mem_membrucotizatie_id")
  private Long memMembrucotizatieId;


  @NotNull
  @Column(name = "mem_membrucotizatie_membruid")
  private Long memMembrucotizatieMembruid;

  @Size(max = 16)
  @Column(name = "mem_membrucotizatie_membrucodunic")
  private String memMembrucotizatieMembrucodunic;


  @NotNull
  @Column(name = "mem_membrucotizatie_userid")
  private Long memMembrucotizatieUserid;
  
  @Size(max = 20)
  @Column(name = "mem_membrucotizatie_usernume")
  private String memMembrucotizatieUsernume;


  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_membru_activ_yn")
  private String memMembrucotizatieActivyn;

  @NotNull
  @Column(name = "mem_membrucotizatie_an")
  private Long memMembrucotizatieAn;

  @NotNull
  @Column(name = "mem_membrucotizatie_lunastart")
  private Long memMembrucotizatieLunastart;

  @NotNull
  @Column(name = "mem_membrucotizatie_lunaend")
  private Long memMembrucotizatieLunaend;

 
  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_membru_refplatasaudoc_12")
  private String memMembrucotizatieRefplatasaudoc12;


  @NotBlank
  @Size(max = 64)
  @Column(name = "mem_membrucotizatie_refplata")
  private String memMembrucotizatieRefplata;



  @Size(max = 512)
  @Column(name = "mem_membrucotizatie_docurl")
  private String memMembrucotizatieDocurl;
 
  @Size(max = 512)
  @Column(name = "mem_membrucotizatie_doclocalpath")
  private String memMembrucotizatieDoclocalpath;


	public MemMembruCotizatie() 
  {
	}

	public MemMembruCotizatie( Long memMembruCotizatieId, 
                       Long memMembruCotizatieMembruid,  String memMembruCotizatieMembrucodunic,
                       Long memMembruCotizatieUserid,    String memMembruCotizatieUsernume, 
                       Long memMembruCotizatieAn,        Long memMembruCotizatieLunastart,  Long memMembruCotizatieLunaend,
                       String memMembruCotizatieActivyn, 
                       String memMembruCotizatieRefplatasaudoc12,
                       String memMembruCotizatieRefplata,
                       String memMembruCotizatieDocurl, String memMembruCotizatieDoclocalpath
                     ) 
  {
    this.memMembrucotizatieId                = memMembruCotizatieId;

    this.memMembrucotizatieMembruid          = memMembruCotizatieMembruid;
    this.memMembrucotizatieMembrucodunic     = memMembruCotizatieMembrucodunic;

    this.memMembrucotizatieUserid            = memMembruCotizatieUserid;
    this.memMembrucotizatieUsernume          = memMembruCotizatieUsernume;

    this.memMembrucotizatieActivyn           = memMembruCotizatieActivyn;
    
    this.memMembrucotizatieAn                = memMembruCotizatieAn;
    this.memMembrucotizatieLunastart         = memMembruCotizatieLunastart;
    this.memMembrucotizatieLunaend           = memMembruCotizatieLunaend;

    this.memMembrucotizatieRefplatasaudoc12  = memMembruCotizatieRefplatasaudoc12;

    this.memMembrucotizatieRefplata          = memMembruCotizatieRefplata;
    
    this.memMembrucotizatieDocurl            = memMembruCotizatieDocurl;
    this.memMembrucotizatieDoclocalpath      = memMembruCotizatieDoclocalpath ;
  }


  public Long getMemMembrucotizatieId() 
  {
    return this.memMembrucotizatieId;
  }

  public void setMemMembrucotizatieId(Long memMembrucotizatieId) 
  {
    this.memMembrucotizatieId = memMembrucotizatieId;
  }

  
  
  public Long getMemMembrucotizatieMembruid() 
  {
    return this.memMembrucotizatieMembruid;
  }

  public void setMemMembrucotizatieMembruid(Long memMembrucotizatieMembruid) 
  {
    this.memMembrucotizatieMembruid = memMembrucotizatieMembruid;
  }


  public String getMemMembrucotizatieMembruCodunic() 
  {
    return this.memMembrucotizatieMembrucodunic;
  }

  public void setMemMembrucotizatieMembruCodunic(String memMembrucotizatieMembrucodunic) 
  {
    this.memMembrucotizatieMembrucodunic = memMembrucotizatieMembrucodunic;
  }



  public Long getMemMembrucotizatieUserid() 
  {
    return this.memMembrucotizatieUserid;
  }

  public void setMemMembrucotizatieUserid(Long memMembrucotizatieUserid) 
  {
    this.memMembrucotizatieUserid = memMembrucotizatieUserid;
  }


  public String getMemMembrucotizatieUsernume() 
  {
    return this.memMembrucotizatieUsernume;
  }

  public void setMemMembrucotizatieUsernume(String memMembrucotizatieUsernume) 
  {
    this.memMembrucotizatieUsernume = memMembrucotizatieUsernume;
  }



  public Long getMemMembrucotizatieAn() 
  {
    return this.memMembrucotizatieAn;
  }

  public void setMemMembrucotizatieCnp(Long memMembrucotizatieAn) 
  {
    this.memMembrucotizatieAn = memMembrucotizatieAn;
  }


  public Long getMemMembrucotizatieLunastart() 
  {
    return this.memMembrucotizatieLunastart;
  }

  public void setMemMembrucotizatieLunastart(Long memMembrucotizatieLunastart) 
  {
    this.memMembrucotizatieLunastart = memMembrucotizatieLunastart;
  }


  public Long getMemMembrucotizatieLunaend() 
  {
    return this.memMembrucotizatieLunaend;
  }

  public void setMemMembrucotizatieLunaend(Long memMembrucotizatieLunaend) 
  {
    this.memMembrucotizatieLunaend = memMembrucotizatieLunaend;
  }



  public String getMemMembrucotizatieRefplata() 
  {
    return this.memMembrucotizatieRefplata;
  }

  public void setMemMembrucotizatieCnp(String memMembrucotizatieRefplata) 
  {
    this.memMembrucotizatieRefplata = memMembrucotizatieRefplata;
  }


  


  public String getMemMembrucotizatieActivyn() 
  {
    return this.memMembrucotizatieActivyn;
  }

  public void setMemMembrucotizatieActivyn(String memMembrucotizatieActivyn) 
  {
    this.memMembrucotizatieActivyn = memMembrucotizatieActivyn;
  }


  public String getMemMembrucotizatieRefplatasaudoc12() 
  {
    return this.memMembrucotizatieRefplatasaudoc12;
  }

  public void setMemMembrucotizatieRefplatasaudocyn(String memMembrucotizatieRefplatasaudoc12) 
  {
    this.memMembrucotizatieRefplatasaudoc12 = memMembrucotizatieRefplatasaudoc12;
  }

  


  public String getMemMembrucotizatieDocurl() 
  {
    return this.memMembrucotizatieDocurl;
  }

  public void setMemMembrucotizatieDocurl(String memMembrucotizatieDocurl) 
  {
    this.memMembrucotizatieDocurl = memMembrucotizatieDocurl;
  }


  public String getMemMembrucotizatieDoclocalpath() 
  {
    return this.memMembrucotizatieDoclocalpath;
  }

  public void setMemMembrucotizatieDoclocalpath(String memMembrucotizatieDoclocalpath) 
  {
    this.memMembrucotizatieDoclocalpath = memMembrucotizatieDoclocalpath;
  }


}

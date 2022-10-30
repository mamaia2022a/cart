package com.potsoft.cart2api.model.mem;

//import com.potsoft.cart2api.model.aut.userrol.MemMembruciRol;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "mem_membruci")
public class MemMembruCI{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mem_membruci_id")
  private Long memMembruciId;


  @NotNull
  @Column(name = "mem_membruci_membruid")
  private Long memMembruciMembruid;

  @Size(max = 16)
  @Column(name = "mem_membruci_membrucodunic")
  private String memMembruciMembrucodunic;


  @NotNull
  @Column(name = "mem_membruci_userid")
  private Long memMembruciUserid;
  
  @Size(max = 20)
  @Column(name = "mem_membruci_usernume")
  private String memMembruciUsernume;


  @NotNull
  @Column(name = "mem_membruci_cnp")
  private Long memMembruciCnp;

  @Size(max = 2)
  @Column(name = "mem_membruci_serie")
  private String memMembruciSerie;

  @NotNull
  @Column(name = "mem_membruci_nr")
  private Long memMembruciNr;

  
 
  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_membruci_activ_yn")
  private String memMembruciActivyn;

  @Size(max = 20)
  @Column(name = "mem_membruci_dataelib")
  private String memMembruciDataelib;

  @Size(max = 20)
  @Column(name = "mem_membruci_dataexp")
  private String memMembruciDataexp;



  @Size(max = 512)
  @Column(name = "mem_membruci_docurl")
  private String memMembruciDocurl;
 
  @Size(max = 512)
  @Column(name = "mem_membruci_doclocalpath")
  private String memMembruciDoclocalpath;


	public MemMembruCI() 
  {
	}

	public MemMembruCI( Long memMembruCIId, 
                       Long memMembruCIMembruid,  String memMembruCIMembrucodunic,
                       Long memMembruCIUserid,    String memMembruCIUsernume, 
                       Long memMembruCICnp,       String memMembruCISerie,  Long memMembruCINr,
                       String memMembruCIActivyn, String memMembruCIDataelib, String memMembruCIDataexp,
                       String memMembruciDocurl, String memMembruciDoclocalpath
                     ) 
  {
    this.memMembruciId                = memMembruCIId;

    this.memMembruciMembruid          = memMembruCIMembruid;
    this.memMembruciMembrucodunic     = memMembruCIMembrucodunic;

    this.memMembruciUserid            = memMembruCIUserid;
    this.memMembruciUsernume          = memMembruCIUsernume;

    this.memMembruciCnp               = memMembruCICnp;
    this.memMembruciSerie             = memMembruCISerie;
    this.memMembruciNr                = memMembruCINr;

    this.memMembruciActivyn           = memMembruCIActivyn;
    this.memMembruciDataelib          = memMembruCIDataelib;
    this.memMembruciDataexp           = memMembruCIDataexp;
    
    this.memMembruciDocurl             = memMembruciDocurl;
    this.memMembruciDoclocalpath       = memMembruciDoclocalpath ;
  }


  public Long getMemMembruciId() 
  {
    return this.memMembruciId;
  }

  public void setMemMembruciId(Long memMembruciId) 
  {
    this.memMembruciId = memMembruciId;
  }

  
  
  public Long getMemMembruciMembruid() 
  {
    return this.memMembruciMembruid;
  }

  public void setMemMembruciMembruid(Long memMembruciMembruid) 
  {
    this.memMembruciMembruid = memMembruciMembruid;
  }


  public String getMemMembruciMembruCodunic() 
  {
    return this.memMembruciMembrucodunic;
  }

  public void setMemMembruciMembruCodunic(String memMembruciMembrucodunic) 
  {
    this.memMembruciMembrucodunic = memMembruciMembrucodunic;
  }



  public Long getMemMembruciUserid() 
  {
    return this.memMembruciUserid;
  }

  public void setMemMembruciUserid(Long memMembruciUserid) 
  {
    this.memMembruciUserid = memMembruciUserid;
  }


  public String getMemMembruciUsernume() 
  {
    return this.memMembruciUsernume;
  }

  public void setMemMembruciUsernume(String memMembruciUsernume) 
  {
    this.memMembruciUsernume = memMembruciUsernume;
  }



  public Long getMemMembruciCnp() 
  {
    return this.memMembruciCnp;
  }

  public void setMemMembruciCnp(Long memMembruciCnp) 
  {
    this.memMembruciCnp = memMembruciCnp;
  }


  public String getMemMembruciSerie() 
  {
    return this.memMembruciSerie;
  }

  public void setMemMembruciCnp(String memMembruciSerie) 
  {
    this.memMembruciSerie = memMembruciSerie;
  }


  public Long getMemMembruciNr() 
  {
    return this.memMembruciCnp;
  }

  public void setMemMembruciNr(Long memMembruciNr) 
  {
    this.memMembruciNr = memMembruciNr;
  }


  public String getMemMembruciActivyn() 
  {
    return this.memMembruciActivyn;
  }

  public void setMemMembruciActivyn(String memMembruciActivyn) 
  {
    this.memMembruciActivyn = memMembruciActivyn;
  }


  public String getMemMembruciDataelib() 
  {
    return this.memMembruciDataelib;
  }

  public void setMemMebrutipDataelib(String memMembruciDataelib) 
  {
    this.memMembruciDataelib = memMembruciDataelib;
  }


  public String getMemMembruciDataexp() 
  {
    return this.memMembruciDataexp;
  }

  public void setMemMembruciEnddt(String memMembruciDataexp) 
  {
    this.memMembruciDataexp = memMembruciDataexp;
  }



  public String getMemMembruciDocurl() 
  {
    return this.memMembruciDocurl;
  }

  public void setMemMembruciDocurl(String memMembruciDocurl) 
  {
    this.memMembruciDocurl = memMembruciDocurl;
  }


  public String getMemMembruciDoclocalpath() 
  {
    return this.memMembruciDoclocalpath;
  }

  public void setMemMembruciDoclocalpath(String memMembruciDoclocalpath) 
  {
    this.memMembruciDoclocalpath = memMembruciDoclocalpath;
  }


}

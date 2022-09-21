package com.potsoft.cart2api.model.aut;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name = "aut_validinreg")
public class AutValidInreg
{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "aut_validinreg_id")
  private Long autValidinregId;


  @NotNull
  @Column(name = "aut_validinreg_userid")
  private Long autValidinregUserid;


  @NotNull
  @Column(name = "aut_validinreg_codvalidare")
  private Long autValidinregCodvalidare;

  @NotBlank
  @Size(max = 1)
  @Column(name = "aut_validinreg_activ_yn")
  private String autValidinregActivyn;

  @Size(max = 20)
  @Column(name = "aut_validinreg_startdt", insertable = false, updatable = false)
  private String autValidinregStartdt;

  
  @Size(max = 20)
  @Column(name = "aut_validinreg_enddt", insertable = false, updatable = false)
  private String autValidinregEnddt;

  

	public AutValidInreg() 
  {
	}

	public AutValidInreg( Long   aut_validinreg_id, Long aut_validinreg_userid, Long aut_validinreg_codvalidare,
          String aut_validinreg_activ_yn, String aut_validinreg_startdt, String aut_validinreg_enddt) 
  {
		this.autValidinregId          = aut_validinreg_id;
    this.autValidinregUserid      = aut_validinreg_userid;
    this.autValidinregCodvalidare = aut_validinreg_codvalidare;
		this.autValidinregActivyn     = aut_validinreg_activ_yn;
		this.autValidinregStartdt     = aut_validinreg_startdt;
    this.autValidinregEnddt       = aut_validinreg_enddt;
	}

  public Long getAutValidinregId() 
  {
    return this.autValidinregId;
  }

  public void setAutValidinregId(Long aut_validinreg_id) 
  {
    this.autValidinregId = aut_validinreg_id;
  }


  public Long getAutValidinregUserid() 
  {
    return this.autValidinregUserid;
  }

  public void setAutValidinregUserid(Long aut_validinreg_userid) 
  {
    this.autValidinregUserid = aut_validinreg_userid;
  }


  public Long getAutValidinregCodvalidare() 
  {
    return this.autValidinregCodvalidare;
  }

  public void setAutValidinregCodvalidare(Long aut_validinreg_codvalidare) 
  {
    this.autValidinregCodvalidare = aut_validinreg_codvalidare;
  }



  public String getAutValidinregActivyn() 
  {
    return this.autValidinregActivyn;
  }

  public void setAutValidinregActivyn(String aut_validinreg_activ_yn) 
  {
    this.autValidinregActivyn = aut_validinreg_activ_yn;
  }


  public String getAutValidinregStartdt() 
  {
    return this.autValidinregStartdt;
  }

  public void setAutValidinregStartdt(String aut_validinreg_startdt) 
  {
    this.autValidinregStartdt = aut_validinreg_startdt;
  }


  public String getAutValidinregEnddt() 
  {
    return this.autValidinregEnddt;
  }

  public void setAutValidinregEnddt(String aut_validinreg_enddt) 
  {
    this.autValidinregEnddt = aut_validinreg_enddt;
  }

  

  
}

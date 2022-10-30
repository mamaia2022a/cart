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
@Table(name = "aut_userrol")
public class AutUserRol
{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "aut_userrol_id")
  private Long autUserrolId;

  @NotNull
  @Column(name = "aut_userrol_rolid")
  private Long autUserrolRolid;

  @NotBlank
  @Size(max = 10)
  @Column(name = "aut_userrol_rolcod")
  private String autUserrolRolcod;

  @NotNull
  @Column(name = "aut_userrol_userid")
  private Long autUserrolUserid;

  @NotBlank
  @Size(max = 1)
  @Column(name = "aut_userrol_activ_yn")
  private String autUserrolActivyn;

  @Size(max = 20)
  @Column(name = "aut_userrol_startdt", insertable = false, updatable = false)
  private String autUserrolStartdt;

  
  @Size(max = 20)
  @Column(name = "aut_userrol_enddt")
  private String autUserrolEnddt;

  //@Where(clause = "aut_userrol_activ_yn = 'y'")
  @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "aut_userrol_rolid", referencedColumnName = "aut_rol_id", insertable = false, updatable = false)
	private AutRol rol;


	public AutUserRol() 
  {
	}

	public AutUserRol( Long   aut_userrol_id, 
          Long aut_userrol_rolid, String aut_userrol_rolcod, Long aut_userrol_userid,
          String aut_userrol_activ_yn, String aut_userrol_startdt, String aut_userrol_enddt) 
  {
		this.autUserrolId       = aut_userrol_id;
		this.autUserrolRolid    = aut_userrol_rolid;
    this.autUserrolRolcod   = aut_userrol_rolcod;
    this.autUserrolUserid   = aut_userrol_userid;
		this.autUserrolActivyn  = aut_userrol_activ_yn;
		this.autUserrolStartdt  = aut_userrol_startdt;
    this.autUserrolEnddt    = aut_userrol_enddt;
	}

  public Long getAutUserrolId() 
  {
    return this.autUserrolId;
  }

  public void setAutUserrolId(Long aut_userrol_id) 
  {
    this.autUserrolId = aut_userrol_id;
  }


  public Long getAutUserrolRolid() 
  {
    return this.autUserrolRolid;
  }

  public void setAutUserrolRolid(Long aut_userrol_rolid) 
  {
    this.autUserrolRolid = aut_userrol_rolid;
  }


  public String getAutUserrolRolcod() 
  {
    return this.autUserrolRolcod;
  }

  public void setAutUserrolRolcod(String aut_userrol_rolcod) 
  {
    this.autUserrolRolcod = aut_userrol_rolcod;
  }


  public Long getAutUserrolUserid() 
  {
    return this.autUserrolUserid;
  }

  public void setAutUserrolUserid(Long aut_userrol_userid) 
  {
    this.autUserrolUserid = aut_userrol_userid;
  }


  public String getAutUserrolActivyn() 
  {
    return this.autUserrolActivyn;
  }

  public void setAutUserrolActivyn(String aut_userrol_activ_yn) 
  {
    this.autUserrolActivyn = aut_userrol_activ_yn;
  }


  public String getAutUserrolStartdt() 
  {
    return this.autUserrolStartdt;
  }

  public void setAutUserrolStartdt(String aut_userrol_startdt) 
  {
    this.autUserrolStartdt = aut_userrol_startdt;
  }


  public String getAutUserrolEnddt() 
  {
    return this.autUserrolEnddt;
  }

  public void setAutUserrolEnddt(String aut_userrol_enddt) 
  {
    this.autUserrolEnddt = aut_userrol_enddt;
  }

  public AutRol getRol() {
    return this.rol;
  }

  public void setRol(AutRol rol) {
    this.rol = rol;
  }

  
}

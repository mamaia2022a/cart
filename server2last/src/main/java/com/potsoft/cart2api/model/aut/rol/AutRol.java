package com.potsoft.cart2api.model.aut.rol;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
@Table(name = "aut_rol", 
    uniqueConstraints = {
      @UniqueConstraint(columnNames = "aut_rol_cod"), 
      @UniqueConstraint(columnNames = "aut_rol_nume")
    })
public class AutRol {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "aut_rol_id")
  private Long autRolId;

  @NotBlank
  @Size(max = 9)
  @Column(name = "aut_rol_cod")
  private String autRolCod;

  @NotBlank
  @Size(max = 32)
  @Column(name = "aut_rol_nume")
  private String autRolNume;

  @NotBlank
  @Size(max = 1)
  @Column(name = "aut_rol_activ_yn")
  private String autRolActivyn;

  @Size(max = 20)
  @Column(name = "aut_rol_startdt")
  private String autRolStartdt;

  
  @Size(max = 20)
  @Column(name = "aut_rol_enddt")
  private String autRolEnddt;


	public AutRol() 
  {
	}

	public AutRol( Long   aut_rol_id, String aut_rol_cod, String aut_rol_nume, 
                  String aut_rol_activ_yn, String aut_rol_startdt, String aut_rol_enddt) 
  {
		this.autRolId       = aut_rol_id;
		this.autRolCod      = aut_rol_cod;
    this.autRolNume     = aut_rol_nume;
		this.autRolActivyn  = aut_rol_activ_yn;
		this.autRolStartdt  = aut_rol_startdt;
    this.autRolEnddt    = aut_rol_enddt;
	}

  public Long getAutRolId() 
  {
    return this.autRolId;
  }

  public void setAutRolId(Long aut_rol_id) 
  {
    this.autRolId = aut_rol_id;
  }


  public String getAutRolCod() 
  {
    return this.autRolCod;
  }

  public void setAutRolCod(String aut_rol_cod) 
  {
    this.autRolCod = aut_rol_cod;
  }


  public String getAutRolNume() 
  {
    return this.autRolNume;
  }

  public void setAutRolNume(String aut_rol_nume) 
  {
    this.autRolNume = aut_rol_nume;
  }


  public String getAutRolActivyn() 
  {
    return this.autRolActivyn;
  }

  public void setAutRolActivyn(String aut_rol_activ_yn) 
  {
    this.autRolActivyn = aut_rol_activ_yn;
  }


  public String getAutRolStartdt() 
  {
    return this.autRolStartdt;
  }

  public void setAutRolStartdt(String aut_rol_startdt) 
  {
    this.autRolStartdt = aut_rol_startdt;
  }


  public String getAutRolEnddt() 
  {
    return this.autRolEnddt;
  }

  public void setAutRolEnddt(String aut_rol_enddt) 
  {
    this.autRolEnddt = aut_rol_enddt;
  }

    
}

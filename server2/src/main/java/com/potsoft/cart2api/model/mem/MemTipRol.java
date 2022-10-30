package com.potsoft.cart2api.model.mem;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;




@Entity
@Table(name = "mem_tiprol", 
    uniqueConstraints = {
      @UniqueConstraint(columnNames = "mem_tiprol_cod"), 
      @UniqueConstraint(columnNames = "mem_tiprol_nume")
    })
public class MemTipRol {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mem_tiprol_id")
  private Long memTiprolId;

  @NotBlank
  @Size(max = 10)
  @Column(name = "mem_tiprol_cod")
  private String memTiprolCod;

  @NotBlank
  @Size(max = 32)
  @Column(name = "mem_tiprol_nume")
  private String memTiprolNume;

  @Size(max = 256)
  @Column(name = "mem_tiprol_descriere")
  private String memTiprolDescriere;

  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_tiprol_activ_yn")
  private String memTiprolActivyn;

  @Size(max = 20)
  @Column(name = "mem_tiprol_startdt")
  private String memTiprolStartdt;

  
  @Size(max = 20)
  @Column(name = "mem_tiprol_enddt")
  private String memTiprolEnddt;


  @NotBlank
  @Size(max = 32)
  @Column(name = "mem_tiprol_displaynume")
  private String memTiprolDisplaynume;

  @Size(max = 256)
  @Column(name = "mem_tiprol_displaydescriere")
  private String memTiprolDisplaydescriere;

  

	public MemTipRol() 
  {
	}

	public MemTipRol( Long   mem_tiprol_id, String mem_tiprol_cod, String mem_tiprol_nume, String mem_tiprol_descriere, 
                  String mem_tiprol_activ_yn, String mem_tiprol_startdt, String mem_tiprol_enddt,
                  String mem_tiprol_displaynume, String mem_tiprol_displaydescriere) 
  {
		this.memTiprolId               = mem_tiprol_id;
		this.memTiprolCod              = mem_tiprol_cod;
    this.memTiprolNume             = mem_tiprol_nume;
    this.memTiprolDescriere        = mem_tiprol_descriere;
		this.memTiprolActivyn          = mem_tiprol_activ_yn;
		this.memTiprolStartdt          = mem_tiprol_startdt;
    this.memTiprolEnddt            = mem_tiprol_enddt;
    this.memTiprolDisplaynume      = mem_tiprol_displaynume;
    this.memTiprolDisplaydescriere = mem_tiprol_displaydescriere;
	}

  public Long getMemTipRolId() 
  {
    return this.memTiprolId;
  }

  public void setMemTipRolId(Long mem_tiprol_id) 
  {
    this.memTiprolId = mem_tiprol_id;
  }


  public String getMemTipRolCod() 
  {
    return this.memTiprolCod;
  }

  public void setMemTipRolCod(String mem_tiprol_cod) 
  {
    this.memTiprolCod = mem_tiprol_cod;
  }


  public String getMemTipRolNume() 
  {
    return this.memTiprolNume;
  }

  public void setMemTipRolNume(String mem_tiprol_nume) 
  {
    this.memTiprolNume = mem_tiprol_nume;
  }


  public String getMemTipRolDescriere() 
  {
    return this.memTiprolDescriere;
  }

  public void setMemTipRolDescriere(String mem_tiprol_descriere)
  {
    this.memTiprolDescriere = mem_tiprol_descriere;
  }


  public String getMemTipRolActivyn() 
  {
    return this.memTiprolActivyn;
  }

  public void setMemTipRolActivyn(String mem_tiprol_activ_yn) 
  {
    this.memTiprolActivyn = mem_tiprol_activ_yn;
  }


  public String getMemTipRolStartdt() 
  {
    return this.memTiprolStartdt;
  }

  public void setMemTipRolStartdt(String mem_tiprol_startdt) 
  {
    this.memTiprolStartdt = mem_tiprol_startdt;
  }


  public String getMemTipRolEnddt() 
  {
    return this.memTiprolEnddt;
  }

  public void setMemTipRolEnddt(String mem_tiprol_enddt) 
  {
    this.memTiprolEnddt = mem_tiprol_enddt;
  }


  public String getMemTipRolDisplayNume() 
  {
    return this.memTiprolDisplaynume;
  }

  public void setMemTipRolDisplayNume(String mem_tiprol_displaynume) 
  {
    this.memTiprolDisplaynume = mem_tiprol_displaynume;
  }


  public String getMemTipRolDisplaydescriere() 
  {
    return this.memTiprolDisplaydescriere;
  }

  public void setMemTipRolDisplaydescriere(String mem_tiprol_displaydescriere)
  {
    this.memTiprolDisplaydescriere = mem_tiprol_displaydescriere;
  }

  
  
}

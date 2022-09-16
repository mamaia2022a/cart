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
@Table(name = "mem_tip", 
    uniqueConstraints = {
      @UniqueConstraint(columnNames = "mem_tip_cod"), 
      @UniqueConstraint(columnNames = "mem_tip_nume")
    })
public class MemTip {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mem_tip_id")
  private Long memTipId;

  @NotBlank
  @Size(max = 10)
  @Column(name = "mem_tip_cod")
  private String memTipCod;

  @NotBlank
  @Size(max = 32)
  @Column(name = "mem_tip_nume")
  private String memTipNume;

  @Size(max = 256)
  @Column(name = "mem_tip_descriere")
  private String memTipDescriere;

  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_tip_activ_yn")
  private String memTipActivyn;

  @Size(max = 20)
  @Column(name = "mem_tip_startdt")
  private String memTipStartdt;

  
  @Size(max = 20)
  @Column(name = "mem_tip_enddt")
  private String memTipEnddt;


  @NotBlank
  @Size(max = 32)
  @Column(name = "mem_tip_displaynume")
  private String memTipDisplaynume;

  @Size(max = 256)
  @Column(name = "mem_tip_displaydescriere")
  private String memTipDisplaydescriere;


	public MemTip() 
  {
	}

	public MemTip( Long   mem_tip_id, String mem_tip_cod, String mem_tip_nume, String mem_tip_descriere, 
                  String mem_tip_activ_yn, String mem_tip_startdt, String mem_tip_enddt,
                  String mem_tip_displaynume, String mem_tip_displaydescriere) 
  {
		this.memTipId               = mem_tip_id;
		this.memTipCod              = mem_tip_cod;
    this.memTipNume             = mem_tip_nume;
    this.memTipDescriere        = mem_tip_descriere;
		this.memTipActivyn          = mem_tip_activ_yn;
		this.memTipStartdt          = mem_tip_startdt;
    this.memTipEnddt            = mem_tip_enddt;
    this.memTipDisplaynume      = mem_tip_displaynume;
    this.memTipDisplaydescriere = mem_tip_displaydescriere;
	}

  public Long getMemTipId() 
  {
    return this.memTipId;
  }

  public void setMemTipId(Long mem_tip_id) 
  {
    this.memTipId = mem_tip_id;
  }


  public String getMemTipCod() 
  {
    return this.memTipCod;
  }

  public void setMemTipCod(String mem_tip_cod) 
  {
    this.memTipCod = mem_tip_cod;
  }


  public String getMemTipNume() 
  {
    return this.memTipNume;
  }

  public void setMemTipNume(String mem_tip_nume) 
  {
    this.memTipNume = mem_tip_nume;
  }


  public String getMemTipDescriere() 
  {
    return this.memTipDescriere;
  }

  public void setMemTipDescriere(String mem_tip_descriere)
  {
    this.memTipDescriere = mem_tip_descriere;
  }


  public String getMemTipActivyn() 
  {
    return this.memTipActivyn;
  }

  public void setMemTipActivyn(String mem_tip_activ_yn) 
  {
    this.memTipActivyn = mem_tip_activ_yn;
  }


  public String getMemTipStartdt() 
  {
    return this.memTipStartdt;
  }

  public void setMemTipStartdt(String mem_tip_startdt) 
  {
    this.memTipStartdt = mem_tip_startdt;
  }


  public String getMemTipEnddt() 
  {
    return this.memTipEnddt;
  }

  public void setMemTipEnddt(String mem_tip_enddt) 
  {
    this.memTipEnddt = mem_tip_enddt;
  }


  public String getMemTipDisplayNume() 
  {
    return this.memTipDisplaynume;
  }

  public void setMemTipDisplayNume(String mem_tip_displaynume) 
  {
    this.memTipDisplaynume = mem_tip_displaynume;
  }


  public String getMemTipDisplaydescriere() 
  {
    return this.memTipDisplaydescriere;
  }

  public void setMemTipDisplaydescriere(String mem_tip_displaydescriere)
  {
    this.memTipDisplaydescriere = mem_tip_displaydescriere;
  }

  
}

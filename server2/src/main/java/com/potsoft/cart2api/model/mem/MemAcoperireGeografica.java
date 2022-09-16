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
@Table(name = "mem_acoperiregeografica", 
    uniqueConstraints = {
      @UniqueConstraint(columnNames = "mem_acoperiregeografica_cod"), 
      @UniqueConstraint(columnNames = "mem_acoperiregeografica_nume")
    })
public class MemAcoperireGeografica {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mem_acoperiregeografica_id")
  private Long memAcoperiregeograficaId;

  @NotBlank
  @Size(max = 16)
  @Column(name = "mem_acoperiregeografica_cod")
  private String memAcoperiregeograficaCod;

  @NotBlank
  @Size(max = 64)
  @Column(name = "mem_acoperiregeografica_nume")
  private String memAcoperiregeograficaNume;


  @NotBlank
  @Size(max = 1)
  @Column(name = "mem_acoperiregeografica_activ_yn")
  private String memAcoperiregeograficaActivyn;


  @NotBlank
  @Size(max = 128)
  @Column(name = "mem_acoperiregeografica_displaynume")
  private String memAcoperiregeograficaDisplaynume;

  

	public MemAcoperireGeografica() 
  {
	}

	public MemAcoperireGeografica( Long   mem_acoperiregeografica_id, 
                                 String mem_acoperiregeografica_cod, 
                                 String mem_acoperiregeografica_nume,  
                                 String mem_acoperiregeografica_activ_yn, 
                                 String mem_acoperiregeografica_displaynume) 
  {
		this.memAcoperiregeograficaId               = mem_acoperiregeografica_id;
		this.memAcoperiregeograficaCod              = mem_acoperiregeografica_cod;
    this.memAcoperiregeograficaNume             = mem_acoperiregeografica_nume;
		this.memAcoperiregeograficaActivyn          = mem_acoperiregeografica_activ_yn;
    this.memAcoperiregeograficaDisplaynume      = mem_acoperiregeografica_displaynume;
	}

  public Long getMemAcoperiregeograficaId() 
  {
    return this.memAcoperiregeograficaId;
  }

  public void setMemAcoperiregeograficaId(Long mem_acoperiregeografica_id) 
  {
    this.memAcoperiregeograficaId = mem_acoperiregeografica_id;
  }


  public String getMemAcoperiregeograficaCod() 
  {
    return this.memAcoperiregeograficaCod;
  }

  public void setMemAcoperiregeograficaCod(String mem_acoperiregeografica_cod) 
  {
    this.memAcoperiregeograficaCod = mem_acoperiregeografica_cod;
  }


  public String getMemAcoperiregeograficaNume() 
  {
    return this.memAcoperiregeograficaNume;
  }

  public void setMemAcoperiregeograficaNume(String mem_acoperiregeografica_nume) 
  {
    this.memAcoperiregeograficaNume = mem_acoperiregeografica_nume;
  }



  public String getMemAcoperiregeograficaActivyn() 
  {
    return this.memAcoperiregeograficaActivyn;
  }

  public void setMemAcoperiregeograficaActivyn(String mem_acoperiregeografica_activ_yn) 
  {
    this.memAcoperiregeograficaActivyn = mem_acoperiregeografica_activ_yn;
  }



  public String getMemAcoperiregeograficaDisplayNume() 
  {
    return this.memAcoperiregeograficaDisplaynume;
  }

  public void setMemAcoperiregeograficaDisplayNume(String mem_acoperiregeografica_displaynume) 
  {
    this.memAcoperiregeograficaDisplaynume = mem_acoperiregeografica_displaynume;
  }


  
  
}

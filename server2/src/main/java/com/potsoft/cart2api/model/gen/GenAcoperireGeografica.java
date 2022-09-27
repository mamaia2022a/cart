package com.potsoft.cart2api.model.gen;

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
@Table(name = "gen_acoperiregeografica", 
    uniqueConstraints = {
      @UniqueConstraint(columnNames = "gen_acoperiregeografica_cod"), 
      @UniqueConstraint(columnNames = "gen_acoperiregeografica_nume")
    })
public class GenAcoperireGeografica {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "gen_acoperiregeografica_id")
  private Long genAcoperiregeograficaId;

  @NotBlank
  @Size(max = 16)
  @Column(name = "gen_acoperiregeografica_cod")
  private String genAcoperiregeograficaCod;

  @NotBlank
  @Size(max = 64)
  @Column(name = "gen_acoperiregeografica_nume")
  private String genAcoperiregeograficaNume;


  @NotBlank
  @Size(max = 1)
  @Column(name = "gen_acoperiregeografica_activ_yn")
  private String genAcoperiregeograficaActivyn;


  @NotBlank
  @Size(max = 128)
  @Column(name = "gen_acoperiregeografica_displaynume")
  private String genAcoperiregeograficaDisplaynume;

  

	public GenAcoperireGeografica() 
  {
	}

	public GenAcoperireGeografica( Long   gen_acoperiregeografica_id, 
                                 String gen_acoperiregeografica_cod, 
                                 String gen_acoperiregeografica_nume,  
                                 String gen_acoperiregeografica_activ_yn, 
                                 String gen_acoperiregeografica_displaynume) 
  {
		this.genAcoperiregeograficaId               = gen_acoperiregeografica_id;
		this.genAcoperiregeograficaCod              = gen_acoperiregeografica_cod;
    this.genAcoperiregeograficaNume             = gen_acoperiregeografica_nume;
		this.genAcoperiregeograficaActivyn          = gen_acoperiregeografica_activ_yn;
    this.genAcoperiregeograficaDisplaynume      = gen_acoperiregeografica_displaynume;
	}

  public Long getGenAcoperiregeograficaId() 
  {
    return this.genAcoperiregeograficaId;
  }

  public void setGenAcoperiregeograficaId(Long gen_acoperiregeografica_id) 
  {
    this.genAcoperiregeograficaId = gen_acoperiregeografica_id;
  }


  public String getGenAcoperiregeograficaCod() 
  {
    return this.genAcoperiregeograficaCod;
  }

  public void setGenAcoperiregeograficaCod(String gen_acoperiregeografica_cod) 
  {
    this.genAcoperiregeograficaCod = gen_acoperiregeografica_cod;
  }


  public String getGenAcoperiregeograficaNume() 
  {
    return this.genAcoperiregeograficaNume;
  }

  public void setGenAcoperiregeograficaNume(String gen_acoperiregeografica_nume) 
  {
    this.genAcoperiregeograficaNume = gen_acoperiregeografica_nume;
  }



  public String getGenAcoperiregeograficaActivyn() 
  {
    return this.genAcoperiregeograficaActivyn;
  }

  public void setGenAcoperiregeograficaActivyn(String gen_acoperiregeografica_activ_yn) 
  {
    this.genAcoperiregeograficaActivyn = gen_acoperiregeografica_activ_yn;
  }



  public String getGenAcoperiregeograficaDisplayNume() 
  {
    return this.genAcoperiregeograficaDisplaynume;
  }

  public void setGenAcoperiregeograficaDisplayNume(String gen_acoperiregeografica_displaynume) 
  {
    this.genAcoperiregeograficaDisplaynume = gen_acoperiregeografica_displaynume;
  }


  
  
}

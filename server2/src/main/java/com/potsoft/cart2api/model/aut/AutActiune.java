package com.potsoft.cart2api.model.aut;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
@Table(name = "aut_actiune", 
    uniqueConstraints = {
      @UniqueConstraint(columnNames = "aut_actiune_cod"), 
      @UniqueConstraint(columnNames = "aut_actiune_nume")
    })
public class AutActiune {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "aut_actiune_id")
  private Long autActiuneId;

  @NotBlank
  @Size(max = 25)
  @Column(name = "aut_actiune_cod")
  private String autActiuneCod;

  @NotBlank
  @Size(max = 128)
  @Column(name = "aut_actiune_nume")
  private String autActiuneNume;

  @Size(max = 256)
  @Column(name = "aut_actiune_descriere")
  private String autActiuneDescriere;


  @NotBlank
  @Size(max = 128)
  @Column(name = "aut_actiune_displaynume")
  private String autActiuneDisplaynume;

  @Size(max = 256)
  @Column(name = "aut_actiune_displaydescriere")
  private String autActiuneDisplaydescriere;


	public AutActiune() 
  {
	}

	public AutActiune( Long   aut_actiune_id, String aut_actiune_cod, 
                 String aut_actiune_nume, String aut_actiune_descriere, 
                 String aut_actiune_displaynume, String aut_actiune_displaydescriere) 
  {
		this.autActiuneId               = aut_actiune_id;
		this.autActiuneCod              = aut_actiune_cod;
    this.autActiuneNume             = aut_actiune_nume;
    this.autActiuneDescriere        = aut_actiune_descriere;
	  this.autActiuneDisplaynume      = aut_actiune_displaynume;
    this.autActiuneDisplaydescriere = aut_actiune_displaydescriere;
	}

  public Long getAutActiuneId() 
  {
    return this.autActiuneId;
  }

  public void setAutActiuneId(Long aut_actiune_id) 
  {
    this.autActiuneId = aut_actiune_id;
  }


  public String getAutActiuneCod() 
  {
    return this.autActiuneCod;
  }

  public void setAutActiuneCod(String aut_actiune_cod) 
  {
    this.autActiuneCod = aut_actiune_cod;
  }


  public String getAutActiuneNume() 
  {
    return this.autActiuneNume;
  }

  public void setAutActiuneNume(String aut_actiune_nume) 
  {
    this.autActiuneNume = aut_actiune_nume;
  }


  public String getAutActiuneDescriere() 
  {
    return this.autActiuneDescriere;
  }

  public void setAutActiuneDescriere(String aut_actiune_descriere)
  {
    this.autActiuneDescriere = aut_actiune_descriere;
  }


  public String getAutActiuneDisplaynume() 
  {
    return this.autActiuneDisplaynume;
  }

  public void setAutActiuneDisplaynume(String aut_actiune_displaynume) 
  {
    this.autActiuneDisplaynume = aut_actiune_displaynume;
  }


  public String getAutActiuneDisplaydescriere() 
  {
    return this.autActiuneDisplaydescriere;
  }

  public void setAutActiuneDisplaydescriere(String aut_actiune_displaydescriere)
  {
    this.autActiuneDisplaydescriere = aut_actiune_displaydescriere;
  }

}

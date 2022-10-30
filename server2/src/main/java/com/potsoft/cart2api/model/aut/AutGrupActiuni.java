package com.potsoft.cart2api.model.aut;

import java.util.HashSet;
import java.util.Set;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Where;



@Entity
@Table(name = "aut_grupactiuni", 
    uniqueConstraints = {
      @UniqueConstraint(columnNames = "aut_grupactiuni_cod"), 
      @UniqueConstraint(columnNames = "aut_grupactiuni_nume")
    })
public class AutGrupActiuni {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "aut_grupactiuni_id")
  private Long autGrupactiuniId;

  @NotBlank
  @Size(max = 10)
  @Column(name = "aut_grupactiuni_cod")
  private String autGrupactiuniCod;

  @NotBlank
  @Size(max = 32)
  @Column(name = "aut_grupactiuni_nume")
  private String autGrupactiuniNume;

  @Size(max = 256)
  @Column(name = "aut_grupactiuni_descriere")
  private String autGrupactiuniDescriere;


  @NotBlank
  @Size(max = 32)
  @Column(name = "aut_grupactiuni_displaynume")
  private String autGrupactiuniDisplaynume;

  @Size(max = 256)
  @Column(name = "aut_grupactiuni_displaydescriere")
  private String autGrupactiuniDisplaydescriere;

  @Where(clause = "aut_grupactactiune_parentactid is null")
  @OrderBy("aut_grupactactiune_importanta")
  @OneToMany(mappedBy = "autGrupactactiuneGrupactid", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<AutGrupActActiune> grupactactiuni = new HashSet<>();

  @Where(clause = "aut_grupactactiune_parentactid is not null")
  @OrderBy("aut_grupactactiune_importanta")
  @OneToMany(mappedBy = "autGrupactactiuneGrupactid", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<AutGrupActActiune> grupactactiunisec = new HashSet<>();


	public AutGrupActiuni() 
  {
	}

	public AutGrupActiuni( Long   aut_grupactiuni_id, String aut_grupactiuni_cod, 
                 String aut_grupactiuni_nume, String aut_grupactiuni_descriere, 
                 String aut_grupactiuni_displaynume, String aut_grupactiuni_displaydescriere) 
  {
		this.autGrupactiuniId               = aut_grupactiuni_id;
		this.autGrupactiuniCod              = aut_grupactiuni_cod;
    this.autGrupactiuniNume             = aut_grupactiuni_nume;
    this.autGrupactiuniDescriere        = aut_grupactiuni_descriere;
	  this.autGrupactiuniDisplaynume      = aut_grupactiuni_displaynume;
    this.autGrupactiuniDisplaydescriere = aut_grupactiuni_displaydescriere;
	}

  public Long getAutGrupactiuniId() 
  {
    return this.autGrupactiuniId;
  }

  public void setAutGrupactiuniId(Long aut_grupactiuni_id) 
  {
    this.autGrupactiuniId = aut_grupactiuni_id;
  }


  public String getAutGrupactiuniCod() 
  {
    return this.autGrupactiuniCod;
  }

  public void setAutGrupactiuniCod(String aut_grupactiuni_cod) 
  {
    this.autGrupactiuniCod = aut_grupactiuni_cod;
  }


  public String getAutGrupactiuniNume() 
  {
    return this.autGrupactiuniNume;
  }

  public void setAutGrupactiuniNume(String aut_grupactiuni_nume) 
  {
    this.autGrupactiuniNume = aut_grupactiuni_nume;
  }


  public String getAutGrupactiuniDescriere() 
  {
    return this.autGrupactiuniDescriere;
  }

  public void setAutGrupactiuniDescriere(String aut_grupactiuni_descriere)
  {
    this.autGrupactiuniDescriere = aut_grupactiuni_descriere;
  }


  public String getAutGrupactiuniDisplayNume() 
  {
    return this.autGrupactiuniDisplaynume;
  }

  public void setAutGrupactiuniDisplayNume(String aut_grupactiuni_displaynume) 
  {
    this.autGrupactiuniDisplaynume = aut_grupactiuni_displaynume;
  }


  public String getAutGrupactiuniDisplaydescriere() 
  {
    return this.autGrupactiuniDisplaydescriere;
  }

  public void setAutGrupactiuniDisplaydescriere(String aut_grupactiuni_displaydescriere)
  {
    this.autGrupactiuniDisplaydescriere = aut_grupactiuni_displaydescriere;
  }

  public Set<AutGrupActActiune> getGrupactactiuni() {
    return this.grupactactiuni;
  }

  public void setGrupactactiuni(Set<AutGrupActActiune> grupactactiuni) {
    this.grupactactiuni = grupactactiuni;
  }

  
  public Set<AutGrupActActiune> getGrupactactiunisec() {
    return this.grupactactiunisec;
  }

  public void setGrupactactiunisec(Set<AutGrupActActiune> grupactactiunisec) {
    this.grupactactiunisec = grupactactiunisec;
  }

}

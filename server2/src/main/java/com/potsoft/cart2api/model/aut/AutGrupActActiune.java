package com.potsoft.cart2api.model.aut;

//import java.util.HashSet;
//import java.util.Set;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//import org.hibernate.annotations.Where;

//import org.hibernate.annotations.Where;



@Entity
@Table(name = "aut_grupactactiune")
public class AutGrupActActiune
{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "aut_grupactactiune_id")
  private Long autGrupactactiuneId;


  @NotNull
  @Column(name = "aut_grupactactiune_grupactid")
  private Long autGrupactactiuneGrupactid;

  @NotBlank
  @Size(max = 10)
  @Column(name = "aut_grupactactiune_grupactcod")
  private String autGrupactactiuneGrupactcod;


  @NotNull
  @Column(name = "aut_grupactactiune_actid")
  private Long autGrupactactiuneActid;

  @NotBlank
  @Size(max = 25)
  @Column(name = "aut_grupactactiune_actcod")
  private String autGrupactactiuneActcod;


  @NotNull        
  @Column(name = "aut_grupactactiune_importanta")
  private int autGrupactactiuneImportanta;

  //@Where(clause = "aut_grupactactiune_parentactid is null")
  @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "aut_grupactactiune_actid", referencedColumnName = "aut_actiune_id", insertable = false, updatable = false)
	private AutActiune actiune;

  
  @NotNull
  @Column(name = "aut_grupactactiune_parentactid")
  private Long autGrupactactiuneParentactid;

  @NotBlank
  @Size(max = 25)
  @Column(name = "aut_grupactactiune_parentactcod")
  private String autGrupactactiuneParentactcod;



	public AutGrupActActiune() 
  {
	}

	public AutGrupActActiune( Long   aut_grupactactiune_id, 
          Long aut_grupactactiune_grupactid, String aut_grupactactiune_grupactcod, 
          Long aut_grupactactiune_actid, String aut_grupactactiune_actcod, int aut_grupactactiune_importanta,
          Long aut_grupactactiune_parentactid, String aut_grupactactiune_parentactcod) 
  {
		this.autGrupactactiuneId           = aut_grupactactiune_id;
		this.autGrupactactiuneGrupactid    = aut_grupactactiune_grupactid;
    this.autGrupactactiuneGrupactcod   = aut_grupactactiune_grupactcod;
		this.autGrupactactiuneActid        = aut_grupactactiune_actid;
    this.autGrupactactiuneActcod       = aut_grupactactiune_actcod;
	  this.autGrupactactiuneImportanta   = aut_grupactactiune_importanta;
		this.autGrupactactiuneParentactid  = aut_grupactactiune_parentactid;
    this.autGrupactactiuneParentactcod = aut_grupactactiune_parentactcod;
	}


  public Long getAutGrupactactiuneId() 
  {
    return this.autGrupactactiuneId;
  }

  public void setAutGrupactactiuneId(Long aut_grupactactiune_id) 
  {
    this.autGrupactactiuneId = aut_grupactactiune_id;
  }


  public Long getAutGrupactactiuneGrupactid() 
  {
    return this.autGrupactactiuneGrupactid;
  }

  public void setAutGrupactactiuneGrupactid(Long aut_grupactactiune_grupactid) 
  {
    this.autGrupactactiuneGrupactid = aut_grupactactiune_grupactid;
  }


  public String getAutGrupactactiuneGrupactcod() 
  {
    return this.autGrupactactiuneGrupactcod;
  }

  public void setAutGrupactactiuneGrupactcod(String aut_grupactactiune_grupactcod) 
  {
    this.autGrupactactiuneGrupactcod = aut_grupactactiune_grupactcod;
  }


 
  public Long getAutGrupactactiuneActid() 
  {
    return this.autGrupactactiuneActid;
  }

  public void setAutGrupactactiuneActid(Long aut_grupactactiune_actid) 
  {
    this.autGrupactactiuneActid = aut_grupactactiune_actid;
  }


  public String getAutGrupactactiuneActcod() 
  {
    return this.autGrupactactiuneActcod;
  }

  public void setAutGrupactactiuneGrupActcod(String aut_grupactactiune_actcod) 
  {
    this.autGrupactactiuneActcod = aut_grupactactiune_actcod;
  }  
  

  
  public int getAutGrupactactiuneImportanta() 
  {
    return this.autGrupactactiuneImportanta;
  }

  public void setAutGrupactactiuneImportanta(int aut_grupactactiune_importanta) 
  {
    this.autGrupactactiuneImportanta = aut_grupactactiune_importanta;
  } 


  public AutActiune getActiune() {
    return this.actiune;
  }

  public void setActiune(AutActiune actiune) {
    this.actiune = actiune;
  }



  public Long getAutGrupactactiuneParentactid() 
  {
    return this.autGrupactactiuneParentactid;
  }

  public void setAutGrupactactiuneParentactid(Long aut_grupactactiune_parentactid) 
  {
    this.autGrupactactiuneParentactid = aut_grupactactiune_parentactid;
  }


  public String getAutGrupactactiuneParentactcod() 
  {
    return this.autGrupactactiuneParentactcod;
  }

  public void setAutGrupactactiuneGrupParentactcod(String aut_grupactactiune_parentactcod) 
  {
    this.autGrupactactiuneParentactcod = aut_grupactactiune_parentactcod;
  }  

}

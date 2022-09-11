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



@Entity
@Table(name = "aut_rolgrupact")
public class AutRolGrupAct
{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "aut_rolgrupact_id")
  private Long autRolgrupactId;


  @NotNull
  @Column(name = "aut_rolgrupact_rolid")
  private Long autRolgrupactRolid;

  @NotBlank
  @Size(max = 10)
  @Column(name = "aut_rolgrupact_rolcod")
  private String autRolgrupactRolcod;


  @NotNull
  @Column(name = "aut_rolgrupact_grupactid")
  private Long autRolgrupactGrupactid;

  @NotBlank
  @Size(max = 10)
  @Column(name = "aut_rolgrupact_grupactcod")
  private String autRolgrupactGrupactcod;


  @NotNull
  @Column(name = "aut_rolgrupact_importanta")
  private int autRolgrupactImportanta;

  //@Where(clause = "aut_userrol_activ_yn = 'y'")
  @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "aut_rolgrupact_grupactid", referencedColumnName = "aut_grupactiuni_id", insertable = false, updatable = false)
	private AutGrupActiuni grupactiuni;

  
	public AutRolGrupAct() 
  {
	}

	public AutRolGrupAct( Long   aut_rolgrupact_id, 
          Long aut_rolgrupact_rolid, String aut_rolgrupact_rolcod, 
          Long aut_rolgrupact_grupactid, String aut_rolgrupact_grupactcod, int aut_rolgrupact_importanta) 
  {
		this.autRolgrupactId           = aut_rolgrupact_id;
		this.autRolgrupactRolid        = aut_rolgrupact_rolid;
    this.autRolgrupactRolcod       = aut_rolgrupact_rolcod;
		this.autRolgrupactGrupactid    = aut_rolgrupact_grupactid;
    this.autRolgrupactGrupactcod   = aut_rolgrupact_grupactcod;
	  this.autRolgrupactImportanta   = aut_rolgrupact_importanta;
	}


  public Long getAutRolgrupactId() 
  {
    return this.autRolgrupactId;
  }

  public void setAutRolgrupactId(Long aut_rolgrupact_id) 
  {
    this.autRolgrupactId = aut_rolgrupact_id;
  }


  public Long getAutRolgrupactRolid() 
  {
    return this.autRolgrupactRolid;
  }

  public void setAutRolgrupactRolid(Long aut_rolgrupact_rolid) 
  {
    this.autRolgrupactRolid = aut_rolgrupact_rolid;
  }


  public String getAutRolgrupactRolcod() 
  {
    return this.autRolgrupactRolcod;
  }

  public void setAutRolgrupactRolcod(String aut_rolgrupact_rolcod) 
  {
    this.autRolgrupactRolcod = aut_rolgrupact_rolcod;
  }


 
  public Long getAutRolgrupactGrupactid() 
  {
    return this.autRolgrupactGrupactid;
  }

  public void setAutRolgrupactGrupactid(Long aut_rolgrupact_grupactid) 
  {
    this.autRolgrupactGrupactid = aut_rolgrupact_grupactid;
  }


  public String getAutRolgrupactGrupactcod() 
  {
    return this.autRolgrupactGrupactcod;
  }

  public void setAutRolgrupactGrupactcod(String aut_rolgrupact_grupactcod) 
  {
    this.autRolgrupactRolcod = aut_rolgrupact_grupactcod;
  }  
  

  
  public int getAutRolgrupactImportanta() 
  {
    return this.autRolgrupactImportanta;
  }

  public void setAutRolgrupactImportanta(int aut_rolgrupact_importanta) 
  {
    this.autRolgrupactImportanta = aut_rolgrupact_importanta;
  } 


  public AutGrupActiuni getGrupactiuni() {
    return this.grupactiuni;
  }

  public void setGrupactiuni(AutGrupActiuni grupactiuni) {
    this.grupactiuni = grupactiuni;
  }

}

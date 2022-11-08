package com.potsoft.cart2api.model.aut;

import java.util.ArrayList;

//import com.potsoft.cart2api.model.aut.AutUserRol;

//import java.util.HashSet;
import java.util.List;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Where;




@Entity
@Table(name = "aut_user", 
    uniqueConstraints = { 
      @UniqueConstraint(columnNames = "aut_user_nume") 
    })
public class AutUser {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "aut_user_id")
  private Long autUserId;

  @NotBlank
  @Size(max = 20)
  @Column(name = "aut_user_nume")
  private String autUserNume;

  @NotBlank
  @Size(max = 255)
  @Column(name = "aut_user_parola")
  private String autUserParola;

  @NotBlank
  @Size(max = 1)
  @Column(name = "aut_user_activ_yn")
  private String autUserActivyn;

  @Size(max = 20)
  @Column(name = "aut_user_startdt", insertable = false, updatable = false)
  private String autUserStartdt;


  @Size(max = 20)
  @Column(name = "aut_user_enddt")
  private String autUserEnddt;


  
  //@OneToMany(fetch = FetchType.EAGER)
	//@JoinTable(name = "aut_userrol", joinColumns = @JoinColumn(name = "aut_userrol_userid", referencedColumnName = "aut_userrol_userid"))
  
  @Where(clause = "aut_userrol_activ_yn = 'y'")
  @OneToMany(fetch=FetchType.EAGER, mappedBy = "autUserrolUserid", cascade = CascadeType.ALL, orphanRemoval = true)
	//@Transient
  private List<AutUserRol> roles = new ArrayList<AutUserRol>();

  

	public AutUser() 
  {
	}

	public AutUser( Long   aut_user_id, String aut_user_nume, String aut_user_parola, 
                  String aut_user_activ_yn, String aut_user_startdt, String aut_user_enddt) 
  {
		this.autUserId       = aut_user_id;
		this.autUserNume     = aut_user_nume;
    this.autUserParola   = aut_user_parola;
		this.autUserActivyn  = aut_user_activ_yn;
		this.autUserStartdt  = aut_user_startdt;
    this.autUserEnddt    = aut_user_enddt;
	}

  public Long getAutUserId() 
  {
    return this.autUserId;
  }

  public void setAutUserId(Long aut_user_id) 
  {
    this.autUserId = aut_user_id;
  }


  public String getAutUserNume() 
  {
    return this.autUserNume;
  }

  public void setAutUserNume(String aut_user_nume) 
  {
    this.autUserNume = aut_user_nume;
  }


  public String getAutUserParola() 
  {
    return this.autUserParola;
  }

  public void setAutUserParola(String aut_user_parola) 
  {
    this.autUserParola = aut_user_parola;
  }


  public String getAutUserActivyn() 
  {
    return this.autUserActivyn;
  }

  public void setAutUserActivyn(String aut_user_activ_yn) 
  {
    this.autUserActivyn = aut_user_activ_yn;
  }


  public String getAutUserStartdt() 
  {
    return this.autUserStartdt;
  }

  public void setAutUserStartdt(String aut_user_startdt) 
  {
    this.autUserStartdt = aut_user_startdt;
  }


  public String getAutUserEnddt() 
  {
    return this.autUserEnddt;
  }

  public void setAutUserEnddt(String aut_user_enddt) 
  {
    this.autUserEnddt = aut_user_enddt;
  }

 
  public List<AutUserRol> getRoles() {
    return roles;
  }

  public void setRoles(List<AutUserRol> roles) {
    this.roles = roles;
  }
  
  
}

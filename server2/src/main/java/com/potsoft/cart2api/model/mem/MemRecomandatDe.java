package com.potsoft.cart2api.model.mem;

//import com.potsoft.cart2api.model.aut.userrol.MemRecomandatdeRol;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "mem_recomandatde")
public class MemRecomandatDe{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mem_recomandatde_id")
  private Long memRecomandatdeId;


  @NotNull
  @Column(name = "mem_recomandatde_refmembruid")
  private Long memRecomandatdeRefmembruid;

  @Size(max = 16)
  @Column(name = "mem_recomandatde_refmembrucodunic")
  private String memRecomandatdeRefmembrucodunic;


  @NotNull
  @Column(name = "mem_recomandatde_refuserid")
  private Long memRecomandatdeRefuserid;
  
  @Size(max = 20)
  @Column(name = "mem_recomandatde_refusernume")
  private String memRecomandatdeRefusernume;



  @NotNull
  @Column(name = "mem_recomandatde_newmembruid")
  private Long memRecomandatdeNewmembruid;

  @Size(max = 16)
  @Column(name = "mem_recomandatde_newmembrucodunic")
  private String memRecomandatdeNewmembrucodunic;


  @NotNull
  @Column(name = "mem_recomandatde_newuserid")
  private Long memRecomandatdeNewuserid;
  
  @Size(max = 20)
  @Column(name = "mem_recomandatde_newusernume")
  private String memRecomandatdeNewusernume;
  



	public MemRecomandatDe() 
  {
	}

	public MemRecomandatDe( Long memRecomandatDeId, 
                       Long memRecomandatDeRefmembruid, String memRecomandatDeRefmembrucodunic,
                       Long memRecomandatDeRefuserid, String memRecomandatDeRefusernume,
                       Long memRecomandatDeNewmembruid, String memRecomandatDeNewmembrucodunic,
                       Long memRecomandatDeNewuserid, String memRecomandatDeNewusernume) 
  {
    this.memRecomandatdeId                = memRecomandatDeId;

    this.memRecomandatdeRefmembruid          = memRecomandatDeRefmembruid;
    this.memRecomandatdeRefmembrucodunic     = memRecomandatDeRefmembrucodunic;

    this.memRecomandatdeRefuserid            = memRecomandatDeRefuserid;
    this.memRecomandatdeRefusernume          = memRecomandatDeRefusernume;


    this.memRecomandatdeNewmembruid          = memRecomandatDeNewmembruid;
    this.memRecomandatdeNewmembrucodunic     = memRecomandatDeNewmembrucodunic;

    this.memRecomandatdeNewuserid            = memRecomandatDeNewuserid;
    this.memRecomandatdeNewusernume          = memRecomandatDeNewusernume;
    
  }


  public Long getMemRecomandatdeId() 
  {
    return this.memRecomandatdeId;
  }

  public void setMemRecomandatdeId(Long memRecomandatdeId) 
  {
    this.memRecomandatdeId = memRecomandatdeId;
  }

  
  
  public Long getMemRecomandatdeRefmembruid() 
  {
    return this.memRecomandatdeRefmembruid;
  }

  public void setMemRecomandatdeRefmembruid(Long memRecomandatdeRefmembruid) 
  {
    this.memRecomandatdeRefmembruid = memRecomandatdeRefmembruid;
  }


  public String getMemRecomandatdeRefmembrucodunic() 
  {
    return this.memRecomandatdeRefmembrucodunic;
  }

  public void setMemRecomandatdeRefmembruCodunic(String memRecomandatdeRefmembrucodunic) 
  {
    this.memRecomandatdeRefmembrucodunic = memRecomandatdeRefmembrucodunic;
  }



  public Long getMemRecomandatdeRefuserid() 
  {
    return this.memRecomandatdeRefuserid;
  }

  public void setMemRecomandatdeRefuserid(Long memRecomandatdeRefuserid) 
  {
    this.memRecomandatdeRefuserid = memRecomandatdeRefuserid;
  }


  public String getMemRecomandatdeRefusernume() 
  {
    return this.memRecomandatdeRefusernume;
  }

  public void setMemRecomandatdeRefusernume(String memRecomandatdeRefusernume) 
  {
    this.memRecomandatdeRefusernume = memRecomandatdeRefusernume;
  }


  public Long getMemRecomandatdeNewmembruid() 
  {
    return this.memRecomandatdeNewmembruid;
  }

  public void setMemRecomandatdeNewmembruid(Long memRecomandatdeNewmembruid) 
  {
    this.memRecomandatdeNewmembruid = memRecomandatdeNewmembruid;
  }


  public String getMemRecomandatdeNewmembrucodunic() 
  {
    return this.memRecomandatdeNewmembrucodunic;
  }

  public void setMemRecomandatdeNewmembruCodunic(String memRecomandatdeNewmembrucodunic) 
  {
    this.memRecomandatdeNewmembrucodunic = memRecomandatdeNewmembrucodunic;
  }



  public Long getMemRecomandatdeNewuserid() 
  {
    return this.memRecomandatdeNewuserid;
  }

  public void setMemRecomandatdeNewuserid(Long memRecomandatdeNewuserid) 
  {
    this.memRecomandatdeNewuserid = memRecomandatdeNewuserid;
  }


  public String getMemRecomandatdeNewusernume() 
  {
    return this.memRecomandatdeNewusernume;
  }

  public void setMemRecomandatdeNewusernume(String memRecomandatdeNewusernume) 
  {
    this.memRecomandatdeNewusernume = memRecomandatdeNewusernume;
  }


  
}

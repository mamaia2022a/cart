package com.potsoft.cart2api.model.mes;



import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;




@Entity
@Table(name = "mes_tipmesaj", 
    uniqueConstraints = {
      @UniqueConstraint(columnNames = "mes_tipmesaj_cod"), 
      @UniqueConstraint(columnNames = "mes_tipmesaj_nume")
    })
public class MesTipMesaj {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "mes_tipmesaj_id")
  private Long mesTipmesajId;

  @NotBlank
  @Size(max = 10)
  @Column(name = "mes_tipmesaj_cod")
  private String mesTipmesajCod;

  @NotBlank
  @Size(max = 1)
  @Column(name = "mes_tipmesaj_reloginyn")
  private String mesTipmesajReloginyn;

  @NotBlank
  @Size(max = 128)
  @Column(name = "mes_tipmesaj_nume")
  private String mesTipmesajNume;

  @NotBlank
  @Size(max = 128)
  @Column(name = "mes_tipmesaj_displaynume")
  private String mesTipmesajDisplaynume;

  
  
	public MesTipMesaj() 
  {
	}

	public MesTipMesaj( Long   mes_tipmesaj_id, String mes_tipmesaj_cod, 
                      String mes_tipmesaj_reloginyn,
                      String mes_tipmesaj_nume, String mes_tipmesaj_displaynume) 
  {
		this.mesTipmesajId               = mes_tipmesaj_id;
		this.mesTipmesajCod              = mes_tipmesaj_cod;
    this.mesTipmesajReloginyn        = mes_tipmesaj_reloginyn;
    this.mesTipmesajNume             = mes_tipmesaj_nume;
    this.mesTipmesajDisplaynume      = mes_tipmesaj_displaynume;
	}

  public Long getTipmesajId() 
  {
    return this.mesTipmesajId;
  }

  public void setTipmesajId(Long mes_tipmesaj_id) 
  {
    this.mesTipmesajId = mes_tipmesaj_id;
  }


  public String getTipmesajCod() 
  {
    return this.mesTipmesajCod;
  }

  public void setTipmesajCod(String mes_tipmesaj_cod) 
  {
    this.mesTipmesajCod = mes_tipmesaj_cod;
  }


  public String getTipmesajReloginyn() 
  {
    return this.mesTipmesajReloginyn;
  }

  public void setTipmesajReloginyn(String mes_tipmesaj_reloginyn) 
  {
    this.mesTipmesajReloginyn = mes_tipmesaj_reloginyn;
  }


  public String getTipmesajNume() 
  {
    return this.mesTipmesajNume;
  }

  public void setTipmesajNume(String mes_tipmesaj_nume) 
  {
    this.mesTipmesajNume = mes_tipmesaj_nume;
  }


  public String getTipmesajDisplaynume() 
  {
    return this.mesTipmesajDisplaynume;
  }

  public void setTipmesajDisplaynume(String mes_tipmesaj_displaynume)
  {
    this.mesTipmesajDisplaynume = mes_tipmesaj_displaynume;
  }


  

}

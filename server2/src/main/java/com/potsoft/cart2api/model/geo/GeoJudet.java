package com.potsoft.cart2api.model.geo;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name = "geo_judet", 
    uniqueConstraints = {
      @UniqueConstraint(columnNames = "geo_judet_cod"), 
      @UniqueConstraint(columnNames = "geo_judet_nume")
    })
public class GeoJudet {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "geo_judet_id")
  private Long geoJudetId;

  @NotNull
  @Column(name = "geo_judet_zonataraid")
  private Long geoJudetZonataraid;

  @NotBlank
  @Size(max = 2)
  @Column(name = "geo_judet_zonataracod")
  private String geoJudetZonataracod;

  @NotBlank
  @Size(max = 10)
  @Column(name = "geo_judet_zonataranume")
  private String geoJudetZonataranume;

  @NotBlank
  @Size(max = 2)
  @Column(name = "geo_judet_cod")
  private String geoJudetCod;

  @NotBlank
  @Size(max = 32)
  @Column(name = "geo_judet_nume")
  private String geoJudetNume;

  @NotBlank
  @Size(max = 32)
  @Column(name = "geo_judet_numescurt")
  private String geoJudetNumescurt;

  @NotNull
  @Column(name = "geo_judet_siruta")
  private String geoJudetSiruta;

  @NotNull
  @Column(name = "geo_judet_regiuneid")
  private String geoJudetRegiuneid;


	public GeoJudet() 
  {
	}

	public GeoJudet( Long   geo_judet_id, 
                   Long   geo_judet_zonataraid, String geo_judet_zonataracod, String geo_judet_zonataranume,
                   String geo_judet_cod, String geo_judet_nume, String geo_judet_numescurt,
                   String geo_judet_siruta, String geo_judet_regiuneid) 
  {
		this.geoJudetId           = geo_judet_id;
    this.geoJudetZonataraid   = geo_judet_zonataraid;
    this.geoJudetZonataracod  = geo_judet_zonataracod;
    this.geoJudetZonataranume = geo_judet_zonataranume;
		this.geoJudetCod          = geo_judet_cod;
    this.geoJudetNume         = geo_judet_nume;
    this.geoJudetNumescurt    = geo_judet_numescurt;
    this.geoJudetSiruta       = geo_judet_siruta;
    this.geoJudetRegiuneid    = geo_judet_regiuneid;
	}

  public Long getGeoJudetId() 
  {
    return this.geoJudetId;
  }

  public void setGeoJudetId(Long geo_judet_id) 
  {
    this.geoJudetId = geo_judet_id;
  }


  public Long getGeoJudetZonataraid() 
  {
    return this.geoJudetZonataraid;
  }

  public void setGeoJudetZonataraid(Long geo_judet_zonataraid) 
  {
    this.geoJudetZonataraid = geo_judet_zonataraid;
  }


  public String getGeoJudetZonataracod() 
  {
    return this.geoJudetZonataracod;
  }

  public void setGeoJudetZonataracod(String geo_judet_Zonataracod) 
  {
    this.geoJudetZonataracod = geo_judet_Zonataracod;
  }


  public String getGeoJudetZonataranume() 
  {
    return this.geoJudetZonataranume;
  }

  public void setGeoJudetZonataranume(String geo_judet_Zonataranume) 
  {
    this.geoJudetZonataranume = geo_judet_Zonataranume;
  }


  public String getGeoJudetCod() 
  {
    return this.geoJudetCod;
  }

  public void setGeoJudetCod(String geo_judet_cod) 
  {
    this.geoJudetCod = geo_judet_cod;
  }


  public String getGeoJudetNume() 
  {
    return this.geoJudetNume;
  }

  public void setGeoJudetNume(String geo_judet_nume) 
  {
    this.geoJudetNume = geo_judet_nume;
  }


  public String getGeoJudetNumescurt() 
  {
    return this.geoJudetNumescurt;
  }

  public void setGeoJudetNumescurt(String geo_judet_numescurt) 
  {
    this.geoJudetNumescurt = geo_judet_numescurt;
  }


  public String getGeoJudetSiruta() 
  {
    return this.geoJudetSiruta;
  }

  public void setGeoJudetSiruta(String geo_judet_siruta) 
  {
    this.geoJudetSiruta = geo_judet_siruta;
  }

  
  public String getGeoJudetRegiuneid() 
  {
    return this.geoJudetRegiuneid;
  }

  public void setGeoJudetRegiuneid(String geo_judet_regiuneid) 
  {
    this.geoJudetRegiuneid = geo_judet_regiuneid;
  }

}

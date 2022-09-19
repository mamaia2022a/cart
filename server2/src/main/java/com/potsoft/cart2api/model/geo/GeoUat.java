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
@Table(name = "geo_uat", 
    uniqueConstraints = {
      @UniqueConstraint(columnNames = "geo_uat_cod"), 
      @UniqueConstraint(columnNames = "geo_uat_nume")
    })
public class GeoUat {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "geo_uat_id")
  private Long geoUatId;

  @NotNull
  @Column(name = "geo_uat_zonataraid")
  private Long geoUatZonataraid;

  @NotBlank
  @Size(max = 2)
  @Column(name = "geo_uat_zonataracod")
  private String geoUatZonataracod;

  @NotBlank
  @Size(max = 10)
  @Column(name = "geo_uat_zonataranume")
  private String geoUatZonataranume;

  @NotNull
  @Column(name = "geo_uat_judetid")
  private Long geoUatJudetid;

  @NotBlank
  @Size(max = 2)
  @Column(name = "geo_uat_judetcod")
  private String geoUatJudetcod;

  @NotBlank
  @Size(max = 32)
  @Column(name = "geo_uat_judetnume")
  private String geoUatJudetnume;

  @NotBlank
  @Size(max = 2)
  @Column(name = "geo_uat_cod")
  private String geoUatCod;

  @NotBlank
  @Size(max = 32)
  @Column(name = "geo_uat_nume")
  private String geoUatNume;


  @NotNull
  @Column(name = "geo_uat_latitudine")
  private Double geoUatLatitudine;

  @NotNull
  @Column(name = "geo_uat_longitudine")
  private Double geoUatLongitudine;

  @NotBlank
  @Size(max = 32)
  @Column(name = "geo_uat_regiuneid")
  private Long geoUatRegiuneid;

  
	public GeoUat() 
  {
	}

	public GeoUat( Long   geo_uat_id, 
                   Long   geo_uat_zonataraid, String geo_uat_zonataracod, String geo_uat_zonataranume,
                   Long   geo_uat_judetid, String geo_uat_judetcod, String geo_uat_judetnume,
                   String geo_uat_cod, String geo_uat_nume,
                   Double geo_uat_latitudine, Double geo_uat_longitudine, Long geo_uat_regiuneid) 
  {
		this.geoUatId           = geo_uat_id;
    this.geoUatZonataraid   = geo_uat_zonataraid;
    this.geoUatZonataracod  = geo_uat_zonataracod;
    this.geoUatZonataranume = geo_uat_zonataranume;
    this.geoUatJudetid      = geo_uat_judetid;
    this.geoUatJudetcod     = geo_uat_judetcod;
    this.geoUatJudetnume    = geo_uat_judetnume;
		this.geoUatCod          = geo_uat_cod;
    this.geoUatNume         = geo_uat_nume;
		this.geoUatLatitudine   = geo_uat_latitudine;
    this.geoUatLongitudine  = geo_uat_longitudine;
		this.geoUatRegiuneid    = geo_uat_regiuneid;
	}

  public Long getGeoUatId() 
  {
    return this.geoUatId;
  }

  public void setGeoUatId(Long geo_uat_id) 
  {
    this.geoUatId = geo_uat_id;
  }


  public Long getGeoUatZonataraid() 
  {
    return this.geoUatZonataraid;
  }

  public void setGeoUatZonataraid(Long geo_uat_zonataraid) 
  {
    this.geoUatZonataraid = geo_uat_zonataraid;
  }


  public String getGeoUatZonataracod() 
  {
    return this.geoUatZonataracod;
  }

  public void setGeoUatZonataracod(String geo_uat_Zonataracod) 
  {
    this.geoUatZonataracod = geo_uat_Zonataracod;
  }


  public String getGeoUatZonataranume() 
  {
    return this.geoUatZonataranume;
  }

  public void setGeoUatZonataranume(String geo_uat_Zonataranume) 
  {
    this.geoUatZonataranume = geo_uat_Zonataranume;
  }


  public Long getGeoUatJudetid() 
  {
    return this.geoUatJudetid;
  }

  public void setGeoUatJudetid(Long geo_uat_judetid) 
  {
    this.geoUatJudetid = geo_uat_judetid;
  }


  public String getGeoUatJudetcod() 
  {
    return this.geoUatJudetcod;
  }

  public void setGeoUatJudetcod(String geo_uat_judetcod) 
  {
    this.geoUatJudetcod = geo_uat_judetcod;
  }


  public String getGeoUatJudetnume() 
  {
    return this.geoUatJudetnume;
  }

  public void setGeoUatJudetnume(String geo_uat_judetnume) 
  {
    this.geoUatJudetnume = geo_uat_judetnume;
  }


  public String getGeoUatCod() 
  {
    return this.geoUatCod;
  }

  public void setGeoUatCod(String geo_uat_cod) 
  {
    this.geoUatCod = geo_uat_cod;
  }


  public String getGeoUatNume() 
  {
    return this.geoUatNume;
  }

  public void setGeoUatNume(String geo_uat_nume) 
  {
    this.geoUatNume = geo_uat_nume;
  }


  public Double getGeoUatLatitudine() 
  {
    return this.geoUatLatitudine;
  }

  public void setGeoUatLatitudine(Double geo_uat_latitudine) 
  {
    this.geoUatLatitudine = geo_uat_latitudine;
  }


  public Double getGeoUatLongitudine() 
  {
    return this.geoUatLongitudine;
  }

  public void setGeoUatLongitudine(Double geo_uat_longitudine) 
  {
    this.geoUatLongitudine = geo_uat_longitudine;
  }


  public Long getGeoUatRegiuneid() 
  {
    return this.geoUatRegiuneid;
  }

  public void setGeoUatRegiuneid(Long geo_uat_regiuneid) 
  {
    this.geoUatRegiuneid = geo_uat_regiuneid;
  }

}

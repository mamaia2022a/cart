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
@Table(name = "geo_localitate", 
    uniqueConstraints = {
      @UniqueConstraint(columnNames = "geo_localitate_cod"), 
    })
public class GeoLocalitate {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "geo_localitate_id")
  private Long geoLocalitateId;

  @NotNull
  @Column(name = "geo_localitate_zonataraid")
  private Long geoLocalitateZonataraid;

  @NotBlank
  @Size(max = 2)
  @Column(name = "geo_localitate_zonataracod")
  private String geoLocalitateZonataracod;

  @NotBlank
  @Size(max = 10)
  @Column(name = "geo_localitate_zonataranume")
  private String geoLocalitateZonataranume;

  
  @NotNull
  @Column(name = "geo_localitate_judetid")
  private Long geoLocalitateJudetid;

  @NotBlank
  @Size(max = 2)
  @Column(name = "geo_localitate_judetcod")
  private String geoLocalitateJudetcod;

  @NotBlank
  @Size(max = 32)
  @Column(name = "geo_localitate_judetnume")
  private String geoLocalitateJudetnume;


  @NotNull
  @Column(name = "geo_localitate_uatid")
  private Long geoLocalitateUatid;

  @NotNull
  @Column(name = "geo_localitate_uatcod")
  private Long geoLocalitateUatcod;

  @NotBlank
  @Size(max = 64)
  @Column(name = "geo_localitate_uatnume")
  private String geoLocalitateUatnume;
  

  @NotNull
  @Column(name = "geo_localitate_cod")
  private Long geoLocalitateCod;

  @NotBlank
  @Size(max = 32)
  @Column(name = "geo_localitate_nume")
  private String geoLocalitateNume;


  @NotNull
  @Column(name = "geo_localitate_latitudine")
  private Double geoLocalitateLatitudine;

  @NotNull
  @Column(name = "geo_localitate_longitudine")
  private Double geoLocalitateLongitudine;

  @NotBlank
  @Size(max = 32)
  @Column(name = "geo_localitate_regiuneid")
  private String geoLocalitateRegiuneid;

  
	public GeoLocalitate() 
  {
	}

	public GeoLocalitate( Long   geo_localitate_id, 
                   Long   geo_localitate_zonataraid, String geo_localitate_zonataracod, String geo_localitate_zonataranume,
                   Long   geo_localitate_judetid, String geo_localitate_judetcod, String geo_localitate_judetnume,
                   Long   geo_localitate_uatid, Long geo_localitate_uatcod, String geo_localitate_uatnume,
                   Long   geo_localitate_cod, String geo_localitate_nume,
                   Double geo_localitate_latitudine, Double geo_localitate_longitudine, String geo_localitate_regiuneid) 
  {
		this.geoLocalitateId           = geo_localitate_id;
    this.geoLocalitateZonataraid   = geo_localitate_zonataraid;
    this.geoLocalitateZonataracod  = geo_localitate_zonataracod;
    this.geoLocalitateZonataranume = geo_localitate_zonataranume;
    this.geoLocalitateJudetid      = geo_localitate_judetid;
    this.geoLocalitateJudetcod     = geo_localitate_judetcod;
    this.geoLocalitateJudetnume    = geo_localitate_judetnume;
    this.geoLocalitateUatid        = geo_localitate_uatid;
    this.geoLocalitateUatcod       = geo_localitate_uatcod;
    this.geoLocalitateUatnume      = geo_localitate_uatnume;
		this.geoLocalitateCod          = geo_localitate_cod;
    this.geoLocalitateNume         = geo_localitate_nume;
		this.geoLocalitateLatitudine   = geo_localitate_latitudine;
    this.geoLocalitateLongitudine  = geo_localitate_longitudine;
		this.geoLocalitateRegiuneid    = geo_localitate_regiuneid;
	}

  public Long getGeoLocalitateId() 
  {
    return this.geoLocalitateId;
  }

  public void setGeoLocalitateId(Long geo_localitate_id) 
  {
    this.geoLocalitateId = geo_localitate_id;
  }


  public Long getGeoLocalitateZonataraid() 
  {
    return this.geoLocalitateZonataraid;
  }

  public void setGeoLocalitateZonataraid(Long geo_localitate_zonataraid) 
  {
    this.geoLocalitateZonataraid = geo_localitate_zonataraid;
  }


  public String getGeoLocalitateZonataracod() 
  {
    return this.geoLocalitateZonataracod;
  }

  public void setGeoLocalitateZonataracod(String geo_localitate_Zonataracod) 
  {
    this.geoLocalitateZonataracod = geo_localitate_Zonataracod;
  }


  public String getGeoLocalitateZonataranume() 
  {
    return this.geoLocalitateZonataranume;
  }

  public void setGeoLocalitateZonataranume(String geo_localitate_Zonataranume) 
  {
    this.geoLocalitateZonataranume = geo_localitate_Zonataranume;
  }


  public Long getGeoLocalitateJudetid() 
  {
    return this.geoLocalitateJudetid;
  }

  public void setGeoLocalitateJudetid(Long geo_localitate_judetid) 
  {
    this.geoLocalitateJudetid = geo_localitate_judetid;
  }


  public String getGeoLocalitateJudetcod() 
  {
    return this.geoLocalitateJudetcod;
  }

  public void setGeoLocalitateJudetcod(String geo_localitate_judetcod) 
  {
    this.geoLocalitateJudetcod = geo_localitate_judetcod;
  }


  public String getGeoLocalitateJudetnume() 
  {
    return this.geoLocalitateJudetnume;
  }

  public void setGeoLocalitateJudetnume(String geo_localitate_judetnume) 
  {
    this.geoLocalitateJudetnume = geo_localitate_judetnume;
  }



  public Long getGeoLocalitateUatid() 
  {
    return this.geoLocalitateUatid;
  }

  public void setGeoLocalitateUatid(Long geo_localitate_uatid) 
  {
    this.geoLocalitateUatid = geo_localitate_uatid;
  }


  public Long getGeoLocalitateUatcod() 
  {
    return this.geoLocalitateUatcod;
  }

  public void setGeoLocalitateUatcod(Long geo_localitate_uatcod) 
  {
    this.geoLocalitateUatcod = geo_localitate_uatcod;
  }


  public String getGeoLocalitateUatnume() 
  {
    return this.geoLocalitateUatnume;
  }

  public void setGeoLocalitateUatnume(String geo_localitate_uatnume) 
  {
    this.geoLocalitateUatnume = geo_localitate_uatnume;
  }


  public Long getGeoLocalitateCod() 
  {
    return this.geoLocalitateCod;
  }

  public void setGeoLocalitateCod(Long geo_localitate_cod) 
  {
    this.geoLocalitateCod = geo_localitate_cod;
  }


  public String getGeoLocalitateNume() 
  {
    return this.geoLocalitateNume;
  }

  public void setGeoLocalitateNume(String geo_localitate_nume) 
  {
    this.geoLocalitateNume = geo_localitate_nume;
  }


  public Double getGeoLocalitateLatitudine() 
  {
    return this.geoLocalitateLatitudine;
  }

  public void setGeoLocalitateLatitudine(Double geo_localitate_latitudine) 
  {
    this.geoLocalitateLatitudine = geo_localitate_latitudine;
  }


  public Double getGeoLocalitateLongitudine() 
  {
    return this.geoLocalitateLongitudine;
  }

  public void setGeoLocalitateLongitudine(Double geo_localitate_longitudine) 
  {
    this.geoLocalitateLongitudine = geo_localitate_longitudine;
  }


  public String getGeoLocalitateRegiuneid() 
  {
    return this.geoLocalitateRegiuneid;
  }

  public void setGeoLocalitateRegiuneid(String geo_localitate_regiuneid) 
  {
    this.geoLocalitateRegiuneid = geo_localitate_regiuneid;
  }

}

package com.potsoft.cart2api.model.geo;

//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;

import javax.persistence.*;
//import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
@Table(name = "geo_zonatara", 
    uniqueConstraints = {
      @UniqueConstraint(columnNames = "geo_zonatara_cod"), 
      @UniqueConstraint(columnNames = "geo_zonatara_nume")
    })
public class GeoZonaTara {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "geo_zonatara_id")
  private Long geoZonaTaraId;

  @NotBlank
  @Size(max = 2)
  @Column(name = "geo_zonatara_cod")
  private String geoZonaTaraCod;

  @NotBlank
  @Size(max = 10)
  @Column(name = "geo_zonatara_nume")
  private String geoZonaTaraNume;


	public GeoZonaTara() 
  {
	}

	public GeoZonaTara( Long   geo_zonatara_id, String geo_zonatara_cod, String geo_zonatara_nume) 
  {
		this.geoZonaTaraId       = geo_zonatara_id;
		this.geoZonaTaraCod      = geo_zonatara_cod;
    this.geoZonaTaraNume     = geo_zonatara_nume;
	}

  public Long getGeoZonaTaraId() 
  {
    return this.geoZonaTaraId;
  }

  public void setGeoZonaTaraId(Long geo_zonatara_id) 
  {
    this.geoZonaTaraId = geo_zonatara_id;
  }


  public String getGeoZonaTaraCod() 
  {
    return this.geoZonaTaraCod;
  }

  public void setGeoZonaTaraCod(String geo_zonatara_cod) 
  {
    this.geoZonaTaraCod = geo_zonatara_cod;
  }


  public String getGeoZonaTaraNume() 
  {
    return this.geoZonaTaraNume;
  }

  public void setGeoZonaTaraNume(String geo_zonatara_nume) 
  {
    this.geoZonaTaraNume = geo_zonatara_nume;
  }


    
}

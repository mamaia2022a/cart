package com.potsoft.cart2api.controller;


import com.potsoft.cart2api.model.geo.GeoJudet;
import com.potsoft.cart2api.model.geo.GeoLocalitate;
import com.potsoft.cart2api.model.geo.GeoUat;
import com.potsoft.cart2api.model.geo.GeoZonaTara;
import com.potsoft.cart2api.service.GeoService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/geo")
public class GeoController {

	@Autowired
	private GeoService geoService;

	@CrossOrigin(origins = "*")
	@GetMapping("/zonetara/toate")
	public ResponseEntity<List<GeoZonaTara>> getZoneTara() 
	{
	  return ResponseEntity.ok(geoService.getZoneTara());
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/judete/toate")
	public ResponseEntity<List<GeoJudet>> getToateJudetele() 
	{
	  return ResponseEntity.ok(geoService.getToateJudetele());
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/judete/zonataraid/{zonataraid}")
	public ResponseEntity<List<GeoJudet>> getJudeteDinZonatara(@PathVariable(name = "zonataraid") Long zonataraid) 
	{
	  return ResponseEntity.ok(geoService.getJudeteleDupaZonataraid(zonataraid));
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/judete/zonataracod/{zonataracod}")
	public ResponseEntity<List<GeoJudet>> getJudeteDinZonaTara( @PathVariable(name = "zonataracod") String zonataracod) 
	{
	  return ResponseEntity.ok(geoService.getJudeteleDupaZonataracod(zonataracod));
	}


	@CrossOrigin(origins = "*")
	@GetMapping("/uat/toate") //inclusiv regiunile din Tarile din Diaspora
	public ResponseEntity<List<GeoUat>> getToateUateurile() 
	{
	  return ResponseEntity.ok(geoService.getToateUateurile());
	}
  
	@CrossOrigin(origins = "*")
	@GetMapping("/uat/zonataraid/{zonataraid}/judetid/{judetid}")
	public ResponseEntity<List<GeoUat>> getLocalitatileDinJudet(
		                                        @PathVariable(name = "zonataraid") Long zonataraid, 
	                                            @PathVariable(name = "judetid") Long judetid) 
	{
	  return ResponseEntity.ok(geoService.getUateuriDupaZonataraidSiDupaJudetid(zonataraid, judetid));
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/uat/zonataraid/{zonataraid}/judetcod/{judetcod}")
	public ResponseEntity<List<GeoUat>> getUateurileeDinJudet(
		                                          @PathVariable(name = "zonataraid") Long zonataraid,
		                                          @PathVariable(name = "judetcod") String judetcod) 
	{
	  return ResponseEntity.ok(geoService.getUateuriDupaZonataraidSiDupaJudetcod(zonataraid, judetcod));
	}



	@CrossOrigin(origins = "*")
	@GetMapping("/localitati/toate") //inclusiv regiunile din Tarile din Diaspora
	public ResponseEntity<List<GeoLocalitate>> getToateLocalitatile() 
	{
	  return ResponseEntity.ok(geoService.getToateLocalitatile());
	}
  
	@CrossOrigin(origins = "*")
	@GetMapping("/localitati/zonataraid/{zonataraid}/judetid/{judetid}/uatid/{uatid}")
	public ResponseEntity<List<GeoLocalitate>> getLocalitatileDinJudet(
		                                        @PathVariable(name = "zonataraid") Long zonataraid, 
	                                            @PathVariable(name = "judetid") Long judetid,
												@PathVariable(name = "uatid") Long uatid) 
	{
	  return ResponseEntity.ok(geoService.getLocalitatileDupaZonataraidDupaJudetidDupaUatid(zonataraid, judetid, uatid));
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/localitati/zonataraid/{zonataraid}/judetcod/{judetcod}/uatcod/{uatcod}")
	public ResponseEntity<List<GeoLocalitate>> getLocalitatileDinJudet(
		                                          @PathVariable(name = "zonataraid") Long zonataraid,
		                                          @PathVariable(name = "judetcod") String judetcod,
												  @PathVariable(name = "uatcod") Long uatcod) 
	{
	  return ResponseEntity.ok(geoService.getLocalitatileDupaZonataraidSiDupaJudetcodDupaUatcod(zonataraid, judetcod, uatcod));
	}



}

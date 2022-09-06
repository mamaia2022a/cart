package com.potsoft.cart2api.controller;


import com.potsoft.cart2api.model.geo.GeoJudet;
import com.potsoft.cart2api.model.geo.GeoLocalitate;
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
	public ResponseEntity<List<GeoJudet>> getToateJudeteleinTara() 
	{
	  return ResponseEntity.ok(geoService.getToateJudeteleDinTara());
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/localitati/toate")
	public ResponseEntity<List<GeoLocalitate>> getToateLocalitatileDinTara() 
	{
	  return ResponseEntity.ok(geoService.getToateLocalitatileDinTara());
	}
  
	@CrossOrigin(origins = "*")
	@GetMapping("/localitati/judetid/{judetid}")
	public ResponseEntity<List<GeoLocalitate>> getLocalitatiInJudet(@PathVariable(name = "judetid") Long judetid) 
	{
	  return ResponseEntity.ok(geoService.getToateLocalitatileDinJudetDupaJudetid(judetid));
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/localitati/judetcod/{judetcod}")
	public ResponseEntity<List<GeoLocalitate>> getLocalitatiInJudet(@PathVariable(name = "judetcod") String judetcod) 
	{
	  return ResponseEntity.ok(geoService.getToateLocalitatileDinJudetDupaJudetcod(judetcod));
	}



}

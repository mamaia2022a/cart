package com.potsoft.cart2api.service.impl;

import com.potsoft.cart2api.payload.request.mem.GrupRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembriGrupRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruAdresaRequest_Actualizare;
import com.potsoft.cart2api.payload.request.mem.MembruAdresaRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruCIRequest_Actualizare;
import com.potsoft.cart2api.payload.request.mem.MembruCIRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruCIRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruCotizatieRequest_Actualizare;
import com.potsoft.cart2api.payload.request.mem.MembruCotizatieRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruCotizatieRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.MembruCotizatieRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.MembruGrupRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.MembruRequest_Vizualizare;
import com.potsoft.cart2api.payload.request.mem.MembruRolRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruRolRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.MembruTipRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.MembruTipRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.SefGrupRequest_Creare;
import com.potsoft.cart2api.payload.request.mem.SefGrupRequest_Stergere;
import com.potsoft.cart2api.payload.request.mem.SefGrupRequest_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.GrupResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembriGrupResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruAdresaResponse_Actualizare;
import com.potsoft.cart2api.payload.response.mem.MembruAdresaResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruCIResponse_Actualizare;
import com.potsoft.cart2api.payload.response.mem.MembruCIResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruCIResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruCotizatieResponse_Actualizare;
import com.potsoft.cart2api.payload.response.mem.MembruCotizatieResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruCotizatieResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.MembruCotizatieResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.MembruGrupResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.MembruResponse_Vizualizare;
import com.potsoft.cart2api.payload.response.mem.MembruRolResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruRolResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.MembruTipResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.MembruTipResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.SefGrupResponse_Creare;
import com.potsoft.cart2api.payload.response.mem.SefGrupResponse_Stergere;
import com.potsoft.cart2api.payload.response.mem.SefGrupResponse_Vizualizare;
//import com.potsoft.cart2api.repository.mem.MemMembruRepository;
import com.potsoft.cart2api.service.MemService;

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemServiceImpl implements MemService 
{
	//@Autowired
	//private MemMembruRepository memMembruRepository;



    /** 
	@Override
	public List<GeoJudet> getToateJudetele()
	{
	  return this.geoJudetRepository.findAll();
	}
    */

	@Override
	public MembruResponse_Creare membru_Creare(Long userid, MembruRequest_Creare membruRequestCreare)
	{
	  return null;
	}
  
	@Override
	public MembruResponse_Stergere membru_Stergere(Long userid, MembruRequest_Stergere membruRequestStergere)
	{
	  return null;
	}

	@Override
	public MembruResponse_Vizualizare membru_Vizualizare(Long userid, MembruRequest_Vizualizare membruRequestVizualizare)
	{
	  return null;
	}
	
	
	@Override
	public MembruCIResponse_Creare  membruCI_Creare(Long userid, MembruCIRequest_Creare membruCIRequestCreare)
	{
	  return null;
	}
	
	@Override
	public MembruCIResponse_Actualizare membruCI_Actualizare(Long userid, 
	                                                         MembruCIRequest_Actualizare membruCIRequestActualizare)
	{
	  return null;
	}
	
	@Override
	public MembruCIResponse_Vizualizare membruCI_Vizualizare  (Long userid, 
	                                                           MembruCIRequest_Vizualizare membruCIRequestVizualizare)
	{
	  return null;
	}
  


	@Override
	public MembruCotizatieResponse_Creare membruCotizatie_Creare(Long userid, 
	                                                             MembruCotizatieRequest_Creare membruCotizatieRequestCreare)
	{
	  return null;
	}

	@Override
	public MembruCotizatieResponse_Actualizare membruCotizatie_Actualizare(Long userid, 
	                                                           MembruCotizatieRequest_Actualizare membruCotizatieRequestActualizare)
	{
	  return null;
	}
	
	@Override
	public MembruCotizatieResponse_Stergere membruCotizatie_Stergere(Long userid, MembruCotizatieRequest_Stergere    membruCotizatieRequestStergere)
	{
	  return null;
	}
	
	@Override
	public MembruCotizatieResponse_Vizualizare  membruCotizatie_Vizualizare(Long userid, 
	                                                MembruCotizatieRequest_Vizualizare membruCotizatieRequestVizualizare)
	{
	  return null;
	}
  

	@Override
	public MembruAdresaResponse_Actualizare membruAdresa_Actualizare(Long userid, 
	                                                MembruAdresaRequest_Actualizare membruCIRequestActualizare)
	{
	  return null;
	}

	@Override
	public MembruAdresaResponse_Vizualizare membruAdresa_Vizualizare(Long userid, MembruAdresaRequest_Vizualizare membruCIRequestVizualizare)
  	{
	  return null;
	}

  
	@Override
	public MembruTipResponse_Creare membruTip_Creare(Long userid, MembruTipRequest_Creare membruTipRequestCreare)
	{
	  return null;
	}
	
	@Override
	public MembruTipResponse_Stergere membruTip_Stergere(Long userid, MembruTipRequest_Stergere membruTipRequestStergere)
	{
	  return null;
	}
  
	@Override
	public MembruRolResponse_Creare membruRol_Creare(Long userid, MembruRolRequest_Creare membruRolRequestCreare)
	{
	  return null;
	}
	@Override
	public MembruRolResponse_Stergere membruRol_Stergere(Long userid, MembruRolRequest_Stergere membruRolRequestStergere)
	{
	  return null;
	}
  
  
	@Override
	public MembruGrupResponse_Creare membruGrup_Creare(Long userid, MembruGrupRequest_Creare membruGrupRequestCreare)
	{
	  return null;
	}
	
	@Override
	public MembruGrupResponse_Stergere membruGrup_Stergere(Long userid, MembruGrupRequest_Stergere membruGrupRequestStergere)
	{
	  return null;
	}

	@Override
	public MembruGrupResponse_Vizualizare membruGrup_Vizualizare(Long userid, MembruGrupRequest_Vizualizare membruGrupRequestVizualizare)
	{
	  return null;
	}
  

	@Override
	public SefGrupResponse_Creare sefGrup_Creare(Long userid, SefGrupRequest_Creare sefGrupRequestCreare)
	{
	  return null;
	}

	@Override
	public SefGrupResponse_Stergere sefGrup_Stergere(Long userid, SefGrupRequest_Stergere sefGrupRequestStergere)
	{
	  return null;
	}

	@Override
	public SefGrupResponse_Vizualizare sefGrup_Vizualizare(Long userid, SefGrupRequest_Vizualizare sefGrupRequestVizualizare)
	{
	  return null;
	}
  

	@Override
	public GrupResponse_Vizualizare  grup_Vizualizare(Long userid, GrupRequest_Vizualizare grupRequestVizualizare)
  	{
	  return null;
	}

	@Override
	public MembriGrupResponse_Vizualizare membriGrup_Vizualizare(Long userid, MembriGrupRequest_Vizualizare grupRequestVizualizare)
	{
	  return null;
	}
  


	
}




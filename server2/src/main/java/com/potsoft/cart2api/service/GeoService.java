package com.potsoft.cart2api.service;

import com.potsoft.cart2api.model.geo.GeoZonaTara;
import com.potsoft.cart2api.model.geo.GeoJudet;
import com.potsoft.cart2api.model.geo.GeoLocalitate;
import com.potsoft.cart2api.model.geo.GeoUat;

//import com.potsoft.cart2api.payload.AlbumResponse;
//import com.potsoft.cart2api.payload.response.general.ApiResponse;
//import com.potsoft.cart2api.payload.response.general.PagedResponse;
//import com.potsoft.cart2api.payload.request.AlbumRequest;
//import com.potsoft.cart2api.security.UserDetailsImpl;
//import org.springframework.http.ResponseEntity;
import java.util.List;

public interface GeoService {
	List<GeoZonaTara>      getZoneTara(); //Tara, Diaspora

	List<GeoJudet>         getToateJudetele();
	List<GeoJudet>         getJudeteleDupaZonataraid(Long zonataraid);
	List<GeoJudet>         getJudeteleDupaZonataracod(String zonataracod);

	List<GeoUat>           getToateUateurile();
	List<GeoUat>           getUateuriDupaZonataraidSiDupaJudetid(Long zonataraid, Long judetid);
	List<GeoUat>           getUateuriDupaZonataraidSiDupaJudetcod(Long zonataraid, String judetcod);

	List<GeoLocalitate>    getToateLocalitatile();
	List<GeoLocalitate>    getLocalitatileDupaZonataraidDupaJudetidDupaUatid(Long zonataraid, Long judetid, Long uatid);
	List<GeoLocalitate>    getLocalitatileDupaZonataraidSiDupaJudetcodDupaUatcod(Long zonataraid, String judetcod, Long uatcod);
	
}


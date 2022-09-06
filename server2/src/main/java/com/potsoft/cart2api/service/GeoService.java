package com.potsoft.cart2api.service;

import com.potsoft.cart2api.model.geo.GeoZonaTara;
import com.potsoft.cart2api.model.geo.GeoJudet;
import com.potsoft.cart2api.model.geo.GeoLocalitate;

//import com.potsoft.cart2api.payload.AlbumResponse;
//import com.potsoft.cart2api.payload.response.general.ApiResponse;
//import com.potsoft.cart2api.payload.response.general.PagedResponse;
//import com.potsoft.cart2api.payload.request.AlbumRequest;
//import com.potsoft.cart2api.security.UserDetailsImpl;
//import org.springframework.http.ResponseEntity;
import java.util.List;

public interface GeoService {
	List<GeoZonaTara>      getZoneTara(); //Tara, Diaspora
	List<GeoJudet>         getToateJudeteleDinTara();

	List<GeoLocalitate>    getToateLocalitatileDinTara();
	List<GeoLocalitate>    getToateLocalitatileDinJudetDupaJudetid(Long judetid);
	List<GeoLocalitate>    getToateLocalitatileDinJudetDupaJudetcod(String judetcod);
	
	List<GeoLocalitate>    getToateLocalitatileDinTaraDiasporaDupaTaraid(Long taraid);
	List<GeoLocalitate>    getToateLocalitatileDinTaraDiasporaDupaTaracod2(String taracod2);

}

/**
 * 	PagedResponse<AlbumResponse> getAllAlbums(int page, int size);

	ResponseEntity<Album> addAlbum(AlbumRequest albumRequest, UserPrincipal currentUser);

	ResponseEntity<Album> getAlbum(Long id);

	ResponseEntity<AlbumResponse> updateAlbum(Long id, AlbumRequest newAlbum, UserPrincipal currentUser);

	ResponseEntity<ApiResponse> deleteAlbum(Long id, UserPrincipal currentUser);

	PagedResponse<Album> getUserAlbums(String username, int page, int size);

 */
package com.potsoft.cart2api.service.impl;

import com.potsoft.cart2api.service.GeoService;

import com.potsoft.cart2api.repository.geo.GeoZonaTaraRepository;
import com.potsoft.cart2api.model.geo.GeoJudet;
import com.potsoft.cart2api.model.geo.GeoLocalitate;
import com.potsoft.cart2api.model.geo.GeoUat;
import com.potsoft.cart2api.model.geo.GeoZonaTara;
import com.potsoft.cart2api.repository.geo.GeoJudetRepository;
import com.potsoft.cart2api.repository.geo.GeoLocalitateRepository;
import com.potsoft.cart2api.repository.geo.GeoUatRepository;

//import java.util.Arrays;
//import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GeoServiceImpl implements GeoService 
{

	@Autowired
	private GeoZonaTaraRepository geoZonaTaraRepository;

	@Autowired
	private GeoJudetRepository geoJudetRepository;

	@Autowired
	private GeoUatRepository geoUatRepository;

	@Autowired
	private GeoLocalitateRepository geoLocalitateRepository;

	

	@Override
	public List<GeoZonaTara> getZoneTara()
	{
	  return this.geoZonaTaraRepository.findAll();
	}



	@Override
	public List<GeoJudet> getToateJudetele()
	{
	  return this.geoJudetRepository.findAll();
	}
	
	@Override
	public List<GeoJudet> getJudeteleDupaZonataraid(Long zonataraid)
	{
	  return this.geoJudetRepository.findByGeoJudetZonataraidOrderByGeoJudetNume(zonataraid);
	}

	@Override
	public List<GeoJudet> getJudeteleDupaZonataracod(String zonataracod)
	{
	  return this.geoJudetRepository.findByGeoJudetZonataracodOrderByGeoJudetNume(zonataracod);
	}


	@Override
	public List<GeoUat> getToateUateurile()
	{
	 return this.geoUatRepository.findAll();
	}
  
	@Override
	public List<GeoUat> getUateuriDupaZonataraidSiDupaJudetid(Long zonataraid, Long judetid)
	{
	  return this.geoUatRepository.findByGeoUatZonataraidAndGeoUatJudetidOrderByGeoUatNume(zonataraid, judetid);
	}

	@Override
	public List<GeoUat> getUateuriDupaZonataraidSiDupaJudetcod(Long zonataraid, String judetcod)
	{
	  return this.geoUatRepository.findByGeoUatZonataraidAndGeoUatJudetcodOrderByGeoUatNume(zonataraid, judetcod);
	}




	@Override
	public List<GeoLocalitate> getToateLocalitatile()
	{
	 return this.geoLocalitateRepository.findAll();
	}
   
	@Override
	public List<GeoLocalitate> getLocalitatileDupaZonataraidDupaJudetidDupaUatid(Long zonataraid, Long judetid, Long uatid)
	{
	  return this.geoLocalitateRepository.findByGeoLocalitateZonataraidAndGeoLocalitateJudetidAndGeoLocalitateUatidOrderByGeoLocalitateNume(zonataraid, judetid, uatid);
	}

	@Override
	public List<GeoLocalitate> getLocalitatileDupaZonataraidSiDupaJudetcodDupaUatcod(Long zonataraid, String judetcod, Long uatcod)
	{
	  return this.geoLocalitateRepository.findByGeoLocalitateZonataraidAndGeoLocalitateJudetcodAndGeoLocalitateUatcodOrderByGeoLocalitateNume(zonataraid, judetcod, uatcod);
	}

	
}



/** https://github.com/amrsaeedhosny/countries/blob/main/countries.sql?h=1
import com.potsoft.cartapi.exception.CartapiException;
import com.potsoft.cartapi.exception.ResourceNotFoundException;
import com.potsoft.cartapi.model.Album;
import com.potsoft.cartapi.model.role.RoleName;
import com.potsoft.cartapi.model.user.User;
import com.potsoft.cartapi.payload.AlbumResponse;
import com.potsoft.cartapi.payload.ApiResponse;
import com.potsoft.cartapi.payload.PagedResponse;
import com.potsoft.cartapi.payload.request.AlbumRequest;
import com.potsoft.cartapi.repository.AlbumRepository;
import com.potsoft.cartapi.repository.UserRepository;
import com.potsoft.cartapi.security.UserPrincipal;
import com.potsoft.cartapi.service.AlbumService;
import com.potsoft.cartapi.utils.AppUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.potsoft.cartapi.utils.AppConstants.ID;

@Service
public class AlbumServiceImpl implements AlbumService {
	private static final String CREATED_AT = "createdAt";

	private static final String ALBUM_STR = "Album";

	private static final String YOU_DON_T_HAVE_PERMISSION_TO_MAKE_THIS_OPERATION = "You don't have permission to make this operation";

	@Autowired
	private AlbumRepository albumRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public PagedResponse<AlbumResponse> getAllAlbums(int page, int size) {
		AppUtils.validatePageNumberAndSize(page, size);

		Pageable pageable = PageRequest.of(page, size, Sort.Direction.DESC, CREATED_AT);

		Page<Album> albums = albumRepository.findAll(pageable);

		if (albums.getNumberOfElements() == 0) {
			return new PagedResponse<>(Collections.emptyList(), albums.getNumber(), albums.getSize(), albums.getTotalElements(),
					albums.getTotalPages(), albums.isLast());
		}

		List<AlbumResponse> albumResponses = Arrays.asList(modelMapper.map(albums.getContent(), AlbumResponse[].class));

		return new PagedResponse<>(albumResponses, albums.getNumber(), albums.getSize(), albums.getTotalElements(), albums.getTotalPages(),
				albums.isLast());
	}

	@Override
	public ResponseEntity<Album> addAlbum(AlbumRequest albumRequest, UserPrincipal currentUser) {
		User user = userRepository.getUser(currentUser);

		Album album = new Album();

		modelMapper.map(albumRequest, album);

		album.setUser(user);
		Album newAlbum = albumRepository.save(album);
		return new ResponseEntity<>(newAlbum, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<Album> getAlbum(Long id) {
		Album album = albumRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(ALBUM_STR, ID, id));
		return new ResponseEntity<>(album, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<AlbumResponse> updateAlbum(Long id, AlbumRequest newAlbum, UserPrincipal currentUser) {
		Album album = albumRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(ALBUM_STR, ID, id));
		User user = userRepository.getUser(currentUser);
		if (album.getUser().getId().equals(user.getId()) || currentUser.getAuthorities()
				.contains(new SimpleGrantedAuthority(RoleName.ROLE_ADMIN.toString()))) {
			album.setTitle(newAlbum.getTitle());
			Album updatedAlbum = albumRepository.save(album);

			AlbumResponse albumResponse = new AlbumResponse();

			modelMapper.map(updatedAlbum, albumResponse);

			return new ResponseEntity<>(albumResponse, HttpStatus.OK);
		}

		throw new CartapiException(HttpStatus.UNAUTHORIZED, YOU_DON_T_HAVE_PERMISSION_TO_MAKE_THIS_OPERATION);
	}

	@Override
	public ResponseEntity<ApiResponse> deleteAlbum(Long id, UserPrincipal currentUser) {
		Album album = albumRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(ALBUM_STR, ID, id));
		User user = userRepository.getUser(currentUser);
		if (album.getUser().getId().equals(user.getId()) || currentUser.getAuthorities()
				.contains(new SimpleGrantedAuthority(RoleName.ROLE_ADMIN.toString()))) {
			albumRepository.deleteById(id);
			return new ResponseEntity<>(new ApiResponse(Boolean.TRUE, "You successfully deleted album"), HttpStatus.OK);
		}

		throw new CartapiException(HttpStatus.UNAUTHORIZED, YOU_DON_T_HAVE_PERMISSION_TO_MAKE_THIS_OPERATION);
	}

	@Override
	public PagedResponse<Album> getUserAlbums(String username, int page, int size) {
		User user = userRepository.getUserByName(username);

		Pageable pageable = PageRequest.of(page, size, Sort.Direction.DESC, CREATED_AT);

		Page<Album> albums = albumRepository.findByCreatedBy(user.getId(), pageable);

		List<Album> content = albums.getNumberOfElements() > 0 ? albums.getContent() : Collections.emptyList();

		return new PagedResponse<>(content, albums.getNumber(), albums.getSize(), albums.getTotalElements(), albums.getTotalPages(), albums.isLast());
	}
}
*/
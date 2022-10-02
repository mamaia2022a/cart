package com.potsoft.cart2api.repository.geo;

import com.potsoft.cart2api.model.geo.GeoZonaTara;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;


import java.util.Optional;

@Repository
public interface GeoZonaTaraRepository extends JpaRepository<GeoZonaTara, Long> 
{
   List<GeoZonaTara> findAll();

   Optional<GeoZonaTara> findByGeoZonaTaraId(@NotNull Long geo_zonatara_cod);

   @Transactional
   default GeoZonaTara loadByGeoZonaTaraId(Long geo_zonatara_id)
   {
     return findByGeoZonaTaraId(geo_zonatara_id)
     .orElseThrow(() ->
     new ResourceNotFoundException("GeoZonaTara", 
                                   "geo_zonatara_id", geo_zonatara_id));
   }
}

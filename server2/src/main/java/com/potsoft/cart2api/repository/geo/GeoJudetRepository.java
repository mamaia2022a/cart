package com.potsoft.cart2api.repository.geo;

import com.potsoft.cart2api.model.geo.GeoJudet;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;

import java.util.Optional;


@Repository
public interface GeoJudetRepository extends JpaRepository<GeoJudet, Long> 
{
   List<GeoJudet> findAll();
   List<GeoJudet> findByGeoJudetZonataraidOrderByGeoJudetNume(Long zonataraid);
   List<GeoJudet> findByGeoJudetZonataracodOrderByGeoJudetNume(String zonataracod);

   Optional<GeoJudet> findByGeoJudetId(@NotNull Long geo_judet_id);

   @Transactional
   default GeoJudet loadByGeoJudetId(Long geo_judet_id)
   {
     return findByGeoJudetId(geo_judet_id)
     .orElseThrow(() ->
     new ResourceNotFoundException("GeoJudet", 
                                   "geo_judet_id", geo_judet_id));
   }

}

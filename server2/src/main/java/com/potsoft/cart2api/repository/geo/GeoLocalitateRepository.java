package com.potsoft.cart2api.repository.geo;

import com.potsoft.cart2api.model.geo.GeoLocalitate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;


import java.util.Optional;


@Repository
public interface GeoLocalitateRepository extends JpaRepository<GeoLocalitate, Long> 
{
   List<GeoLocalitate> findAll();
   List<GeoLocalitate> findByGeoLocalitateZonataraidAndGeoLocalitateJudetidAndGeoLocalitateUatidOrderByGeoLocalitateNume(Long zonataraid, Long judetid, Long uatid);
   List<GeoLocalitate> findByGeoLocalitateZonataraidAndGeoLocalitateJudetcodAndGeoLocalitateUatcodOrderByGeoLocalitateNume(Long zonataraid, String judetcod, long uatcod);

   Optional<GeoLocalitate> findByGeoLocalitateId(@NotNull Long geo_localitate_id);

   @Transactional
   default GeoLocalitate loadByGeoLocalitateId(Long geo_localitate_id)
   {
     return findByGeoLocalitateId(geo_localitate_id)
     .orElseThrow(() ->
     new ResourceNotFoundException("GeoLocalitate", 
                                   "geo_localitate_id", geo_localitate_id));
   }

}


/** https://www.baeldung.com/spring-data-derived-queries
 *  @Query("select e from Employee e where e.firstName = :searchName 
               or e.lastName = :searchName)
    List<Employee> findEmployeeByFirstNameOrLastName(
             @Param("searchName") String searchName);
 */
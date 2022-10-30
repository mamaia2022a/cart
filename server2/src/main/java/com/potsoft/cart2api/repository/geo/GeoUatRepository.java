package com.potsoft.cart2api.repository.geo;

import com.potsoft.cart2api.model.geo.GeoUat;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;


import java.util.Optional;


@Repository
public interface GeoUatRepository extends JpaRepository<GeoUat, Long> 
{
   List<GeoUat> findAll();
   List<GeoUat> findByGeoUatZonataraidAndGeoUatJudetidOrderByGeoUatNume(Long zonataraid, Long judetid);
   List<GeoUat> findByGeoUatZonataraidAndGeoUatJudetcodOrderByGeoUatNume(Long zonataraid, String judetcod);

   Optional<GeoUat> findByGeoUatId(@NotNull Long geo_uat_id);

   @Transactional
   default GeoUat loadByGeoUatId(Long geo_uat_id)
   {
     return findByGeoUatId(geo_uat_id)
     .orElseThrow(() ->
     new ResourceNotFoundException("GeoUat", 
                                   "geo_uat_id", geo_uat_id));
   }


}


/** https://www.baeldung.com/spring-data-derived-queries
 *  @Query("select e from Employee e where e.firstName = :searchName 
               or e.lastName = :searchName)
    List<Employee> findEmployeeByFirstNameOrLastName(
             @Param("searchName") String searchName);
 */
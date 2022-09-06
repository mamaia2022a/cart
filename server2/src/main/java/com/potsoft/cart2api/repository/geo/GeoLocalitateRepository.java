package com.potsoft.cart2api.repository.geo;

import com.potsoft.cart2api.model.geo.GeoLocalitate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import javax.validation.constraints.NotBlank;
//import java.util.Optional;

@Repository
public interface GeoLocalitateRepository extends JpaRepository<GeoLocalitate, Long> 
{
   List<GeoLocalitate> findAll();
   List<GeoLocalitate> findByGeoLocalitateZonataraidAndGeoLocalitateJudetid(Long zonataraid, Long judetid);
   List<GeoLocalitate> findByGeoLocalitateZonataraidAndGeoLocalitateJudetcod(Long zonataraid, String judetcod);
}


/** https://www.baeldung.com/spring-data-derived-queries
 *  @Query("select e from Employee e where e.firstName = :searchName 
               or e.lastName = :searchName)
    List<Employee> findEmployeeByFirstNameOrLastName(
             @Param("searchName") String searchName);
 */
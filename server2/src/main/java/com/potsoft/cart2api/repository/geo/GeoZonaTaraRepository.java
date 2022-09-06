package com.potsoft.cart2api.repository.geo;

import com.potsoft.cart2api.model.geo.GeoZonaTara;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import javax.validation.constraints.NotBlank;
//import java.util.Optional;

@Repository
public interface GeoZonaTaraRepository extends JpaRepository<GeoZonaTara, Long> 
{
   List<GeoZonaTara> findAll();
}

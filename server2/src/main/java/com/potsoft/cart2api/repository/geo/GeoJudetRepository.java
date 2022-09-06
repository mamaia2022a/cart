package com.potsoft.cart2api.repository.geo;

import com.potsoft.cart2api.model.geo.GeoJudet;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import javax.validation.constraints.NotBlank;
//import java.util.Optional;

@Repository
public interface GeoJudetRepository extends JpaRepository<GeoJudet, Long> 
{
   List<GeoJudet> findAll();
}

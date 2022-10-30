package com.potsoft.cart2api.repository.gen;

import com.potsoft.cart2api.model.gen.GenAcoperireGeografica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import java.util.Optional;


@Repository
public interface GenAcoperireGeograficaRepository extends JpaRepository<GenAcoperireGeografica, Long> 
{
    Optional<GenAcoperireGeografica> findByGenAcoperiregeograficaId(@NotNull Long gen_acoperiregeografica_id);
    Optional<GenAcoperireGeografica> findByGenAcoperiregeograficaCod(@NotBlank String gen_acoperiregeografica_cod);
  
    @Transactional
    default GenAcoperireGeografica loadByGenAcoperiregeograficaCod(String gen_acoperiregeografica_cod)
    {
      return findByGenAcoperiregeograficaCod(gen_acoperiregeografica_cod)
      .orElseThrow(() ->
      new ResourceNotFoundException("GenAcoperireGeografica", 
                                    "gen_acoperiregeografica_cod", gen_acoperiregeografica_cod));
    }
  
}

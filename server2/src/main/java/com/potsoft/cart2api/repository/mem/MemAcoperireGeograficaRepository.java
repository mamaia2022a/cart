package com.potsoft.cart2api.repository.mem;

import com.potsoft.cart2api.model.mem.MemAcoperireGeografica;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import java.util.Optional;


@Repository
public interface MemAcoperireGeograficaRepository extends JpaRepository<MemAcoperireGeografica, Long> 
{
    Optional<MemAcoperireGeografica> findByMemAcoperiregeograficaId(@NotNull Long mem_acoperiregeografica_id);
    Optional<MemAcoperireGeografica> findByMemAcoperiregeograficaCod(@NotBlank String mem_acoperiregeografica_cod);
  
    @Transactional
    default MemAcoperireGeografica loadByMemAcoperiregeograficaCod(String mem_acoperiregeografica_cod)
    {
      return findByMemAcoperiregeograficaCod(mem_acoperiregeografica_cod)
      .orElseThrow(() ->
      new ResourceNotFoundException("MemAcoperireGeografica", 
                                    "mem_acoperiregeografica_cod", mem_acoperiregeografica_cod));
    }
  
}

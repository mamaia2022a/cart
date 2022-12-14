package com.potsoft.cart2api.repository.mem;

import com.potsoft.cart2api.model.mem.MemGrup;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;


import java.util.Optional;


@Repository
public interface MemGrupRepository extends JpaRepository<MemGrup, Long> 
{
    @Modifying
    @Query("update MemGrup m set m.memGrupActivyn = 'n', m.memGrupEnddt = now() where m.memGrupSefgrupuserid = :sefgrupuserid")
    void dezactiveazaMemGrup(@Param(value = "sefgrupuserid") Long sefgrupuserid);

    Optional<MemGrup> findByMemGrupId(@NotBlank Long mem_grup_id);
    Optional<MemGrup> findByMemGrupCodunic(@NotBlank String mem_grup_codunic);
  
    @Transactional
    default MemGrup loadByMemGrupId(Long mem_grup_id)
    {
      return findByMemGrupId(mem_grup_id)
      .orElseThrow(() ->
      new ResourceNotFoundException("MemGrup", 
                                    "mem_grup_id", mem_grup_id));
    }

    @Transactional
    default MemGrup loadByMemGrupCodunic(String mem_grup_codunic)
    {
      return findByMemGrupCodunic(mem_grup_codunic)
      .orElseThrow(() ->
      new ResourceNotFoundException("MemGrup", 
                                    "mem_grup_codunic", mem_grup_codunic));
    }

}

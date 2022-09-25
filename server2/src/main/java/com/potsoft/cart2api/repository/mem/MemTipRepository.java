package com.potsoft.cart2api.repository.mem;

import com.potsoft.cart2api.model.mem.MemTip;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import java.util.Optional;


@Repository
public interface MemTipRepository extends JpaRepository<MemTip, Long> 
{
    Optional<MemTip> findByMemTipId(@NotNull Long mem_tip_id);
    Optional<MemTip> findByMemTipCod(@NotBlank String mem_tip_cod);
  
    @Transactional
    default MemTip loadByMemTipCod(String mem_tip_cod)
    {
      return findByMemTipCod(mem_tip_cod)
      .orElseThrow(() ->
      new ResourceNotFoundException("MemTip", 
                                    "mem_tip_cod", mem_tip_cod));
    }

}

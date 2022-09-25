package com.potsoft.cart2api.repository.mem;

import com.potsoft.cart2api.model.mem.MemTipRol;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import java.util.Optional;


@Repository
public interface MemTipRolRepository extends JpaRepository<MemTipRol, Long> 
{
    Optional<MemTipRol> findByMemTiprolId(@NotNull Long mem_tiprol_id);
    Optional<MemTipRol> findByMemTiprolCod(@NotBlank String mem_tiprol_cod);

    @Transactional
    default MemTipRol loadByMemTiprolCod(String mem_tiprol_cod)
    {
        return findByMemTiprolCod(mem_tiprol_cod)
        .orElseThrow(() ->
        new ResourceNotFoundException("MemTipRol", 
                                    "mem_tiprol_cod", mem_tiprol_cod));
    }
}

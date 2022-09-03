package com.potsoft.cart2api.repository.aut;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import com.potsoft.cart2api.model.aut.AutRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import java.util.Optional;

@Repository
public interface AutRolRepository extends JpaRepository<AutRol, Long> 
{
  Optional<AutRol> findByAutRolId(@NotNull Long aut_rol_id);
  Optional<AutRol> findByAutRolCod(@NotBlank String aut_rol_cod);

  @Transactional
  default AutRol loadByAutRolCod(String aut_rol_cod)
  {
    return findByAutRolCod(aut_rol_cod)
    .orElseThrow(() ->
    new ResourceNotFoundException("AutRol", 
                                  "aut_rol_cod", aut_rol_cod));
}

}

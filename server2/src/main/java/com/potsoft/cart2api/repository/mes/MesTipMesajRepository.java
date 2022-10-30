package com.potsoft.cart2api.repository.mes;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import com.potsoft.cart2api.model.mes.MesTipMesaj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import java.util.Optional;

@Repository
public interface MesTipMesajRepository extends JpaRepository<MesTipMesaj, Long> 
{
  Optional<MesTipMesaj> findByMesTipmesajId(@NotNull Long mes_tipmesaj_id);
  Optional<MesTipMesaj> findByMesTipmesajCod(@NotBlank String mes_tipmesaj_cod);

  @Transactional
  default MesTipMesaj loadByMesTipmesajCod(String mes_tipmesaj_cod)
  {
    return findByMesTipmesajCod(mes_tipmesaj_cod)
    .orElseThrow(() ->
    new ResourceNotFoundException("MesTipMesaj", 
                                  "mes_tipmesaj_cod", mes_tipmesaj_cod));
  }

}

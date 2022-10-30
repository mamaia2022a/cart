package com.potsoft.cart2api.repository.mes;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import com.potsoft.cart2api.model.mes.MesMesaj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;


import java.util.Optional;

@Repository
public interface MesMesajRepository extends JpaRepository<MesMesaj, Long> 
{
  Optional<MesMesaj> findByMesMesajId(@NotNull Long mes_mesaj_id);

  @Transactional
  default MesMesaj loadByMesMesajId(@NotNull Long mes_mesaj_id)
  {
    return findByMesMesajId(mes_mesaj_id)
    .orElseThrow(() ->
    new ResourceNotFoundException("MesMesaj", 
                                  "mes_mesaj_id", mes_mesaj_id));
  }

}

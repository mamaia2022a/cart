package com.potsoft.cart2api.repository.mes;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import com.potsoft.cart2api.model.mes.MesExpeditor;
import com.potsoft.cart2api.model.mes.MesMesaj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import java.util.Optional;

@Repository
public interface MesExpeditorRepository extends JpaRepository<MesExpeditor, Long> 
{
  Optional<MesMesaj> findByMesExpeditorUseridAndMesExpeditorRolcod(@NotNull Long mes_expeditor_userid,
                                                                   @NotBlank String mes_expeditor_rolcod);

  @Transactional
  default MesMesaj loadByMesExpeditorUseridAndMesExpeditorRolcod(@NotNull Long mes_expeditor_userid, 
                                                                 @NotBlank String mes_expeditor_rolcod)
  {
    return findByMesExpeditorUseridAndMesExpeditorRolcod(mes_expeditor_userid, mes_expeditor_rolcod)
    .orElseThrow(() ->
    new ResourceNotFoundException("MesExpeditor", 
                                  "mes_expeditor_userid, mes_expeditor_rolcod",  
                                  mes_expeditor_userid + " , " + mes_expeditor_rolcod));
  }

}
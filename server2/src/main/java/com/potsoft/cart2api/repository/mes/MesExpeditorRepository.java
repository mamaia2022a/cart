package com.potsoft.cart2api.repository.mes;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import com.potsoft.cart2api.model.mes.MesExpeditor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


@Repository
public interface MesExpeditorRepository extends JpaRepository<MesExpeditor, Long> 
{
  Optional<MesExpeditor> findByMesExpeditorUseridAndMesExpeditorRolcod(@NotNull Long mes_expeditor_userid,
                                                                       @NotBlank String mes_expeditor_rolcod);

  @Transactional
  default MesExpeditor loadByMesExpeditorUseridAndMesExpeditorRolcod(@NotNull Long mes_expeditor_userid, 
                                                                     @NotBlank String mes_expeditor_rolcod)
  {
    return findByMesExpeditorUseridAndMesExpeditorRolcod(mes_expeditor_userid, mes_expeditor_rolcod)
    .orElseThrow(() ->
    new ResourceNotFoundException("MesExpeditor", 
                                  "mes_expeditor_userid, mes_expeditor_rolcod",  
                                  mes_expeditor_userid + " , " + mes_expeditor_rolcod));
  }


  @Modifying
  @Query("update MesExpeditor m set m.mesExpeditorActivyn = 'n', m.mesExpeditorEnddt = now() where (m.mesExpeditorUserid = :userid) and (m.mesExpeditorRolcod = :rolcod)")
  void dezactiveazaMesExpeditor(@Param(value = "userid") Long userid,
                              @Param(value = "rolcod") String rolcod);

}

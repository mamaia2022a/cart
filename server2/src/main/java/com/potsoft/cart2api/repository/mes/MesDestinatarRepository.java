package com.potsoft.cart2api.repository.mes;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import com.potsoft.cart2api.model.mes.MesDestinatar;
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
public interface MesDestinatarRepository extends JpaRepository<MesDestinatar, Long> 
{
  Optional<MesDestinatar> findByMesDestinatarUseridAndMesDestinatarRolcod(@NotNull Long mes_destinatar_userid,
                                                                          @NotBlank String mes_destinatar_rolcod);

  @Transactional
  default MesDestinatar loadByMesDestinatarUseridAndMesDestinatarRolcod(@NotNull Long mes_destinatar_userid, 
                                                                        @NotBlank String mes_destinatar_rolcod)
  {
    return findByMesDestinatarUseridAndMesDestinatarRolcod(mes_destinatar_userid, mes_destinatar_rolcod)
    .orElseThrow(() ->
    new ResourceNotFoundException("MesDestinatar", 
                                  "mes_destinatar_userid, mes_destinatar_rolcod",  
                                  mes_destinatar_userid + " , " + mes_destinatar_rolcod));
  }

  @Modifying
  @Query("update MesDestinatar m set m.mesDestinatarActivyn = 'n', m.mesDestinatarEnddt = now() where (m.mesDestinatarUserid = :userid) and (m.mesDestinatarRolcod = :rolcod)")
  void dezactiveazaMesDestinatar(@Param(value = "userid") Long userid,
                                 @Param(value = "rolcod") String rolcod);

}

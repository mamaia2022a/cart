package com.potsoft.cart2api.repository.mes;

import com.potsoft.cart2api.model.mes.MesDestinMesaj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


@Repository
public interface MesDestinMesajRepository extends JpaRepository<MesDestinMesaj, Long> 
{
  List<MesDestinMesaj> findByMesDestinmesajDestuseridAndMesDestinmesajDestrolcod(@NotNull Long mes_mesaj_destuserid, 
                                                                                 @NotBlank String mes_mesaj_destrolcod);
                                                                                 
  @Query("select m from MesDestinMesaj m where (m.mesDestinmesajPrimityn ='n') and (m.mesDestinmesajDestuserid = :destuserid) order by mesDestinmesajDataprimirii" )
  List<MesDestinMesaj> loadListaMesajeNeprimiteDeUser(@Param(value = "destuserid") @NotNull Long destuserid);

}

package com.potsoft.cart2api.repository.mem;

import com.potsoft.cart2api.model.mem.MemMembru;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;


import java.util.Optional;


@Repository
public interface MemMembruRepository extends JpaRepository<MemMembru, Long> 
{

	Optional<MemMembru> findByMemMembruId(@NotNull Long membruid);
	Optional<MemMembru> findByMemMembruUserid(@NotNull Long userid);


	@Transactional
	default MemMembru loadByMemMembruId(Long membruid)
	{
	  return findByMemMembruId(membruid)
	  .orElseThrow(() ->
	  new ResourceNotFoundException("MemMembru", 
									"mem_membru_id", membruid));
  }


  @Transactional
	default MemMembru loadByMemMembruUserid(Long userid)
	{
	  return findByMemMembruUserid(userid)
	  .orElseThrow(() ->
	  new ResourceNotFoundException("MemMembru", 
									"mem_membru_userid", userid));
  }


  @Modifying
  @Query("update MemMembru m set m.memMembruActivyn = 'n', m.memMembruEnddt = now() where m.memMembruUserid = :userid")
  void dezactiveazaMemMembru(@Param(value = "userid") Long userid);

  @Modifying
  @Query("update MemMembru m set m.memMembruTipid = :memnewtipid, m.memMembruTipcod = :memnewtipcod where m.memMembruUserid = :userid")
  void schimbaMembruTip(@Param(value = "userid")       Long   userid,
                        @Param(value = "memnewtipid")  Long   memNewTipid,
                        @Param(value = "memnewtipcod") String memNewTipcod
                        );

  @Modifying
  @Query("update MemMembru m set m.memMembruGrupid = :memgrupid, m.memMembruGrupnume = :memgrupnume, memMembruGrupcodunic = :memGrupCodunic, m.memMembruTipid = :memnewtipid, m.memMembruTipcod = :memnewtipcod where m.memMembruUserid = :userid")
  void afiliereGrup(@Param(value = "userid")         Long   userid,
                    @Param(value = "memnewtipid")    Long   memNewTipid,
                    @Param(value = "memnewtipcod")   String memNewTipcod,
					@Param(value = "memgrupid")      Long   memGrupId,
					@Param(value = "memgrupnume")    String memGrupNume,
					@Param(value = "memgrupcodunic") String memGrupCodunic
                    );				  

  @Modifying
  @Query("update MemMembru m set m.memMembruGrupid = null, m.memMembruGrupnume = null, memMembruGrupcodunic = null, m.memMembruTipid = :memnewtipid, m.memMembruTipcod = :memnewtipcod where m.memMembruUserid = :userid")
  void dezafiliereGrup(@Param(value = "userid")    Long   userid,
                    @Param(value = "memnewtipid")  Long   memNewTipid,
                    @Param(value = "memnewtipcod") String memNewTipcod
                    );
}

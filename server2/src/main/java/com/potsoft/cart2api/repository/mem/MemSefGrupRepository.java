package com.potsoft.cart2api.repository.mem;

import com.potsoft.cart2api.model.mem.MemSefGrup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotNull;


import java.util.Optional;


@Repository
public interface MemSefGrupRepository extends JpaRepository<MemSefGrup, Long> 
{

    Optional<MemSefGrup> findByMemSefgrupUserid(@NotNull Long mem_sefgrup_userid);
  
    @Transactional
    default MemSefGrup loadByMemSefgrupUserid(Long mem_sefgrup_userid)
    {
      return findByMemSefgrupUserid(mem_sefgrup_userid)
      .orElseThrow(() ->
      new ResourceNotFoundException("MemSefGrup", 
                                    "mem_sefgrup_userid", mem_sefgrup_userid));
    }


    @Modifying
    @Query("update MemSefGrup m set m.memSefgrupActivyn = 'n', m.memSefgrupEnddt = now() where m.memSefgrupUserid = :userid")
    void dezactiveazaMemSefGrup(@Param(value = "userid") Long userid);

    @Modifying
    @Query("update MemSefGrup m set m.memSefgrupGrupid = :grupid, m.memSefgrupGrupnume = :grupnume, m.memSefgrupGrupcodunic = :grupcodunic where m.memSefgrupUserid = :userid")
    void actualizaregrupMemSefGrup(@Param(value = "userid") Long userid,
                                   @Param(value = "grupid") Long grupid,
                                   @Param(value = "grupnume") String grupnume, 
                                   @Param(value = "grupcodunic") String grupcodeunic);
}

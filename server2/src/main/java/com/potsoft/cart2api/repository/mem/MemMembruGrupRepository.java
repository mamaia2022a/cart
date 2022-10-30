package com.potsoft.cart2api.repository.mem;

import com.potsoft.cart2api.model.mem.MemMembruGrup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.potsoft.cart2api.exception.ResourceNotFoundException;
import org.springframework.transaction.annotation.Transactional;

//import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.util.List;
import java.util.Optional;


@Repository
public interface MemMembruGrupRepository extends JpaRepository<MemMembruGrup, Long> 
{

    @Query("select m from MemMembruGrup m where (m.memMembrugrupActivyn='y') and (m.memMembrugrupGrupid = :grupid)" )
    List<MemMembruGrup> loadMembriGrup(@Param(value = "grupid") Long grupid);

    @Query("select m from MemMembruGrup m where (m.memMembrugrupCerereyn='y') and (m.memMembrugrupAcceptareyn is null) and (m.memMembrugrupActivyn='n') and (m.memMembrugrupGrupid = :grupid)" )
    List<MemMembruGrup> loadMembriInAsteptare(@Param(value = "grupid") Long grupid);

    //List<MemMembruGrup> findByMemMembrugrupGrupid(Long mem_membrugrup_userid);

    Optional<MemMembruGrup> findByMemMembrugrupUserid(@NotNull Long mem_membrugrup_userid);
  
    @Transactional
    default MemMembruGrup loadByMemMembrugrupUserid(Long mem_membrugrup_userid)
    {
      return findByMemMembrugrupUserid(mem_membrugrup_userid)
      .orElseThrow(() ->
      new ResourceNotFoundException("MemMembruGrup", 
                                    "mem_membrugrup_userid", mem_membrugrup_userid));
    }


    //memMembruGrupRepository.loadByMemMembrugrupUserid(userid);
    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query("update MemMembruGrup m set m.memMembrugrupActivyn = 'y', m.memMembrugrupStartdt = now(), m.memMembrugrupAcceptareyn = 'y', m.memMembrugrupAcceptaredt = now() where m.memMembrugrupUserid = :userid")
    void acceptareAfiliere(@Param(value = "userid") Long userid);

    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query("update MemMembruGrup m set m.memMembrugrupAcceptareyn = 'n', m.memMembrugrupAcceptaredt = now() where m.memMembrugrupUserid = :userid")
    void refuzAfiliere(@Param(value = "userid") Long userid);

    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query("update MemMembruGrup m set m.memMembrugrupActivyn = 'y', m.memMembrugrupStartdt = now() where m.memMembrugrupUserid = :userid")
    void activare(@Param(value = "userid") Long userid);

    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query("update MemMembruGrup m set m.memMembrugrupActivyn = 'n', m.memMembrugrupPlecareyn = 'y', m.memMembrugrupEnddt = now() where m.memMembrugrupUserid = :userid")
    void plecare(@Param(value = "userid") Long userid);

    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query("update MemMembruGrup m set m.memMembrugrupActivyn = 'n', m.memMembrugrupExcludereyn = 'y', m.memMembrugrupEnddt = now() where m.memMembrugrupUserid = :userid")
    void excludere(@Param(value = "userid") Long userid);

}



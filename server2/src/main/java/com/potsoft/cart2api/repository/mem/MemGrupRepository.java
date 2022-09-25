package com.potsoft.cart2api.repository.mem;

import com.potsoft.cart2api.model.mem.MemGrup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


@Repository
public interface MemGrupRepository extends JpaRepository<MemGrup, Long> 
{
    @Modifying
    @Query("update MemGrup m set m.memGrupActivyn = 'n', m.memGrupEnddt = now() where m.memGrupSefgrupuserid = :sefgrupuserid")
    void dezactiveazaMemGrup(@Param(value = "sefgrupuserid") Long sefgrupuserid);

}

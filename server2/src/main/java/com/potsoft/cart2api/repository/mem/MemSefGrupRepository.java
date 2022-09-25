package com.potsoft.cart2api.repository.mem;

import com.potsoft.cart2api.model.mem.MemSefGrup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


@Repository
public interface MemSefGrupRepository extends JpaRepository<MemSefGrup, Long> 
{
    @Modifying
    @Query("update MemSefGrup m set m.memSefgrupActivyn = 'n', m.memSefgrupEnddt = now() where m.memSefgrupUserid = :userid")
    void dezactiveazaMemSefGrup(@Param(value = "userid") Long userid);

}

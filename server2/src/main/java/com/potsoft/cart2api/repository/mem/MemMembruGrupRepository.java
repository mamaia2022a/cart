package com.potsoft.cart2api.repository.mem;

import com.potsoft.cart2api.model.mem.MemMembruGrup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


@Repository
public interface MemMembruGrupRepository extends JpaRepository<MemMembruGrup, Long> 
{
    @Modifying
    @Query("update MemMembruGrup m set m.memMembrugrupActivyn = 'n', m.memMembrugrupEnddt = now() where m.memMembrugrupUserid = :userid")
    void dezactiveazaMemMembruGrup(@Param(value = "userid") Long userid);

}

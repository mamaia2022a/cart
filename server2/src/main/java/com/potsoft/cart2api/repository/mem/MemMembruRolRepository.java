package com.potsoft.cart2api.repository.mem;

import com.potsoft.cart2api.model.mem.MemMembruRol;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


@Repository
public interface MemMembruRolRepository extends JpaRepository<MemMembruRol, Long> 
{
    @Modifying
    @Query("update MemMembruRol m set m.memMembrurolActivyn = 'n', m.memMembrurolEnddt = now() where (m.memMembrurolUserid = :userid) and (m.memMembrurolTiprolcod = :memtiprolcod)")
    void dezactiveazaMemMembruRol(@Param(value = "userid") Long userid, @Param(value = "memtiprolcod") String memtiprolcod);

}

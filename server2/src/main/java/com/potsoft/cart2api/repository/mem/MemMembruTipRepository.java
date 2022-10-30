package com.potsoft.cart2api.repository.mem;

import com.potsoft.cart2api.model.mem.MemMembruTip;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface MemMembruTipRepository extends JpaRepository<MemMembruTip, Long> 
{
    @Modifying
    @Query("update MemMembruTip m set m.memMembrutipActivyn = 'n', m.memMembrutipEnddt = now() where (m.memMembrutipUserid = :userid) and (m.memMembrutipTipcod = :memtipcod)")
    void dezactiveazaMemMembruTip(@Param(value = "userid") Long userid, @Param(value = "memtipcod") String memtipcod);


}

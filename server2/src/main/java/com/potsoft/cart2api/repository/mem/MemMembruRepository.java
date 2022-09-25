package com.potsoft.cart2api.repository.mem;

import com.potsoft.cart2api.model.mem.MemMembru;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface MemMembruRepository extends JpaRepository<MemMembru, Long> 
{
    @Modifying
    @Query("update MemMembru m set m.memMembruActivyn = 'n' where m.memMembruId = :membruid")
    void deactivateMemTip(@Param(value = "membruid") Long membruid);

    @Modifying
    @Query("update MemMembru m set m.memMembruActivyn = 'n', m.memMembruEnddt = now() where m.memMembruUserid = :userid")
    void dezactiveazaMemMembru(@Param(value = "userid") Long userid);

}

package com.potsoft.cart2api.repository.aut;

import com.potsoft.cart2api.model.aut.AutUserRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.util.List;
//import java.util.Date;
import java.util.Optional;

@Repository
public interface AutUserRolRepository extends JpaRepository<AutUserRol, Long> 
{

	@Query("select m from AutUserRol m where (m.autUserrolActivyn ='y') and (m.autUserrolUserid = :userid)" )
	List<AutUserRol> loadUserRoluriActive(@Param(value = "userid") @NotNull Long userid);
  
	Optional<AutUserRol> findByAutUserrolId(@NotBlank Long aut_userrol_id);
	Optional<AutUserRol> findByAutUserrolUseridAndAutUserrolRolcod(@NotBlank Long aut_userrol_userid, 
                                                                   @NotBlank String aut_userrol_rolcod);

	// str_to_date(:str_e, '%Y-%m-%d %T')
    // @Modifying(clearAutomatically = true, flushAutomatically = true)
	@Modifying
    @Query("update AutUserRol r set r.autUserrolActivyn = 'n', r.autUserrolEnddt = now() where (r.autUserrolUserid = :userid) and (r.autUserrolRolcod = :rolcod)")
    void dezactiveazaAutUserRol(@Param(value = "userid") Long userid, @Param(value = "rolcod") String rolcod);

	
	@Transactional
	default AutUserRol loadByAutUserrolUseridAndAutUserrolRolcod(@NotBlank Long aut_userrol_userid, 
                                                                 @NotBlank String aut_userrol_rolcod)
	{
	  return findByAutUserrolUseridAndAutUserrolRolcod(aut_userrol_userid, aut_userrol_rolcod)
	  .orElseThrow(() ->
	  new ResourceNotFoundException("AutUserRol", 
									"aut_userinfo_userid, aut_userinfo_rolcod", 
                                               aut_userrol_userid + " ," + aut_userrol_rolcod));
    }

}

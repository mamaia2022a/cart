package com.potsoft.cart2api.repository.aut;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import com.potsoft.cart2api.model.aut.AutUser;
import com.potsoft.cart2api.security.UserDetailsImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotBlank;
import java.util.Optional;

@Repository
public interface AutUserRepository extends JpaRepository<AutUser, Long> 
{
	Optional<AutUser> findByAutUserId(@NotBlank Long aut_user_id);
	Optional<AutUser> findByAutUserNume(@NotBlank String aut_user_nume);

	Boolean existsByAutUserNume(@NotBlank String aut_user_nume);

	//Optional<User> findByUsernameOrEmail(String username, String email);

	@Transactional
	default AutUser loadByAutUserId(Long aut_user_id)
	{
	  return findByAutUserId(aut_user_id)
	  .orElseThrow(() ->
	  new ResourceNotFoundException("AutRol", 
									"aut_rol_cod", aut_user_id));
    }
  
	
	default AutUser getUser(UserDetailsImpl currentUser) 
	{
	  return getUserByName(currentUser.getUsername());
	}

	default AutUser getUserByName(String aut_user_nume) 
	{
		return findByAutUserNume(aut_user_nume)
		.orElseThrow(() ->
		new ResourceNotFoundException("AutUser", 
		                              "aut_user_nume", aut_user_nume));
	}
}

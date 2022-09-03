package com.potsoft.cart2api.repository;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import com.potsoft.cart2api.model.aut.user.AutUser;
import com.potsoft.cart2api.security.UserDetailsImpl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotBlank;
import java.util.Optional;

@Repository
public interface AutRepository extends JpaRepository<AutUser, Long> {
	Optional<AutUser> findByAutUserNume(@NotBlank String aut_user_nume);
	Optional<AutUser> findByAutUserId(@NotBlank Long aut_user_id);
	//Optional<AutUser> findByEmail(@NotBlank String email);

	Boolean existsByAutUserNume(@NotBlank String aut_user_nume);

	//Boolean existsByEmail(@NotBlank String email);

	//Optional<User> findByUsernameOrEmail(String username, String email);

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

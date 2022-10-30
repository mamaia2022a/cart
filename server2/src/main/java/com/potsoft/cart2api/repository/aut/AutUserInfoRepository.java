package com.potsoft.cart2api.repository.aut;

import com.potsoft.cart2api.model.aut.AutUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.potsoft.cart2api.exception.ResourceNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.NotBlank;
import java.util.Optional;

@Repository
public interface AutUserInfoRepository extends JpaRepository<AutUserInfo, Long> 
{
	Optional<AutUserInfo> findByAutUserInfoId(@NotBlank Long aut_userinfo_id);
	Optional<AutUserInfo> findByAutUserInfoUserid(@NotBlank Long aut_userinfo_userid);

	Optional<AutUserInfo> findByAutUserInfoTelefon(@NotBlank String aut_user_telefon);
	Optional<AutUserInfo> findByAutUserInfoEmail(@NotBlank String aut_user_email);

	Boolean existsByAutUserInfoTelefon(@NotBlank String aut_user_telefon);
    Boolean existsByAutUserInfoEmail(@NotBlank String email);

	@Transactional
	default AutUserInfo loadByAutUserInfoUserid(Long aut_userinfo_userid)
	{
	  return findByAutUserInfoUserid(aut_userinfo_userid)
	  .orElseThrow(() ->
	  new ResourceNotFoundException("AutUserInfo", 
									"aut_userinfo_userid", aut_userinfo_userid));
    }

}

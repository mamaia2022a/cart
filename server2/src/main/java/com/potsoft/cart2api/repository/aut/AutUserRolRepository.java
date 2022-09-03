package com.potsoft.cart2api.repository.aut;

import com.potsoft.cart2api.model.aut.AutUserRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import javax.validation.constraints.NotBlank;
//import java.util.Optional;

@Repository
public interface AutUserRolRepository extends JpaRepository<AutUserRol, Long> 
{

}

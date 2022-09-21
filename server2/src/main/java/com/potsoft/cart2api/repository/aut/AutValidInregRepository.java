package com.potsoft.cart2api.repository.aut;

//import com.potsoft.cart2api.exception.ResourceNotFoundException;
import com.potsoft.cart2api.model.aut.AutValidInreg;

//import org.jboss.logging.Param;
//import org.jboss.logging:jboss-logging-annotations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.jpa.Param;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;

//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;


//import java.util.Optional;

@Repository
public interface AutValidInregRepository extends JpaRepository<AutValidInreg, Long> 
{
  @Query( "select o from AutValidInreg o where (aut_validinreg_userid = :userid) and (aut_validinreg_codvalidare = :codvalidare)" )
  AutValidInreg loadValidInreg(
              @Param("userid") Long userid, 
              @Param("codvalidare") Long codvalidare);

              /** 
  Optional<AutValidInreg> findByAutValidinregCodvalidare(@NotNull Long aut_validinreg_codvalidare);

  @Transactional
  default AutValidInreg loadByautValidinregCodvalidare(Long aut_validinreg_codvalidare)
  {
    return findByAutValidinregCodvalidare(aut_validinreg_codvalidare)
    .orElseThrow(() ->
    new ResourceNotFoundException("AutValidInreg", 
                                  "aut_validinreg_codvalidare", aut_validinreg_codvalidare));
  }
   */
}


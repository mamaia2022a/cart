package com.potsoft.cart2api.repository.aut;

import com.potsoft.cart2api.model.aut.AutRolGrupAct;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.util.List;


@Repository
public interface AutRolGrupActRepository extends JpaRepository<AutRolGrupAct, Long> 
{
  List<AutRolGrupAct> findByAutRolgrupactRolid(@NotNull Long aut_rolgrupact_rolid);
  List<AutRolGrupAct> findByAutRolgrupactRolcod(@NotBlank String aut_rolgrupact_rolcod);

}

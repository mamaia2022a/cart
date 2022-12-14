package com.potsoft.cart2api.repository.mem;

import com.potsoft.cart2api.model.mem.MemRecomandatDe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import javax.validation.constraints.NotBlank;
//import java.util.Optional;

@Repository
public interface MemRecomandatDeRepository extends JpaRepository<MemRecomandatDe, Long> 
{

}

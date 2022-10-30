package com.potsoft.cart2api.repository.aut;

import com.potsoft.cart2api.model.aut.AutValidInreg;


import lombok.NonNull;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

//import com.potsoft.cart2api.repository.aut.Specification;

public final class AutValidInregSpecifications {
    public static Specification<AutValidInreg> hasValidationCode(@NonNull Long autValidInregValidationcod) {
        return (Root<AutValidInreg> root, CriteriaQuery<?> query, CriteriaBuilder cb)
                -> cb.equal(root.get("autValidinregCodvalidare"), autValidInregValidationcod);
    }


    /**
    public static Specification<AutValidInreg> isEndDateLowerThanCurrentDate() {
      LocalDate date = LocalDate.now();//.minus(6, ChronoUnit.HOURS); 
      return (Root<AutValidInreg> root, CriteriaQuery<?> query, CriteriaBuilder cb)
              -> cb.equal(new String(""), "");//(LocalDate)(root.get("autValidinregEnddt")));
  }*/

  /** 
    public static Specification<AutValidInreg> isEndDateLowerThanCurrentDate() {
      return (Root<AutValidInreg> root, CriteriaQuery<?> query, CriteriaBuilder cb)
        LocalDate date = LocalDate.now();//.minus(6, ChronoUnit.HOURS);
        return builder.lessThan(date, root.get()) ;;//.lessThan(date, root.get(AutValidInreg.getAutValidinregEnddt()));
      };
    }*/
    
    /**
     * public static Specification<AutValidInreg> hasAge(DateTTime age) {
        return (Root<Employee> root, CriteriaQuery<?> query, CriteriaBuilder cb)
                -> cb.equal(root.get(Employee_.age), age);
    }*/
}

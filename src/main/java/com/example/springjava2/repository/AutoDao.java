package com.example.springjava2.repository;

import com.example.springjava2.Auto;
import com.example.springjava2.criterias.AutoCriteria;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AutoDao {

    private final EntityManager em;

    private final AutoRepository repository;

    public AutoDao(EntityManager em, AutoRepository repository) {
        this.em = em;
        this.repository = repository;
    }

    /*public Page<Auto> findAutosByFiltro(AutoCriteria autoFiltro){

    }

    public Specification<Auto> formarFiltro(AutoCriteria autofiltro){
        return ((auto,cq,cb)->{
            Specification<Auto> specification = Specification.where(null);
            if(autofiltro.getId()!=null){
                specification = specification.and(cb.equal(auto.get("id"),autofiltro.getId()));
            }
            if(autofiltro.getPrecioInicial()!=null && autofiltro.getPrecioFinal()!=null){
                specification = specification.and(cb.equals(auto.get("id"),autofiltro.getId()));
            }
        });
    }*/

    public Page<Auto> findAutosByColorAndPantallita(String color,int page, int pageSize){
        return repository.findAll(findAutosByColorConPan(color), PageRequest.of(page,pageSize));
    }

    public Specification<Auto> findAutosByColorConPan(String color){
        return ((auto, cq,cb)-> {
            Predicate colorPredicate = cb.equal(auto.get("color"),color);
            Predicate pantallitaPredicate = cb.isTrue(auto.get("pantallita"));
            return cb.and(colorPredicate,pantallitaPredicate);
        }
        );
    }
}

package com.example.springjava2.repository;

import com.example.springjava2.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Long>, JpaSpecificationExecutor<Auto> {


    List<Auto> findByColor(String color);

    List<Auto> findByPantallitaTrue();


}

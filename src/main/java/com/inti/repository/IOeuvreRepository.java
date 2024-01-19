package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.model.Oeuvre;

/**
 * 
 * @author antoine vallée
 * 
 * interface repository oeuvre pour les opérations CRUD(Create, Read, Update, Delete) 
 *
 */

@Repository
public interface IOeuvreRepository extends JpaRepository<Oeuvre, Long>{

}

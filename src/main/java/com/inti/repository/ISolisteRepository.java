package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.model.Soliste;

/**
 * 
 * @author antoine vallée
 * 
 * interface repository soliste pour les opérations CRUD(Create, Read, Update, Delete) 
 *
 */

@Repository
public interface ISolisteRepository extends JpaRepository<Soliste, Long>{

}

package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.model.Concert;

/**
 * 
 * @author antoine vallée
 * 
 * interface repository concert pour les opérations CRUD(Create, Read, Update, Delete) 
 *
 */

@Repository
public interface IConcertRepository extends JpaRepository<Concert, Long>{

}

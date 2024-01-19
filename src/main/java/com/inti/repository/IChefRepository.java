package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.model.Chef;

/**
 * 
 * @author antoine vallée
 * 
 * interface repository chef pour les opérations CRUD(Create, Read, Update, Delete) 
 *
 */

@Repository
public interface IChefRepository extends JpaRepository<Chef, Long>{

}

package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.model.Lieu;

/**
 * 
 * @author antoine vallée
 * 
 * interface repository lieu pour les opérations CRUD(Create, Read, Update, Delete) 
 *
 */

@Repository
public interface ILieuRepository extends JpaRepository<Lieu, Long>{

}

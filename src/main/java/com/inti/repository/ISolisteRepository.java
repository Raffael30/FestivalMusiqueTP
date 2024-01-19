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
<<<<<<< HEAD
public interface ISolisteRepository extends JpaRepository<Soliste, Long>{

=======
public interface ISolisteRepository extends JpaRepository<Soliste, Integer> {

	public Soliste findByNom(String nom);

	public long count();
>>>>>>> branch 'raphael' of https://github.com/Raffael30/FestivalMusiqueTP.git
}

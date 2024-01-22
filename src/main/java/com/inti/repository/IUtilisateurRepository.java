package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.model.utilisateur;

public interface IUtilisateurRepository extends JpaRepository<utilisateur, Integer>{

	utilisateur findByLogin(String login);
}

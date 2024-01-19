package com.inti.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * 
 * @author antoine vallée
 * 
 * Classe chef pour les opérations CRUD(Create, Read, Update, Delete) 
 *
 */

@Entity
@Table(name = "chef")
@Data
public class Chef {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long num;
	
	private String nom;
	
	private String prenom;
	
	private LocalDate dateNaissance;
	
	private String nationalite;
	
	private String cachet;
	
	private String commentaire;
	
	@OneToMany(targetEntity=Oeuvre.class, mappedBy="chef")
	private List<Oeuvre> oeuvres = new ArrayList<>();

}

package com.inti.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
 * Classe lieu pour les opérations CRUD(Create, Read, Update, Delete) 
 *
 */

@Entity
@Table(name = "lieu")
@Data
public class Lieu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long num;
	
	private String nom;
	
	private String rue;
	
	private long nbFauteuil;
	
	@OneToMany(targetEntity=Concert.class, mappedBy="lieu")
	private List<Concert> concerts = new ArrayList<>();

}

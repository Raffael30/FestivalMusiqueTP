package com.inti.model;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * 
 * @author antoine vallée
 * 
 * Classe concert pour les opérations CRUD(Create, Read, Update, Delete) 
 *
 */

@Entity
@Table(name = "concert")
@Data
public class Concert {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long num;
	
	@Column(name = "nom", length = 50)
	private String nom;
	
	private LocalDate dateConcert;
	
	@OneToMany(targetEntity=Oeuvre.class, mappedBy="concert")
	private List<Oeuvre> oeuvres = new ArrayList<>();
	
	@ManyToOne
	@JoinTable(name="num")
	private Lieu lieu;


}

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
<<<<<<< HEAD
import lombok.Data;

/**
 * 
 * @author antoine vallée
 * 
 * Classe concert pour les opérations CRUD(Create, Read, Update, Delete) 
 *
 */
=======
import lombok.Getter;
import lombok.Setter;
>>>>>>> branch 'raphael' of https://github.com/Raffael30/FestivalMusiqueTP.git

@Entity
@Table(name = "concert")
@Data
public class Concert {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
	private long num;
	
	@Column(name = "nom", length = 50)
=======
	private int num;

	@Column(name = "NOM")
>>>>>>> branch 'raphael' of https://github.com/Raffael30/FestivalMusiqueTP.git
	private String nom;
<<<<<<< HEAD
	
=======

	@Column(name = "DATECONCERT")
>>>>>>> branch 'raphael' of https://github.com/Raffael30/FestivalMusiqueTP.git
	private LocalDate dateConcert;
<<<<<<< HEAD
	
	@OneToMany(targetEntity=Oeuvre.class, mappedBy="concert")
	private List<Oeuvre> oeuvres = new ArrayList<>();
	
	@ManyToOne
	@JoinTable(name="num")
	private Lieu lieu;


=======

	@OneToMany(mappedBy = "concert")
	List<Oeuvre> listeOeuvres;
>>>>>>> branch 'raphael' of https://github.com/Raffael30/FestivalMusiqueTP.git
}

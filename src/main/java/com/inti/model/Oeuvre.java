package com.inti.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * 
 * @author antoine vallée
 * 
 * Classe oeuvre pour lister des oeuvres de notre bdd
 *
 */
@Entity
@Table(name = "oeuvre")
@Data
public class Oeuvre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long num;
	
	@Column(name = "nom", length = 50)
	private String nom;
	
	@Column(name="duree")
	private LocalTime duree;
	
	@ManyToMany
    @JoinTable( name = "Oeuvre_Soliste_Associations",
                joinColumns = @JoinColumn(name = "num_Oeuvre" ),
                inverseJoinColumns = @JoinColumn(name = "num_Soliste" ) )
    private List<Soliste> solistes = new ArrayList<>();

	
	@ManyToOne
	@JoinTable(name="num")
	private Chef chef;
	
	@ManyToOne
	@JoinTable(name="num")
	private Concert concert;
	
	
	
}

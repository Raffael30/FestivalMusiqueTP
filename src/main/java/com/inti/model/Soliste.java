package com.inti.model;

import java.time.LocalDate;
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
import jakarta.persistence.Table;
import lombok.Data;

/**
 * 
 * @author antoine vallée
 * 
 * Classe soliste pour les opérations CRUD(Create, Read, Update, Delete) 
 *
 */

@Entity
@Table(name = "soliste")
@Data
public class Soliste {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long num;
	
	@Column(name = "nom", length = 50)
	private String nom;
	
	@Column(name = "prenom", length = 50)
	private String prenom;
	
	private LocalDate dateNaissance;
	
	@Column(name = "nationalite", length = 50)
	private String nationalite;
	
	@ManyToMany
    @JoinTable( name = "Oeuvre_Soliste_Associations",
                joinColumns = @JoinColumn(name = "num_Soliste" ),
                inverseJoinColumns = @JoinColumn(name = "num_Oeuvre" ) )
    private List<Oeuvre> oeuvres = new ArrayList<>();

}

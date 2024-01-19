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
<<<<<<< HEAD
 * 
 * @author antoine vallée
 * 
 * Classe soliste pour les opérations CRUD(Create, Read, Update, Delete) 
=======
 * @author Valentin
>>>>>>> branch 'raphael' of https://github.com/Raffael30/FestivalMusiqueTP.git
 *
<<<<<<< HEAD
=======
 *         Classe soliste td1 ex2
>>>>>>> branch 'raphael' of https://github.com/Raffael30/FestivalMusiqueTP.git
 */

@Entity
<<<<<<< HEAD
@Table(name = "soliste")
@Data
=======
@Table(name = "SOLISTE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
>>>>>>> branch 'raphael' of https://github.com/Raffael30/FestivalMusiqueTP.git
public class Soliste {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
	private long num;
	
	@Column(name = "nom", length = 50)
	private String nom;
	
	@Column(name = "prenom", length = 50)
	private String prenom;
	
	private LocalDate dateNaissance;
	
	@Column(name = "nationalite", length = 50)
	private String nationalite;
	
=======
	public int num;

	@Column(name = "NOM")
	public String nom;

	@Column(name = "PRENOM")
	public String prenom;

	@Column(name = "DATENAISSANCE")
	public String dateNaissance;

	@Column(name = "NATIONALITE")
	public String nationalite;

>>>>>>> branch 'raphael' of https://github.com/Raffael30/FestivalMusiqueTP.git
	@ManyToMany
<<<<<<< HEAD
    @JoinTable( name = "Oeuvre_Soliste_Associations",
                joinColumns = @JoinColumn(name = "num_Soliste" ),
                inverseJoinColumns = @JoinColumn(name = "num_Oeuvre" ) )
    private List<Oeuvre> oeuvres = new ArrayList<>();
=======
	@JoinTable(name = "oeuvre_soliste", joinColumns = @JoinColumn(name = "soliste_num"), inverseJoinColumns = @JoinColumn(name = "oeuvre_num"))
	public List<Oeuvre> oeuvres;
>>>>>>> branch 'raphael' of https://github.com/Raffael30/FestivalMusiqueTP.git
}

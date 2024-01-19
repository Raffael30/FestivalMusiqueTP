package com.inti.model;

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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *@author Valentin
 *
 * Classe soliste td1 ex2
 */

@Entity
@Table(name="SOLISTE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Soliste {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int num;
	
	@Column(name = "NOM")
	public String nom;
	
	@Column(name = "PRENOM")
	public String prenom;
	
	@Column(name = "DATENAISSANCE")
	public String dateNaissance;
	
	@Column(name = "NATIONALITE")
	public String nationalite;
	
	@ManyToMany
	@JoinTable(name = "oeuvre_soliste",
	joinColumns = @JoinColumn(name="soliste_num"),
	inverseJoinColumns = @JoinColumn(name="oeuvre_num"))
	public List<Oeuvre> oeuvres;
}

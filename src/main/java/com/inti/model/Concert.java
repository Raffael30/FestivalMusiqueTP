package com.inti.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.EqualsAndHashCode.Exclude;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Concert {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num;
	private String nom;
	private LocalDate dateConcert;
	
	@OneToMany(mappedBy = "concert")
	List<Oeuvre> listeOeuvres;
}

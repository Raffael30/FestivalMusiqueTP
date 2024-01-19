package com.inti.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "OEUVRE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Oeuvre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int num;

	@Column(name = "NOM")
	public String nom;

	@Column(name = "DUREE")
	public int duree;

	@ManyToMany(mappedBy = "oeuvres")
	public List<Soliste> solistes;

	@ManyToOne
	@JoinColumn(name = "concert_num")
	public Concert concert;
}

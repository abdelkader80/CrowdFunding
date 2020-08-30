package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Projet implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	int id_projet;
	String nom_projet;
	double budget;
	Date date_debut;
	Date date_fin;
	double somme_demandee;
	String Descriptif;
	String Image;
	@ManyToOne
	Categorie categorie;
	@OneToMany
	private Collection<Don> don;
	@ManyToOne
	Createur createur;
}

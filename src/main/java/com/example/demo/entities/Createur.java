package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Createur implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	int id_cr;
	String nom;
	String prenom;
	String fonction;
	@ManyToOne
	private Collection<Projet> projet;

}

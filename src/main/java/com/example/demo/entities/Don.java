package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Don {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	int id_don;
	@ManyToOne
	Participant participant;
	@ManyToOne
	Projet projet;
	double montant_don;
	
	

}

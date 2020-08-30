package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

@Entity
public class Participant {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	int id_participant;
	String nom;
	String prenom;
	String adresse;
	int tel;

}

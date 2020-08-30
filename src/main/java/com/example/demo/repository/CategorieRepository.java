package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Categorie;
@RepositoryRestResource
@CrossOrigin("*")

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

}

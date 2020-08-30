package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Createur;
@RepositoryRestResource
@CrossOrigin("*")

public interface CreateurRepository extends JpaRepository<Createur, Integer> {

}

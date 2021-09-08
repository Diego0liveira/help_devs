package com.devjunior.adote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devjunior.adote.model.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {

}

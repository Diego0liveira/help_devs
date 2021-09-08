package com.devjunior.adote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devjunior.adote.model.Animal;
import com.devjunior.adote.service.AnimalService;

@RestController
@RequestMapping(value = "/animal")
public class AnimalController {
	
	@Autowired
	private AnimalService animalService;
	
	@GetMapping(value = "/listar")
	public ResponseEntity<List<Animal>> listaAnimal() {
		return new ResponseEntity<List<Animal>>(animalService.listarAniamais(), HttpStatus.OK);
	}

}

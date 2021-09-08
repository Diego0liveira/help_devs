package com.devjunior.adote.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devjunior.adote.model.Animal;
import com.devjunior.adote.repository.AnimalRepository;

@Service
public class AnimalServiceImpl implements AnimalService {
	
	@Autowired
	private AnimalRepository animalRepository;

	@Override
	public Animal obterAnimalPeloId(Integer id) {
		return animalRepository.getById(id);
	}

	@Override
	public List<Animal> listarAniamais() {
		return animalRepository.findAll();
	}

	@Override
	public void excluirAnimal(Integer id) {
		animalRepository.deleteById(id);
	}

	@Override
	public Animal atualizarAnimal(Animal animal) {
		return animalRepository.save(animal);
	}

	@Override
	public Animal criarAnimal(Animal animal) {
		return animalRepository.save(animal);
	}

}

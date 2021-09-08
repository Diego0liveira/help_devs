package com.devjunior.adote.service;

import java.util.List;

import com.devjunior.adote.model.Animal;

public interface AnimalService {

	public Animal obterAnimalPeloId(Integer id);
	public List<Animal> listarAniamais();
	public void excluirAnimal(Integer id);
	public Animal atualizarAnimal(Animal animal);
	public Animal criarAnimal(Animal animal);
}

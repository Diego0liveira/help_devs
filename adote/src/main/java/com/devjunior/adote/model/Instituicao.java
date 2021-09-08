package com.devjunior.adote.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "instituicao")
public class Instituicao {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String cnpj;
	
	@OneToOne
	@JoinColumn(name = "enderco_id")
	private Endereco enderco;
	
	@OneToMany(mappedBy = "instituicao")
	@Cascade(CascadeType.ALL)
	private List<Animal> animals;
	
	public Instituicao() { }

	public Instituicao(Integer id, String nome, String cnpj, Endereco enderco, List<Animal> animals) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.enderco = enderco;
		this.animals = animals;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEnderco() {
		return enderco;
	}

	public void setEnderco(Endereco enderco) {
		this.enderco = enderco;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

}

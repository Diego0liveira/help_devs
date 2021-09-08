package com.devjunior.adote.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "visita")
public class Visita {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Date data;
	@OneToOne
	@JoinColumn(name = "animal_id")
	private Animal animal;
	
	@OneToOne
	@JoinColumn(name = "instituicao_id")
	private Instituicao instituicao;
	
	@OneToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	
	public Visita() {}

	public Visita(Integer id, Date data, Animal animal, Instituicao instituicao, Usuario usuario) {
		super();
		this.id = id;
		this.data = data;
		this.animal = animal;
		this.instituicao = instituicao;
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}

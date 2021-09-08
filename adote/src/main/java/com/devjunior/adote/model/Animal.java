package com.devjunior.adote.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Table(name = "animal")
public class Animal {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String raca;
	private Date dataNascimento;
	private String cor;
	private String porte;
	private String genero;
	private String urlImage;
	private Boolean adotado;
	
	@OneToMany(mappedBy = "animal")
	@Cascade(CascadeType.ALL)
	private List<Visita> visitas;
	
	public Animal() { }
	
	public Animal(Integer id, String nome, String raca, Date dataNascimento, String cor, String porte, String genero,
			String urlImage, Boolean adotado, List<Visita> visitas) {
		super();
		this.id = id;
		this.nome = nome;
		this.raca = raca;
		this.dataNascimento = dataNascimento;
		this.cor = cor;
		this.porte = porte;
		this.genero = genero;
		this.urlImage = urlImage;
		this.adotado = adotado;
		this.visitas = visitas;
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
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public Boolean getAdotado() {
		return adotado;
	}
	public void setAdotado(Boolean adotado) {
		this.adotado = adotado;
	}
	public List<Visita> getVisitas() {
		return visitas;
	}
	public void setVisitas(List<Visita> visitas) {
		this.visitas = visitas;
	}
	
}

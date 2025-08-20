package com.xicaum59.Event.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_participante")
public class Participante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@Column(unique = true)
	private String email;
	
	@ManyToMany
	@JoinTable(name = "tb_participante_atividade", 
	joinColumns = @JoinColumn(name = "participante_id"),
	inverseJoinColumns = @JoinColumn(name = "atividade_id"))
	private Set<Atividade> atividades = new HashSet<>();
	
	public Participante() {
		
	}

	public Participante(Long id, String name, String email) {
		
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Set<Atividade> getAtividades() {
		return atividades;
	}

}

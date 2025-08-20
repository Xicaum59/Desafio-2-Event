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

}

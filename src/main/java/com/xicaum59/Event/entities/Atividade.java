package com.xicaum59.Event.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_atividade")
public class Atividade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String descricao;
	private Double price;

	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;
	
	@ManyToMany(mappedBy = "atividades")	
	private Set<Participante> participantes = new HashSet<>();
	
	@ManyToMany(mappedBy = "atividades")
	private Set<Bloco> blocos = new HashSet<>();
	
	public Atividade() {
		
	}

	public Atividade(Long id, String name, String descricao, Double price, Categoria categoria) {
		
		this.id = id;
		this.name = name;
		this.descricao = descricao;
		this.price = price;
		this.categoria = categoria;
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

	public void setNome(String name) {
		this.name = name;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Categoria getCategoria() {
        return categoria;
    }
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public Set<Participante> getParticipantes() {
		return participantes;
	}
}

package com.xicaum59.Event.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descriçao; 
	
	@OneToMany(mappedBy = "categoria")
	private List<Atividade> atividades = new ArrayList<>();
	
	public Categoria() {
		
	}

	public Categoria(Integer id, String descriçao) {
		
		this.id = id;
		this.descriçao = descriçao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescriçao() {
		return descriçao;
	}

	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}
	
	public List<Atividade> getAtividades() {
		return atividades;
	}
	
	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}
	
}

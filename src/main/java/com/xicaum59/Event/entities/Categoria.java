package com.xicaum59.Event.entities;

public class Categoria {

	private Integer id;
	private String descriçao; 
	
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
	
}

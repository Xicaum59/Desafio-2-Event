package com.xicaum59.Event.entities;

import java.time.Instant;
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
@Table(name = "tb_bloco")
public class Bloco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant inicio;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant fim;
	
	@ManyToMany
	@JoinTable(name = "tb_bloco_atividade", joinColumns = @JoinColumn(name = "bloco_id"), inverseJoinColumns = @JoinColumn(name = "atividade_id"))
	
	private Set<Atividade> atividades = new HashSet<>();
	

		public Bloco() {
			
		}

		public Bloco(Long id, Instant inicio, Instant fim) {
			
			this.id = id;
			this.inicio = inicio;
			this.fim = fim;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Instant getInicio() {
			return inicio;
		}

		public void setInicio(Instant inicio) {
			this.inicio = inicio;
		}

		public Instant getFim() {
			return fim;
		}

		public void setFim(Instant fim) {
			this.fim = fim;
		}
			
		
}

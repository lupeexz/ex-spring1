package com.prjLupi.prjClientes.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Cliente")
public class Clientes{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String cliente;
	
	@Column(name = "fone")
	private String fone;
	
	public Clientes() {
		
	}
	
	public Clientes(long id, String cliente, String fone) {
		this.id = id;
		this.cliente = cliente;
		this.fone = fone;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return cliente;
	}
	
	public void setName(String name) {
		this.cliente = name;
	}
	
	public String getfone() {
		return fone;
	}
	
	public void setprice(String fone) {
		this.fone = fone;
	}
	
}
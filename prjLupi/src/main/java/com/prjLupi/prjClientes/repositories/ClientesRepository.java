package com.prjLupi.prjClientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjLupi.prjClientes.entities.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes,Long>{
	
	

}

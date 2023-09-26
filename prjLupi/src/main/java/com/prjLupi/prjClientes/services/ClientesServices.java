package com.prjLupi.prjClientes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prjLupi.prjClientes.entities.Clientes;
import com.prjLupi.prjClientes.repositories.ClientesRepository;

@Service
public class ClientesServices {
	private final ClientesRepository clientesRepository;
	
	@Autowired
	public ClientesServices(ClientesRepository clientesRepository) {
		this.clientesRepository = clientesRepository;
	}
	
	public Clientes saveLupiApplication(Clientes clientes) {
		return clientesRepository.save(clientes);
	}
	
	public List<Clientes> getAllClientes(){
		return clientesRepository.findAll();
	}
	
	public Clientes getClientesId(long id) {
		return clientesRepository.findById(id).orElse(null);
	}
	
	public void deleteClientes(long id) {
		clientesRepository.deleteById(id);
	}
}
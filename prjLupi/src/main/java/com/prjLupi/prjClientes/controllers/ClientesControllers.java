package com.prjLupi.prjClientes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prjLupi.prjClientes.entities.Clientes;
import com.prjLupi.prjClientes.services.ClientesServices;

@RestController
@RequestMapping("/Clientes")
public class ClientesControllers {

	private final ClientesServices clientesServices ;
		
		@Autowired
		public ClientesControllers(ClientesServices clientesServices) {
			this.clientesServices = clientesServices;
		}
		
		@PostMapping
		public Clientes createClientes(@RequestBody Clientes clientes) {
			return clientesServices.saveLupiApplication(clientes);
		}
		
		@GetMapping("/{id}")
		public Clientes getClientes(@PathVariable long id ) {
			return clientesServices.getClientesId(id);
		}
		
		@GetMapping
		public List<Clientes> gettAllClientes(){
			return clientesServices.getAllClientes();
		}
		
		@DeleteMapping("/{id}")
		public void deleteClientes(@PathVariable long id ) {
			clientesServices.deleteClientes(id);
		}

}

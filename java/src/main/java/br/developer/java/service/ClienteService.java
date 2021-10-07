package br.developer.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.developer.java.repository.ClientesRepository;


@Service
public class ClienteService {

	@Autowired
	private ClientesRepository clientesRepository;
	
	public void delete(Integer cliente) {
		ClientesRepository.deleteById(cliente);
		
	}

	public ClientesRepository getClientesRepository() {
		return clientesRepository;
	}

	public void setClientesRepository(ClientesRepository clientesRepository) {
		this.clientesRepository = clientesRepository;
	}
}

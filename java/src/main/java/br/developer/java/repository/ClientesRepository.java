package br.developer.java.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import br.developer.java.controller.Cliente;
import br.developer.java.entity.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long>{

	static void deleteById(Integer cliente) {
		ClientesRepository.deleteById(cliente);
		
	}
//	public List<Clientes> findByLocation(String locationId);

	Optional<Clientes> getById(Integer cliente);

//	Clientes getOne(Integer id);

//	Clientes findById(Integer id);

	
}
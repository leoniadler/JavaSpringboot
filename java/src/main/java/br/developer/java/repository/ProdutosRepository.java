package br.developer.java.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.developer.java.entity.Clientes;
import br.developer.java.entity.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long>{
	static void deleteById(Integer produto) {
		ProdutosRepository.deleteById(produto);
	}
	Optional<Produtos> getById(Integer produto);
}

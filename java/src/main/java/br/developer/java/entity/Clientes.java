package br.developer.java.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.*;
import javax.validation.Valid;

import org.springframework.format.annotation.DateTimeFormat;

import br.developer.java.repository.ClientesRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Entity
@Table(name = "clientes")
public class Clientes {

	@Id
	@Column(name = "id")
	@GeneratedValue
	//(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "cpf", nullable = false)
	private String cpf;
	
	@Column(name = "sexo", nullable = false)
	private String sexo;
	@Column(name = "data_de_nascimento")
	private String dataDeNascimento;
	@Column(name = "celular", nullable = false)
	private String celular;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	
	
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
public void setSexo(String sexo){
		
		this.sexo = sexo;
	}
	
	public String getSexo() {
	return sexo;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
//	public static List<Clientes> listAll() {
//		return Clientes.findAll();
//		
//	}
//	private static List<Clientes> findAll() {
//		return Clientes.findAll();
//	}
//	public static void delete(long id) {
//		Clientes.remove(findById(id));
//	}
	
	
	
	
	
	
	

	
	
	
	
	
	
}
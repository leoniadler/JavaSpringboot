package br.developer.java.entity;

import javax.persistence.*;

@Entity
@Table (name= "produtos")
public class Produtos {
	
	@Id
	@Column(name = "id")
	@GeneratedValue
	public Long id;
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "valor", nullable = false)
	private double valor;
	
	private String modelo;
	@Column(name = "modelo", nullable = false)
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo= modelo;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}

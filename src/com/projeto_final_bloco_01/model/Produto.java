package com.projeto_final_bloco_01.model;

public abstract class Produto {

	private int id;
	private String nome;
	private double preco;
	private String marca;
	public Produto(int id, String nome, double preco, String marca) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	public void visualizarInformacoes() {
		System.out.println(" *** INFORMAÇÕES DO PRODUTO *** ");
		System.out.println("NUMERO DE IDENTIFICAÇÃO DO PRODUTO " + this.id );
		System.out.println("NOME DO PRODUTO : " + this.nome);
		System.out.println("VALOR DO PRODUTO : R$" + this.preco);
		System.out.println("MARCA DO PRODUTO : R$" + this.marca);
		
	}
	
	
}

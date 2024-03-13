package com.projeto_final_bloco_01.model;

public class Movel extends Produto {

	private double largura;
	private double altura;
	private double comprimento;
	private String cor;

	public Movel(int id, String nome, double preco, String marca, double largura, double altura, double comprimento,
			String cor) {
		super(id, nome, preco, marca);
		this.largura = largura;
		this.altura = altura;
		this.comprimento = comprimento;
		this.cor = cor;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}

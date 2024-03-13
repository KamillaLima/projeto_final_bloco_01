package com.projeto_final_bloco_01.model;

public class Livro extends Produto {

	private String autor;
	private int quantidadePaginas;
	private Tema tema;

	public Livro(int id, String nome, double preco, String marca, String autor, int quantidadePaginas, Tema tema) {
		super(id, nome, preco, marca);
		this.autor = autor;
		this.quantidadePaginas = quantidadePaginas;
		this.tema = tema;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getQuantidadePaginas() {
		return quantidadePaginas;
	}

	public void setQuantidadePaginas(int quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

}

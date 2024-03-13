package com.projeto_final_bloco_01.controller;

import java.util.ArrayList;
import com.projeto_final_bloco_01.model.Produto;
import com.projeto_final_bloco_01.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository{

	ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int id;
	public int gerarId() {
		return ++id;
	}
	
	@Override
	public void procurarPorNumero(int numero) {
		var produto = buscarNaLista(numero);
		if(produto !=null) {
			produto.visualizarInformacoes();
		}
		else {
			System.out.println("PRODUTO INEXISTENTE");
		}
		
	}

	@Override
	public void listarTodos() {
		for (Produto produto : listaProdutos) {
			produto.visualizarInformacoes();
		}
		if(listaProdutos.size() == 0) {
			System.out.println("NENHUM ITEM FOI CADASTRADO\n");
		}
		
	}

	@Override
	public void cadastrar(Produto produto) {
	    try {
	        listaProdutos.add(produto);
	        System.out.println("O produto foi criado e o seu número de identificação é : " + produto.getId());
	    } catch (Exception e) {
	        System.err.println("Ocorreu uma exceção ao cadastrar o produto: " + e.getMessage());
	        
	    }
	}


	@Override
	public void atualizar(Produto produto) {
		var buscarProduto = buscarNaLista(produto.getId());
		if(buscarProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscarProduto),produto);
		}
		else {
			System.out.println("PRODUTO INEXISTENTE");
		}
		
	}

	@Override
	public void deletar(int numero) {
		var buscarProduto = buscarNaLista(numero);
		if(buscarProduto != null) {
			if(listaProdutos.remove(buscarProduto)) {
				System.out.println("ITEM REMOVIDO COM SUCESSO!");
			}
			else {
				System.out.println("PROBLEMA PARA REMOVER O PRODUTO");
			}
		}
		else {
			System.out.println("PRODUTO INEXISTENTE");
		}
		
	}
	
	public Produto buscarNaLista(int numero) {
		for (Produto produto : listaProdutos) {
			if(produto.getId() == numero) {
				return produto;
			}
		}
		return null;
	}

}

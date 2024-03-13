package com.projeto_final_bloco_01.repository;

import com.projeto_final_bloco_01.model.Produto;

public interface ProdutoRepository {
			public void procurarPorNumero(int numero);
			public void listarTodos();
			public void cadastrar(Produto produto);
			public void atualizar(Produto Produto);
			public void deletar(int numero);
			
}

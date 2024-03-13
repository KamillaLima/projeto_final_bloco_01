package com.projeto_final_bloco_01;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.projeto_final_bloco_01.controller.ProdutoController;
import com.projeto_final_bloco_01.model.Livro;
import com.projeto_final_bloco_01.model.Movel;
import com.projeto_final_bloco_01.model.Tema;

public class Menu {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String nome, marca, autor, cor, opcaoProduto;
		Tema tema = null;
		int temaEscolhido;
		double altura, largura, comprimento, valor;
		int quantidadePaginas, opcao, numeroId;
		ProdutoController produtoController = new ProdutoController();
		boolean menu = true;
		while (menu) {
			System.out.println("********* AMAZON 2.0 --- DIA DO CONSUMIDOR *********");
			System.out.println("1- Cadastrar item");
			System.out.println("2- Listar todos os itens");
			System.out.println("3- Listar item em específico");
			System.out.println("4- Atualizar item");
			System.out.println("5- Apagar item");
			System.out.println("0- SAIR");
			System.out.println("************************************");
			System.out.println("Informe a opção desejada : ");
			
			try {
				opcao = sn.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("\n Digite valores inteiros! ");
				sn.nextLine();
				opcao = 0;
			}

			switch (opcao) {
			case 0:
				System.out.println("VOLTE SEMPRE! ");
				menu = false;
				break;

			case 1:
				System.out.println("\nCADASTRAR ITEM");
				System.out.println("ATENÇÃO: NO MOMENTO É PERMITIDO O CADASTRO APENAS DE MÓVEIS E LIVROS!\n");
				System.out.print("Informe o nome do produto : ");
				sn.skip("\\R?");
				nome = sn.nextLine();
				System.out.print("Informe o valor do produto : R$");
				valor = sn.nextDouble();
				System.out.print("Informe a marca do produto : ");
				sn.skip("\\R?");
				do {
					marca = sn.nextLine();
					System.out.print("O produto se trata de um MOVEL ou LIVRO ? ");
					opcaoProduto = sn.next().toUpperCase();
				} while (!opcaoProduto.equals("MOVEL") && !opcaoProduto.equals("LIVRO"));
				if (opcaoProduto.equals("MOVEL")) {
					System.out.print("Informe a altura do móvel : ");
					altura = sn.nextDouble();
					System.out.print("Informe o comprimento do móvel : ");
					comprimento = sn.nextDouble();
					System.out.print("Informe a largura do móvel : ");
					largura = sn.nextDouble();
					System.out.print("Informe a cor do móvel : ");
					sn.skip("\\R?");
					cor = sn.nextLine();
					produtoController.cadastrar(new Movel(produtoController.gerarId(), nome, valor, marca, largura,
							altura, comprimento, cor));
				} else {
					System.out.print("Informe o autor : ");
					sn.skip("\\R?");
					autor = sn.nextLine();
					System.out.print("Informe a quantidade de páginas : ");
					quantidadePaginas = sn.nextInt();
					do {
						System.out.print("Informe o tema : \n [1]-DRAMA \n [2]-ROMANCE \n [3]-SUSPENSE [4]-TERROR\n ");
						sn.skip("\\R?");
						temaEscolhido = sn.nextInt();
					} while (temaEscolhido <= 0 || temaEscolhido >= 5);
					switch (temaEscolhido) {
					case 1:
						tema = Tema.DRAMA;
						break;
					case 2:
						tema = Tema.ROMANCE;
						break;
					case 3:
						tema = Tema.SUSPENSE;
						break;
					case 4:
						tema = Tema.TERROR;
						break;

					}
					produtoController.cadastrar(
							new Livro(produtoController.gerarId(), nome, valor, marca, autor, quantidadePaginas, tema));
				}

				System.out.println("\nCADASTRO REALIZADO COM SUCESSO! \n");

				break;

			case 2:
				System.out.println("LISTAR TODOS OS ITENS CADASTRADOS : ");
				produtoController.listarTodos();
				break;
			case 3:
				System.out.println("\nLISTAR ITEM EM ESPECÍFICO: \n");
				System.out.print("Informe o número de identificação do produto : ");
				numeroId = sn.nextInt();
				produtoController.procurarPorNumero(numeroId);
				break;
			case 4:
				System.out.println("\nATUALIZAR ITEM EM ESPECÍFICO: \n");
				System.out.print("Informe o número de identificação do produto : ");
				numeroId = sn.nextInt();
				var buscaProduto = produtoController.buscarNaLista(numeroId);
				if (buscaProduto != null) {
					System.out.println("ATENÇÃO: NO MOMENTO É PERMITIDO O CADASTRO APENAS DE MÓVEIS E LIVROS!\n");
					System.out.print("Informe o nome do produto : ");
					sn.skip("\\R?");
					nome = sn.nextLine();
					System.out.print("Informe o valor do produto : R$");
					valor = sn.nextDouble();
					System.out.print("Informe a marca do produto : ");
					sn.skip("\\R?");
					do {
						marca = sn.nextLine();
						System.out.print("O produto se trata de um MOVEL ou LIVRO ? ");
						opcaoProduto = sn.next().toUpperCase();
					} while (!opcaoProduto.equals("MOVEL") && !opcaoProduto.equals("LIVRO"));
					if (opcaoProduto.equals("MOVEL")) {
						System.out.print("Informe a altura do móvel : ");
						altura = sn.nextDouble();
						System.out.print("Informe o comprimento do móvel : ");
						comprimento = sn.nextDouble();
						System.out.print("Informe a largura do móvel : ");
						largura = sn.nextDouble();
						System.out.print("Informe a cor do móvel : ");
						sn.skip("\\R?");
						cor = sn.nextLine();
						produtoController
								.atualizar(new Movel(numeroId, nome, valor, marca, largura, altura, comprimento, cor));
					} else {
						System.out.print("Informe o autor : ");
						sn.skip("\\R?");
						autor = sn.nextLine();
						System.out.print("Informe a quantidade de páginas : ");
						quantidadePaginas = sn.nextInt();
						do {
							System.out.print(
									"Informe o tema : \n [1]-DRAMA \n [2]-ROMANCE \n [3]-SUSPENSE [4]-TERROR\n ");
							sn.skip("\\R?");
							temaEscolhido = sn.nextInt();
						} while (temaEscolhido <= 0 || temaEscolhido >= 5);
						switch (temaEscolhido) {
						case 1:
							tema = Tema.DRAMA;
							break;
						case 2:
							tema = Tema.ROMANCE;
							break;
						case 3:
							tema = Tema.SUSPENSE;
							break;
						case 4:
							tema = Tema.TERROR;
							break;

						}
						produtoController
								.atualizar(new Livro(numeroId, nome, valor, marca, autor, quantidadePaginas, tema));
					}

					System.out.println("\nATUALIZAÇÃO REALIZADA COM SUCESSO! \n");

					break;
				} else {
					System.out.println("PRODUTO NÃO ENCONTRADO");
				}
				break;
			case 5:
				System.out.println("\nAPAGAR ITEM EM ESPECÍFICO: \n");
				System.out.print("Informe o número de identificação do produto : ");
				numeroId = sn.nextInt();
				produtoController.deletar(numeroId);
				break;
			default:
				System.out.println("OPÇÃO INVÁLIDA");
				break;
			}
		}
		sn.close();
	}

}

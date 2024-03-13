package com.projeto_final_bloco_01;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int opcao = 0;
		String nome, marca, autor, cor, opcaoProduto,tema;
		double altura, largura, comprimento, valor;
		int quantidadePaginas;
		boolean menu = true;
		while (menu) {
			System.out.println("********* AMAZON 2.0 --- DIA DO CONSUMIDOR *********");
			System.out.println("1- Cadastrar pedido");
			System.out.println("2- Listar todos os pedidos");
			System.out.println("3- Listar pedido em específico");
			System.out.println("4- Atualizar pedido");
			System.out.println("5- Apagar pedido");
			System.out.println("0- SAIR");
			System.out.println("************************************");
			System.out.println("Informe a opção desejada : ");
			opcao = sn.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("VOLTE SEMPRE! ");
				menu = false;
				break;

			case 1:
				System.out.println("\nCADASTRAR PRODUTO");
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
				if(opcaoProduto.equals("MOVEL")) {
					System.out.print("Informe a altura do móvel : ");
					altura = sn.nextDouble();
					System.out.print("Informe o comprimento do móvel : ");
					comprimento = sn.nextDouble();
					System.out.print("Informe a largura do móvel : ");
					largura = sn.nextDouble();
					System.out.print("Informe a cor do móvel : ");
					sn.skip("\\R?");
					cor = sn.nextLine();
				}
				else {
					System.out.print("Informe o autor : ");
					sn.skip("\\R?");
					autor = sn.nextLine();
					System.out.print("Informe a quantidade de páginas : ");
					quantidadePaginas = sn.nextInt();
					System.out.print("Informe o tema : ");
					sn.skip("\\R?");
					tema = sn.nextLine();
				}
				System.out.println("\nCADASTRO REALIZADO COM SUCESSO! \n");
					
				break;

			case 2:
				System.out.println("Listar ");
				break;
			case 3:
				System.out.println("Listar em especifico");
				break;
			case 4:
				System.out.println("Atualizar");
				break;
			case 5:
				System.out.println("apagar");
				break;
			default:
				System.out.println("OPÇÃO INVÁLIDA");
				break;
			}
		}
		sn.close();
	}

}

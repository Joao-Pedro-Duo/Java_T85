package atividade_avaliativa_pratica_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe_03_Controle_Estoque {
	
	// Objeto Scanner para leitura dos dados digitados pelo usuário
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Collection responsável por armazenar os produtos cadastrados
		ArrayList<String[]> produtos = new ArrayList<String[]>();
		
		int opcao;
		
		// Variável responsável por controlar a permanência no menu
		char continua = 'S';
		
		// Loop principal do sistema
		while(continua == 'S') {
				System.out.println("*****************************************************");
				System.out.println("***              Controle de Estoque              ***");
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
			
			// Valida a opção digitada pelo usuário
			do {
				System.out.println("                  Escolha uma opção:                 ");
				System.out.println("                                                     ");	
				System.out.println("  1 - Adicionar um novo produto                      ");
				System.out.println("  2 - Atualizar a quantidade de um produto existente ");
				System.out.println("  3 - Listar todos os produtos                       ");
				System.out.println("  0 - Sair                                           ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
					
				System.out.print("Entre com a opção desejada: ");
				opcao = leia.nextInt();
			}while (opcao < 0 || opcao > 3);	
			
			if (opcao == 0) {
				System.out.println("\nPrograma Finalizado!");
				break;
			}
			
			switch(opcao) {
			case 1:

				 // Vetor para armazenar os dados do produto
			    String[] produto = new String[2];
			    
			    // Limpa a entrada após a leitura da opção do menu
			    leia.nextLine();

			    System.out.print("Digite o nome do produto: ");
			    produto[0] = leia.nextLine();

			    System.out.print("Digite a quantidade em estoque: ");
			    produto[1] = leia.next();

			    // Adiciona o produto à coleção
			    produtos.add(produto);

			    System.out.println("\nProduto cadastrado com sucesso!");
			
				break;
			case 2 :
				
				// Limpa a entrada
			    leia.nextLine();
				
				// Solicita o nome do produto que terá o estoque atualizado
				System.out.print("Digite o nome do produto: ");
				String nomeProduto = leia.nextLine();

				// Variável utilizada para verificar se o produto foi encontrado
				boolean encontrado = false;

				// Percorre a coleção procurando o produto informado
				for(String[] produtolistado : produtos) {

				    if(produtolistado[0].equalsIgnoreCase(nomeProduto)) {

				        System.out.print("Nova quantidade: ");
				        produtolistado[1] = leia.next();

				        encontrado = true;

				        System.out.println("\nQuantidade atualizada!");

				        break;
				    }

				}

				// Exibe mensagem caso o produto não exista na coleção
				if(!encontrado) {
				    System.out.println("\nProduto não encontrado!");
				}
				break;
			case 3 :
				
				// Verifica se existem produtos cadastrados
				if(produtos.isEmpty()) {

			        System.out.println("\nNenhum produto cadastrado!");

			    } else {

			        System.out.println("\n**************************************");
			        System.out.println("          ESTOQUE DE PRODUTOS");
			        System.out.println("**************************************");

			        System.out.printf("%n%-20s%-15s%n",
			                "Produto", "Quantidade");

			        // Exibe todos os produtos cadastrados e suas quantidades
			        for(String[] produtolistado : produtos) {

			            System.out.printf("%-20s%-15s%n",
			            		produtolistado[0],
			            		produtolistado[1]);

			        }

			    }
				
				break;
			}
			
			// Pergunta ao usuário se deseja retornar ao menu principal
			do {
				System.out.println("Deseja Voltar ao Menu? (S/N)");
				continua = leia.next().toUpperCase().charAt(0);
				if (continua == 'N') {
					System.out.println("Programa Finalizado!");
				}
			} while (!(continua == 'S') && !(continua == 'N'));
		}
		
		
		leia.close();

	}

}

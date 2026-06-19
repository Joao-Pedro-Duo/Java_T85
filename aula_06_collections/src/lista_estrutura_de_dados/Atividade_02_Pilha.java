package lista_estrutura_de_dados;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Atividade_02_Pilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Deque<String> pilhadelivros = new ArrayDeque<String>();
		
		int opcao;
		
		char continua = 'S';
		
		while(continua == 'S') {
				System.out.println("*************************************************");
				System.out.println("*** Programa Simulação de uma Pilha de Livros ***");
				System.out.println("*************************************************");
				System.out.println("                                                 ");
				
			do {
				System.out.println("                Escolha uma opção:               ");
				System.out.println("                                                 ");	
				System.out.println("       1 - Adicionar um novo livro na Pilha      ");
				System.out.println("       2 - Listar todos os Livros da Pilha       ");
				System.out.println("       3 - Retirar um Livro da Pilha               ");
				System.out.println("       0 - Sair                                  ");
				System.out.println("                                                 ");
				System.out.println("*************************************************");
					
				System.out.print("Entre com a opção desejada: ");
				opcao = leia.nextInt();
			}while (opcao < 0 || opcao > 3);	
				
			if (opcao == 1) {
				leia.nextLine(); // Para não dar conflito entre o "nextInt" e o "nextLine"
				
				System.out.print("Digite o nome: ");
				String nome = leia.nextLine();
				pilhadelivros.push(nome);
				
				System.out.println("\nPilha: ");
				
				for(var livros : pilhadelivros) {
					System.out.println(livros);
				}
				
				System.out.println("\nLivro Adicionado!");
				
			}
			
			if (opcao == 2) {
				boolean pilhavazia = pilhadelivros.isEmpty();
				
				if (pilhavazia) {
					System.out.println("\nA Pilha está vazia!\n");
				} else {
					System.out.println("\nLista de Livros na Pilha: ");
					
					for(var livros : pilhadelivros) {
						System.out.println(livros);
					}
					System.out.println("");
				}
			}
			
			if (opcao == 3) {
				boolean pilhavazia = pilhadelivros.isEmpty();
				
				if (pilhavazia) {
					System.out.println("\nA Pilha está vazia!\n");
				} else {
					String livroretirado = pilhadelivros.pop();
					
					System.out.println("\nPilha: ");
					
					for(var livros : pilhadelivros) {
						System.out.println(livros);
					}
					
					System.out.printf("\nLivro Retirado da Pilha: " + livroretirado + "\n");
				}
			}
			
			if (opcao == 0) {
				System.out.println("Programa Finalizado!");
				break;
			}
			
			
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

package lista_estrutura_de_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade_01_Fila {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> filadepessoas = new LinkedList<String>();
		
		int opcao;
		
		char continua = 'S';
		
		while(continua == 'S') {
				System.out.println("*****************************************");
				System.out.println("***   Programa Simulação de uma Fila  ***");
				System.out.println("*****************************************");
				System.out.println("                                         ");
				
			do {
				System.out.println("           Escolha uma opção:            ");
				System.out.println("                                         ");	
				System.out.println("      1 - Adicionar Cliente na Fila      ");
				System.out.println("      2 - Listar todos os Clientes       ");
				System.out.println("      3 - Retirar Cliente da Fila        ");
				System.out.println("      0 - Sair                           ");
				System.out.println("                                         ");
				System.out.println("*****************************************");
					
				System.out.print("Entre com a opção desejada: ");
				opcao = leia.nextInt();
			}while (opcao < 0 || opcao > 3);	
				
			if (opcao == 1) {
				leia.nextLine(); // Limpa o ENTER pendente
				
				System.out.print("Digite o nome: ");
				String nome = leia.nextLine();
				filadepessoas.add(nome);
				
				System.out.println("\nFila: ");
				
				for(var pessoa : filadepessoas) {
					System.out.println(pessoa);
				}
				
				System.out.println("\nCliente Adicionado!");
				
			}
			
			if (opcao == 2) {
				boolean filavazia = filadepessoas.isEmpty();
				
				if (filavazia) {
					System.out.println("\nA Fila está vazia!\n");
				} else {
					System.out.println("\nLista de Clientes na Fila: ");
					
					for(var pessoa : filadepessoas) {
						System.out.println(pessoa);
					}
					System.out.println("");
				}
			}
			
			if (opcao == 3) {
				boolean filavazia = filadepessoas.isEmpty();
				
				if (filavazia) {
					System.out.println("\nA Fila está vazia!\n");
				} else {
					String clientechamado = filadepessoas.remove();
					
					System.out.println("\nFila: ");
					
					for(var pessoa : filadepessoas) {
						System.out.println(pessoa);
					}
					
					System.out.printf("\nCliente Chamado: " + clientechamado + "\n");
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
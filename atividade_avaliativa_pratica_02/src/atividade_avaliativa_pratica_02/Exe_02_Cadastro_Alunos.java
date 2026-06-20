package atividade_avaliativa_pratica_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe_02_Cadastro_Alunos {
	
	// Objeto Scanner para leitura dos dados digitados pelo usuário
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Collection responsável por armazenar os alunos cadastrados
		ArrayList<String[]> alunos = new ArrayList<String[]>();
		
		int opcao;
		
		// Controla a permanência do usuário no menu principal
		char continua = 'S';
		
		 // Loop principal do sistema
		while(continua == 'S') {
				System.out.println("*****************************************");
				System.out.println("***        Cadastro de Alunos         ***");
				System.out.println("*****************************************");
				System.out.println("                                         ");
				
			// Valida a opção digitada pelo usuário
			do {
				System.out.println("           Escolha uma opção:            ");
				System.out.println("                                         ");	
				System.out.println("  1 - Adicionar um aluno a uma coleção   ");
				System.out.println("  2 - Listar todos os alunos cadastrados ");
				System.out.println("  3 - Calcular a média geral das notas   ");
				System.out.println("  0 - Sair                               ");
				System.out.println("                                         ");
				System.out.println("*****************************************");
					
				System.out.print("Entre com a opção desejada: ");
				opcao = leia.nextInt();
			}while (opcao < 0 || opcao > 3);	
			
			if (opcao == 0) {
				System.out.println("\nPrograma Finalizado!");
				break;
			}
			
			switch(opcao) {
			case 1:
				
				// Vetor para armazenar os dados do aluno
				String[] aluno = new String[7];
				
				// Limpa a entrada após a leitura da opção do menu
				leia.nextLine();
				
				System.out.print("Digite seu Nome: ");
				aluno[0] = leia.nextLine();
				
				System.out.print("Digite a sua Idade: ");
				aluno[1] = leia.next();
				
				// Calcula a soma das notas para posteriormente obter a média
				float soma = 0;
				
				// Loop para cadastro das 4 notas do aluno
				for (int info = 2; info < 6; info ++) {
					System.out.printf("\nDigite a %d° nota do participante: ", info - 1);
					aluno[info] = leia.next();
					
					soma += Float.parseFloat(aluno[info]);
				}
				
				// Calcula a média final do aluno
				float media = soma / 4;
				
				// Converte a média para String e armazena na última posição do vetor
				aluno[6] = String.valueOf(media);
				
				// Adiciona o aluno à coleção
				alunos.add(aluno);
				
				System.out.println("\nAluno cadastrado com sucesso!");
			
				break;
			case 2 :
				
				// Verifica se existem alunos cadastrados
				if(alunos.isEmpty()) {
					System.out.println("\nNenhum aluno cadastrado!");
				} else {
					
					// Percorre a coleção exibindo os dados de cada aluno
					for (var alunoscadastrados : alunos ) {

					    System.out.println("\nNome: " + alunoscadastrados[0]);
					    System.out.println("Idade: " + alunoscadastrados[1]);

					    // Exibe as quatro notas do aluno
					    for (var posicao = 2; posicao < 6; posicao++) {
					        System.out.println("Nota " + (posicao - 1) + ": " + alunoscadastrados[posicao]);
					    }

					}
				}
				break;
			case 3 :
				
				// Exibe os alunos, suas idades e suas respectivas notas
				System.out.println("\n***********************************************************************");
				System.out.println("                           CADASTRO DE ALUNOS");
				System.out.println("***********************************************************************");

				System.out.printf("%n%-15s%-8s%-10s%-10s%-10s%-10s%-10s%n",
						"Nome", "Idade", "Nota1", "Nota2", "Nota3", "Nota4", "Média");

				for(String[] alunosnotafinal : alunos) {

					System.out.printf("%-15s", alunosnotafinal[0]);
					System.out.printf("%-8s", alunosnotafinal[1]);

					for(int posicao = 2; posicao < 6; posicao++) {
						System.out.printf("%-10.1f",
								Float.parseFloat(alunosnotafinal[posicao]));
					}

					System.out.printf("%-10.1f%n",
							Float.parseFloat(alunosnotafinal[6]));
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

package atividade_avaliativa_pratica;

import java.util.Scanner;

public class Exe_01_Analise_Idade_Acesso {

	public static void main(String[] args) {
		
		// Importando Scanner
		
		Scanner leia = new Scanner(System.in);
				
		// Declarando Variavéis 
				
		String nome;
		int idade;
		boolean autorizacao; 
		
		// Menu para realizar a análise de idade e acesso
		
		System.out.println("********************************************************");
		System.out.println("               ANÁLISE DE IDADE E ACESSO                ");
		System.out.println("********************************************************");
		System.out.println("                                                        ");
		System.out.println("              1 - VERIFICAR ACESSO                      ");
		System.out.println("                                                        ");
		System.out.println("                    2 - SAIR                            ");
		System.out.println("                                                        ");
		System.out.println("********************************************************");
		
		// Primeiro pergunta a opção. Depois efetua a análise
		
		System.out.print("Escolha as opções: ");
		int opcao = leia.nextInt();
		
		// utilizo o nextLine para que não ocorra um erro de linha, que atrapalhe o nome.
		
		leia.nextLine();
		
		// Switch de Análise de idade e acesso que guarda a entrada de dados e realiza a análise. E depois imprimi o nome e a situação ("Acesso Liberado", "Acesso Liberado com autorização" e "Acesso Negado")
		// correspondente a análise de acesso.
				
		switch(opcao) {
		case 1:
			System.out.print("\nDigite seu Nome Completo: ");
			nome = leia.nextLine();
					
			System.out.print("Digite a sua idade: ");
			idade = leia.nextInt();
			
			System.out.print("Possui Autorização (true/false): ");
			autorizacao = leia.nextBoolean();
					
			if (idade >= 18) {
				System.out.println("\nAcesso Liberado para " + nome);
			} else if (idade < 18 && autorizacao == true ) {
				System.out.println("\nAcesso Liberado com autorização para " + nome);
			} else {
				System.out.println("\nAcesso Negado!");
			}
		break;
		case 2:
				System.out.println("Desligando o sistema!");
		break;
		default:
			System.out.println("Opção Inválida! Tente Novamente!");
		}
		
		leia.close();
	}

}

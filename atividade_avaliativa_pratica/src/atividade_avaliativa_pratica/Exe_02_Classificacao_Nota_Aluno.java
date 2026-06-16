package atividade_avaliativa_pratica;

import java.util.Scanner;

public class Exe_02_Classificacao_Nota_Aluno {

	public static void main(String[] args) {
		
		// Importando Scanner
		
		Scanner leia = new Scanner(System.in);
				
		// Declarando Variavéis 
				
		String nome;
		float notafinal;
		
		// Menu para realizar a aprovação escolar
		
		System.out.println("********************************************************");
		System.out.println("             VERIFICAR RESULTADO ESCOLAR                ");
		System.out.println("********************************************************");
		System.out.println("                                                        ");
		System.out.println("              1 - VERIFICAR RESULTADO                   ");
		System.out.println("                                                        ");
		System.out.println("                    2 - SAIR                            ");
		System.out.println("                                                        ");
		System.out.println("********************************************************");
		
		// Primeiro pergunta a opção. Depois efetua a verificação
		
		System.out.print("Escolha as opções: ");
		int opcao = leia.nextInt();
		
		// utilizo o nextLine para que não ocorra um erro de linha, que atrapalhe o nome.
		
		leia.nextLine();
		
		// Switch de Verificação que guarda a entrada de dados e realiza a verificação da nota final. E depois imprimi o nome do aluno e a situação (Aprovado, Recuperação e Reprovado)
		// correspondente a nota final.
		
		switch(opcao) {
		case 1:
			System.out.print("\nDigite seu Nome Completo: ");
			nome = leia.nextLine();
			
			System.out.print("Digite a sua Nota Final: ");
			notafinal = leia.nextFloat();
			
			if (notafinal >= 7) {
				System.out.printf("\nAluno: " + nome + "\nSituação: Aprovado");
			} else if (notafinal >= 5 && notafinal < 7) {
				System.out.printf("\nAluno: " + nome + "\nSituação: Recuperação");
			} else {
				System.out.printf("\nAluno: " + nome + "\nSituação: Reprovado");
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

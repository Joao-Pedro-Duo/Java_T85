package atividade_avaliativa_pratica;

import java.util.Scanner;

public class Exe_03_Simulacao_Calculadora {

	public static void main(String[] args) {
		
		// Importando Scanner
		
		Scanner leia = new Scanner(System.in);
						
		// Declarando Variavéis 
						
		double numero1, numero2;
		
		// Menu para realizar os cálculos
		
		System.out.println("********************************************************");
		System.out.println("          SIMULAÇÃO DE UMA CALCULADORA BÁSICA           ");
		System.out.println("********************************************************");
		System.out.println("                                                        ");
		System.out.println("                    1 - SOMA                            ");
		System.out.println("                    2 - SUBTRAÇÃO                       ");
		System.out.println("                    3 - MULTIPLICAÇÃO                   ");
		System.out.println("                    4 - DIVISÃO                         ");
		System.out.println("                                                        ");
		System.out.println("                    5 - SAIR                            ");
		System.out.println("                                                        ");
		System.out.println("********************************************************");
		
		// Primeiro pergunta a operação. Depois efetua os cálculos
		
		System.out.print("Escolha a sua Operação: ");
		int operacao = leia.nextInt();
		
		// Switch de Operação, utilizando a função "Leia" em cada um, dentro de cada case (1, 2, 3, 4).
		// E imprimindo o resultado em cada operação escolhida
		
		switch(operacao) {
		case 1:
			System.out.print("\nDigite o primeiro número: ");
			numero1 = leia.nextDouble();
			
			System.out.print("Digite o segundo número: ");
			numero2 = leia.nextDouble();
			
			double resultadosoma = (numero1 + numero2);
			System.out.printf("\nOperação: SOMA  \nResultado: %.2f ", resultadosoma);
		break;
		case 2:
			System.out.print("\nDigite o primeiro número: ");
			numero1 = leia.nextDouble();
			
			System.out.print("Digite o segundo número: ");
			numero2 = leia.nextDouble();
			
			double resultadosubtracao = (numero1 - numero2);
			System.out.printf("\nOperação: SUBTRAÇÃO  \nResultado: %.2f ", resultadosubtracao);
		break;
		case 3:
			System.out.print("\nDigite o primeiro número: ");
			numero1 = leia.nextDouble();
			
			System.out.print("Digite o segundo número: ");
			numero2 = leia.nextDouble();
			
			double resultadomultiplicacao = (numero1 * numero2);
			System.out.printf("\nOperação: MULTIPLICAÇÃO  \nResultado: %.2f ", resultadomultiplicacao);
		break;
		case 4:
			System.out.print("\nDigite o primeiro número: ");
			numero1 = leia.nextDouble();
			
			System.out.print("Digite o segundo número: ");
			numero2 = leia.nextDouble();
			
			if (numero2 != 0) {
				double resultadodivisao = (numero1 / numero2);
				System.out.printf("\nOperação: DIVISÃO  \nResultado: %.2f ", resultadodivisao);
			} else {
				System.out.println("Não Pode dividir por 0! Tente Novamente!");
			}
		break;
		case 5:
			System.out.println("Desligando o sistema!");
		break;
		default:
			System.out.println("Opção Inválida! Tente Novamente!");
		}
		
		leia.close();
	}

}

package lista01_lacocondicional_aula_03;

import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeroA, numeroB, numeroC;
		
		System.out.println("**** VERIFICADOR DE SOMAS ****");
		
		System.out.println("\n**** SOMENTE DIGITE NÚMEROS INTEIROS!!! ****");
		
		System.out.print("\nDigite o número A: ");
		numeroA = leia.nextInt();
		
		System.out.print("Digite o número B: ");
		numeroB = leia.nextInt();
		
		System.out.print("Digite o número C: ");
		numeroC = leia.nextInt();
		
		int somaAB = (numeroA + numeroB);
		
		if (somaAB > numeroC) {
			System.out.printf("\n%d + %d = %d > %d", numeroA, numeroB, somaAB, numeroC);
			System.out.print("\nA soma de A + B é Maior do que C");
		} else if (somaAB == numeroC) {
			System.out.printf("\n%d + %d = %d == %d", numeroA, numeroB, somaAB, numeroC);
			System.out.print("\nA soma de A + B é Igual a C");
		} else if (somaAB < numeroC) {
			System.out.printf("\n%d + %d = %d < %d", numeroA, numeroB, somaAB, numeroC);
			System.out.print("\nA soma de A + B é Menor do que C");
		} else {
			System.out.println("Você digitou algum número errado! ");
		}
		
		
		leia.close();
	}

}

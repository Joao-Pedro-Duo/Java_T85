package exercicios_aula_02;

import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("--- Cálculo de Notas Escolar --- ");
		
		System.out.print("\nDigite a primeira nota: ");
		float nota1 = leia.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		float nota2 = leia.nextFloat();
		
		System.out.print("Digite a terceira nota: ");
		float nota3 = leia.nextFloat();
		
		System.out.print("Digite a quarta nota: ");
		float nota4 = leia.nextFloat();
		
		float somadasNotas = (nota1 + nota2) + (nota3 + nota4);
		
		float mediaFinal = (somadasNotas / 4);
		
		System.out.printf("\nMédia Final: %.1f", mediaFinal);
		
		
		leia.close();
	}

}

package lista01_lacocondicional_aula_03;

import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numerodesejado;
		
		System.out.println("**** INDICADOR DE NUMEROS PARES, IMPARES, POSITIVOS OU NEGATIVOS ****");
		
		System.out.print("\nDigite um número: ");
		numerodesejado = leia.nextInt();
		
		int numeroparimpar = (numerodesejado % 2 );
		
		
		if (numerodesejado > 0 && numeroparimpar == 0) {
			System.out.println("\nO Número " + numerodesejado + " é par e positivo!");
		} else if (numerodesejado > 0 && numeroparimpar == 1) {
			System.out.println("\nO Número " + numerodesejado + " é ímpar e positivo!");
		} else if (numerodesejado < 0 && numeroparimpar == 0) {
			System.out.println("\nO Número " + numerodesejado + " é par e negativo!");
		} else if (numerodesejado < 0 && numeroparimpar == -1) {
			System.out.println("\nO Número " + numerodesejado + " é ímpar e negativo!");
		} else if (numerodesejado == 0) {
			System.out.println("\nNão é possivél realizar essa equação!");
		}
		
		leia.close();
	}

}

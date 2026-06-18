package lista_01_vetores;

import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetornumerosInteiros[] = new int [10];
		int soma = 0;
		float media;
		
		
		for (int contador = 0; contador < vetornumerosInteiros.length; contador ++) {
			System.out.printf("\nDigite um valor inteiro para a posição [%d]: ", contador);
			vetornumerosInteiros[contador] = leia.nextInt();
			
			soma += vetornumerosInteiros[contador];
		}	
		
		System.out.print("\n");
		
		System.out.print("\nVetor: ");
		
		for (int numero : vetornumerosInteiros) {
			System.out.print(numero + " ");
		}
		
		System.out.print("\n");
		
		for (int contador = 0; contador < vetornumerosInteiros.length; contador ++) {
			if (vetornumerosInteiros[contador] % 2 == 1) {
				System.out.printf("\n\nElementos nos índices ímpares: %d ", vetornumerosInteiros[contador]);
			}
		}
		
		System.out.print("\n");
		
		for (int contador = 0; contador < vetornumerosInteiros.length; contador ++) {
			if (vetornumerosInteiros[contador] % 2 == 0) {
				System.out.printf("\n\nElementos nos índices pares: %d ", vetornumerosInteiros[contador]);
			}
		}
		
		System.out.print("\n");
		
		media = (soma / 10);
		
		System.out.printf("\nSoma: %d ", soma);
		System.out.printf("\nMédia: %.2f ", media);
		
		leia.close();
	}

}

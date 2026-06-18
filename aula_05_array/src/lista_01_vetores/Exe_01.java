package lista_01_vetores;

import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int deznumeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int encontrarnumero;
		boolean encontrado = false; 
		
		System.out.print("Vetor: ");
		
		for (int numero : deznumeros) {
			System.out.print(numero + " ");
		}
		
		System.out.println("\n\nDigite um número que você deseja encontrar: ");
		encontrarnumero = leia.nextInt();
		
		for (int posicao = 0; posicao < deznumeros.length; posicao ++) {
			if (deznumeros[posicao] == encontrarnumero) {
				System.out.printf("O Número %d está localizado na posição: %d", encontrarnumero, posicao);
				encontrado = true;
			}  		
		}
		
		
			if (!encontrado) {
			System.out.printf("O Número %d não foi encontrado", encontrarnumero);
		}
	
		leia.close();
	}

}

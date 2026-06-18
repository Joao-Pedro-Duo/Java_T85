package lista_02_matrizes;

import java.util.Scanner;

public class Exe_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int matriz3x3[][] = new int[3][3];
		int somanumerosprincipal = 0, somanumerossecundaria = 0;
		
		for (int linha = 0; linha < matriz3x3.length; linha ++) {
			for (int coluna = 0; coluna < matriz3x3[linha].length; coluna ++) {
				System.out.printf("Digite um número para a posição [%d][%d] = ", linha, coluna);
				matriz3x3[linha][coluna] = leia.nextInt();
			}
		}	
		
		for (int linha = 0; linha < 1; linha ++) {
			for (int coluna = 0; coluna < 1; coluna ++) {
				System.out.printf("\nElementos da Diagonal Principal: %d, %d, %d", matriz3x3[0][0], matriz3x3[1][1], matriz3x3[2][2]);
				somanumerosprincipal = (matriz3x3[0][0] + matriz3x3[1][1] + matriz3x3[2][2]);
				
			}
		}	
		
		for (int linha = 0; linha < 1; linha ++) {
			for (int coluna = 0; coluna < 1; coluna ++) {
				System.out.printf("\nElementos da Diagonal Secundária: %d, %d, %d", matriz3x3[0][2], matriz3x3[1][1], matriz3x3[2][0]);
				somanumerossecundaria = (matriz3x3[0][2] + matriz3x3[1][1] + matriz3x3[2][0]);
				
			}
		}	
		
		
		System.out.println("\n");
		
		System.out.printf("\nSoma dos Elementos da Diagonal Principal: %d", somanumerosprincipal);
		System.out.printf("\nSoma dos Elementos da Diagonal Secundária: %d", somanumerossecundaria);
		
		leia.close();
	}

}

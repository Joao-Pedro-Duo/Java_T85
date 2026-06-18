package lista_02_matrizes;

import java.util.Scanner;

public class Exe_04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double matrizdenotas[][] = {
			{4.0, 5.0, 7.0, 3.0},
			{2.5, 6.5, 4.7, 8.0},
			{10.0, 8.5, 9.5, 8.0},
			{9.0, 6.5, 7.6, 8.2},
			{5.0, 5.0, 5.0, 6.3},
			{7.0, 8.0, 9.0, 8.5},
			{5.5, 3.5, 2.5, 1.0},
			{8.0, 9.0, 10.0, 9.5},
			{5.6, 5.8, 6.5, 7.0},
			{7.5, 8.5, 9.5, 10.0},
		};
		
		double vetormedia[] = new double[10];
		
		for (int linha = 0; linha < matrizdenotas.length; linha ++) {
			vetormedia[linha] = (matrizdenotas[linha][0] + matrizdenotas[linha][1] + matrizdenotas[linha][2] + matrizdenotas[linha][3]) / 4;
		}
		
		System.out.print("\nVetor de Média Calculado: ");
		for (int linha = 0; linha < matrizdenotas.length; linha ++) {
			System.out.printf("[%.1f] ", vetormedia[linha]);
		}
		
		leia.close();
	}

}

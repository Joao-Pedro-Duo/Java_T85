package lista_02_matrizes;

import java.util.Scanner;

public class Exe_04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double matrizdenotas[][] = new double[2][4];
		
		double vetormedia[] = new double[2];
		
		//for ()
		
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

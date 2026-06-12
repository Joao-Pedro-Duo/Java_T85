package exercicios_aula_02;

import java.util.Scanner;

public class Exe_04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("--- Cálculo de Diferença entre Números --- ");
		
		System.out.print("\nDigite o primeiro número: ");
		float numero1 = leia.nextFloat();
		
		System.out.print("Digite o segundo número: ");
		float numero2 = leia.nextFloat();
		
		System.out.print("Digite o terceiro número: ");
		float numero3 = leia.nextFloat();
		
		System.out.print("Digite o quarto número: ");
		float numero4 = leia.nextFloat();
		
		float diferencaNumeros = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.printf("\nDiferença entre os Números: %.2f", diferencaNumeros);
		
		
		leia.close();
	}

}

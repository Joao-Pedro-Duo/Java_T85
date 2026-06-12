package exercicios_aula_02;

import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("--- Cálculo de Salário --- ");
		
		System.out.print("\nDigite o valor do Salário: R$ ");
		float Salario = leia.nextFloat();
		
		System.out.print("Digite o valor do Abono: R$ ");
		float Abono = leia.nextFloat();
		
		float novoSalario = (Salario + Abono);
		
		System.out.printf("\nNovo Salário: R$ %.2f", novoSalario);
		
		
		leia.close();
	}

}

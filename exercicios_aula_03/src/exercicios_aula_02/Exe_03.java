package exercicios_aula_02;

import java.util.Scanner;

public class Exe_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("--- Cálculo do Salário Líquido --- ");
		
		System.out.print("\nDigite o valor do Salário Bruto: R$ ");
		float salarioBruto = leia.nextFloat();
		
		System.out.print("Digite o valor do Adicional Noturno: R$ ");
		float adicionalNoturno = leia.nextFloat();
		
		System.out.print("Digite a quantidade de Horas Extras: ");
		float horasExtras = leia.nextFloat();
		
		System.out.print("Digite o valor dos Descontos: R$ ");
		float descontos = leia.nextFloat();
		
		float salarioLiquido = (salarioBruto + adicionalNoturno) + (horasExtras * 5) - descontos;
		
		System.out.printf("\nSalário Liquido: R$ %.2f", salarioLiquido);
		
		
		leia.close();
	}

}

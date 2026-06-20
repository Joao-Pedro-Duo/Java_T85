package aula_07_metodos;

import java.util.Scanner;

public class CalculadoraMetodos {
	
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		double numero1, numero2;
		
		System.out.println("*** CALCULADORA BÁSICA ***");
		
		System.out.print("\nDigite o primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		numero2 = leia.nextDouble();
		
		System.out.printf("\n%.2f + %.2f = %.2f%n", numero1, numero2, somar(numero1, numero2));
		System.out.printf("%.2f - %.2f = %.2f%n", numero1, numero2, subtrair(numero1, numero2));
		System.out.printf("%.2f * %.2f = %.2f%n", numero1, numero2, multiplicar(numero1, numero2));
		System.out.printf("%.2f / %.2f = %.2f%n", numero1, numero2, dividir(numero1, numero2));
		
		System.out.println("");
		
		sobre();
		
		leia.close();
	}

	public static double somar(double numero1, double numero2) {
		return numero1 + numero2;
	}
	
	public static double subtrair(double numero1, double numero2) {
		return numero1 - numero2;
	}
	
	public static double multiplicar(double numero1, double numero2) {
		return numero1 * numero2;
	}

	public static double dividir(double numero1, double numero2) {
		return numero1 / numero2;
	}
	
	public static void sobre() {
		System.out.println("Projeto Calculadora Básica");
		System.out.println("Desenvolvido por: João Pedro");
	}

}

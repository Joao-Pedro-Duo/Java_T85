package atividade_avaliativa_pratica_02;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe_01_Colecao_Numeros_Analise {
	
	// Objeto Scanner para leitura dos dados digitados pelo usuário
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Cria uma collection para armazenar 5 números inteiros
		ArrayList<Integer> cinconumeros = new ArrayList<Integer>();
		
		System.out.println("*****************************************");
		System.out.println("***        Coleção de Números         ***");
		System.out.println("*****************************************");
		
		// Loop para cadastrar os 5 números
		for(var contador = 0; contador < 5; contador++ ) {
			System.out.printf("Entre com um numero para a posição %d: ", contador);
			int numeroentrada = leia.nextInt();
			cinconumeros.add(numeroentrada);
			
		}
		
		// Exibe todos os números armazenados na coleção
		System.out.print("\nColeção: ");
		
		for (var numero : cinconumeros) {
			System.out.print(numero + " ");
		}
		
		// Chama os métodos para realizar os cálculos
		int soma = somarnumeros(cinconumeros);
		double media = calcularmedia(cinconumeros);
		int maior = maiornumero(cinconumeros);
		
		// Exibe os resultados
		System.out.println("\nSoma: " + soma);
		System.out.println("Média: " + media);
		System.out.println("Maior valor: " + maior);

		
		leia.close();
	}

	// Método responsável por somar todos os números 
	public static int somarnumeros(ArrayList<Integer> cinconumeros) {
		
		int soma = 0;
		
		for (var numero : cinconumeros) {
			soma += numero;
		}
		
		return soma;
	}
	
	// Método responsável por calcular a média dos números
	public static double calcularmedia(ArrayList<Integer> cinconumeros) {
		
		int soma = 0;
		
		for (var numero : cinconumeros) {
			soma += numero;
		}
		
		double media = (double) soma / cinconumeros.size(); 
		
		return media;
	}
	
	// Método responsável por encontrar o maior número da coleção
	public static int maiornumero(ArrayList<Integer> cinconumeros) {
		 int maior; 
		 
		// Ordena a coleção em ordem crescente
		 cinconumeros.sort(null);
		 
		// Obtém o último elemento da lista (maior valor)
		 maior = cinconumeros.get(4);
		 
		 return maior;
	}
}

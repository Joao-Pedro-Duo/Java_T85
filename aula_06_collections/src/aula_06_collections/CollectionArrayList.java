package aula_06_collections;

import java.util.ArrayList;
import java.util.Comparator;

public class CollectionArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(1);
		numeros.add(3);
		numeros.add(5);
		numeros.add(7);
		numeros.add(9);
		
		for (int numero : numeros) {
			System.out.println(numero);
		}
		
		System.out.println("\nO objeto que está presente no índice 1: " + numeros.get(1));
		System.out.println("\nO índice do objeto 1: " + numeros.indexOf(1) + "\n");
		
		numeros.set(3, 25);
		
		for (int numero : numeros) {
			System.out.println(numero);
		}
		
		System.out.print("\n");
		
		numeros.remove(0);
		
		for (int numero : numeros) {
			System.out.println(numero);
		}
		
		// Ordenar em ordem crescente
		numeros.sort(null);
		
		// Ordenar em ordem decrescente
		numeros.sort(Comparator.reverseOrder());
		
		for (int numero : numeros) {
			System.out.println(numero);
		}
		

	}

}

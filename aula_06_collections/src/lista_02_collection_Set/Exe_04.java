package lista_02_collection_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exe_04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> deznumeros = new HashSet<Integer>();
		
		ArrayList<Integer> listanumeros = new ArrayList<Integer>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		
		boolean numeroencontrado;
		
		deznumeros.addAll(listanumeros);
		
		System.out.print("List: ");
		
		for (var numero : listanumeros) {
			System.out.print(numero + " ");
		}
		
		System.out.print("\n\nDigite o número que você deseja encontrar: ");
		int encontrarnumero = leia.nextInt();
		
		numeroencontrado = deznumeros.contains(encontrarnumero);
		
		if (numeroencontrado == true) { 
			System.out.printf("\nO número %d foi encontrado!", encontrarnumero);
		} else {
			System.out.printf("\nO número %d não foi encontrado!", encontrarnumero);
		}
		
		leia.close();

	}

}

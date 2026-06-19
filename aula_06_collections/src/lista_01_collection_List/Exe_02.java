package lista_01_collection_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Integer> listanumeros = new ArrayList<Integer>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		
		boolean numeroencontrado;
		
		System.out.print("List: ");
		
		for (var numero : listanumeros) {
			System.out.print(numero + " ");
		}
		
		System.out.print("\n\nDigite o número que você deseja encontrar: ");
		int encontrarnumero = leia.nextInt();
		
		
		int procurando = listanumeros.indexOf(encontrarnumero);
		numeroencontrado = listanumeros.contains(encontrarnumero);
		
		if (numeroencontrado == true) { 
			System.out.printf("\nO número %d está localizado na posição: %d ", encontrarnumero, procurando);
		} else {
			System.out.printf("\nO número %d não foi encontrado!", encontrarnumero);
		}
		
		leia.close();
	}

}

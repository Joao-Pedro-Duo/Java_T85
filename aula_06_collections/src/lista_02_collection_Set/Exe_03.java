package lista_02_collection_Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exe_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> deznumeros = new HashSet<Integer>();
		
		for (var numero = 1; numero < 11; numero ++) {
			System.out.printf("Digite um valor inteiro: ");
			deznumeros.add(leia.nextInt());
		}
		
		System.out.print("\nListar dados do Set: \n");
		
		for(var numero : deznumeros) {
			System.out.println(numero.hashCode());
		}

	}

}

package aula_06_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		ArrayList<String> listaFrutas = new ArrayList<String>(Arrays.asList("Banana", "Pêra"));
		
		
		frutas.add("Morango");
		frutas.add("Melão");
		frutas.add("Abacate");
		frutas.add("abacate");
		frutas.add("Abacate");
		
		frutas.addAll(listaFrutas);
		
		for(String fruta : frutas) {
			System.out.println(fruta);
			System.out.println(fruta.hashCode());
		}
		
		
		System.out.println("A fruta Laranja está presente? " + frutas.contains("Laranja"));
		
		frutas.remove("abacate");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
			System.out.println(fruta.hashCode());
		}
	}

}

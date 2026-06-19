package lista_01_collection_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> listacores = new ArrayList<String>();
		
		for (var cor = 1; cor < 6; cor ++) {
			System.out.printf("Digite %d cor para a lista: ", cor);
			listacores.add(leia.next());
		}
		
		System.out.println("\nListar todas as cores: \n");
		
		for (var cor : listacores) {
			System.out.println(cor);
		}
		
		System.out.println("\nOrdenar as cores: \n");
		
		listacores.sort(null);
		
		for (var cor : listacores) {
			System.out.println(cor);
		}
		
		leia.close();
	}

}

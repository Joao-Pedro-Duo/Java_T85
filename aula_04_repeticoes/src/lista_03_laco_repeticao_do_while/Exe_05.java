package lista_03_laco_repeticao_do_while;

import java.util.Scanner;

public class Exe_05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero = 0, somanumerospositivos = 0;
		
		System.out.println("Soma de números somente positivos!\n(Digite '0' para parar o loop!)\n");
		
			do {
				
				System.out.print("Digite um número: ");
				numero = leia.nextInt();
					
				if (numero > 0) {
					somanumerospositivos += numero;
				} else if (numero < 0 ) {
					System.out.print("");
				}
			} while (numero != 0); 	
		
		System.out.printf("\nResultado: ");
		System.out.printf("\nA soma dos números positivos é: %d", somanumerospositivos);
		
		leia.close();
	}

}

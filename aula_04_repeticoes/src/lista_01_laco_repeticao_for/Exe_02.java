package lista_01_laco_repeticao_for;

import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numerosate10 = 0;
		
		int numerospares = 0, numerosimpares = 0;
		
		System.out.println("Contagem de números pares e ímpares entre dez números");
		
		for(int contador = 0; contador < 10; contador++) {
			System.out.printf("\nDigite o %d˚ número (inteiro): ",contador+1);
			
			numerosate10 = leia.nextInt();
			
			if(numerosate10 % 2 == 0) {
				numerospares ++;
			} else {
				numerosimpares ++;
			}
		
		}
		
		System.out.printf("\nTotal de números pares: %d", numerospares);
		System.out.printf("\nTotal de números ímpares: %d", numerosimpares);
			
		leia.close();
	}

}

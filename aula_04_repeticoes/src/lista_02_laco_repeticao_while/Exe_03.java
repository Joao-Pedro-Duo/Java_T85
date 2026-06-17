package lista_02_laco_repeticao_while;

import java.util.Scanner;

public class Exe_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, menoresde21 = 0, maioresde50 = 0 ;
		boolean iniciar = true;
		
		System.out.println("Contagem de pessoas que são menores de 21 anos e maiores de 50 anos\n(Digite um numero negativo para parar o loop!)");
		
		while(iniciar) {
			
			System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();
			
			if (idade < 21 && idade >= 0) {
				menoresde21 ++;
			} else if (idade > 50) {
				maioresde50 ++;
			} else if (idade < 0) {
				iniciar = false;
			}
		}
		
		System.out.printf("\nTotal de pessoas menores de 21 anos de idade: %d", menoresde21);
		System.out.printf("\nTotal de pessoas maiores de 50 anos de idade: %d", maioresde50);
			
		leia.close();
	}

}

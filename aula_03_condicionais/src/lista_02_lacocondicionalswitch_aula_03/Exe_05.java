package lista_02_lacocondicionalswitch_aula_03;

import java.util.Scanner;

public class Exe_05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int produto, quantidade;
		
		System.out.println("********************************************************");
		System.out.println("                     JORJÃO LANCHES                       ");
		System.out.println("********************************************************");
		System.out.println(" Código do Produto |     Produto      | Preço Unitário  ");
		System.out.println("                                                        ");
		System.out.println("       1           | Cachorro Quente  |  R$ 10,00       ");
		System.out.println("       2           | X - Salada       |  R$ 15,00       ");
		System.out.println("       3           | X - Bacon        |  R$ 18,00       ");
		System.out.println("       4           | Bauru            |  R$ 12,00       ");
		System.out.println("       5           | Refrigerante     |  R$ 08,00       ");
		System.out.println("       6           | Suco de laranja  |  R$ 13,00       ");
		System.out.println("                                                        ");
		System.out.println("********************************************************");
		
		System.out.print("Escolha o código do produto: ");
		produto = leia.nextInt();
		
		System.out.print("Escolha a quantidade: ");
		quantidade = leia.nextInt();
		
		float valorcachorro = (quantidade * 10); 
		float valorxsalada = (quantidade * 15); 
		float valorxbacon = (quantidade * 18); 
		float valorbauru = (quantidade * 12); 
		float valorrefri = (quantidade * 8); 
		float valorsucodelaranja = (quantidade * 13); 
		
		switch(produto) {
		case 1:
			System.out.println("\nProduto: Cachorro Quente");
			System.out.printf("Valor Total: R$ %.2f", valorcachorro);
		break;
		case 2:
			System.out.println("\nProduto: X - Salada");
			System.out.printf("Valor Total: R$ %.2f", valorxsalada);
		break;
		case 3:
			System.out.println("\nProduto: X - Bacon");
			System.out.printf("Valor Total: R$ %.2f", valorxbacon);
		break;
		case 4:
			System.out.println("\nProduto: Bauru");
			System.out.printf("Valor Total: R$ %.2f", valorbauru);
		break;
		case 5:
			System.out.println("\nProduto: Refrigerante");
			System.out.printf("Valor Total: R$ %.2f", valorrefri);
		break;
		case 6:
			System.out.println("\nProduto: Suco de laranja");
			System.out.printf("Valor Total: R$ %.2f", valorsucodelaranja);
		break;
		default:
			System.out.println("Opção Inválida!");
	}

		
		leia.close();
	}

}

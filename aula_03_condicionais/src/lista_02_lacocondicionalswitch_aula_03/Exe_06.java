package lista_02_lacocondicionalswitch_aula_03;

import java.util.Scanner;

public class Exe_06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int codcargo;
		String nome;
		float salario;
		
		System.out.println("**************************************************************");
		System.out.println("                     JORJÃO LANCHES                           ");
		System.out.println("**************************************************************");
		System.out.println(" Código do Cargo   |     Cargo        | Percentual do Reajuste");
		System.out.println("                                                              ");
		System.out.println("       1           | Gerente          |          10%          ");
		System.out.println("       2           | Vendedor         |           7%          ");
		System.out.println("       3           | Supervisor       |           9%          ");
		System.out.println("       4           | Motorista        |           6%          ");
		System.out.println("       5           | Estoquista       |           5%          ");
		System.out.println("       6           | Técnico de TI    |           8%          ");
		System.out.println("                                                              ");
		System.out.println("**************************************************************");
		
		System.out.print("Nome do Colaborador: ");
		nome = leia.nextLine();
		
		System.out.print("Escolha o Código do Cargo: ");
		codcargo = leia.nextInt();
		
		System.out.print("Informe o Salário: ");
		salario = leia.nextFloat();
		
		double novosalario1 = salario + (salario * 0.10); 
		double novosalario2 = salario + (salario * 0.07); 
		double novosalario3 = salario + (salario * 0.09); 
		double novosalario4 = salario + (salario * 0.06); 
		double novosalario5 = salario + (salario * 0.05); 
		double novosalario6 = salario + (salario * 0.08); 
		
		switch(codcargo) {
		case 1:
			System.out.println("\nNome do Colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			System.out.printf("Salário: R$ %.2f", novosalario1);
		break;
		case 2:
			System.out.println("\nNome do Colaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			System.out.printf("Salário: R$ %.2f", novosalario2);
		break;
		case 3:
			System.out.println("\nNome do Colaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			System.out.printf("Salário: R$ %.2f", novosalario3);
		break;
		case 4:
			System.out.println("\nNome do Colaborador: " + nome);
			System.out.println("Cargo: Motorista");
			System.out.printf("Salário: R$ %.2f", novosalario4);
		break;
		case 5:
			System.out.println("\nNome do Colaborador: " + nome);
			System.out.println("Cargo: Estoquista");
			System.out.printf("Salário: R$ %.2f", novosalario5);
		break;
		case 6:
			System.out.println("\nNome do Colaborador: " + nome);
			System.out.println("Cargo: Técnico de TI");
			System.out.printf("Salário: R$ %.2f", novosalario6);
		break;
		default:
			System.out.println("Opção Inválida!");
	}

		leia.close();

	}

}

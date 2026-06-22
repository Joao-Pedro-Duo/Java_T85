package exercicio_criacao_classe;

public class TestaCliente {

	public static void main(String[] args) {
		
		ClasseCliente c1 = new ClasseCliente ("Raquel", 20, "123.456.786-43", "Bairro Jardim Tropical Rua das Margaridas",
				"12345678", "19", "(11) 987546789");
		
		c1.visualizar();
		
		System.out.println("\n");
	
		ClasseCliente c2 = new ClasseCliente ("Pedro", 30, "741.859.582-85", "Bairro Novo Oriente Rua Doze de Maio",
				"38585773", "21", "(13) 938473628" );
		
		c2.visualizar();
				
				

	}

}

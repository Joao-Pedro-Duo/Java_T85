package exercicio_criacao_classe;

public class ClasseCliente {
	private String nome;
	private int idade;
	private String cpf;
	private String endereco;
	private String cep;
	private String numero_casa;
	private String telefone;
	
	
	public ClasseCliente(String nome, int idade, String cpf, String endereco, String cep, String numero_casa,
			String telefone) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
		this.cep = cep;
		this.numero_casa = numero_casa;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getNumero_casa() {
		return numero_casa;
	}


	public void setNumero_casa(String numero_casa) {
		this.numero_casa = numero_casa;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void visualizar() {
		
		System.out.println("*************************************");
		System.out.println("           DADOS DO CLIENTE           ");
		System.out.println("*************************************");
		System.out.printf("Nome do cliente: %s%n", this.nome);
		System.out.printf("CPF do cliente: %s%n", this.cpf);
		System.out.printf("Idade do cliente: %d%n", this.idade);
		System.out.printf("Telefone do cliente: %s%n", this.telefone);
		System.out.println("                                       ");
		System.out.printf("Endereço do cliente: %s%n", this.endereco);
		System.out.printf("Número da casa do cliente: %s%n", this.numero_casa);
		System.out.printf("CEP do cliente: %s%n", this.cep);
	
	}
}

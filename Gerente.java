//classe gerente herdando variaveis e metodo da classe Pessoa e herdando getters e setters da interface Pessoas

public class Gerente extends Pessoa implements Pessoas{
	//construct da classe
	public Gerente(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	//variaveis da classe
	public String nome;
	public String email;
	//metodo imprimir da classe
	public void imprimir() {
		System.out.println("Dados do usuario");
		System.out.println("Nome:"+nome);
		System.out.println("Email:"+email);
	}	
	//metedo herdado da classe pessoa
	public String obterFuncao() {
		String f = "Gerente";
		return f;
	}
	//getters e setters das vairaveis da classe
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	//getters e setters vindos da interface Pessoas
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public String getEmail() {
		return email;
	}	
}

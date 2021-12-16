//classe gerente herdando variaveis e metodo da classe Pessoa e herdando getters e setters da interface Pessoas
public class Gerente extends Pessoa implements Pessoas{
	
	public Gerente(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}//construct da classe
	
	//variaveis da classe
	public String nome;
	public String email;
	public String senha = "senha123";
	
	public void imprimir() {
		System.out.println("Dados do usuario");
		System.out.println("Nome:"+nome);
		System.out.println("Email:"+email);
	}//imprimir da classe
	
	public String obterFuncao() {
		String f = "Gerente";
		return f;
	}//metedo herdado da classe pessoa
	
	//getters e setters da classe
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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

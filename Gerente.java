public class Gerente {
	
	public Gerente(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	public String nome;
	public String email;
	public String senha = "senha123";
	
	public void imprimir() {
		System.out.println("Dados do usuario");
		System.out.println("Nome:"+nome);
		System.out.println("Email:"+email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
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
}
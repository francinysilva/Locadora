import java.util.ArrayList;

public class Usuario {
	
	public Usuario(String nome, String email) {
		
		this.nome = nome;
		this.email = email;
	}
	
	public String nome;
	public String email;
	public String senha = "senha123";
	
	public ArrayList<Usuario> usuarios = new ArrayList<>();	
	public ArrayList<Filme> filmes = new ArrayList<>();
	
	public void imprimir() {
		
		System.out.println("Dados do usuario");
		System.out.println("Nome:"+nome);
		System.out.println("Email:"+email);
		System.out.println("Filmes locados: "+filmes.size());
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

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(ArrayList<Filme> filmes) {
		this.filmes = filmes;
	}
}

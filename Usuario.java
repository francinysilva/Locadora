import java.util.ArrayList;

public class Usuario {
	
	public Usuario(String nome, String email) {
		//construtor da classe com  nome e email
		this.nome = nome;
		this.email = email;
	}
	//variaveis da classe
	public String nome;
	public String email;
	
	//arrays de objeto do tipo usuario e objeto do tipo filme
	public ArrayList<Usuario> usuarios = new ArrayList<>();	
	public ArrayList<Filme> filmes = new ArrayList<>();
	
	public void imprimir() {
		//metodo para imprimir dados do usuario
		System.out.println("Dados do usuario");
		System.out.println("Nome:"+nome);
		System.out.println("Email:"+email);
		System.out.println("Filmes locados: "+filmes.size());
	}
}
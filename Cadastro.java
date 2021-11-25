import java.util.ArrayList;

public class Cadastro {
		public Cadastro(String nome, String email, String senha) {
			//contrutor da classe com nome, senha e email
			this.nome = nome;
			this.senha = senha;
			this.email = email;
		}
		//declaração das variaveis
		public String nome;
		public String email;
		public String senha;
		//Array de objetos do tipo filme
		public ArrayList<Filme> filmes = new ArrayList<>();
		
		public void imprimir() {
			//metodo para imprimir nome, email e numero de filmes locados
			System.out.println("nome:"+nome);
			System.out.println("email:"+email);
			System.out.println("numero de filmes:"+filmes.size());
		}
	}

import java.util.ArrayList;

public class Cadastro {
		public Cadastro(String nome, String email, String senha) {
			this.nome = nome;
			this.email = email;
			this.senha = senha;
		}
		public String nome;
		public String email;
		public String senha = "senha123";
		public ArrayList<Filme> filmes = new ArrayList<>();
		
		public void imprimir() {
			System.out.println("nome:"+nome);
			System.out.println("email:"+email);
			System.out.println("numero de filmes:"+filmes.size());
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

		public ArrayList<Filme> getFilmes() {
			return filmes;
		}

		public void setFilmes(ArrayList<Filme> filmes) {
			this.filmes = filmes;
		}		
	}

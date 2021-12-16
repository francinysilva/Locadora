import java.util.ArrayList;//importaçao da biblioteca arraylist

//classe cadastro herdando variaveis e metodo da classe Pessoa e herdando getters e setters da interface Pessoas
public class Cadastro extends Pessoa implements Pessoas{
		public Cadastro(String nome, String email, String senha) {
			this.nome = nome;
			this.email = email;
			this.senha = senha;
		}
		
		public String senha = "senha123";//variavel guardando uma senha pré definida
		public ArrayList<Filme> filmes = new ArrayList<>();//arryalist de filmes
		
		public void imprimir() {
			System.out.println("nome:"+nome);
			System.out.println("email:"+email);
			System.out.println("numero de filmes:"+filmes.size());
		}//metodo imprimir da classe cadastro
		
		public String obterFuncao() {
			String f = "Cliente";
			return f;
		}//metodo herdado de Pessoa.java
		
		//getters e setters
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

		public ArrayList<Filme> getFilmes() {
			return filmes;
		}

		public void setFilmes(ArrayList<Filme> filmes) {
			this.filmes = filmes;
		}
		
		//getters e setters herdados da interface Pessoas.Java
		@Override
		public String getNome() {
			return nome;
		}

		@Override
		public String getEmail() {
			return email;
		}	
	}

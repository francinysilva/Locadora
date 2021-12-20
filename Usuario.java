import java.util.ArrayList;//importaçao da biblioteca arraylist

//classe usuario herdando variaveis e metodo da classe Pessoa e herdando getters e setters da interface Pessoas
public class Usuario extends Pessoa implements Pessoas{
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	//variaveis e arraylists da classe
	public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();	
	
	public static ArrayList<Filme> filmes = new ArrayList<>();
	
	public void imprimir() {
		System.out.println("Dados do usuario");
		System.out.println("Nome:"+nome);
		System.out.println("Email:"+email);
	}//imprimir da classe
	
	public String obterFuncao() {
		String f = "Cliente";
		return f;
	}
	//metodo herdado de Pessoa.java

	
	//getters e setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		Usuario.usuarios = usuarios;
	}

	public ArrayList<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(ArrayList<Filme> filmes) {
		Usuario.filmes = filmes;
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

import java.util.ArrayList;

public class Filme {
	//variaveis filme
	public String nome;
	public int cod;
	public double valor;
	public String descricao;
	public boolean filmeLocado;
	//construct da class
	public Filme(String nome, int cod, double valor, String descricao, boolean filmeLocado) {
		this.nome = nome;
		this.cod = cod;
		this.valor = valor;
		this.descricao = descricao;
		this.filmeLocado = filmeLocado;
	}
	//imprimir da class filme
	public static void imprimir(ArrayList<Filme> f) {
		for (int i = 0; i<Usuario.filmes.size();i++) {
			if(Usuario.filmes.get(i).isFilmeLocado()==true) {
				i++;
			}
			System.out.println("");
			System.out.println("Nome: "+Usuario.filmes.get(i).getNomeFilme());
			System.out.println("Codigo: "+Usuario.filmes.get(i).getCodFilme());
			System.out.println("Descriçao: "+Usuario.filmes.get(i).getDescricaoFilme());
			System.out.println("Valor: R$"+Usuario.filmes.get(i).getValorFilme()+"0");
		}
	}
	//setters e getters das variaveis
	public String getNomeFilme() {
		return nome;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nome = nomeFilme;
	}
	public int getCodFilme() {
		return cod;
	}
	public void setCodFilme(int codFilme) {
		this.cod = codFilme;
	}
	public double getValorFilme() {
		return valor;
	}
	public void setValorFilme(double valorFilme) {
		this.valor = valorFilme;
	}
	public String getDescricaoFilme() {
		return descricao;
	}
	public void setDescricaoFilme(String descricaoFilme) {
		this.descricao = descricaoFilme;
	}
	public boolean isFilmeLocado() {
		return filmeLocado;
	}
	public void setFilmeLocado(boolean filmeLocado) {
		this.filmeLocado = filmeLocado;
	}
}

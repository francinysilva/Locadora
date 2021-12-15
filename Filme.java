public class Filme {
	
	public String nome;
	public int cod;
	public double valor;
	public String descricao;
	public boolean filmeLocado;
	
	public void imprimir() {
		System.out.println("Filme:");
		System.out.println("Nome: "+nome);
		System.out.println("Descrição: "+descricao);
		System.out.println("Filme locado: "+filmeLocado);
	}
	
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

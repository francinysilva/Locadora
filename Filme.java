public class Filme {
	
	public String nomeFilme;
	public int codFilme;
	public double valorFilme;
	public String descricaoFilme;
	public boolean filmeLocado;
	
	public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
	public int getCodFilme() {
		return codFilme;
	}
	public void setCodFilme(int codFilme) {
		this.codFilme = codFilme;
	}
	public double getValorFilme() {
		return valorFilme;
	}
	public void setValorFilme(double valorFilme) {
		this.valorFilme = valorFilme;
	}
	public String getDescricaoFilme() {
		return descricaoFilme;
	}
	public void setDescricaoFilme(String descricaoFilme) {
		this.descricaoFilme = descricaoFilme;
	}
	public boolean isFilmeLocado() {
		return filmeLocado;
	}
	public void setFilmeLocado(boolean filmeLocado) {
		this.filmeLocado = filmeLocado;
	}
}

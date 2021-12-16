import java.time.LocalDate;//importaçao da bliblioteca localdate

public class Locacao {
	//variaveis do tipo localdate
	LocalDate dataSaida = LocalDate.now();
	LocalDate dataEntrada = LocalDate.now().plusDays(7);
	
	public void imprimir() {
		System.out.println("Data de retirada:"+dataSaida);
		System.out.println("Data de devolução:"+dataEntrada);
	}//metodo imprimir da classe
	
	
	//getters e setters da funçao
	public LocalDate getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}
	public LocalDate getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
}

import java.time.LocalDate;
import java.util.Scanner;

public class Locadora extends ValorTotal{
		//scanner e localdates
		public static Scanner leitor = new Scanner(System.in);
		static LocalDate dataSaida = LocalDate.now();
		static LocalDate dataEntrada = LocalDate.now().plusDays(7);
		//metodo pra ler dados do usuario
		public static Usuario lerUsuario() {		
			System.out.println("Por favor, digite os dados pedidos.");
			System.out.print("Digite o nome:");		
			String nome = leitor.next();
			System.out.print("Digite o email:");		
			String email = leitor.next();	
			Usuario usu = new Usuario (nome, email); 
			return usu; 
		}
		//metodo pra comparar os dados com os usuarios predefinidos
		public static String comparaUsuario() {
			String nome = "teste";
			System.out.println("Digite seu email:");
			String email = leitor.next();
			for (int i = 0; i<Usuario.usuarios.size();i++) {
				if (email.equals(Usuario.usuarios.get(i).getEmail())) {
					nome = Usuario.usuarios.get(i).getNome();
					i=Usuario.usuarios.size();
				}
			}
			return nome;
		}
		//metodo pra ler os filmes que serao locados e criar uma "nota" com o nome do cliente e as informaçoes sobre o serviço
		public static void locacao(String usu) {
			int i=99;
			int cont=0;
			int aux = 0;
			int[] arr = new int[]{0,0,0,0,0};
			while (i != 0) {//laço de repeticao pra ler todos os filmes que serao locados 
				Filme.imprimir(Usuario.filmes);
				System.out.println("Digite o codigo do filme que deseja alugar ou digite 0 para sair:");
				aux = leitor.nextInt();
				if (aux==0) {
					i=0;
				}else {
					aux--;
					if (Usuario.filmes.get(aux).isFilmeLocado()==true) {//if pra impedir de selecionar filmes indisponiveis ou selecionar um filme mais de uma vez
						System.out.println("Filme indisponivel no momento");
					}else {
						Usuario.filmes.get(aux).setFilmeLocado(true);//if pra gravar no array o codigo do filme
						arr[cont]=(Usuario.filmes.get(aux).getCodFilme());
						cont++;
					}
				}
			}
			cont = 0;
			for (i = 0; i<arr.length; i++) {//laço de repeticao pra ver quantos filmes foram escolhidos
					if (arr[i]>0) {
						cont++;
					}	
			}
			//decremento pra regular a posicao do array com o codigo dos filmes
			arr[0]--;
			arr[1]--;
			arr[2]--;
			arr[3]--;
			arr[4]--;
			switch (cont){//switch com os casos conforme o numero de filmes que soma o valor total e informa junto com a data da retirada e da devolucao, nome do cliente e nome dos filmes
			case 1: {
				System.out.println("");
				System.out.println("Cliente: "+usu);
				System.out.println("Filme: "+Usuario.filmes.get(arr[0]).getNomeFilme());
				System.out.println("Data de retirada:"+dataSaida);
				System.out.println("Data de devolução:"+dataEntrada);
				System.out.printf("Valor total: R$"+Usuario.filmes.get(arr[0]).getValorFilme());
				System.out.println("\nVolte sempre :)");
				break;
			}case 2: {
				System.out.println("");
				System.out.println("Cliente: "+usu);
				System.out.println("Filmes: "+Usuario.filmes.get(arr[0]).getNomeFilme()+", "+Usuario.filmes.get(arr[1]).getNomeFilme());
				System.out.println("Data de retirada:"+dataSaida);
				System.out.println("Data de devolução:"+dataEntrada);
				System.out.printf("Valor total: R$"+vFinal(Usuario.filmes.get(arr[0]).getValorFilme(), Usuario.filmes.get(arr[1]).getValorFilme()));
				System.out.println("\nVolte sempre :)");
				break;
			}case 3: {
				System.out.println("");
				System.out.println("Cliente: "+usu);
				System.out.println("Filmes: "+Usuario.filmes.get(arr[0]).getNomeFilme()+", "+Usuario.filmes.get(arr[1]).getNomeFilme()+", "+Usuario.filmes.get(arr[2]).getNomeFilme());
				System.out.println("Data de retirada:"+dataSaida);
				System.out.println("Data de devolução:"+dataEntrada);
				System.out.printf("Valor total: R$"+vFinal(Usuario.filmes.get(arr[0]).getValorFilme(), Usuario.filmes.get(arr[1]).getValorFilme()), Usuario.filmes.get(arr[2]).getValorFilme());
				System.out.println("\nVolte sempre :)");
				break;
			}case 4: {
				System.out.println("");
				System.out.println("Cliente: "+usu);
				System.out.println("Filmes: "+Usuario.filmes.get(arr[0]).getNomeFilme()+", "+Usuario.filmes.get(arr[1]).getNomeFilme()+", "+Usuario.filmes.get(arr[2]).getNomeFilme()+", "+Usuario.filmes.get(arr[3]).getNomeFilme());
				System.out.println("Data de retirada:"+dataSaida);
				System.out.println("Data de devolução:"+dataEntrada);
				System.out.printf("Valor total: R$"+vFinal(Usuario.filmes.get(arr[0]).getValorFilme(), Usuario.filmes.get(arr[1]).getValorFilme()), Usuario.filmes.get(arr[2]).getValorFilme(), Usuario.filmes.get(arr[3]).getValorFilme());
				System.out.println("\nVolte sempre :)");
				break;
			}case 5: {
				System.out.println("");
				System.out.println("Cliente: "+usu);
				System.out.println("Filmes: "+Usuario.filmes.get(arr[0]).getNomeFilme()+", "+Usuario.filmes.get(arr[1]).getNomeFilme()+", "+Usuario.filmes.get(arr[2]).getNomeFilme()+", "+Usuario.filmes.get(arr[3]).getNomeFilme()+", "+Usuario.filmes.get(arr[4]).getNomeFilme());
				System.out.println("Data de retirada:"+dataSaida);
				System.out.println("Data de devolução:"+dataEntrada);
				System.out.printf("Valor total: R$"+vFinal(Usuario.filmes.get(arr[0]).getValorFilme(), Usuario.filmes.get(arr[1]).getValorFilme()), Usuario.filmes.get(arr[2]).getValorFilme(), Usuario.filmes.get(arr[3]).getValorFilme(), Usuario.filmes.get(arr[4]).getValorFilme());
				System.out.println("\nVolte sempre :)");
				break;
			}default:
				break;
		}
	}
}
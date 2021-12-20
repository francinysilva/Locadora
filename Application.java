import java.time.LocalDate;

public class Application {

	public static void main(String[] args){
		//criacao de usuarios
		Usuario user1 = new Usuario("Franciny", "franciny@gmail.com");
		Usuario user2 = new Usuario("Pedro", "pedro@gmail.com");
		Usuario user3 = new Usuario("Henrique", "Henrique@gmail.com");
		Usuario user4 = new Usuario("Maria", "maria@gmail.com");
		Usuario user5 = new Usuario("Joao", "joao@gmail.com");
		//adicionando os usuarios no arraylist
		Usuario.usuarios.add(user1);
		Usuario.usuarios.add(user2);
		Usuario.usuarios.add(user3);
		Usuario.usuarios.add(user4);
		Usuario.usuarios.add(user5);
		//criacao dos filmes
		Filme filme1 = new Filme("filme a", 1, 5.00, "filme de comedia...", false);
		Filme filme2 = new Filme("filme b", 2, 4.00, "filme de açao...", true);
		Filme filme3 = new Filme("filme c", 3, 5.00, "filme de terror...", false);
		Filme filme4 = new Filme("filme d", 4, 6.00, "documentario...", false);
		Filme filme5 = new Filme("filme e", 5, 7.00, "filme infantil...", false);
		//adicionando os filmes na arraylist
		Usuario.filmes.add(filme1);
		Usuario.filmes.add(filme2);
		Usuario.filmes.add(filme3);
		Usuario.filmes.add(filme4);
		Usuario.filmes.add(filme5);
		
		LocalDate data = LocalDate.now();
		System.out.println("Bem vindo a nossa Locadora, dia "+data);
		
		int opcao=0;
		//if pra identificar usuario
		while (opcao!=1 || opcao!=2){
			opcao =  Menu.opcoesLogin();
			if (opcao == 1){
				String usu = Locadora.comparaUsuario();
				System.out.println("Veja nossa lista de filmes sr(a)"+usu+":");
				Locadora.locacao(usu);
				break;
			}else if (opcao == 2) {
				Usuario usu = Locadora.lerUsuario(); 
				Usuario.usuarios.add(usu);
				System.out.println("Veja nossa lista de filmes sr(a)"+usu.getNome()+":");
				Locadora.locacao(usu.getNome());
				break;
			}else {
				System.out.println("Opçao invalida! Tente novamente:");
			}
		}
	}
}

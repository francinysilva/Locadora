import java.util.Scanner;

public class Menu {

	public static Scanner leitor = new Scanner(System.in);
	
	public static Cadastro lerCadastro() {	
		System.out.println("Cadastrando um usuario.");
		System.out.println("Por favor, digite os dados pedidos.");
		System.out.print("Digite o nome:");		
		String nome = leitor.nextLine(); 
		System.out.print("Digite o email:");		
		String email = leitor.nextLine();
		System.out.print("Digite o senha:");		
		String senha = leitor.nextLine();
		Cadastro cad = null;
		if (senha.equals(cad.getSenha())) {
			cad = new Cadastro(nome, email, senha);
		}
		return cad;
	}
	
	public static Usuario lerUsuario() {
		System.out.println("Por favor, digite os dados pedidos.");
		System.out.print("Digite o nome:");		
		String nome = leitor.nextLine();
		System.out.print("Digite o email:");		
		String email = leitor.nextLine();
		System.out.print("Digite o senha:");		
		Usuario usu = new Usuario (nome, email); 
		return usu; 
	}
}

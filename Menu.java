import java.util.Scanner;

public class Menu {
public static Scanner leitor = new Scanner(System.in);//cria objeto scanner pra ler as entradas do usuario
	
	public static Cadastro lerCadastro() {	
		System.out.println("Cadastrando um usuario.");
		System.out.println("Por favor, digite os dados pedidos.");
		System.out.print("Digite o nome:");		
		String nome = leitor.nextLine(); //le o nome
		System.out.print("Digite o email:");		
		String email = leitor.nextLine(); //le o email
		System.out.print("Digite o senha:");		
		String senha1 = leitor.nextLine();  //le a senha
		System.out.print("Digite a confirmacao de senha:");		
		String senha2 = leitor.nextLine();
		Cadastro cad = null;
		if (senha1.equals(senha2)) {
			cad = new Cadastro(nome, email, senha1);
		}
		return cad; //retorna o objeto cadastro
	}
	
	public static Usuario lerUsuario() {
		System.out.println("Por favor, digite os dados pedidos.");
		System.out.print("Digite o nome:");		
		String nome = leitor.nextLine();//le o nome
		System.out.print("Digite o email:");		
		String email = leitor.nextLine(); //le o email
		Usuario usu = new Usuario (nome, email); //cria um usuario no sistema com as informaçoes obtidas
		return usu; //retorna o objeto usuario
	}
}
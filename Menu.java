import java.util.Scanner;

public class Menu {
	//criacao do scanner
	public static Scanner leitor = new Scanner(System.in);//declaraçao de scanner
	//mensagens usadas no while do application
	public static int opcoesLogin() {
		System.out.println("Digite 1 se já tem cadastro conosco ou digite 2 para se cadastrar");
		int r = leitor.nextInt();
		return r;
	}
	public static int opcoesLocacao() {
		System.out.println("Deseja locar qual filme?");
		int r = leitor.nextInt();
		return r;
	}
}

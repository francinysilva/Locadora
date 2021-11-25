
public class Application {

	public static void main(String[] args) {
		Usuario usu = Menu.lerUsuario(); //cria variavel do tipo usuario e chama o metodo lerUsuario() da classe Menu
		usu.imprimir(); //imprime a variavel usu
		/*Cadastro cadastro = Menu.lerCadastro(); //cria variavel do tipo cadastro e chama o metodo lerCadastro() da classe Menu 
		cadastro.imprimir(); //imprime a variavel cadastro*/
	}

}
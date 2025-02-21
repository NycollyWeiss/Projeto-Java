package telas;

import java.util.Scanner;

import controllers.ProdutosController;
import shop.Produto;

public class MenuUser {
	
	


	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ProdutosController controller = new ProdutosController();
			int opcao;
			boolean menu = true;
			String login;
			String senha;
			boolean subMenu = true;
			int subOpcao;
			
		while (menu) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("     Karma Airsof Shop - Be their Karma Interno      ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Produtos                             ");
			System.out.println("            2 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();
			
			
	
			switch(opcao) {
			
			
			case 1: 
				while(subMenu) {
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("                     Produtos                        ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("            1 - Cadastrar                            ");
				System.out.println("            2 - Atualizar                            ");
				System.out.println("            3 - Listar todos                         ");
				System.out.println("            4 - Buscar                               ");
				System.out.println("            5 - Deletar                              ");
				System.out.println("            6 - Voltar ao menu                       ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("Entre com a opção desejada:                          ");
				System.out.println("                                                     ");
				
				subOpcao = leia.nextInt();
				//consome quebra de linha(enter), quando vc usa outros next sem ser o line
				leia.nextLine();
				
				switch(subOpcao) {
				
				case 1:
					Produto produtoCadastro = new Produto();
					
					System.out.println("Digite o nome do produto:");
					produtoCadastro.setNome(leia.nextLine());
					
					System.out.println("Digite o departamento do produto:");
					produtoCadastro.setDepartamento(leia.nextLine());
					
					System.out.println("Digite o tipo do produto:");
					produtoCadastro.setTipo(leia.nextLine());
					
					System.out.println("Digite a marca do produto:");
					produtoCadastro.setMarca(leia.nextLine());
					
					System.out.println("Digite o preco do produto:");
					produtoCadastro.setPreco(leia.nextDouble());
					//consome quebra de linha(enter), quando vc usa outros next sem ser o line
					leia.nextLine();
								
					System.out.println("Digite a quantidade do produto:");
					produtoCadastro.setQuantidade(leia.nextInt());
					
					controller.cadastrar(produtoCadastro);
					break;
					
				case 2: 
					System.out.println("Digite o Id do produto que deseja atualizar:");
					Produto produtoEditar = controller.buscarNaLista(leia.nextInt());
					leia.nextLine();
					produtoEditar.visualizar();
					System.out.println("Digite o nome do produto:");
					
					produtoEditar.setNome(leia.nextLine());
					
					System.out.println("Digite o departamento do produto:");
					produtoEditar.setDepartamento(leia.nextLine());
					
					System.out.println("Digite o tipo do produto:");
					produtoEditar.setTipo(leia.nextLine());
					
					System.out.println("Digite a marca do produto:");
					produtoEditar.setMarca(leia.nextLine());
					
					System.out.println("Digite o preco do produto:");
					produtoEditar.setPreco(leia.nextDouble());
					//consome quebra de linha(enter), quando vc usa outros next sem ser o line
					leia.nextLine();
								
					System.out.println("Digite a quantidade do produto:");
					produtoEditar.setQuantidade(leia.nextInt());
					
					controller.atualizar(produtoEditar);
					
					
					
					break;
				case 3: 
					//obj dentro da variavel, criou para poder acessar as coisas dele
					controller.listarTodos();
					break;
				case 4: 
					System.out.println("Digite o nome do produto:");
					String nome = leia.nextLine();
					controller.procurarPorNome(nome);
					break;
					
				case 5: 
					System.out.println("Digite o Id do produto a deletar:");
					int id = leia.nextInt();
					leia.nextLine();
					controller.deletar(id);
					break;
				case 6: 
					subMenu= false;
					break;
					
				
				
					}
				}
				
				
				
				break;
				
				
		
			case 2: 
				System.out.println("Karma Airsof Shop - Be their Karma");
				sobre();
				leia.close();
				menu = false;
				break;
			}

			
	}
		
		
	

	}
	
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Nycolly Weiss ");
	    System.out.println("github.com/NycollyWeiss");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("*********************************************************");
			
	}
	
}

package shop;

import java.util.Scanner;

public class MenuUser {
	
	


	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
			int opcao;
			boolean menu = true;
			String login;
			String senha;
			
		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("           Karma Airsof Shop - Be their Karma        ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Login                                ");
			System.out.println("            2 - Criar conta                          ");
			System.out.println("            3 - Estoque                              ");
			System.out.println("            4 - Produtos                             ");
			System.out.println("            5 - Vendas                               ");
			System.out.println("            6 - Caixa                                ");
			System.out.println("            7 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();
			
			
			
			if(opcao == 7) {
				System.out.println("Karma Airsof Shop - Be their Karma");
				sobre();
				leia.close();
				menu = false;
				System.exit(0);
				
			}
			
			switch(opcao) {
			
			case 1: 
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("                     Login                           ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");

				System.out.println("Digite seu login: ");
				login = leia.nextLine();
				System.out.println("Digite sua senha: ");
				senha = leia.nextLine();
				break;
				//fazer verificacao se existe esse login ou senha errada
				
			case 2: 
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("                     Criar Conta                     ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");

				System.out.print("Digite seu login: ");
				leia.nextLine();
				
				System.out.println("Digite novamente seu login: ");
				leia.nextLine();
				System.out.println("Digite sua senha: ");
				leia.nextLine();
				System.out.println("Digite novamente sua senha: ");
				break;
				//fazer verificacao se as senhas sao iguais e se o login ja existe
				
				
			case 3: 
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("                     Estoque                         ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				//menu estoque 
				break;
				//so poder acessar o estoque se estiver logado
				

			case 4: 
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("                     Produtos                        ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");

				break;
				
				
			case 5: 
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("                     Vendas                          ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");

				break;
				
				
			case 6: 
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("                     Caixa                           ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");

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

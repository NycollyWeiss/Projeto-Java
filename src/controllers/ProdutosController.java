package controllers;

import java.util.ArrayList;

import repository.ProdutoRepository;
import shop.Produto;

public class ProdutosController implements ProdutoRepository {

	
	private ArrayList <Produto> listaProduto = new ArrayList<Produto>();
	private int Id;
	
	
	@Override
	public void procurarPorNome(String nome) {
		for(Produto produto : listaProduto) {
			if(produto.getNome().toUpperCase().contains(nome.toUpperCase())) {
				produto.visualizar();
			}
		}
		
	}
	@Override
	public void listarTodos() {
		if(listaProduto.isEmpty()) {
			System.out.println("Nenhum produto cadastrado!");
		}
		
		for(Produto produto: listaProduto) {
			produto.visualizar();
		}
	}
	@Override
	public void cadastrar(Produto produto) {
		produto.setId(listaProduto.size() + 1);
		listaProduto.add(produto);
		System.out.println("O produto " + produto.getNome() + "foi cadstrado com sucesso!");
		
	}
	
	@Override
	//produto mini é variavel 
	public void atualizar(Produto produto) {
		 Produto buscaProduto = buscarNaLista(produto.getId());
			
			if (buscaProduto!= null) {
				listaProduto.set(listaProduto.indexOf(produto),produto);
				
				System.out.println("\nO produto " + produto.getId() + " foi atualizada com sucesso!");
			}else
				System.out.println("\nO produto " + produto.getId() + " não foi encontrada!");
	    }
		
	
	
	public void deletar(int numero) {
		Produto produto = buscarNaLista(numero);
		if(produto != null) {
			
			if(listaProduto.remove(produto) == true)
				System.out.println("\n" + produto.getId() + " foi deletada com sucesso!");
		}else
			System.out.println("\n " + produto.getId() + " não foi encontrada!");
    }
   
 // tipo Produto
	public Produto buscarNaLista(int numero) {
		for(Produto produto: listaProduto) {
			if(produto.getId() == numero) {
				return produto;
			}
		}
		return null;
	
	}

	
	
		
}


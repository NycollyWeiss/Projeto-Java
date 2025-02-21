package repository;
import shop.Produto;

public interface ProdutoRepository {
		// CRUD do produto 
		
	public void procurarPorNome(String nome);
    public void listarTodos();
    public void cadastrar(Produto produto);
    public void atualizar(Produto produto);
    public void deletar(int numero);
		
		
	}



package repository;
import shop.Produto;

public interface ProdutoRepository {
		// CRUD do produto 
		
	public void procurarPorNome(String nome);
    public void listarTodos() throws Exception;
    public void cadastrar(Produto produto);
    public void atualizar(Produto produto) throws Exception;
    public void deletar(int numero) throws Exception;
		
		
	}



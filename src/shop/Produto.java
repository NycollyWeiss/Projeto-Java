package shop;

public class Produto {
	
	private String departamento;
	private String tipo; 
	private String nome;
	private String marca;
	private double preco;
	private int quantidade;
	private int Id;
	
	
	public Produto () {
		
	}


	public Produto(String departamento, String tipo, String nome, String marca, double preco, int quantidade, int id) {
		this.departamento = departamento;
		this.tipo = tipo;
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
		this.quantidade = quantidade;
		this.Id = id;
	}
	
	
	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}

	public void visualizar() {
		
	
		System.out.println("\n\n***********************************************************");
		System.out.println("Informacoes do produto:");
		System.out.println("***********************************************************");
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Marca: " + this.marca);
		System.out.println("Preco: " + this.preco);
		System.out.println("Quantidade: " + this.quantidade);
	}


	
	
}
	
	


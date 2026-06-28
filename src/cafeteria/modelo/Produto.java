package cafeteria.modelo;

public class Produto {

	private String codigo;
	private String nome;
	private double precoBase;
	private int quantidadeEstoque;
	
	public Produto(String codigo, String nome, double precoBase, int quantidadeEstoque) {
		this.codigo = codigo;
		this.nome = nome;
		this.precoBase = precoBase;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public double getPrecoBase() {
		return precoBase;
	}
	
	public int getQuantidadeestoque() {
		return quantidadeEstoque;
	}
	public void baixarEstoque(int quantidade) {
		if(quantidade <= this.quantidadeEstoque) {
			this.quantidadeEstoque -= quantidade;
		}
	}
}

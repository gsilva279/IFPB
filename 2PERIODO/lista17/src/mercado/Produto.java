package mercado;

public class Produto {
	private String nomeProduto;
	private double preco;
	
	public Produto(String nome, double preco){
		this.nomeProduto = nome;
		this.preco = preco;
	}
	
	public String getNomeProduto() {return nomeProduto;}
	public void setNomeProduto(String produto) {this.nomeProduto = produto;}
	public double getPreco() {return preco;}
	public void setPreco(double preco) {this.preco = preco;}
	
}

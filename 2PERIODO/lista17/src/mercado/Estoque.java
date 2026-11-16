package mercado;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
	private static Estoque instancia;
	private List<Produto> produtos = new ArrayList<>();
	
	private Estoque() {}
	
	public static Estoque getInstance() {
		if (instancia == null) {
			instancia = new Estoque();
		}
		return instancia;
	}
	
	public List<Produto> getProdutos(){return produtos;}
	public void setProdutos(List<Produto> produtos) {this.produtos = produtos;}
	
	//método adicionar produto:
	public 	void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
}

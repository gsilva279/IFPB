package mercado;
import java.time.LocalDate;

public class ProdutoNaoPerecivel extends Produto{
	private LocalDate dataFabricacao;
	
	public ProdutoNaoPerecivel(String nome, double preco, LocalDate dataFabricacao) throws DataInvalidaException{
		super(nome, preco);
		if(dataFabricacao.isAfter(LocalDate.now())) {
			throw new DataInvalidaException("A data do poduto está no futuro!");
		}
		this.dataFabricacao = dataFabricacao;
	}
	
	public LocalDate getDataFabricacao() {return dataFabricacao;}
	public void setDataFabricacao(LocalDate data) {this.dataFabricacao = data;}

}

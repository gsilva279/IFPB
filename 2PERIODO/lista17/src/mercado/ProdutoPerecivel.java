package mercado;
import java.time.LocalDate;

public class ProdutoPerecivel extends Produto{
	private LocalDate dataValidade;	
	
	public ProdutoPerecivel(String nome, double preco, LocalDate dataValidade) throws DataInvalidaException{
		super(nome, preco);
		if(dataValidade.isBefore(LocalDate.now())) {
			throw new DataInvalidaException("A data de validade nõa pode está no passado");
		}
		this.dataValidade = dataValidade;
	}
	
	public LocalDate getDataValidade() {return  dataValidade;}
	public void setDataValidade(LocalDate data) {this.dataValidade = data;}

}

package ProjetoNovosUsados;
public class CarroNovo extends Carro{
	private double percentualDeAcrescimo;
	
	public CarroNovo(String modelo, double preco) {
		super(modelo, preco);
		this.percentualDeAcrescimo = 0.10;
	}

	public double getPercentualDeAcrescimo() {
		return percentualDeAcrescimo;
	}

	public void setPercentualDeAcrescimo(double percentualDeAcrescimo) {
		this.percentualDeAcrescimo = percentualDeAcrescimo;
	}
	@Override
	public double getPreco() {
		double percentualDeAumento = super.getPreco() * this.getPercentualDeAcrescimo();
		return super.getPreco() + percentualDeAumento;
	}
	@Override
	public String toString() {
		String tipo = this.getClass().getSimpleName();
		return "Tipo: " + tipo + " - " + "Modelo: " + this.getModelo() + " - " + "Preço: " + super.getPreco();
	}
	
	
}

package ProjetoNovosUsados;

public class CarroUsado extends Carro {
private double percentualDeDesconto;
	
	public CarroUsado(String modelo, double preco) {
		super(modelo, preco);
		this.percentualDeDesconto = 0.10;
	}

	public double getPercentualDeDesconto() {
		return percentualDeDesconto;
	}

	public void setPercentualDeDesconto(double percentualDeDesconto) {
		this.percentualDeDesconto = percentualDeDesconto;
	}
	@Override
	public double getPreco() {
		double percentualDeDesconto = super.getPreco() * this.getPercentualDeDesconto();
		return super.getPreco() - percentualDeDesconto;
	}

	@Override
	public String toString() {
		String tipo = this.getClass().getSimpleName();
		return "Tipo: " + tipo + " - " + "Modelo: " + this.getModelo() + " - " + "Preço: " + super.getPreco();
	}
	
}

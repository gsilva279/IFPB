package ProjetoRadarOO;

public class Multa {
	private Veiculo veiculoMultado;
	private float valorMulta;

	public Multa(Veiculo veiculo, float valorMulta){
	  this.veiculoMultado = veiculo;
	  this.valorMulta = valorMulta;
	}
	public Veiculo getVeiculo(){
	  return veiculoMultado;
	}
	public float getValorMulta(){
	   return valorMulta;
	}
	public void setVeiculoMultado(Veiculo veiculo){
	  this.veiculoMultado = veiculo;
	}
	public void setValorMulta(float multa){
	  this.valorMulta = multa;
	}
}

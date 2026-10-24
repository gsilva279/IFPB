package ProjetoRadarOO;

public class Radar {
	private float velocidadeMaximaPermitida;

	public Radar(float velocidadePermitida){
	  this.velocidadeMaximaPermitida = velocidadePermitida;
	}
	public float getVelocidadeMaximaPermitida(){
	  return velocidadeMaximaPermitida;
	}
	public void setVelocidadeMaximaPermitida(float velociadePermitida){
	  this.velocidadeMaximaPermitida = velociadePermitida;
	}
	public float calcularMulta(Veiculo veiculo){
	  float excesso = veiculo.getVelocidadeAtual() - this.getVelocidadeMaximaPermitida();
	  float vintePorcentoDoLimite = this.getVelocidadeMaximaPermitida()*0.2f;
	  float cinquentaPorcentoDoLimite = this.getVelocidadeMaximaPermitida()*0.5f;

	  if (excesso <= vintePorcentoDoLimite ){
	     return 85.13f;
	  }
	  if(excesso <= cinquentaPorcentoDoLimite ){
	      return 127.53f;
	  }
	 return 574.62f;
	}

	public void verificarVelocidade(Veiculo veiculo) throws VelocidadeMaximaNaoRespeitadaException, VelocidadeMinimaNaoRespeitadaException{
	if (veiculo.getVelocidadeAtual() > this.getVelocidadeMaximaPermitida()){
	   Multa multa = new Multa(veiculo, calcularMulta(veiculo));
	   throw new VelocidadeMaximaNaoRespeitadaException("Velocidade ACIMA da permitida", multa);
	} 
	float metadeVelocidadeMaxima = (this.getVelocidadeMaximaPermitida() * 0.5f );
	 if (veiculo.getVelocidadeAtual() < metadeVelocidadeMaxima){
		Multa multa = new Multa(veiculo, 87.33f);
	    throw new VelocidadeMinimaNaoRespeitadaException("Velocidade ABAIXO da permitida", multa);
	}
	}
}

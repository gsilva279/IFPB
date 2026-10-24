package ProjetoRadarOO;

public class Veiculo {
	private String placa;
	private String nomeProprietario;
	private float velocidadeAtual;

	public Veiculo(String placa, String nome, float velocidade){
	  this.placa = placa;
	  this.nomeProprietario = nome;
	  this.velocidadeAtual = velocidade;
	}
	public String getPlaca(){
	  return placa;
	}
	public String getNomeProprietario(){
	  return nomeProprietario;
	}
	public float getVelocidadeAtual(){
	   return velocidadeAtual;
	}
	public void setPlaca(String placa){
	  this.placa = placa;
	}
	public void setNomeProprietario(String nome){
	  this.nomeProprietario = nome;
	}
	public void setVelocidadeAtual(float velocidade){
	  this.velocidadeAtual = velocidade;
	}
	
	@Override
	public String toString() {
		return "Placa: " + this.getPlaca() + " || Velocidade: " + this.getVelocidadeAtual();
	}

}

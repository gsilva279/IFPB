package ProjetoPlanejadorDeViagens;

public class Carro {
	private String modelo;
	private float autonomia;
	private int capacidadeDoTanque;
	
	public String getModelo() {
		return modelo;
	}
	public float getAutonomia() {
		return autonomia;
	}
	public int capacidadeDoTanque() {
		return capacidadeDoTanque;
	}
	public void setModelo(String novoModelo) {
		modelo = novoModelo;
	}
	public void setAutonomia(float novaAutonomia) {
		autonomia = novaAutonomia;
	}
	public void setCapacidadeDoTanque(int novaCapacidade) {
		capacidadeDoTanque = novaCapacidade;
	}

}

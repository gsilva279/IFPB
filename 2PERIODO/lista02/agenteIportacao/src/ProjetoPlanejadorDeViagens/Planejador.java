package ProjetoPlanejadorDeViagens;

public class Planejador {
	public int estimarAbastecimento(Carro carro, int distanciaAoDestino) {
		float autonomiaTotal = carro.getAutonomia() * carro.capacidadeDoTanque();
		return (int) Math.ceil(distanciaAoDestino / autonomiaTotal);
	}
}

package ProjetoPlanejadorDeViagens;
import java.util.Scanner;

public class Viagem {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Carro carro = new Carro();
		Planejador planejador = new Planejador();
		int distancia;
		
		System.out.println("Modelo do carro: ");
		carro.setModelo(entrada.nextLine());
		System.out.println("Autonomia do carro: ");
		carro.setAutonomia(entrada.nextFloat());
		System.out.println("Capacidade do tanque do carro: ");
		carro.setCapacidadeDoTanque(entrada.nextInt());
		System.out.println("Informe a distancia da viagem: ");
		distancia = entrada.nextInt();
		
		System.out.println("Você precisará abastecer " + planejador.estimarAbastecimento(carro, distancia) + " vezes.");
		
	}
}

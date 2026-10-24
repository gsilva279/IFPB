package ProjetoRadarOO;

public class Main {
	public static void main(String[] args){
		Veiculo[] veiculos = new Veiculo[100];
		
		for(int i=0; i < 100; i++) {
			float velocidadeAleatoria = (float) (40 + Math.random() * 110);
			velocidadeAleatoria = Math.round(velocidadeAleatoria * 100) /100f;
			veiculos[i] = new Veiculo("CAR-" +i, " ", velocidadeAleatoria);
			//System.out.println(veiculos[i].toString());
		}
		
		int totalMultas = 0;
		float totalValorMultas = 0.0f;
		Radar radar = new Radar(90.0f);
		
		for(Veiculo v:veiculos) {
			try {
				radar.verificarVelocidade(v);
				System.out.println(v.getPlaca() + "[" + "sem multa" + "]");
			} catch (VelocidadeMaximaNaoRespeitadaException e) {
				System.out.println(e.getMulta().getVeiculo().getPlaca()+ "[" + "MULTADO: R$ " + e.getMulta().getValorMulta() + "]");
				totalMultas++;
				totalValorMultas += radar.calcularMulta(v);
			} catch (VelocidadeMinimaNaoRespeitadaException e) {
				System.out.println(e.getMulta().getVeiculo().getPlaca()+ "[" + "MULTADO: R$ " + e.getMulta().getValorMulta() + "]");
				totalMultas++;
				totalValorMultas += radar.calcularMulta(v);
			}
		}
		System.out.println("\nQtd de multas: " + totalMultas);
		System.out.println("Valor toral das multas: R$ " + totalValorMultas);
	}
}

package ProjetoVinteUm;

public class Mao {
	private Carta[] maoPega = new Carta[12];
	private int totalCartas = 0;
	
	public Carta getCarta(int indice) {
	    return maoPega[indice];
	}
	
	public void addCarta(Carta cartaRecebida) {
		maoPega[totalCartas] = cartaRecebida;
		totalCartas++;
	}
	
	 public int totalDePontosAtual() {
	        int somaDemais = 0;
	        int qtdAses = 0;

	        for (int i = 0; i < totalCartas; i++) {
	            if (maoPega[i].getNumeracao().equals("A")) {
	                qtdAses++;
	            } else {
	                somaDemais += maoPega[i].getValor();
	            }
	        }

	        if (qtdAses == 0) {
	            return somaDemais;
	        }

	        int total = somaDemais + (qtdAses - 1);

	        if (total <= 10) {
	            total += 11;
	        } else {
	            total += 1;
	        }

	        return total;
	    }

	 @Override
	 public String toString() {
	     String resultado = "";

	     for (int i = 0; i < totalCartas; i++) {
	         resultado += maoPega[i] + "\n";
	     }

	     resultado += "Total de pontos: " + totalDePontosAtual();

	     return resultado;
	 }
}

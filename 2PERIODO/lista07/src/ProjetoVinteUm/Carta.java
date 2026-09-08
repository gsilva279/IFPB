package ProjetoVinteUm;

public class Carta {
	private String naipe;
	private String numeracao;
	private int valor;
	
	public String getNumeracao() {
	    return numeracao;
	}

	public int getValor() {
	    return valor;
	}
	
	public Carta(String naipe, String numeracao, int valor) {
		this.naipe = naipe;
		this.numeracao = numeracao;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return naipe + " de " + numeracao;
	}
	
}

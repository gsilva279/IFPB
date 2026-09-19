package JogoDaForca;

public class JogoDaForca {
	private Palavra[] dicionario;
	private int posicaoSorteada;
	private StringBuilder gabarito;
	
	public Palavra[] getDicionario() {
		return dicionario;
	}
	public int getPosicaoSorteada() {
		return posicaoSorteada;
	}
	public String getGabarito() {
		return gabarito.toString();
	}
	public JogoDaForca(Palavra[] dicionario) {
		this.dicionario = dicionario;
	}
	
	//Métodos
	public String pegarDica() {
		return dicionario[posicaoSorteada].getDica();
	}
	
	public void sortear() {
		posicaoSorteada = (int)(Math.random() * dicionario.length);
		if(dicionario[posicaoSorteada] != null) {
			int tamPalavraSorteado = dicionario[posicaoSorteada].getPalavra().length();
			for(int i=0; i < tamPalavraSorteado; i++) {
				gabarito = new StringBuilder("?".repeat(tamPalavraSorteado));
			}
		}	
	}
	
	public  boolean testarLetra(char letra) {
		String palavraSorteada = dicionario[posicaoSorteada].getPalavra();
		boolean res = false;
		for(int i=0; i<palavraSorteada.length(); i++) {
			if(palavraSorteada.charAt(i) == letra) {
				gabarito.setCharAt(i, letra);
				res = true;
			}
		}
		return res;
	}
	
	public boolean testaSeAcabou() {
		for(int i=0; i<getGabarito().length(); i++) {
			if(gabarito.charAt(i) == '?') {
				return false;
			}
		}
		return true;
	}
	
}

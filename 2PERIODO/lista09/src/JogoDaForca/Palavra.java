package JogoDaForca;

public class Palavra {
	private String palavra;
	private String dica;
	
	public String getPalavra() {
		return palavra;
	}
	public String getDica() {
		return dica;
	}
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	public void setDica(String dica) {
		this.dica = dica;
	}
	public Palavra(String palavra, String dica) {
		setPalavra(palavra);
		setDica(dica);
	}

}

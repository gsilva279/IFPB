package ProjetoImpressoraOO;

public class FaltouPapelException extends Exception {
	private int qtdPaginasNaoImpressas;
	
	public FaltouPapelException(String mensagem, int pgNaoImpressas) {
		super(mensagem);
		this.qtdPaginasNaoImpressas = pgNaoImpressas;
	}
	public int getQtdPaginasNaoImpressas() {
		return qtdPaginasNaoImpressas;
	}
	
}

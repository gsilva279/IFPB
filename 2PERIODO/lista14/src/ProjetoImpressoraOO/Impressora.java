package ProjetoImpressoraOO;

public class Impressora {
	private int qtdPaginas;
	private float cargaDoToner;
	
	public Impressora() {
		this.qtdPaginas = 0;
		this.cargaDoToner = 100f;
	}

	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	public float getCargaDoToner() {
		return cargaDoToner;
	}

	public void setCargaDoToner(float caragaDoToner){
		this.cargaDoToner = caragaDoToner;
	}
	
	public int imprimir(int paginas) throws FaltouPapelException, FaltouTintaException{
		int paginasImpressas = 0;
		
		while(paginasImpressas < paginas) {
			if(this.getQtdPaginas() == 0) {
				throw new FaltouPapelException("Não há papel", (paginas - paginasImpressas));
			}
			if(this.getCargaDoToner() < 0.35f) {
				throw new FaltouTintaException("Não tem tinta");
			}
			 this.setQtdPaginas(getQtdPaginas()-1);
	         this.setCargaDoToner(getCargaDoToner()-0.35f);
	         paginasImpressas++;
		}
		return paginasImpressas;
	}
}

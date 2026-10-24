package ProjetoMensageiro;

public class DireitosAutorais implements Mensagem {
	private Mensagem mensagem;
	
	public DireitosAutorais(Mensagem mensagem) {
		this.mensagem = mensagem;
	}
	@Override 
	public String getTexto() {
		return mensagem.getTexto().concat("... [Direitos Reservados].");
	}
	@Override 
	public void setTexto(String texto) {
		this.mensagem.setTexto(texto);
	}
}

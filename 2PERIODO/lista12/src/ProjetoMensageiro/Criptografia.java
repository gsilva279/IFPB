package ProjetoMensageiro;

public class Criptografia implements Mensagem {
	private Mensagem mensagem;
	
	public Criptografia(Mensagem mensagem) {
		this.mensagem = mensagem;
	}
	
	@Override
	public String getTexto() {
		return mensagem.getTexto().replace(" ", "*");
	}
	@Override
	public void setTexto(String texto) {
		this.mensagem.setTexto(texto);
	}
	
}

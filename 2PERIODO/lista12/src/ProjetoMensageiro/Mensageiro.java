package ProjetoMensageiro;

public class Mensageiro {
	public Mensagem prepararMensagem(String texto, String destino) {
		if("externo".equalsIgnoreCase(destino)) {
			return new Criptografia(new DireitosAutorais(new MensagemSimples(texto)));
		}
		return new MensagemSimples(texto);
	}
}

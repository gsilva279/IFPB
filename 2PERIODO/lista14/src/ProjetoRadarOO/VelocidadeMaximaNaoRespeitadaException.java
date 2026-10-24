package ProjetoRadarOO;

public class VelocidadeMaximaNaoRespeitadaException extends Exception {
	 private Multa multa;
	   public VelocidadeMaximaNaoRespeitadaException(String mensagem, Multa multa){
	       super(mensagem);
	       this.multa = multa;
	  }

	public Multa getMulta(){
	  return multa;
	}
}

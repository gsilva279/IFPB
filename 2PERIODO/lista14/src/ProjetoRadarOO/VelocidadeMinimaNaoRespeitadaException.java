package ProjetoRadarOO;

public class VelocidadeMinimaNaoRespeitadaException extends Exception {
	private Multa multa;

	  public VelocidadeMinimaNaoRespeitadaException(String mensagem, Multa multa){
	      super(mensagem);
	      this.multa = multa;
	   }
	  public Multa getMulta(){
		  return multa;
		}
	  }
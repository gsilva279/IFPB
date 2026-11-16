package ProjetoEquacaoSegundoGrau;

public class NaoHaSolucaoRealException extends Exception{
	  public NaoHaSolucaoRealException() {
	      super("Não há solução real: delta negativo");
	   }
}

package JogoMatematica;

public class JogoMatematica {
	private String calculo;
	private int resposta;
	
	public String getCalculo() {
		return calculo;
	}
	public int getResposta() {
		return resposta;
	}
	
	public void sortearCalculo() {
		int operando1 = (int) (Math.random() * 101);
		int operando2 = (int) (Math.random() * 101);
		
		//gera a operação aleatória
		String[] operacoes = {"+", "-", "*", "/"};
		int indiceOperacao = (int)(Math.random() * operacoes.length);
		String escolha = operacoes[indiceOperacao];
		int resultado = 0;
		String operacaoExtenso = "";
		
		while (escolha.equals("/") && operando2 == 0) {
		    operando2 = (int) (Math.random() * 101);
		}
		
		//montando a string da operação por extenso
		operacaoExtenso = operando1 + escolha + operando2;
		
		//Calculo:
		switch(escolha) {
		case "+":
			resultado = operando1 + operando2;
			break;
		case "-":
			resultado = operando1 - operando2;
			break;
		case "*":
			resultado = operando1 * operando2;
			break;
		case "/":
			resultado = operando1 / operando2;
			break;
		}
		
		calculo = operacaoExtenso;
		resposta = resultado;
	}

	public boolean checarResposta(int tentativa) {
		return tentativa == resposta;
	}
}

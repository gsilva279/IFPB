package ProjetoBanco;

public class Banco {
	private ContaCorrente[] contas = new ContaCorrente[10];
	private int qtdContasSalvas = 0;
	
	public boolean salvarConta(ContaCorrente novaConta) {
		 if(novaConta == null || qtdContasSalvas == contas.length) {
			 return false;
		 }
		 
		 int i = 0;
		 while(i  <qtdContasSalvas) {
			 if(contas[qtdContasSalvas].ehIgual(novaConta)) {
				 return false;
			 }
		 }
		 contas[qtdContasSalvas] = novaConta;
		 qtdContasSalvas++;
		 return true;
	}
	
	public ContaCorrente recuperarConta(String numeroConta) {
		if(numeroConta == null) {
			return null;
		}
		for(int i =0; i < qtdContasSalvas; i++) {
			if(contas[i].getNumero().equals(numeroConta)) {
				return contas[i];
			}
		}
		return null;
	}

}

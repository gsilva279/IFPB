package ProjetoBanco;

public class ContaCorrente {
	private String titular;
	private String numero;
	private float saldo;
	
	public String getTitular() {
		return titular;
	}
	public String getNumero() {
		return numero;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	//verifica se duas contas são iguais forem iguais
	public boolean ehIgual(ContaCorrente conta) {
		if(conta == null) {
			return false;
		}
		return this.getNumero().equals(conta.getNumero());
	}
	
}

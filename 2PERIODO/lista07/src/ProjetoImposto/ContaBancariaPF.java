package ProjetoImposto;

public class ContaBancariaPF {
	private String titular;
	private String numero;
	private float saldo;
	private TipoDeConta tipo;
	
	public String getTitular() {
		return titular;
	}
	public String getNumero() {
		return numero;
	}
	public float getSaldo() {
		return saldo;
	}
	public TipoDeConta getTipo() {
		return tipo;
	}
	
	public ContaBancariaPF(String titular, String numero,float saldo, TipoDeConta tipo) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
		this.tipo = tipo;
	}
	
	//metodo para comparar se as contas são iguais
	public boolean eIgual(ContaBancariaPF conta) {
		if(conta == null) {
			return false;
		}
		return this.numero == conta.numero;
	}

}

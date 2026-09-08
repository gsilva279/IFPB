package ProjetoImposto;

public class ContaBancariaPJ {
	private PessoaJuridica titular;
	private String numero;
	private float saldo;
	private TipoDeConta tipo;
	
	public PessoaJuridica getTitular() {
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

	public ContaBancariaPJ(PessoaJuridica titular, String numero, float saldo, TipoDeConta tipo) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
		this.tipo = tipo;
	}
	
}

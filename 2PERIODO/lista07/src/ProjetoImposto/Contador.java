package ProjetoImposto;

public class Contador {
	public static float calcularImpostoPJ(ContaBancariaPJ pj) {
		return (pj.getSaldo()* (0.1f*pj.getTitular().getQtdFuncionarios()))/12;
	}
	public static float calcularImpostoPF(ContaBancariaPF pf) {
		return (pf.getSaldo()*0.1f)/12;
	}
}

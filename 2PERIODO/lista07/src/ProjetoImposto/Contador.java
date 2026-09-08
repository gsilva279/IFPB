package ProjetoImposto;

public class Contador {
	public static float calcularImpostoPJ(ContaBancariaPJ pj) {
		float impostoPJ;
		return impostoPJ = (pj.getSaldo()* (0.1f*pj.getTitular().getQtdFuncionarios()))/12;
	}
	public static float calcularImpostoPF(ContaBancariaPJ pf) {
		float impostoPF;
		return impostoPF = (pf.getSaldo()*0.1f)/12;
	}
}

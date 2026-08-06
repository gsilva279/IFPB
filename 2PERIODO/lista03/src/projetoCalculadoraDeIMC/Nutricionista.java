package projetoCalculadoraDeIMC;

public class Nutricionista {
	public ResultadoIMC avaliarIMC(Paciente a) {
		float imc = (float) (a.getPeso()/(Math.pow(a.getAltura(), 2)));
		
		if (imc < 18) {
			return ResultadoIMC.ABAIXO_DO_PESO;
		}
		else if (imc < 25) {
			return ResultadoIMC.NORMAL;
		} else if(imc < 30) {
			return ResultadoIMC.SOBREPESO;
		} else {
			return ResultadoIMC.OBESIDADE;
		}
		
	}
}

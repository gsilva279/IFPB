package DoacaoDeSangue;
import Modelo.Pessoa;

public class AtendenteDaEnfermaria {
	public boolean avaliarDoador(Pessoa doador, boolean temTatuagem, boolean ingeriuAlcool) {
		if (doador.getIdade() > 19 && doador.getIdade() < 69) {
			if (doador.getPeso() >= 50) {
				if (temTatuagem == false && ingeriuAlcool == false) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}

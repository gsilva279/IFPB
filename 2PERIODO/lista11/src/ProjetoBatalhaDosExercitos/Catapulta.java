package ProjetoBatalhaDosExercitos;

public class Catapulta extends Unidade {
	public Catapulta() {
		super(100);
	}
	public boolean ganhaQuandoAtacadoPor(Unidade atacante) {
		return atacante instanceof Infantaria;
	}
}

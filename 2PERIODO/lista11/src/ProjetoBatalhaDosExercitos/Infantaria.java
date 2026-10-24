package ProjetoBatalhaDosExercitos;

public class Infantaria extends Unidade {
	public Infantaria() {
		super(100);
	}
	public boolean ganhaQuandoAtacadoPor(Unidade atacante) {
		return atacante instanceof Cavalaria;
	}
}

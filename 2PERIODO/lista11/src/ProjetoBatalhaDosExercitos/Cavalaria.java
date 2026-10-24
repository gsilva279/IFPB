package ProjetoBatalhaDosExercitos;

public class Cavalaria extends Unidade{
	public Cavalaria() {
		super(100);
	}
	public boolean ganhaQuandoAtacadoPor(Unidade atacante) {
		return atacante instanceof Catapulta;
	}
}

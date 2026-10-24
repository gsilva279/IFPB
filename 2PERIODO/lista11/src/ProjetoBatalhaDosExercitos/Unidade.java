package ProjetoBatalhaDosExercitos;

public abstract class Unidade {
	private int valorUnidade;
	
	public int getValorUnidade() {
		return valorUnidade;
	}
	public void setValorUnidade(int valor) {
		this.valorUnidade = valor;
	}
	
	public Unidade(int valor) {
		this.valorUnidade = valor;
	}
	
	public abstract boolean ganhaQuandoAtacadoPor(Unidade atacante);
	
	public boolean empata(Unidade outraUnidade) {
		return this.getClass() == outraUnidade.getClass();
	}
	
	public Resultado batalhar(Unidade outraUnidade) {
		if(this.empata(outraUnidade)) {
			return Resultado.EMPATE;
		}
		if(this.ganhaQuandoAtacadoPor(outraUnidade)) {
			return Resultado.VITORIA;
		}
		return Resultado.DERROTA;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}

package ProjetoHomeTheater;

public class Tv extends Aparelho {
	private boolean ligada;
	
	public void setLigada(boolean bool) {
		this.ligada = bool;
	}
	public boolean getLigada() {
		return ligada;
	}
	public void ligar() {
		System.out.println("Ligada");
		this.setLigada(true);
	}
	
	public void desligar() {
		System.out.println("Desligada");
		this.setLigada(false);
	}
	
	@Override
	public void procedimento() {
		if(this.getLigada() == false) {
			this.ligar();
		} 
		if(proximo != null) {
			proximo.procedimento();
		}
	}
}

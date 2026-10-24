package ProjetoHomeTheater;

public class Luz extends Aparelho{
	private boolean acesa;
	
	public void setAcesa(boolean bool) {
		this.acesa = bool;
	}
	public boolean getAcesa() {
		return acesa;
	}
	public void ligar() {
		this.setAcesa(true);
	}
	public void desligar() {
		this.setAcesa(false);
	}
	@Override
	public void procedimento() {
		if(this.getAcesa() == true) {
			this.desligar();
		}
		if(proximo != null) {
			proximo.procedimento();
		}
	} 		
}

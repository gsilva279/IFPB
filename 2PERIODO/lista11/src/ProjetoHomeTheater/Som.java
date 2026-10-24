package ProjetoHomeTheater;

public class Som extends Aparelho {
	private int volume;
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void mutar() {
		this.setVolume(0);
	}
	public void aumentar() {
		this.setVolume(++volume);
	}
	public void baixar() {
		this.setVolume(--volume);
	}
	
	@Override
	public void procedimento() {
		if(this.getVolume() != 30) {
			while(this.getVolume() < 30) {
				this.aumentar();
			}
		}
		
		if(proximo != null) {
			proximo.procedimento();
		}
	}
}

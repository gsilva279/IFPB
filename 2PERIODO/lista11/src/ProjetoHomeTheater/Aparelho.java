package ProjetoHomeTheater;

public abstract class Aparelho {
	//Handler
	protected Aparelho proximo;
	
	public Aparelho() {
		
	};
	
	public void setAparelho(Aparelho proximo) {
		this.proximo = proximo;	
	}
	
	public abstract void procedimento();
}

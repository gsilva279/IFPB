package ProjetoHomeTheater;

public class HomeTheater{
	private Aparelho aparelho;
	
	public HomeTheater(Aparelho primeiroAparelho) {
		this.aparelho = primeiroAparelho;
	}
	
	public void ligarModoFilme() {
		aparelho.procedimento();
		System.out.println("Modo filme ligado");
	}
	
}

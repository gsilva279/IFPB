package ProjetoHomeTheater;

public class Programa {
	public static void main(String[] args) {
		Tv tv = new Tv();
		Luz luz = new Luz();
		Som som = new Som();
		
		tv.setAparelho(luz);
		luz.setAparelho(som);
		
		HomeTheater home = new HomeTheater(tv);
		home.ligarModoFilme();
	}
}

package ProjetoDomino;

public class Main {
	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		
		for(int i=0; i < 28; i++) {
			System.out.println(jogo.getPecas());
		}
	}
}

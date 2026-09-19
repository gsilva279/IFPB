package ProjetoDomino;

public class Jogo {
	private Domino[] pecas = new Domino[28];
	
	public Domino[] getPecas() {
		return pecas;
	}
	
	public Jogo() {
		int i = 0;
		
		for(int a=0; a <=6; a++) {
			for(int b = a; b <= 6; b++) {
				pecas[i] = new Domino(a, b);
				i++;
			}
		}
	}
	
	public void embaralharPecas() {
		
		
	}

}

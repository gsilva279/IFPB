package ProjetoLanceDado;
import javax.swing.ImageIcon;

public class Jogo {
	private int numeroSorteado;
	
	public void sortearNumero(){
		this.setNumeroSorteado((int) (Math.random() * 6) + 1);
	}
	
	public int getNumeroSorteado() {
		return numeroSorteado;
	}
	
	public void setNumeroSorteado(int numero) {
		this.numeroSorteado = numero;
	}
	
	public ImageIcon pegarIconeSorteado() {
		switch(numeroSorteado) {
			case 1:
				return new ImageIcon("src/img/icons8-dice-one-48.png");
			case 2:
				return new ImageIcon("src/img/icons8-dice-two-100.png");
			case 3:
				return new ImageIcon("src/img/icons8-dice-three-100.png");
			case 4:
				return new ImageIcon("src/img/icons8-dice-four-48.png");
			case 5:
				return new ImageIcon("src/img/icons8-dice-five-48.png");
			case 6:
				return new ImageIcon("src/img/icons8-dice-six-100.png");
			default:
				return new ImageIcon("src/img/icons8-dice-six-100.png"); 
		}
	}
	public boolean acertou(int palpite) {
		return palpite == numeroSorteado;
	}
}

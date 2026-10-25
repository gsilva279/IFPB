package ProjetoDomino;

public class Jogo {
	private Domino[] pecas = new Domino[28];
	private int indice = 0;
	private int pontaEsquerdaAiva = -1;
	private int pontaDireitaAtiva = -1;
	
	public int getPontaEsquerdaAtiva() {
		return pontaEsquerdaAiva;
	}
	
	public int getPontaDireitaAtiva() {
		return pontaDireitaAtiva;
	}
	
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
		for(int i=1; i <= 100; i++) {
			int pos1 = (int)(Math.random()* pecas.length);
			int pos2;
			do {
				pos2 = (int)(Math.random()* pecas.length);
			}while(pos1 == pos2);
			
			Domino aux = pecas[pos1];
			pecas[pos1] = pecas[pos2];
			pecas[pos2] = aux;
		}
		pontaEsquerdaAiva = -1;
		pontaDireitaAtiva = -1;
		indice = 0;
	}
	
	public Domino puxarPeca() {
		if(indice < pecas.length) {
			Domino pecaAtual = pecas[indice];
			indice++;
			return pecaAtual;
		} else {
			return null;
		}
	}
	
	//métodos para a questão jogo-classico:
	public boolean conectaPontaEsquerda(Domino dom) {
		if(getPontaEsquerdaAtiva() == -1 || getPontaDireitaAtiva() == -1) {
			pontaEsquerdaAiva = dom.getLadoA();
			pontaDireitaAtiva = dom.getLadoB();
			return true;
		} else {
			if(dom.getLadoA() == pontaEsquerdaAiva) {
				pontaEsquerdaAiva = dom.getLadoB();
			} else if(dom.getLadoB() == pontaEsquerdaAiva) {
				pontaEsquerdaAiva = dom.getLadoA();
			} else {
				return false;
			}
			return true;
		}
	}
	
	public boolean conectaPontaDireita(Domino dom) {
		if(getPontaEsquerdaAtiva() == -1 || getPontaDireitaAtiva() == -1) {
			pontaEsquerdaAiva = dom.getLadoA();
			pontaDireitaAtiva = dom.getLadoB();
			return true;
		} else {
			if(dom.getLadoA() == pontaDireitaAtiva) {
				pontaDireitaAtiva = dom.getLadoB();
			} else if(dom.getLadoB() == pontaDireitaAtiva) {
				pontaDireitaAtiva = dom.getLadoA();
			} else {
				return false;
			}
			return true;
		}
	}
	
	public static boolean testeSeAcabou(Domino[] arrayDom) {
		for(Domino dom: arrayDom) {
			if(dom != null) {
				return false;
			}
		}
		return true;
	}
	
}

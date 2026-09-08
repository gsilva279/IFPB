package ProjetoVinteUm;

public class Baralho {
	private Carta[] arrayBaralho = new Carta[52];
	private int indice = 0;
	
	//para criar o baralho
	public Baralho(){
		String[] naipes = {"Copas", "Ouros", "Paus", "Espadas"};
		String[] numeracoes = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		for(int i=0; i < naipes.length; i++) {
			for(int j=0; j < numeracoes.length; j++) {
				int valor;
				if(j >= 10) {
					valor = 10;
				}else if (j == 0) {
					valor = 11;
				} else {
					valor = j + 1;
				}
				arrayBaralho [indice] = new Carta(naipes[i], numeracoes[j], valor);
				indice++;
			}
		}
		indice = 0;
		embaralhar(10000);
	}
	
	//embaralhar
	public void embaralhar(int vezes) {
		for(int i=0; i < vezes; i++) {
			int pos1 = (int)(Math.random()*arrayBaralho.length);
			int pos2 = (int)(Math.random()*arrayBaralho.length);
			Carta aux = arrayBaralho[pos1];
			
			arrayBaralho[pos1] = arrayBaralho[pos2];
			arrayBaralho[pos2] = aux;
		}
	}
	
	//puxarCarta
	public Carta puxarCarta(){
			if(indice < arrayBaralho.length) {
				return arrayBaralho[indice++];
			} else {
				return null;
			}
	}
}

package ProjetoDomino;
import java.util.Arrays;
import java.util.Scanner;

public class Unomino {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Jogo jogo = new Jogo();
		Domino[] jogador = new Domino[6];
		Domino primeiraPeca;
		jogo.embaralharPecas();
		boolean verificao = true;
		int pontos = 0;
		
		for(int i = 0; i < 6; i++) {
			jogador[i] = jogo.puxarPeca();
		}
		
		primeiraPeca = jogo.puxarPeca();
		
		System.out.println("Peça da vez: " + primeiraPeca);
		System.out.println("Peças na mão: " + Arrays.toString(jogador));
		
		do {
			System.out.println("Indique o índice da peça que deseja casar (0-5): ");
			int pecaEscolhida = input.nextInt();
			 if(jogador[pecaEscolhida].validarJuncao(primeiraPeca)) {
				 primeiraPeca = jogador[pecaEscolhida];
				 jogador[pecaEscolhida] = null;
				 pontos++;
				 
				 if(pontos == 6) {
					 System.out.println("Você venceu, parabéns.");
					 System.out.println("Você fez " + pontos + " pontos.");
					 verificao = false;
				 }
				 
			 } else {
				 System.out.println("Você perdeu. Fim de Jogo");
				 System.out.println("Você fez " + pontos + " pontos.");
				 verificao = false;
			 }
		}while(verificao);
		input.close();
	}
	
}

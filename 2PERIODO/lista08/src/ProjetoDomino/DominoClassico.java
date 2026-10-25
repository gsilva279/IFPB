package ProjetoDomino;
import java.util.Arrays;
import java.util.Scanner;

public class DominoClassico {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Jogo jogo = new Jogo();
		Domino[] jogador1 = new Domino[6];
		Domino[] jogador2 = new Domino[6];
		boolean fimDeJogo = true;
		int turno = 1;

		jogo.embaralharPecas();
		for(int i = 0; i < 6; i++) {
			jogador1[i] = jogo.puxarPeca();
			jogador2[i] = jogo.puxarPeca();
		}
		Domino pecaEmJogo = jogo.puxarPeca();
		System.out.println("Peça sorteada para iniciar o jogo: " + pecaEmJogo);
		jogo.conectaPontaEsquerda(pecaEmJogo);
		
		do {
			Domino[] maoAtual;
			String nomeJogador;
			
			if(turno == 1) {
				maoAtual = jogador1;
				nomeJogador = "Jogador 1";
			} else {
				maoAtual = jogador2;
				nomeJogador = "Jogador 2";
			}
			
 			System.out.println("Em jogo: esquerda: " + jogo.getPontaEsquerdaAtiva() + " | direita: " + jogo.getPontaDireitaAtiva());
			System.out.println("Mão do jogador : " + nomeJogador + ": "+ Arrays.toString(maoAtual));
			
			System.out.println(nomeJogador + " , indique o índice da peça que deseja jogar: ");
			int escolhaPeca = input.nextInt();
			input.nextLine();
			
			System.out.println(nomeJogador + " , em qual lado deseja conectar? ");
			String escolhaLado = input.nextLine();
			
			boolean conectou;
			if(escolhaLado.equalsIgnoreCase("esquerda")) {
				conectou = jogo.conectaPontaEsquerda(maoAtual[escolhaPeca]);
			} else {
				conectou = jogo.conectaPontaDireita(maoAtual[escolhaPeca]);
			}
			
			if(conectou) {
				maoAtual[escolhaPeca] = null;
				if(jogo.testeSeAcabou(maoAtual)) {
					System.out.println(nomeJogador + " ficou sem peças e venceu o jogo!");
					fimDeJogo = false;
				} else {
					turno = (turno == 1)? 2: 1;
				}
			} else {
				String vencedor = (turno == 1) ? "Jogador 2":"Jogador 1";
				System.out.println("Não conectou. " + nomeJogador + " perdeu.");
				System.out.println(vencedor + " venceu o jogo!");
				fimDeJogo = false;
			}	
		}while(fimDeJogo);
		
		input.close();
	}
}

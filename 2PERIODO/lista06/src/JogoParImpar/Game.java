package JogoParImpar;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int escolhaJogador = 0;
		int escolhaMaquina = 0;
		int resultado = 0;
		int pontuacaoVencedor = 0;
		String nomeVencedor = "";
		String nome;
		
		
		System.out.print("Informe seu nome para começar o jogo: ");
		nome = input.nextLine();
		Jogador jogador = new Jogador(nome);
		Jogador maquina = new Jogador("Máquina");
		
		while(true) {
			System.out.print("\nEscolha um número de 1 a 10: ");
			escolhaJogador = input.nextInt();
			escolhaMaquina = (int)(Math.random() * 11);
			System.out.print("Máquina: " + escolhaMaquina);
			
			resultado = escolhaJogador + escolhaMaquina;
			System.out.print("\nResultado da rodada " + resultado + "\n");
			
			if (resultado%2 == 0) {
				jogador.adicionarPonto();
			} else {
				maquina.adicionarPonto();
			}
			
			if (jogador.getPontuacao() == 10) {
				nomeVencedor = jogador.getNome();
				pontuacaoVencedor = jogador.getPontuacao();
				break;
			} else if(maquina.getPontuacao() == 10){
				nomeVencedor = maquina.getNome();
				pontuacaoVencedor = maquina.getPontuacao();
				break;
			}
			
		}
		System.out.println("\nO jogador " + nomeVencedor + " venceu!");
		System.out.println("Pontuação: " + pontuacaoVencedor + " pts");
		input.close();
		
	}
}

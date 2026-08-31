package JogoMatematica;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		JogoMatematica jogo = new JogoMatematica();
		int erros = 0;
		int qtdRespostasCertas = 0;
		
		do {
			jogo.sortearCalculo();
			System.out.println("Qual o resultado da operação: " + jogo.getCalculo());
			int tentativa = input.nextInt();
			
			if(jogo.checarResposta(tentativa)) {
				System.out.println("Acertou!!!");
				qtdRespostasCertas++;
			} else {
				System.out.println("Errou, a resposta certa é " + jogo.getResposta());
				erros++;
			}
			
		} while(erros != 3);
		
		System.out.println("Questões certas: " + qtdRespostasCertas);
		input.close();
		
	}
}

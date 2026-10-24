package ProjetoBatalhaDosExercitos;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o nome do jogador 1: ");
		Jogador j1 = new Jogador(input.nextLine());
		System.out.print("Informe o nome do jogador 2: ");
		Jogador j2 = new Jogador(input.nextLine());
		
		//laço para comprar unidades
		while(j1.getDinheiro() >= 100 || j2.getDinheiro() >= 100) {
				j1.menuComprarUnidade(input);
				j2.menuComprarUnidade(input);
			}
		
		//laço para batalhar
		while(j1.temUnidades() && j2.temUnidades()) {
			int i1 = (int) (Math.random()*j1.qtdUnidades());
			int i2 = (int) (Math.random()*j2.qtdUnidades());
			
			Unidade a = j1.pegarUnidade(i1);
			Unidade b = j2.pegarUnidade(i2);
			Resultado batalha = a.batalhar(b);
			String res;
			
			if(batalha == Resultado.VITORIA) {
				res = a.toString();
				j2.removerUnidade(i2);
			} else if (batalha == Resultado.DERROTA) {
				res = b.toString();
				j1.removerUnidade(i1);
			} else {
				res = "EMPATE";
				j2.removerUnidade(i2);
				j1.removerUnidade(i1);
			}
			
			System.out.println(a + " X " + b + " = " + res);
		}
		
		//final do jogo.
		String nomeVencedor;
		if(j1.temUnidades() && !j2.temUnidades()) {
			nomeVencedor = j1.getNome();
		} else if(j2.temUnidades() && !j1.temUnidades()) {
			nomeVencedor = j2.getNome();
		} else {
			nomeVencedor = "Empate";
		}
		System.out.println("FIM DE JOGO!!!");
		System.out.println("***Vencedor: " + nomeVencedor + "***");
		
	}
}







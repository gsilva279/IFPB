package exerciciosLacos;
import java.util.Scanner;

public class ImprimirNome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome;
		int k;
		
		System.out.println("Informe um nome e quantidade para imprimir: ");
		nome = input.nextLine();
		k = Integer.parseInt(input.nextLine());
		
		while(k > 0) {
			System.out.println(nome);
			k--;
		}
		input.close();
	}
}

package lerNomes;
import java.util.Scanner;

public class lerNomes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome1;
		String nome2;
		
		System.out.println("Informe dois nomes para fazer a comparação: ");
		nome1 = input.nextLine();
		nome2 = input.nextLine();
		
		if (nome1.equals(nome2)) {
			System.out.println("São iguais");
		} else {
			System.out.println("Não são iguais");
		}
		
	}
}

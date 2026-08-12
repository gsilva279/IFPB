package exerciciosLacos;
import java.util.Scanner;

public class SomaAteUm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int somaTotal = 0;
		int num;
		
		do {
			System.out.println("Número: ");
			num = input.nextInt();
			if (num != -1) {
				somaTotal += num;
			}
		} while (num != -1);
		
		System.out.println("Total: " + somaTotal);
		input.close();
	}
}

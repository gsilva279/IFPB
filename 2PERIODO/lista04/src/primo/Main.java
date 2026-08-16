package primo;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		CDF cdf = new CDF();
		Scanner input = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe um número para verificar: ");
		numero = input.nextInt();
		
		for(int i=1; i <= numero; i++) {
			if (cdf.ePrimo(i)) {
				System.out.println(i + " é primo");
			}	
		}
		input.close();
	}
}

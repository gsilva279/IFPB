package main;
import java.util.Scanner;

public class ImpressaoAlfabetica {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome1;
		String nome2;
		String primeiro, segundo;
		
		System.out.print("Entrada 1: ");
		nome1 = input.nextLine();
		System.out.print("\nEntrada 2: ");
		nome2 = input.nextLine();
		
		do {
			if(nome1.equals(nome2)) {
				System.out.print("As duas entradas devem ser diferentes: ");
				System.out.print("\nEntrada 2: ");
				nome2 = input.nextLine();
			}
			
		} while(nome1.equals(nome2));
		
		if(nome1.compareToIgnoreCase(nome2) < 0) {
			primeiro = nome1;
			segundo = nome2;
		} else {
			primeiro = nome2;
			segundo = nome1;
		}
		
		System.out.println(primeiro + ", " + segundo);
		input.close();
	}
}

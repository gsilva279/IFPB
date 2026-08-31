package main;
import java.util.Scanner;

public class ConversorBases {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String numHex;
		String numBinario;
		int numInt;
		
		
		System.out.print("Informe um número Hexadecimal: ");
		numHex = input.nextLine();
		numInt = Integer.parseInt(numHex, 16);
		numBinario = Integer.toBinaryString(numInt); 
		
		System.out.print("Número Hexadecimal: " + numHex);
		System.out.print("\nBase Binária: " + numBinario);
		System.out.print("\nBase Decimal: " + numInt);
		input.close();
	}
}

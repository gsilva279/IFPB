package main;
import java.util.Scanner;
public class MaiorMenor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String entrada;
		int maior, menor;
		//entrada de valores
		System.out.println("Informe uma lista de número (use a vírgula para separar): ");
		entrada = input.nextLine();
		String[] listaNumeros = entrada.split(",");
		//para coverter os número do array para comparação
		int[] numeros = new int[listaNumeros.length];
		for(int i = 0; i < listaNumeros.length; i++) {
			numeros[i] = Integer.parseInt(listaNumeros[i]);
		}
		//comparações
		maior = numeros[0];
		menor = numeros[0];
		
		for(int i:numeros) {
			maior = Math.max(maior, i);
			menor = Math.min(menor, i);
		}
		System.out.print("O maior número lido foi: " + maior);
		System.out.print("\nO menor número lido foi: " + menor);
		input.close();
	}
}

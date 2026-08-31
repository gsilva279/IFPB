package main;
import java.util.Scanner;
public class VogaisConsoantes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String entrada;
		int vogais = 0; 
		int consoantes = 0;
		
		System.out.println("Informe uma pavra ou frase: ");
		entrada = input.nextLine();
		String[] letras = entrada.split("");
		
		for(String elemento: letras) {
			switch(elemento.toLowerCase()) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
	        	vogais++;
	        	break;
	        default:
	        	if (!elemento.equals(" ")) {
	        		consoantes++;
	        	}
	        	break;
			}
		}
		
		System.out.print("Voagais: " + vogais);
		System.out.print("\nConsonates: " + consoantes);
		input.close();
	}
}

package calenadario;
import java.util.Scanner;

public class Calendario {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String mes, resultado;
		
		System.out.println("Informe um mes: ");
		mes = input.nextLine().toLowerCase();
		
		switch (mes) {
			case "janeiro":
			case "março":
			case "maio":
			case "julho":
			case "agosto":
			case "outubro":
			case "dezembro":
				resultado = "31";
				break;
			case "abril":
			case "junho":
			case "setembro":
			case "novembro":
				resultado = "30";
				break;
			case "fevereiro":
				resultado = "28";
				break;
			default:
				resultado = "Opção inválida!!!!";
				break;
		}
		
		System.out.println(mes + " tem " + resultado + " dias.");
	}
}

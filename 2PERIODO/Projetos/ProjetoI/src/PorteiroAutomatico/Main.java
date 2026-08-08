package PorteiroAutomatico;
import java.util.Scanner;
import Modelo.Pessoa;

public class Main {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		Porteiro porteiro = new Porteiro();
		String resultado;
		
		System.out.println("====================");
		System.out.println("Informe seu nome: ");
		pessoa.setNome(input.nextLine());
		System.out.println("Informe sua idade: ");
		pessoa.setIdade(Integer.parseInt(input.nextLine()));
		System.out.println("Informe seu sexo(homem, mulher): ");
		pessoa.setSexo(input.nextLine());
		
		resultado = porteiro.boasVindas(pessoa);
		System.out.println(resultado);
		input.close();
	}
}

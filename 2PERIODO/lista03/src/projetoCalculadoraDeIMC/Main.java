package projetoCalculadoraDeIMC;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Paciente a = new Paciente();
		Nutricionista n = new Nutricionista();
		
		System.out.println("informe seu peso: ");
		a.setPeso(input.nextFloat());
		System.out.println("informe sua altura: ");
		a.setAltura(input.nextFloat());
		
		System.out.println("Resultado do IMC: " + n.avaliarIMC(a));
	}
}

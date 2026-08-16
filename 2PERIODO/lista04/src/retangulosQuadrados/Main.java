package retangulosQuadrados;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Retangulo[] retangulos = new Retangulo[2];
		String teste1, teste2, comparacao;
		
		for(int i = 0; i < 2; i++) {
			retangulos[i] = new Retangulo();
			System.out.print("Qual a medida da base do "+ (i+1)+ "º: ");
			retangulos[i].setBase(input.nextInt());
			System.out.print("Qual a medida da altura do "+ (i+1)+ "º: ");
			retangulos[i].setAltura(input.nextInt());
		}
		
		teste1 = (retangulos[0].isQuadrado())? " é um quadrado": " não é quadrado";
		teste2 = (retangulos[1].isQuadrado())? " é um quadrado": " não é quadrado";
		comparacao = (retangulos[0].eIgual(retangulos[1]))? "Eles são iguais.": "Eles não são iguais.";
		System.out.println("O primeiro retângulo"+ teste1);
		System.out.println("O segundo retângulo"+ teste2);
		System.out.println(comparacao);
		if (!(retangulos[0].eIgual(retangulos[1]))) {
			if(retangulos[0].area() > retangulos[1].area()) {
				retangulos[0].autoDesenhar();
			} else if(retangulos[0].area() == retangulos[1].area()) {
				retangulos[0].autoDesenhar();
				System.out.println();
				retangulos[1].autoDesenhar();
			} else {
				retangulos[1].autoDesenhar();
			}
		}
		input.close();
	}
}

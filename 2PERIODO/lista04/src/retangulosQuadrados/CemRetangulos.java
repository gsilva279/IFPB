package retangulosQuadrados;
import java.util.Scanner;

public class CemRetangulos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int qtdQuadrados=0, qtdRetangulos=0;
		Retangulo maior = new Retangulo();
		Retangulo menor = new Retangulo();
		maior = null; menor = null;
		int somaPerimetroTotal= 0;
		
		
		for(int i=1; i <= 100; i++) {
			Retangulo r = new Retangulo();
			System.out.print("Base do retangulo "+ (i) + ": ");
			r.setBase(input.nextInt());
			System.out.print("Altura do retangulo "+ (i) + ": ");
			r.setAltura(input.nextInt());
			
			if (r.isQuadrado()) {
				qtdQuadrados++;
			} else {
				qtdRetangulos++;
				somaPerimetroTotal += r.perimetro();
			}
			
			if (maior == null || r.area() >= maior.area()) {
				maior = r;
			}
			if (menor == null || r.area() <= menor.area()) {
				menor = r;
			}
		}
		System.out.println("Quadrados: " + qtdQuadrados);
		System.out.println("Retangulos: " + qtdRetangulos);
		System.out.println("Soma de todos os Perimetro: " + somaPerimetroTotal);
		maior.autoDesenhar();
		menor.autoDesenhar();
		input.close();
	}
}

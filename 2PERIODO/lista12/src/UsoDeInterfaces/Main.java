package UsoDeInterfaces;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		MinhaData data1 = MinhaData.ler(input, "Data 1");
		MinhaData data2 = MinhaData.ler(input, "Data 2");
		
		int teste = data1.comparacao(data2);

		if (teste == 0) {
			System.out.println("As datas são iguais: " + data1);
		} else if (teste == 1) {
			System.out.println("Ordem crescente: " + data2 + " - " + data1);
		} else {
			System.out.println("Ordem crescente: " + data1 + " - " + data2);
		}
		input.close();
	}
}

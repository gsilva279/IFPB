package medias;
import java.util.Scanner;

public class AbaixoDaMedia {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cont =0;
		int[] medias = new int[5];
		
		System.out.println("Digite 5 médias: ");
		for(int i=0; i < 5; i++) {
			medias[i] = input.nextInt();
		}
		
		for(int media:medias) {
			if (media < 7) {
				//ou cont += (media < 7) ? 1 : 0;
				cont++;
			}
		}
		System.out.println(cont + " alunos estão abaixo da média");
		input.close();
	}

}

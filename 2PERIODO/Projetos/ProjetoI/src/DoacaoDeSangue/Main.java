package DoacaoDeSangue;
import java.util.Scanner;
import Modelo.Pessoa;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AtendenteDaEnfermaria atendente = new AtendenteDaEnfermaria();
		Pessoa doador = new Pessoa();
		boolean temTatuagem;
		boolean ingeriuAlcool;
		boolean resultado;
		String saida;
		int i = 1;
		int cont = 0;
		
		while (i <= 2) {
			System.out.println("==================");
			System.out.println("Informe seu nome: ");
			doador.setNome(input.nextLine());
			System.out.println("infome sua idade: ");
			doador.setIdade(input.nextInt());
			System.out.println("Informe seu peso: ");
			doador.setPeso(input.nextFloat());
			System.out.println("Você tem tatuagem? ");
			temTatuagem = input.nextBoolean();
			System.out.println("Você ingeriu alcool nas ultmas 24h? ");
			ingeriuAlcool = input.nextBoolean();
		
			resultado = atendente.avaliarDoador(doador, temTatuagem, ingeriuAlcool);
			
			if (resultado == true) {
				saida = " pode doar sangue.";
				cont++;
			} else {
				saida = " não pode doar sangue.";
			}
			
			System.out.println(doador.getNome() + " você" + saida);
			i++;
		}
		System.out.println("A quantidade de pessoas que pode doar sangue é: " + cont);
		input.close();
	}
}

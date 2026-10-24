package ProjetoMensageiro;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		System.out.println("Informe a mensagem: ");
		String mensagem = input.nextLine();
		System.out.println("Informe o destino: ");
		String destino = input.nextLine();
		
		Mensageiro mensageiro = new Mensageiro();
		Mensagem mensagemRetornada = mensageiro.prepararMensagem(mensagem, destino);
		
		System.out.println("Mensagem final: " + mensagemRetornada.getTexto());
		input.close();
	}
}

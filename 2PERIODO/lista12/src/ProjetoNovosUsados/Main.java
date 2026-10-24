package ProjetoNovosUsados;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Carro carro = null; 
		
		System.out.println("Informe o preco: ");
		double preco = Double.parseDouble(input.nextLine());
		System.out.println("Informe o tipo(novo/usado: ");
		String tipo = input.nextLine();
		System.out.println("Informe o modelo: ");
		String modelo = input.nextLine();
		
		if(tipo.equalsIgnoreCase("novo")){
			carro = new CarroNovo(modelo, preco);
		} else if (tipo.equalsIgnoreCase("usado")){
			carro = new CarroUsado(modelo, preco);
		} else {
			System.out.println("Tipo inválido. Digite novo ou usado.");
			input.close();
			return;
		}
		System.out.println(carro);
		System.out.println("Preço a pagar: " + carro.getPreco());
		input.close();
	}
}

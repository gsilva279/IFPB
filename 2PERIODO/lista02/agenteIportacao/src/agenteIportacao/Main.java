package agenteIportacao;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ProdutoImportado produto = new ProdutoImportado();
		AgenteDeImportacao agente = new AgenteDeImportacao();
		
		System.out.println("Informe o tipo do produto importado: ");
		produto.setTipo(entrada.nextLine());
		System.out.println("Informe o preço do produto importado($): ");
		produto.setPreco(entrada.nextFloat());
		
		float valorFinal = agente.converter(produto) + agente.calcularImposto(produto);
		System.out.println("O produto custará R$" + valorFinal);
	}
}

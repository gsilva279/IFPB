package ProjetoImposto;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {
		String tipoConta;
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Infome o tipo de conta (pj - pf): ");
		tipoConta = input.nextLine();
		
		if(tipoConta.equalsIgnoreCase("pj")) {
			
			
			ContaBancariaPJ contaPJ = new ContaBancariaPJ();
		} else if(tipoConta.equalsIgnoreCase("pf")) {
			
		} else {
			System.out.println("Informe um tipo válido.");
		}
	}
}

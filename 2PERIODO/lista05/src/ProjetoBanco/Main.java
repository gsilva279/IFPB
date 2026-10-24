package ProjetoBanco;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Banco banco = new Banco();
		
		boolean fimOperacao = true;
		while(fimOperacao) {
			System.out.println(" 1 – cadastrar uma conta, "
					+ "\n2 – consultar o saldo de uma conta, "
					+ "\n3 – sair");
			String opcao = input.nextLine();
			
			switch(opcao) {
				case "1":
					ContaCorrente conta = new ContaCorrente();
					System.out.println("Titular: ");
					conta.setTitular(input.nextLine());
					System.out.println("Numero: ");
					conta.setNumero(input.nextLine());
					System.out.println("Saldo: ");
					conta.setSaldo(input.nextFloat());
					input.nextLine();
					
					if (banco.salvarConta(conta)) {
						System.out.println("Conta cadastrada com sucesso");
					} else {
						System.out.println("Erro!!");
					}
					break;
				case "2":
					System.out.println("Numero: ");
					String numeroConta = input.nextLine();
					ContaCorrente contaEncontrada = banco.recuperarConta(numeroConta);
					
					if (contaEncontrada != null) {
						System.out.println("O saldo: " + contaEncontrada.getSaldo());
					} else {
						System.out.println("Conta não encontrada");
					}
					break;
					case "3":
					System.out.println("Saindo, obrigado....");
					fimOperacao = false;
					break;
				default:
					System.out.println("Informe uma opção válida!");
					break;
			}
		}
		input.close();
	}
}

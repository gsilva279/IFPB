package ProjetoImposto;
import java.util.Scanner;


public class Cliente {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		System.out.println("=== Cooperativa - Abertura de Conta ===");
		System.out.println("Informe o tipo de conta (PF ou PJ): ");
		String tipoConta = input.nextLine();


		System.out.println("Número da conta: ");
		String numero = input.nextLine();


		System.out.println("Saldo inicial da conta: ");
		float saldo = Float.parseFloat(input.nextLine());


		System.out.println("Tipo de conta (CORRENTE, POUPANCA, SALARIO): ");
		TipoDeConta tipo = TipoDeConta.valueOf(input.nextLine().trim().toUpperCase());


		if (tipoConta.equalsIgnoreCase("pf")) {


			System.out.println("Nome do titular: ");
			String nomeTitular = input.nextLine();


			ContaBancariaPF contaPF = new ContaBancariaPF(nomeTitular, numero, saldo, tipo);


			float imposto = Contador.calcularImpostoPF(contaPF);


			System.out.println("\n--- Dados da conta cadastrada ---");
			System.out.println(contaPF);
			System.out.printf("Imposto a pagar: R$ %.2f%n", imposto);


		} else if (tipoConta.equalsIgnoreCase("pj")) {


			System.out.println("Nome do responsável pela empresa: ");
			String nomeResp = input.nextLine();


			System.out.println("Ano de nascimento do responsável: ");
			int nascimento = Integer.parseInt(input.nextLine());


			System.out.println("Nome fantasia da empresa: ");
			String fantasia = input.nextLine();


			System.out.println("CNPJ: ");
			String cnpj = input.nextLine();


			System.out.println("Quantidade de funcionários: ");
			int qtdFuncionarios = Integer.parseInt(input.nextLine());


			Pessoa responsavel = new Pessoa(nomeResp, nascimento);
			PessoaJuridica pj = new PessoaJuridica(fantasia, cnpj, qtdFuncionarios, responsavel);
			ContaBancariaPJ contaPJ = new ContaBancariaPJ(pj, numero, saldo, tipo);


			float imposto = Contador.calcularImpostoPJ(contaPJ);


			System.out.println("\n--- Dados da conta cadastrada ---");
			System.out.println(contaPJ);
			System.out.printf("Imposto a pagar: R$ %.2f%n", imposto);


		} else {
			System.out.println("Informe um tipo válido (PF ou PJ).");
		}


		input.close();
	}
}

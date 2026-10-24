package ProjetoImpressoraOO;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Impressora impressora = new Impressora();
		int totalPaginas = 0;
		boolean status = true;
		
		while(status) {
			System.out.println("1 – imprimir "
					+ "\n2 – carregar papel na impressora, "
					+ "\n3 – trocar o toner da impressora  "
					+ "\n4 - sair");
			int opcao = Integer.parseInt(input.nextLine());
			
			switch(opcao) {
				case 1:
					System.out.println("Páginas a serem impressas: ");
					int paraImprimir = Integer.parseInt(input.nextLine());
					try {
						totalPaginas += impressora.imprimir(paraImprimir);
					} catch (FaltouTintaException e) {
						System.out.println(e.getMessage());
					} catch (FaltouPapelException e) {
						System.out.println(e.getMessage());
						totalPaginas += paraImprimir - e.getQtdPaginasNaoImpressas();
					}
					break;
				case 2:
					System.out.println("Qantidade de papel: ");
					int qtdPepel = Integer.parseInt(input.nextLine());
					impressora.setQtdPaginas(impressora.getQtdPaginas() + qtdPepel);
					break;
				case 3:
					System.out.println("Toner recarregado");
					impressora.setCargaDoToner(100);
					break;
				case 4:
					System.out.println("\nSAINDO...");
					System.out.println("Total de Páginas Impressas: " + totalPaginas);
					status = false;
					break;
				default:
					System.out.println("Informe uma opção válida");
					break;
			}
		}
		input.close();
	}
}

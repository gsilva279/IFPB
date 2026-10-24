import java.util.ArrayList;

public class TesteExtrator {
	public static void main(String[] args) {
		ArrayList<Palavra> lista = ExtratorPalavrasCSV.extrairPalavras("palavras.csv");
		/*System.out.println("Resultado: " + lista);*/
		
		if(lista == null) {
			System.out.println("Erro: o CSV está fora do formato esperado.");
		} else {
			for(Palavra p:lista) {
				System.out.println(p + " | " + p.getDificuldade());
			}
		}
	}
}

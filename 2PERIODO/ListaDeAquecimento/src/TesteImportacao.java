import java.util.ArrayList;
public class TesteImportacao {

		public static void main(String[] args) {
			String arquivoXML = "central.xml";
			String arquivoCSV = "palavras.csv";

			Persistencia p = new Persistencia();
			CentralDeInformacoes central = p.recuperarCentral(arquivoXML);

			ArrayList<Palavra> extraidas = ExtratorPalavrasCSV.extrairPalavras(arquivoCSV);

			if (extraidas == null) {
				System.out.println("Erro: o CSV está fora do formato esperado.");
				return;
			}

			int adicionadas = 0;
			for (Palavra palavra : extraidas) {
				if (central.adicionarPalavra(palavra)) {
					adicionadas++;
				}
			}

			p.salvarCentral(central, arquivoXML);

			System.out.println("Palavras no CSV: " + extraidas.size());
			System.out.println("Palavras novas adicionadas: " + adicionadas);
			System.out.println("Total na central: " + central.getTodasAsPalavras().size());
		}
}

import java.util.ArrayList;
import java.io.*;

public class ExtratorPalavrasCSV {
	public static ArrayList<Palavra> extrairPalavras(String nomeCSV) {
		ArrayList<Palavra> palavras = new ArrayList<>();

		try(BufferedReader leitor = new BufferedReader(new InputStreamReader(new FileInputStream(nomeCSV), "UTF-8"));){
			String linha;
			while((linha = leitor.readLine()) != null) {
				String[] partes = linha.split(",", 3);
				if(partes.length != 3) {
					return null;
				}
				
				String palavra = partes[0].trim();
				String numero = partes[1].trim();
				String dica = partes[2].trim();
				
				if(palavra.isEmpty()) {
					return null;
				}
				
				int nivel;
				try {
					nivel = Integer.parseInt(numero);
				} catch(NumberFormatException e){
					return null;
				}
				
				Dificuldade dificulade;
				switch(nivel) {
					case 0:
						dificulade = Dificuldade.FACIL;
						break;
					case 1:
						dificulade = Dificuldade.MEDIO;
						break;
					case 2:
						dificulade = Dificuldade.DIFICIL;
						break;
					default:
						return null;
				}
				palavras.add(new Palavra(palavra, dica, dificulade));
				
			}
		} catch(IOException e) {
			return null;
		}
		return palavras;
	}
}

package JogoDaForca;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class ReadearFile {
	public static void main(String[] ars) throws IOException {
		String path = "src/JogoDaForca/palavras.txt";
		File arquivo = new File(path);
		System.out.println(arquivo.exists());
		
		FileReader linha = new FileReader(path);
		BufferedReader br = new BufferedReader(linha);
		
		String l = br.readLine();
		while( l != null) {
			System.out.println(l);
			l = br.readLine();
		}
		br.close();
	}
}

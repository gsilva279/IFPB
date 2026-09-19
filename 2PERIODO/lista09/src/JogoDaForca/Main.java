package JogoDaForca;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Palavra[] dic = new Palavra[10];
		int erros = 0;
		int pontuacao = 0;
		
		/*10 paalvras e dicas são colocadas no array manualmente
		 * 
		for(int i=0; i < dic.length; i++) {
			System.out.println("Informe a palavra " + (i+1));
			String pal = input.nextLine();
			System.out.println("Informe a dica " + (i+1));
			String dica = input.nextLine();
			dic[i] = new Palavra(pal, dica);
		}*/
		
		//ler arquivo para poder preencher o array dic
		String caminhoTxt = "src/JogoDaForca/palavras.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(caminhoTxt))){
			String l;
			int i = 0;
			while((l = br.readLine()) != null && i < dic.length) {
				String[] partes = l.split(",");
				String palavra = partes[0].trim();
				String dica = partes[1].trim();
				
				dic[i] = new Palavra(palavra, dica);
				i++;
			}
		} catch (IOException e) {
			System.out.println("ERRO: " + e.getMessage());
		}
		
		JogoDaForca jogo = new JogoDaForca(dic);
		jogo.sortear();
		
		do {
			System.out.println("Gabarito: " + jogo.getGabarito());
			System.out.println("Qual letra quer testar: ");
			char letra = input.next().charAt(0);
			
			if(jogo.testarLetra(letra)) {
				System.out.println("A letra " + letra + " está presente.");
				System.out.println("Gabarito: " + jogo.getGabarito());
			} else {
				System.out.println("A letra " + letra + " não está presente.");
				erros++;
			}
			
		} while(!jogo.testaSeAcabou());
		
		pontuacao = 2 * jogo.getDicionario().length - erros;
		System.out.println("Pontuação final: " + pontuacao);
		input.close();
	}
}

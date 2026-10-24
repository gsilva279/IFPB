import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.*;

public class Persistencia {
	private XStream criarXStream() {
		XStream xstream = new XStream(new DomDriver());
		xstream.allowTypes(new Class[]{
			CentralDeInformacoes.class, Jogador.class, Palavra.class, Sexo.class, Dificuldade.class
		});
		return xstream;
	}
	
	public void salvarCentral(CentralDeInformacoes central,String nomeXML) {
		XStream xstream = criarXStream();
		try(Writer escritor = new OutputStreamWriter(new FileOutputStream(nomeXML), "UTF-8")) {
			xstream.toXML(central, escritor);
		} catch (IOException e) {
			System.out.println("Erro ao salvar a central: " + e.getMessage());
		}
	}
	
	public CentralDeInformacoes recuperarCentral(String nomeXML) {
		File arquivo = new File(nomeXML);
		if(!arquivo.exists()) {
			return new CentralDeInformacoes();
		}
		XStream xstream = criarXStream();
		try(Reader leitor = new InputStreamReader(new FileInputStream(arquivo), "UTF-8")){
			return (CentralDeInformacoes) xstream.fromXML(leitor);
		} catch (IOException e) {
			System.out.println("Erro ao recuperar Central: " + e.getMessage());
			return new CentralDeInformacoes();
		}
	}
}


public class TestePersistencia {
	public static void main(String[] args) {
		Persistencia p = new Persistencia();
		
		/* Teste para o método salvarCentral
		CentralDeInformacoes central = new CentralDeInformacoes();
		p.salvarCentral(central, "central.xml");
		*/
		
		//Teste do método recuperarCentral
		CentralDeInformacoes central = p.recuperarCentral("central.xml");
		System.out.println("Jogadores carregados: " + central.getTodosOsJogadores().size());
		central.adicionarJogador(new Jogador("Kevin", Sexo.FEMININO, "11111111111", "g@gmail.com"));
		p.salvarCentral(central, "central.xml");
		
		//Teste para palavra
		String arquivo = "central.xml";
		CentralDeInformacoes central2= p.recuperarCentral("central.xml");
		System.out.println("Palavras carregadas: " + central2.getTodasAsPalavras().size());
		central.adicionarPalavra(new Palavra("bola", "para jogar", Dificuldade.DIFICIL));
		
		p.salvarCentral(central2, arquivo);

	}
}

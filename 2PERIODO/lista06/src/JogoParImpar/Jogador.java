package JogoParImpar;

public class Jogador {
	private String nome;
	private int pontuacao;
	
	public String getNome() {
		return nome;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public Jogador(String Novonome) {
		this.nome = Novonome;
		this.pontuacao = 0;
	}
	
	public void adicionarPonto() {
		pontuacao++;
	}
}

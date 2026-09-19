package ProjetoImposto;

public class Pessoa {

	private String nome;
	private int anoNascimento;
	
	
	public Pessoa(String nome, int anoNascimento) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
	}
	
	public void setNome(String s) {
		nome = s;
	}
	
	public void setAnoNascimento(int x) {
		anoNascimento = x;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getAnoNascimento() {
		return anoNascimento;
	}
	
	public int getIdade() {
		return 2026 - anoNascimento;
	}
}
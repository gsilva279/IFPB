package escola;

public class Professor {
	private String nome;
	private String disciplina;
	
	//get e sets
	public void set(String nome) {
		this.nome = nome;
	}
	public String nome() {
		return nome;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getDisciplina() {
		return disciplina;
	}
	
	//métodos:
	public boolean resultado(Aluno a) {
		if (a.media() >= 7){
			return true;
		}
		else {
			return false;
		}
	}
}
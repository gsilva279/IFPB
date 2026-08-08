package Modelo;

public class Pessoa {
	private String nome;
	private String sexo;
	private float peso;
	private int altura;
	private int idade;
	
	//gets
	public String getNome() {
		return nome;
	}
	public String getSexo() {
		return sexo;
	}
	public float getPeso() {
		return peso;
	}
	public int getAltura() {
		return altura;
	}
	public int getIdade() {
		return idade;
	}
	
	//sets
	public void setNome(String novoNome) {
		nome = novoNome;
	}
	public void setSexo(String novoSexo) {
		sexo = novoSexo;
	}
	public void setPeso(float novoPeso) {
		peso = novoPeso;
	}
	public void setAltura(int novaAltura) {
		altura = novaAltura;
	}
	public void setIdade(int novaIdade) {
		idade = novaIdade;
	}
}

package ProjetoImposto;

public class PessoaJuridica {
	private String nomeFantasia;
	private String cnpj;
	private int qtdFuncionarios;
	private Pessoa responsavel;
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getQtdFuncionarios() {
		return qtdFuncionarios;
	}
	
	public Pessoa getResponsavel() {
		return responsavel;
	}

	public PessoaJuridica(String nomeFantasia, String cnpj, int qtdFuncionarios, Pessoa responsavel) {
		super();
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.qtdFuncionarios = qtdFuncionarios;
		this.responsavel = responsavel;
	}
	
	
	
}

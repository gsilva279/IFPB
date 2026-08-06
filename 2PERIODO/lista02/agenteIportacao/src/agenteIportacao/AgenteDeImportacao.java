package agenteIportacao;

public class AgenteDeImportacao {
	public float converter(ProdutoImportado produto) {
		return produto.getPreco() * 5.13f;
	}
	public float calcularImposto(ProdutoImportado produto) {
		return converter(produto) * 0.6f;
	}

}

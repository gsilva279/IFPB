package PorteiroAutomatico;
import Modelo.Pessoa;

public class Porteiro {
	public String boasVindas(Pessoa pessoa) {
		if (pessoa.getIdade() > 10) {
			String sexo = pessoa.getSexo();
			
			switch (sexo) {
			case "homem":
				return "Bem-vindo senhor " + pessoa.getNome();
			case "mulher":
				return "Bem-vinda senhora " + pessoa.getNome();
			case "":
				return "Olá " + pessoa.getNome() + " tenha um otimo dia!";
			} 
		} 
		
		return "Olá jovem " + pessoa.getNome();

	}
}

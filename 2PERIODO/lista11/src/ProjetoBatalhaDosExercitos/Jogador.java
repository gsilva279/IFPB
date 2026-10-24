package ProjetoBatalhaDosExercitos;
import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {
		private String nome;
		private int dinheiro = 200;
		private ArrayList<Unidade> unidades = new ArrayList<Unidade>();
		
		public Jogador(String nome) {
			this.nome = nome;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getDinheiro() {
			return dinheiro;
		}
		private void setDinheiro(int dinheiro) {
			this.dinheiro = dinheiro;
		}
		
		public boolean temUnidades() {
			return !unidades.isEmpty();
		}
		
		public boolean comprar(Unidade compraUnidade) {
			if(this.getDinheiro() >= compraUnidade.getValorUnidade()) {
				unidades.add(compraUnidade);
				this.setDinheiro(this.getDinheiro() - compraUnidade.getValorUnidade());
				return true;
			}
			return false;
		}
		
		public boolean removerUnidade(int indice){
			if(indice >= 0 && indice < unidades.size()) {
				unidades.remove(indice);
				return true;
			}
			return false;
		}	
		
		public Unidade pegarUnidade(int indice) {
			if(indice >= 0 && indice < unidades.size()) {
				return unidades.get(indice);
			}
			return null;
		}
		
		public int qtdUnidades() {
			return this.unidades.size();
		}
		
		public void menuComprarUnidade(Scanner leitor) {
				if(this.getDinheiro() >= 100) {
					System.out.println(this.getNome() + ", unidades disponiveis para compra: "
							+ "Infantaria, Catapulta, Cavalaria.");
					String opcao = leitor.nextLine().toLowerCase();
					switch(opcao) {
						case "infantaria":
							this.comprar(new Infantaria());
							break;
						case "catapulta":
							this.comprar(new Catapulta());
							break;
						case "cavalaria":
							this.comprar(new Cavalaria());
							break;
					}
				}
		}
}







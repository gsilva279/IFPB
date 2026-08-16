package primo;

public class CDF {
	public boolean ePrimo(int numero) {
		for(int i=2; i< numero; i++) {
			if(numero % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	/*para testes
	public static void main(String[] args) {
		CDF verificador = new CDF();
		int numero = 8;
		
		System.out.println("O número: " + numero + " é primo? " + verificador.ePrimo(numero));
	}*/
}

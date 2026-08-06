package operadorTernario;

public class exemploTernario {
	public static void main(String[] args) {
		int idade = 88;
		String resultado;
		
		/*com operador if-else
		if (idade >= 18) {
			resultado = "Maior de idade";
		} else {
			resultado = "Menor de idade";
		}*/
		
		//com operador ternário
		resultado = (idade >=18)? "Maior de idade": "Menor de idade";
		
		System.out.println("resultado: " + resultado);
	}
}

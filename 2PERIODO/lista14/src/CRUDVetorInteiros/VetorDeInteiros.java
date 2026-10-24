package CRUDVetorInteiros;
import javax.swing.JOptionPane;

public class VetorDeInteiros {
	public static void main(String[] args) {
		int[] conjunto = new int[3];
		int somaTotal = 0;
		boolean temZero;
		
		do {
			try {
				String numeroTxt = JOptionPane.showInputDialog("Informe o número: ");
				int numero = Integer.parseInt(numeroTxt);
				String posicaoTxt = JOptionPane.showInputDialog("Informe a posição[0-"+ (conjunto.length - 1)+"]");
				int posicao = Integer.parseInt(posicaoTxt);
				conjunto[posicao] = numero;
			} catch (IndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "Posição inexistente");
			} catch(NumberFormatException k) {
				JOptionPane.showMessageDialog(null, "Digite apenas números");
			}
			
			temZero = false;
			for(int n:conjunto) {
				if(n ==0) {
					temZero = true;
				}
			}
			
		} while(temZero);
		
		for(int numero:conjunto) {
			somaTotal += numero;
		}
		
		JOptionPane.showMessageDialog(null, somaTotal);
	}
}

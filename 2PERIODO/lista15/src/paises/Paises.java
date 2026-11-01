package paises;
import javax.swing.*;
import java.awt.Image;

public class Paises {
	public static void main(String[] args) {
		String[] paises = {"Alemanha", "França", "Camarões", "Holanda"};
		ImageIcon img = new ImageIcon("src/paises/globo.png");
		ImageIcon icone = new ImageIcon(img.getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH));
		Object result = JOptionPane.showInputDialog(
					null,
					"Escolha seu país favorito: ",
					"Paises",
					JOptionPane.QUESTION_MESSAGE,
					icone,
					paises,
					paises[0]
				);
		if(result != null) {	
			new JFramePaises((String) result);
		}
	}
}

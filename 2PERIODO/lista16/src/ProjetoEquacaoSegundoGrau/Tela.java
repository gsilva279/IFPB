package ProjetoEquacaoSegundoGrau;
import java.awt.Color;

import javax.swing.JFrame;

public class Tela extends JFrame{
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
		setTitle("Sorteia dado");
		setSize(600, 600);
		setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);	
	}

}

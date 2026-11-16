package tela;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;

public class telaAcesso extends JFrame{
	public telaAcesso() {
		setTitle("Estoque");
		setLayout(new BorderLayout());
		//Radio button:
		JRadioButton rbPerecivel = new JRadioButton("Produto perecível");
		JRadioButton rbNaoPerecivel = new JRadioButton("Produto não perecível");
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rbNaoPerecivel);
		grupo.add(rbPerecivel);
		rbNaoPerecivel.setSelected(true);
		JPanel painel = new JPanel(new FlowLayout());
		painel.add(rbNaoPerecivel);
		painel.add(rbPerecivel);
		
		//
		
		
		
		add(painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
	}
}

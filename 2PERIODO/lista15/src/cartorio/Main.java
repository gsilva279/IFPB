package cartorio;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Font;

public class Main {
	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[4];
		JFrame janela = new JFrame();
		janela.setLayout(null);
		
		ImageIcon original = new ImageIcon("src/cartorio/pessoa.png");
		ImageIcon icon = new ImageIcon(
				original.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH));
	
		
		for(int i=0; i < pessoas.length; i++) {
				String nome = JOptionPane.showInputDialog("Nome pessoa " + (i+1));
				int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento pessoa "+(i+1)));
				pessoas[i] = new Pessoa(nome, anoNascimento);
				
				JLabel quadro = new JLabel(pessoas[i].getNome(), icon, JLabel.LEFT);
				quadro.setFont(new Font("SansSerif", Font.BOLD, 24));
				quadro.setToolTipText("Nascido em: " + pessoas[i].getAnoNascimento());
				int coluna = i % 2;
				int linha = i / 2;
				quadro.setBounds(20 + coluna * 240, 20 + linha * 100, 220, 60);
				janela.add(quadro);
		}
		
		janela.setTitle("Pessoas");
		janela.setSize(350, 250);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janela.setVisible(true);
	}
}

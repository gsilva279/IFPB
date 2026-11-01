package login;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.formdev.flatlaf.FlatDarkLaf;

public class LoginComFlatlaf {
	public static void main(String[] args) {
		//muda o L&F
		try {
			UIManager.setLookAndFeel(new FlatDarkLaf());
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		JFrame janela = new JFrame();
		String imgCaminho = "src/login/chave.png";
		ImageIcon img = new ImageIcon(imgCaminho);
		ImageIcon icone = new ImageIcon(img.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		
		janela.setTitle("Cadasnimbustro de Clientes - Acesso");
		janela.setSize(600, 300);
		janela.getContentPane().setBackground(Color.LIGHT_GRAY);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);
		janela.setLayout(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel labelImage = new JLabel(icone);
		labelImage.setBounds(30, 40, 200, 200);
		JLabel nome = new JLabel("Nome:");
		nome.setBounds(300, 80, 140, 20);
		nome.setForeground(Color.BLACK);
		nome.setFont(new Font("SansSerif", Font.BOLD, 20));
		JLabel senha = new JLabel("Senha:");
		senha.setBounds(300, 120, 140, 20);
		senha.setForeground(Color.RED);
		senha.setFont(new Font("SansSerif", Font.BOLD, 20));
		JTextField campoNome = new JTextField(10);
		campoNome.setBounds(400, 80, 140, 20);
		JTextField campoSenha = new JTextField(10);
		campoSenha.setBounds(400, 120, 140, 20);
		JButton butaoEntrar = new JButton("Entrar");
		butaoEntrar.setBounds(400, 170, 100, 30);
		butaoEntrar.setForeground(new Color(0, 100, 0));
		butaoEntrar.setFont(new Font("SansSerif", Font.BOLD, 20));
		janela.add(labelImage);
		janela.add(nome);
		janela.add(senha);
		janela.add(campoNome);
		janela.add(campoSenha);
		janela.add(butaoEntrar);
		janela.setVisible(true);

	}
}

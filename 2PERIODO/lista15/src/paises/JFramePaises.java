package paises;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class JFramePaises extends JFrame {
	private String nome;
	private JLabel faixa1 = new JLabel();
	private JLabel faixa2 = new JLabel();
	private JLabel faixa3 = new JLabel();
	
	public JFramePaises(String nome) {
		this.nome = nome;
		setTitle(getNome());
		setSize(600, 400);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		faixa1.setOpaque(true);
		faixa2.setOpaque(true);
		faixa3.setOpaque(true);
		
		pegarBandeira();
		
		add(faixa1);
		add(faixa2);
		add(faixa3);
		setVisible(true);
	}
	
	public void pegarBandeira() {
		String pais = this.getNome();
		switch(pais) {
			case "Alemanha":
				faixa1.setBackground(Color.BLACK);
				faixa1.setBounds(0, 0, 600, 133);

				faixa2.setBackground(Color.RED);
				faixa2.setBounds(0, 133, 600, 133);

				faixa3.setBackground(Color.YELLOW);
				faixa3.setBounds(0, 266, 600, 134);
				break;
			case "França":
				faixa1.setBackground(Color.BLUE);
				faixa1.setBounds(0, 0, 200, 400);
				
				faixa2.setBackground(Color.WHITE);
				faixa2.setBounds(200, 0, 200, 400);
				
				faixa3.setBackground(Color.RED);
				faixa3.setBounds(400, 0, 200, 400);
				break;
			case "Camarões":
				faixa1.setBackground(Color.GREEN);
				faixa1.setBounds(0, 0, 200, 400);
				
				faixa2.setBackground(Color.RED);
				faixa2.setBounds(200, 0, 200, 400);
				
				faixa2.setText("★");
				faixa2.setHorizontalAlignment(JLabel.CENTER);
				faixa2.setVerticalAlignment(JLabel.CENTER);
				faixa2.setFont(new Font("SansSerif", Font.BOLD, 150));
				faixa2.setForeground(Color.YELLOW);
				
				faixa3.setBackground(Color.YELLOW);
				faixa3.setBounds(400, 0, 200, 400);
				break;
			case "Holanda":
				faixa1.setBackground(Color.RED);
				faixa1.setBounds(0, 0, 600, 133);

				faixa2.setBackground(Color.WHITE);
				faixa2.setBounds(0, 133, 600, 133);

				faixa3.setBackground(Color.BLUE);
				faixa3.setBounds(0, 266, 600, 134);
				break;
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}

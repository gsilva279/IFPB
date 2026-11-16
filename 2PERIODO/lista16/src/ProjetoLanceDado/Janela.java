package ProjetoLanceDado;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JOptionPane;


public class Janela extends JFrame implements ActionListener{
	private Jogo jogo = new Jogo();
	private JLabel imagemDado = new JLabel();
	private JButton butao = new JButton("JOGAR");
	private JSpinner numeroTxt = new JSpinner(new SpinnerNumberModel(1, 1, 6, 1));
	private JLabel resultadoTxt = new JLabel("resultado...");
	
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
		setTitle("Sorteia dado");
		setSize(600, 600);
		setLayout(null);
		setLocationRelativeTo(null);
		
		butao.setBounds(240, 50, 150, 30);
		butao.addActionListener(this);
		numeroTxt.setBounds(160, 50, 50, 30);
		resultadoTxt.setBounds(150, 450, 300, 30);
		resultadoTxt.setHorizontalAlignment(JLabel.CENTER);
		imagemDado.setBounds(230, 150, 130, 130);
		imagemDado.setHorizontalAlignment(JLabel.CENTER);
		
		add(imagemDado);
		add(resultadoTxt);
		add(numeroTxt);
		add(butao);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int palpite = (Integer) numeroTxt.getValue();
		
		jogo.sortearNumero();
		imagemDado.setIcon(jogo.pegarIconeSorteado());
			
		if(jogo.acertou(palpite)) {
			resultadoTxt.setText("Você acertou!");
		} else {
			resultadoTxt.setText("Você errou! Sorteado: " + jogo.getNumeroSorteado());
		}
		
		int opcao = JOptionPane.showConfirmDialog(
				this,
				"Deseja jogar de novo?",
				"Fim de rodada",
				JOptionPane.YES_NO_OPTION
				);
		if(opcao == JOptionPane.YES_OPTION) {
			imagemDado.setIcon(null);
			resultadoTxt.setText("Resltado...");
			numeroTxt.setValue(1);
		} else {
			System.exit(0);
		}
		
	}

}

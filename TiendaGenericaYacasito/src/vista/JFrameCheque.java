package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class JFrameCheque extends JFrame
{
	private static final long serialVersionUID = 1L;
	private CHEPanel panelCheque;
	public JFrameCheque()
	{
		setSize(800,330);
		setResizable(false);
		setTitle("CHEQUE");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		panelCheque =  new CHEPanel();
		panelCheque.setBounds(1, 1, 800, 330);
		add(panelCheque);		
	}
}

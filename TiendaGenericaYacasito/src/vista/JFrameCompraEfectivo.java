package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class JFrameCompraEfectivo extends JFrame
{
	private CEPanelValores valores;
	
	
	public JFrameCompraEfectivo()
	{
		setSize(300,300);
		setResizable(false);
		setTitle("VALIDAR COMPRA");
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		valores =  new CEPanelValores();
		add(valores);		
	}
}		
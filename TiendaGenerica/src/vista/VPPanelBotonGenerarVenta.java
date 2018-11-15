package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class VPPanelBotonGenerarVenta extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnGeneral;
	private JLabel txtBtn;
	public static final String BUTG = "BotonG";
	
	public VPPanelBotonGenerarVenta()
	{
		setLayout(null);
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
	

		txtBtn = new JLabel("Generar Venta");
		txtBtn.setFont(new java.awt.Font("Yu Gothic UI Light", java.awt.Font.BOLD,15));
		
		btnGeneral = new JButton(txtBtn.getText());
		btnGeneral.setActionCommand(BUTG);
		btnGeneral.setForeground(Color.BLACK);
		btnGeneral.setBackground(Color.WHITE);
		btnGeneral.setFont(txtBtn.getFont());
		btnGeneral.setBounds(165, 65, 150, 60);
		
		
		add(btnGeneral);
		
	}

	public JButton getBtnGeneral() {
		return btnGeneral;
	}

	public void setBtnGeneral(JButton btnGeneral) {
		this.btnGeneral = btnGeneral;
	}

	
	
}

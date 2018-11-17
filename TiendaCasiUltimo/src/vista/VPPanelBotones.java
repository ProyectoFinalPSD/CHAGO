package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class VPPanelBotones extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnCompra;
	private JButton btnProd;
	private JButton btnProv;
	
	public final static String COMPRA = "Compra";
	public final static String PROD = "Productos";
	public final static String PROV = "Proveedores";
	
	public VPPanelBotones()
	{
		setLayout(new GridLayout(1, 3));
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		JLabel txtBtnDT = new JLabel("Compra");
		txtBtnDT.setFont(new java.awt.Font("Yu Gothic UI Light", java.awt.Font.BOLD,12));
		btnCompra = new JButton(txtBtnDT.getText());
		btnCompra.setActionCommand(COMPRA);
		btnCompra.setForeground(Color.BLACK);
		btnCompra.setBackground(Color.WHITE);
		btnCompra.setFont(txtBtnDT.getFont());
		
		JLabel txtBtnPR = new JLabel("Productos");
		txtBtnPR.setFont(new java.awt.Font("Yu Gothic UI Light", java.awt.Font.BOLD,12));
		btnProd = new JButton("Productos");
		btnProd.setActionCommand(PROD);
		btnProd.setForeground(Color.BLACK);
		btnProd.setBackground(Color.WHITE);
		btnProd.setFont(txtBtnPR.getFont());
		
		JLabel txtBtnPV = new JLabel("Proveedores");
		txtBtnPV.setFont(new java.awt.Font("Yu Gothic UI Light", java.awt.Font.BOLD,12));
		btnProv = new JButton("Proveedores");
		btnProv.setActionCommand(PROV);
		btnProv.setForeground(Color.BLACK);
		btnProv.setBackground(Color.WHITE);
		btnProv.setFont(txtBtnPV.getFont());
		
		
		add(btnCompra);
		add(btnProd);
		add(btnProv);
		/*add(new JLabel(""));
		add(new JLabel(""));
		add(btnProv1);*/
	}

	
	public JButton getBtnCompra() {
		return btnCompra;
	}


	public void setBtnCompra(JButton btnCompra) {
		this.btnCompra = btnCompra;
	}


	public JButton getBtnProd() {
		return btnProd;
	}

	public void setBtnProd(JButton btnProd) {
		this.btnProd = btnProd;
	}

	public JButton getBtnProv() {
		return btnProv;
	}

	public void setBtnProv(JButton btnProv) {
		this.btnProv = btnProv;
	}
	
}

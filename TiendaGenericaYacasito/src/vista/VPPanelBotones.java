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
	private JButton btnCom;
	private JButton btnProd;
	private JButton btnProv;
	
	public final static String COM = "Compras";
	public final static String PROD = "Productos";
	public final static String PROV = "Proveedores";
	
	public VPPanelBotones()
	{
		setLayout(new GridLayout(1, 3));
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		JLabel txtBtnDT = new JLabel("Compras");
		txtBtnDT.setFont(new java.awt.Font("Yu Gothic UI Light", java.awt.Font.BOLD,12));
		btnCom = new JButton(txtBtnDT.getText());
		btnCom.setActionCommand(COM);
		btnCom.setForeground(Color.BLACK);
		btnCom.setBackground(Color.WHITE);
		btnCom.setFont(txtBtnDT.getFont());
		
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
		
		add(btnCom);
		add(btnProd);
		add(btnProv);
		/*add(new JLabel(""));
		add(new JLabel(""));
		add(btnProv1);*/
	}

	public JButton getBtnCom() {
		return btnCom;
	}

	public void setBtnDatos(JButton btnDatos) {
		this.btnCom = btnDatos;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setBtnCom(JButton btnCom) {
		this.btnCom = btnCom;
	}
	
}

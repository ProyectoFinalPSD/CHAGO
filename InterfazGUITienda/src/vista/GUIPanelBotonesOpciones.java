package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class GUIPanelBotonesOpciones extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnDatos;
	private JButton btnProd;
	private JButton btnProv;
	private JButton btnProv1;
	
	public final static String DATOS = "Datos";
	public final static String PROD = "Productos";
	public final static String PROV = "Proveedores";
	public final static String PROV1 = "Proveedoresab";
	
	public GUIPanelBotonesOpciones()
	{
		setLayout(new GridLayout(2, 3));
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		JLabel txtBtnDT = new JLabel("Datos Tienda");
		txtBtnDT.setFont(new java.awt.Font("Yu Gothic UI Light", java.awt.Font.BOLD,12));
		btnDatos = new JButton(txtBtnDT.getText());
		btnDatos.setActionCommand(DATOS);
		btnDatos.setForeground(Color.BLACK);
		btnDatos.setBackground(Color.WHITE);
		btnDatos.setFont(txtBtnDT.getFont());
		
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
		
		JLabel txtBtnPV1 = new JLabel("Metodos Prov");
		txtBtnPV1.setFont(new java.awt.Font("Yu Gothic UI Light", java.awt.Font.BOLD,12));
		btnProv1 = new JButton("Metodos Prov");
		btnProv1.setActionCommand(PROV1);
		btnProv1.setForeground(Color.BLACK);
		btnProv1.setBackground(Color.WHITE);
		btnProv1.setFont(txtBtnPV1.getFont());
		
		add(btnDatos);
		add(btnProd);
		add(btnProv);
		add(new JLabel(""));
		add(new JLabel(""));
		add(btnProv1);
	}

	public JButton getBtnDatos() {
		return btnDatos;
	}

	public void setBtnDatos(JButton btnDatos) {
		this.btnDatos = btnDatos;
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

	public JButton getBtnProv1() {
		return btnProv1;
	}

	public void setBtnProv1(JButton btnProv1) {
		this.btnProv1 = btnProv1;
	}
	
	
	
}

package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class panelEM1 extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JLabel labN, labTipoC, labNIT, labCOrigen, labIVa, labTasaInteres, labNBanco, labNumCuenta, labNGerente ;
	private JTextField txtNT, TxtTipoC, txtNIT, TxtCOrigen, TxtIVa, TxtTasaInteres, TxtNBanco, TxtNumCuenta, TxtNGerente;
	
	public panelEM1()
	{
		setLayout(new GridLayout(10, 2));
		TitledBorder border = BorderFactory.createTitledBorder("Datos entrada");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		labN = new JLabel("Digite Nombre");
		txtNT = new JTextField("");
		
		labTipoC = new JLabel("Digite Tipo de Comercio");
		TxtTipoC = new JTextField("");
		
		labNIT = new JLabel("Digite NIT");
		txtNIT = new JTextField("");
		
		labCOrigen = new JLabel("Digite Ciudad de Origen");
		TxtCOrigen = new JTextField("");
		
		labIVa = new JLabel("Digite IVA");
		TxtIVa = new JTextField("");
		
		labTasaInteres = new JLabel("Digite Tasa de Intres");
		TxtTasaInteres = new JTextField("");
		
		labNBanco = new JLabel("Digite Nombre Banco");
		TxtNBanco = new JTextField("");
		
		labNumCuenta = new JLabel("Digite Numero de Cuenta");
		TxtNumCuenta = new JTextField("");
		
		labNGerente = new JLabel("Digite Nombre Gerente");
		TxtNGerente = new JTextField("");
		
		
		add(labN);
		add(txtNT);
		add(labTipoC);
		add(TxtTipoC);
		add(labNIT);
		add(txtNIT);
		add(labCOrigen);
		add(TxtCOrigen);
		add(labIVa);
		add(TxtIVa);
		add(labTasaInteres);
		add(TxtTasaInteres);
		add(labNBanco);
		add(TxtNBanco);
		add(labNumCuenta);
		add(TxtNumCuenta);
		add(labNGerente);
		add(TxtNGerente);
	}
	
	
	
	public JTextField getTxtNT() {
		return txtNT;
	}



	public void setTxtNT(JTextField txtNT) {
		this.txtNT = txtNT;
	}



	public JTextField getTxtTipoC() {
		return TxtTipoC;
	}



	public void setTxtTipoC(JTextField txtTipoC) {
		TxtTipoC = txtTipoC;
	}



	public JTextField getTxtNIT() {
		return txtNIT;
	}



	public void setTxtNIT(JTextField txtNIT) {
		this.txtNIT = txtNIT;
	}



	public JTextField getTxtCOrigen() {
		return TxtCOrigen;
	}



	public void setTxtCOrigen(JTextField txtCOrigen) {
		TxtCOrigen = txtCOrigen;
	}



	public JTextField getTxtIVa() {
		return TxtIVa;
	}



	public void setTxtIVa(JTextField txtIVa) {
		TxtIVa = txtIVa;
	}



	public JTextField getTxtTasaInteres() {
		return TxtTasaInteres;
	}



	public void setTxtTasaInteres(JTextField txtTasaInteres) {
		TxtTasaInteres = txtTasaInteres;
	}



	public JTextField getTxtNBanco() {
		return TxtNBanco;
	}



	public void setTxtNBanco(JTextField txtNBanco) {
		TxtNBanco = txtNBanco;
	}



	public JTextField getTxtNumCuenta() {
		return TxtNumCuenta;
	}



	public void setTxtNumCuenta(JTextField txtNumCuenta) {
		TxtNumCuenta = txtNumCuenta;
	}



	public JTextField getTxtNGerente() {
		return TxtNGerente;
	}



	public void setTxtNGerente(JTextField txtNGerente) {
		TxtNGerente = txtNGerente;
	}



		public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public JLabel getLabN() {
		return labN;
	}
	public void setLabN(JLabel labN) {
		this.labN = labN;
	}



	public JLabel getLabTipoC() {
		return labTipoC;
	}



	public void setLabTipoC(JLabel labTipoC) {
		this.labTipoC = labTipoC;
	}



	public JLabel getLabNIT() {
		return labNIT;
	}



	public void setLabNIT(JLabel labNIT) {
		this.labNIT = labNIT;
	}



	public JLabel getLabCOrigen() {
		return labCOrigen;
	}



	public void setLabCOrigen(JLabel labCOrigen) {
		this.labCOrigen = labCOrigen;
	}



	public JLabel getLabIVa() {
		return labIVa;
	}



	public void setLabIVa(JLabel labIVa) {
		this.labIVa = labIVa;
	}



	public JLabel getLabTasaInteres() {
		return labTasaInteres;
	}



	public void setLabTasaInteres(JLabel labTasaInteres) {
		this.labTasaInteres = labTasaInteres;
	}



	public JLabel getLabNBanco() {
		return labNBanco;
	}



	public void setLabNBanco(JLabel labNBanco) {
		this.labNBanco = labNBanco;
	}



	public JLabel getLabNumCuenta() {
		return labNumCuenta;
	}



	public void setLabNumCuenta(JLabel labNumCuenta) {
		this.labNumCuenta = labNumCuenta;
	}



	public JLabel getLabNGerente() {
		return labNGerente;
	}



	public void setLabNGerente(JLabel labNGerente) {
		this.labNGerente = labNGerente;
	}
	

	
	
}

package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JFrameCuotas extends JFrame
{

	private JLabel labMonto, labTasaInteres, labPlazo;
	private JTextField txtMonto, txtTasa, txtPlazo;
	private JTable tablaAmortizacion;
	private DefaultTableModel model;
	private JButton confirmar, nuevo;
	public final static String CONFIRMAR = "confirmar";
	public final static String NUEVO = "nuevo";
	
	
	public JFrameCuotas()
	{
		setSize(500,380);
		setTitle("Registro de cuotas");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
	
		tablaAmortizacion = new JTable();
		
		labMonto = new JLabel();
		labMonto.setText("Monto a financiar");
		labMonto.setBounds(20, 80, 100, 25);
		add(labMonto);
		
		txtMonto = new JTextField();
		txtMonto.setBounds(150, 80, 100, 25);
		add(txtMonto);
		
		labTasaInteres = new JLabel();
		labTasaInteres.setText("Tasa de interés");
		labTasaInteres.setBounds(20, 50, 100, 25);
		
		txtTasa = new JTextField();
		txtTasa.setBounds(150, 50, 100, 25);
		add(txtTasa);
		
		labPlazo = new JLabel();
		labPlazo.setText("Plazo");
		labPlazo.setBounds(20, 20, 80, 25);
		
		txtPlazo = new JTextField();
		txtPlazo.setBounds(150, 20, 100, 25);
		add(txtPlazo);
		
		confirmar = new JButton("Confirmar");
		confirmar.setActionCommand(CONFIRMAR);
		confirmar.setBounds(20, 290, 100, 20);
		add(confirmar);
		
		nuevo = new JButton("Nuevo crédito");
		nuevo.setActionCommand(NUEVO);
		nuevo.setBounds(160, 290, 180, 20);
		add(nuevo);
		
		
		model = new DefaultTableModel();// definimos el objeto tableModel
		tablaAmortizacion.setModel(model);
		model.addColumn("N° Cuota");
		model.addColumn("Saldo");
		model.addColumn("Valor cuota");
		model.addColumn("Intereses");
		model.addColumn("Capital");
		
		JScrollPane Barra = new JScrollPane();
		Barra.setBounds(20, 140, 400, 130);
		Barra.setViewportView(tablaAmortizacion);
		
		
		add(labMonto);
		add(labTasaInteres);
		add(labPlazo);
		add(Barra);
		
	}


	public JLabel getLabMonto() {
		return labMonto;
	}


	public void setLabMonto(JLabel labMonto) {
		this.labMonto = labMonto;
	}


	public JLabel getLabTasaInteres() {
		return labTasaInteres;
	}


	public void setLabTasaInteres(JLabel labTasaInteres) {
		this.labTasaInteres = labTasaInteres;
	}


	public JLabel getLabPlazo() {
		return labPlazo;
	}


	public void setLabPlazo(JLabel labPlazo) {
		this.labPlazo = labPlazo;
	}


	public JTextField getTxtMonto() {
		return txtMonto;
	}


	public void setTxtMonto(JTextField txtMonto) {
		this.txtMonto = txtMonto;
	}


	public JTextField getTxtTasa() {
		return txtTasa;
	}


	public void setTxtTasa(JTextField txtTasa) {
		this.txtTasa = txtTasa;
	}


	public JTextField getTxtPlazo() {
		return txtPlazo;
	}


	public void setTxtPlazo(JTextField txtPlazo) {
		this.txtPlazo = txtPlazo;
	}


	public JTable getTablaAmortizacion() {
		return tablaAmortizacion;
	}


	public void setTablaAmortizacion(JTable tablaAmortizacion) {
		this.tablaAmortizacion = tablaAmortizacion;
	}


	public DefaultTableModel getModel() {
		return model;
	}


	public void setModel(DefaultTableModel model) {
		this.model = model;
	}


	public JButton getConfirmar() {
		return confirmar;
	}


	public void setConfirmar(JButton confirmar) {
		this.confirmar = confirmar;
	}


	public JButton getNuevo() {
		return nuevo;
	}


	public void setNuevo(JButton nuevo) {
		this.nuevo = nuevo;
	}	
	
}

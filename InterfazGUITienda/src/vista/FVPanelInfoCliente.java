package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class FVPanelInfoCliente extends JPanel 
{
	private static final long serialVersionUID = 1L;
	private Calendar calendario;
	private JTextField espacioNumFactura,eC,eN,eD,eT,eCE;
	private JLabel fecha, numFactura,cedula,nombre,direccion, telefono,correoElectronico;
	private JButton cliente;
	private static final String CLIENTE = "CLIENTE";

	public FVPanelInfoCliente()
	{
		setLayout(null);

		calendario = Calendar.getInstance();

		
		fecha =  new JLabel("FECHA: ");
		fecha.setBounds(5, 5, 50, 10);
		
		JLabel espacioFecha =  new JLabel(String.valueOf(calendario.DAY_OF_MONTH+"/11/2018"));
		espacioFecha.setBounds(60, 5, 400, 10);
		
		
		numFactura = new JLabel("# FACTURA: ");
		espacioNumFactura =  new JTextField();
		espacioNumFactura.setBackground(Color.WHITE);
		espacioNumFactura.setForeground(Color.BLACK);

		cliente = new JButton("Cliente");
		cliente.setActionCommand(CLIENTE);
		cliente.setBounds(122,121,212,132);

		cedula =  new JLabel("Cedula");
		eC =  new JTextField();
		eC.setBackground(Color.WHITE);
		eC.setForeground(Color.BLACK);

		nombre = new JLabel("Nombre");
		eN =  new JTextField();
		eN.setBackground(Color.WHITE);
		eN.setForeground(Color.BLACK);

		direccion =  new JLabel("Dirección");
		eD =  new JTextField();
		eD.setBackground(Color.WHITE);
		eD.setForeground(Color.BLACK);

		telefono =  new JLabel("Teléfono");
		eT =  new JTextField();
		eT.setBackground(Color.WHITE);
		eT.setForeground(Color.BLACK);

		correoElectronico =  new JLabel("Correo Electrónico");
		eCE =  new JTextField();
		eCE.setBackground(Color.WHITE);
		eCE.setForeground(Color.BLACK);
		
		add(fecha);
		add(espacioFecha);
		add(numFactura);
		add(espacioNumFactura);
		add(cedula);		
		add(nombre);		
		add(direccion);		
		add(telefono);		
		add(correoElectronico);
		add(eC);
		add(eN);
		add(eD);
		add(eT);
		add(eCE);
		add(cliente);
	
	}

}

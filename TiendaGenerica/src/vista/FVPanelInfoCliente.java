package vista;

import java.awt.Color;

import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FVPanelInfoCliente extends JPanel 
{
	private static final long serialVersionUID = 1L;
	private Calendar calendario;
	private JTextField espacioNumFactura,eC,eN,eD,eT,eCE, numProductosVender;
	private JLabel fecha, numFactura,cedula,nombre,direccion, telefono,Email,productos;
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
		numFactura.setBounds(340, 5, 70, 10);

		espacioNumFactura =  new JTextField();
		espacioNumFactura.setBounds(407, 2, 35, 20);
		espacioNumFactura.setBackground(Color.WHITE);
		espacioNumFactura.setForeground(Color.BLACK);

		cliente = new JButton("Cliente");
		cliente.setActionCommand(CLIENTE);
		cliente.setBounds(5, 25, 100, 25);

		cedula =  new JLabel("Cedula");
		cedula.setBounds(15, 60, 50, 10);

		eC =  new JTextField();
		eC.setBounds(1, 75, 75, 20);
		eC.setBackground(Color.WHITE);
		eC.setForeground(Color.BLACK);

		nombre = new JLabel("Nombre");
		nombre.setBounds(95, 60, 50, 10);

		eN =  new JTextField();
		eN.setBounds(80, 75,90, 20);
		eN.setBackground(Color.WHITE);
		eN.setForeground(Color.BLACK);

		direccion =  new JLabel("Dirección");
		direccion.setBounds(190, 60, 60, 10);

		eD =  new JTextField();
		eD.setBounds(175, 75, 90, 20);
		eD.setBackground(Color.WHITE);
		eD.setForeground(Color.BLACK);

		telefono =  new JLabel("Teléfono");
		telefono.setBounds(285, 60, 60, 10);

		eT =  new JTextField();
		eT.setBounds(270, 75, 78, 20);
		eT.setBackground(Color.WHITE);
		eT.setForeground(Color.BLACK);

		Email =  new JLabel("E-mail");
		Email.setBounds(365, 60, 50, 10);

		eCE =  new JTextField();
		eCE.setBounds(350, 75, 90, 20);		
		eCE.setBackground(Color.WHITE);
		eCE.setForeground(Color.BLACK);

		productos =  new JLabel("PRODUCTOS");
		productos.setBounds(5, 115, 85, 10);

		numProductosVender =  new JTextField();
		numProductosVender.setBounds(85, 110, 40, 25);
		numProductosVender.setBackground(Color.WHITE);
		numProductosVender.setForeground(Color.BLACK);

		add(fecha);
		add(espacioFecha);
		add(numFactura);
		add(espacioNumFactura);
		add(cedula);		
		add(nombre);		
		add(direccion);		
		add(telefono);		
		add(Email);
		add(eC);
		add(eN);
		add(eD);
		add(eT);
		add(eCE);
		add(cliente);
		add(productos);
		add(numProductosVender);
		

	}

}

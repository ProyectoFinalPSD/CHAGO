package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GCPanelBotonesClientes extends JPanel
{
	private JButton crear, actualizar, borrar;
	private static final String CREAR = "CREAR";
	private static final String ACTUALIZAR = "ACTUALIZAR";
	private static final String BORRAR = "BORRAR";

	public GCPanelBotonesClientes()
	{
		setLayout(new GridLayout(3,1));
		
		crear = new JButton("CREAR CLIENTE");
		crear.setActionCommand(CREAR);
		
		actualizar = new JButton("ACTUALIZAR CLIENTE");
		actualizar.setActionCommand(ACTUALIZAR);
		
		borrar = new JButton("BORRAR CLIENTE");
		borrar.setActionCommand(BORRAR);
		
		add(crear);
		add(actualizar);
		add(borrar);	
	}

}

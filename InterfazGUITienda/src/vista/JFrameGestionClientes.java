package vista;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class JFrameGestionClientes extends JFrame
{
	private GCPanelBotonesClientes panelBotones;
	private GCPanelListaClientes panelLista;
	
	public JFrameGestionClientes()
	{
		setSize(500,400);
		setResizable(false);
		setTitle("GESTIÓN DE CLIENTES");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		panelBotones =  new GCPanelBotonesClientes();	
		add(panelBotones, BorderLayout.EAST);
		
		panelLista = new GCPanelListaClientes();
		add(panelLista, BorderLayout.CENTER);

	
	
	
	}

}

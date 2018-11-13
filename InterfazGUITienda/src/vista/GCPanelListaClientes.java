package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class GCPanelListaClientes extends JPanel
{
	private JList listaClientes;
	private DefaultListModel modelo;
	private JScrollPane scrollLista;
	
	public GCPanelListaClientes()
	{
		setLayout(new BorderLayout());
		
		listaClientes = new JList();
		listaClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
		
		modelo = new DefaultListModel();
		
		scrollLista = new JScrollPane();
		scrollLista.setBounds(20, 120,220, 80);
		scrollLista.setViewportView(listaClientes);
		
		add(listaClientes);		
	}
}

package vista;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class GPROPanelListaProducto extends JPanel
{
	private JList listaProductos;
	private DefaultListModel modelo;
	private JScrollPane scrollLista;

	public GPROPanelListaProducto()
	{
		setLayout(new BorderLayout());

		listaProductos = new JList();
		listaProductos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );

		modelo = new DefaultListModel();

		scrollLista = new JScrollPane();
		scrollLista.setBounds(20, 120,220, 80);
		scrollLista.setViewportView(listaProductos);

		add(listaProductos);
	}

}

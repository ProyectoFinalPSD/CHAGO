package vista;

import java.awt.BorderLayout;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class GPPanelListaProveedor extends JPanel
{
	private JList listaProveedores;
	private DefaultListModel modelo;
	private JScrollPane scrollLista;

	public GPPanelListaProveedor()
	{
		setLayout(new BorderLayout());

		listaProveedores= new JList();
		listaProveedores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );

		modelo = new DefaultListModel();

		scrollLista = new JScrollPane();
		scrollLista.setBounds(20, 120,220, 80);
		scrollLista.setViewportView(listaProveedores);

		add(listaProveedores);
	}
}

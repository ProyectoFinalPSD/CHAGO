package vista;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;

public class FVPanelTablaProductos extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JButton seleccionarProducto;
	private JList listaProductos;
	private static final String SELECCIONAR = "SELECCIONAR PRODUCTO";
	
	public FVPanelTablaProductos()
	{
		setLayout(null);
		seleccionarProducto = new JButton("Seleccionar Producto");
		seleccionarProducto.setBounds(275, 150, 160, 30);
		seleccionarProducto.setActionCommand(SELECCIONAR);
		
		listaProductos =  new JList();
		listaProductos.setBounds(5, 5, 265, 400);
		
		
		
		add(seleccionarProducto);
		add(listaProductos);
		
	}
}

package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FVPanelBtnCompraProducto extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JButton cancelar, continuar, seleccionarPro;
	private static final String CANCELAR = "CANCELAR";
	private static final String CONTINUAR = "CONTINUAR";
	private static final String SELECCIONAR = "SELECCIONAR PRODUCTO";
	
	public FVPanelBtnCompraProducto()
	{
		setLayout(new GridLayout(1, 3));
		
		seleccionarPro = new JButton("Seleccionar Producto");
		seleccionarPro.setActionCommand(SELECCIONAR);
		
		continuar = new JButton("Continuar Compra");
		continuar.setActionCommand(CONTINUAR);
		
		cancelar = new JButton("Cancelar Compra");
		cancelar.setActionCommand(CANCELAR);
		
		add(seleccionarPro);
		add(continuar);
		add(cancelar);		
	}
}

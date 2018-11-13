package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class JFrameFacturaVenta extends JFrame
{
	private static final long serialVersionUID = 1L;
	private FVPanelInfoCliente PFVPanelInfo;
	private FVPanelCantidadProducto PFVPanelProducto;
	private FVPanelBtnCompraProducto PFVPanelBotones;
	private FVPanelTablaProductos PFVPanelListadoPro;
	
	
	public JFrameFacturaVenta()
	{
		setSize(470,700);
		setResizable(false);
		setTitle("FACTURA DE VENTA");
		setLocationRelativeTo(null);
		setLayout(null);
		
		PFVPanelInfo = new FVPanelInfoCliente();
		PFVPanelInfo.setBounds(10, 10, 420, 70);
		add(PFVPanelInfo);
		
		PFVPanelProducto = new FVPanelCantidadProducto();
		add(PFVPanelProducto);
		
		PFVPanelBotones =  new FVPanelBtnCompraProducto();
		add(PFVPanelBotones);
		
		PFVPanelListadoPro = new FVPanelTablaProductos();
		add(PFVPanelListadoPro);		
	}

}

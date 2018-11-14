package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class JFrameFacturaVenta extends JFrame
{
	private static final long serialVersionUID = 1L;
	private FVPanelInfoCliente PFVPanelInfo;
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
		PFVPanelInfo.setBounds(10, 10, 470, 130);
		add(PFVPanelInfo);
		
		PFVPanelListadoPro = new FVPanelTablaProductos();
		PFVPanelListadoPro.setBounds(10, 150, 470, 400);
		add(PFVPanelListadoPro);	
		
		
		PFVPanelBotones =  new FVPanelBtnCompraProducto();
		PFVPanelBotones.setBounds(10, 550, 470, 150);
		add(PFVPanelBotones);
	}

}

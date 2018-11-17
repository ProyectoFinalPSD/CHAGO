package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import modelo.Mundo;
import vista.MundoVista;


public class Controlador implements ActionListener {

	private MundoVista gui;
	private Mundo m;
	
	public Controlador()
	{
		m = new Mundo();
		gui = new MundoVista();
		
		
		gui.getVp().setVisible(true);
		gui.getFv().setVisible(false);
		gui.getCe().setVisible(false);
		gui.getFp().setVisible(false);
		gui.getRpv().setVisible(false);
		gui.getDt().setVisible(false);
		gui.getRpd().setVisible(false);
		
		
		gui.getVp().getPo().getBtnDatos().addActionListener(this);
		gui.getVp().getPo().getBtnProv().addActionListener(this);
		gui.getVp().getPg().getBtnGeneral().addActionListener(this);
		gui.getVp().getPo().getBtnProd().addActionListener(this);
		
		
		gui.getDt().getPom1().getBtnAgregar().addActionListener(this);
				
		
		gui.getRpd().getAgregar().addActionListener(this);
		
		gui.getRpv().getAgregar().addActionListener(this);
		gui.getRpv().getEliminar().addActionListener(this);
		
		
		gui.getFv().getPFVPanelBotones().getContinuar().addActionListener(this);
	}

	public void darDatosTienda(ActionEvent e)
	{
		if(e.getActionCommand().equals(gui.getDt().getPom1().AGREGAR))
		{
			m.getModdat().crearArchivos(gui.getDt().getPe().getTxtNT().getText(), gui.getDt().getPe().getTxtTipoC().getText(),gui.getDt().getPe().getTxtNIT().getText(),  gui.getDt().getPe().getTxtCOrigen().getText(), gui.getDt().getPe().getTxtIVa().getText(), gui.getDt().getPe().getTxtTasaInteres().getText(), gui.getDt().getPe().getTxtNBanco().getText(), gui.getDt().getPe().getTxtNumCuenta().getText(), gui.getDt().getPe().getTxtNGerente().getText());
			gui.getVp().getTituloG().setText(gui.getDt().getPe().getTxtNT().getText());
			
			JOptionPane.showMessageDialog(null, "Datos Ingresadors Correctamente");
			gui.getDt().setVisible(false);
			gui.getVp().getPg().getBtnGeneral().setEnabled(true);
			gui.getVp().getPo().getBtnProv().setEnabled(true);
			gui.getVp().getPo().getBtnProd().setEnabled(true);
			gui.getVp().getPo().getBtnProv1().setEnabled(true);		
			
		}
		
	}
	public void deshabilitarBotones()
	{
			gui.getVp().getPg().getBtnGeneral().setEnabled(false);
			gui.getVp().getPo().getBtnProv().setEnabled(false);
			gui.getVp().getPo().getBtnProd().setEnabled(false);
			gui.getVp().getPo().getBtnProv1().setEnabled(false);		
			
	}
	public void darVenta(ActionEvent e)
	{
		gui.getFv().setVisible(true);
		if(e.getActionCommand().equals(gui.getFv().getPFVPanelBotones().CONTINUAR))
		{
			gui.getFp().setVisible(true);
		}
		
	}
	public void darProveedor(ActionEvent e)
	{
		if(e.getActionCommand().equals(gui.getRpv().AGREGAR))
		{
			String NIT = gui.getRpv().getTextNIT().getText();
			String tel = gui.getRpv().getTextTelefono().getText();
			String nombre = gui.getRpv().getTextNombre().getText();
			String direccion = gui.getRpv().getTextDireccion().getText();
			String ciudad = gui.getRpv().getTextCiudad().getText();
			
			gui.getRpv().agregarProveedor();
			m.getModprov().agregarProveedor(NIT, nombre, direccion, tel, ciudad);
			System.out.println(m.getModprov().getProveedores().size());
		}
		else if (e.getActionCommand().equals(gui.getRpv().ELIMINAR))
		{
			gui.getRpv().eliminarProveedor(gui.getRpv().getMiTabla2().getSelectedRow());
		}
		
	}
	public void darProducto(ActionEvent e)
	{
		if (e.getActionCommand().equals(gui.getRpd().AGREGAR))
		{
			gui.getRpd().agregarProducto();
		}
		else if (e.getActionCommand().equals(gui.getRpd().ELIMINAR))
		{
			gui.getRpd().eliminarProducto(gui.getRpd().getMiTabla2().getSelectedRow());
		}
	}
	public void darCliente(ActionEvent e)
	{
		if (e.getActionCommand().equals(gui.getRcl().getAgregar()))
		{
			gui.getRcl().agregarCliente();
		}
		else if (e.getActionCommand().equals(gui.getRcl().getEliminar()))
		{
			gui.getRcl().eliminarCliente(gui.getRcl().getMiTabla2().getSelectedRow());
		}
	}
	
	public void actionPerformed(ActionEvent e)
	
	{
		if(m.getModdat().getConfiguracion().exists() == false)
		{
				deshabilitarBotones();
				JOptionPane.showMessageDialog(null, "Ingrese datos de la tienda para continuar", null, JOptionPane.WARNING_MESSAGE);
				gui.getDt().setVisible(true);
				darDatosTienda(e);	
		}		
		else if(e.getActionCommand().equals(gui.getVp().getPg().BUTG))
		{
			gui.getFv().setVisible(true);
			gui.getFv().getPFVPanelInfo().getEspacioNumFactura().setText(String.valueOf(m.getModfact().darConsecutivo()));	
			darVenta(e);
		}
		else if(e.getActionCommand().equals(gui.getFv().getPFVPanelInfo().CLIENTE))
		{
			gui.getRcl().setVisible(true);		
		}
		darCliente(e);

		if(e.getActionCommand().equals(gui.getVp().getPo().PROV))
		{
			gui.getRpv().setVisible(true);
		}
		 darProveedor(e);
		if(e.getActionCommand().equals(gui.getVp().getPo().PROD))
		{
			gui.getRpd().setVisible(true);
		}
		darProducto(e);
	}
	
	
}
	
	


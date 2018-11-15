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
		
		
		gui.getVp().getPo().getBtnDatos().addActionListener(this);
		gui.getVp().getPo().getBtnProv().addActionListener(this);
		gui.getVp().getPg().getBtnGeneral().addActionListener(this);
		gui.getVp().getPo().getBtnProd().addActionListener(this);
		
		
		gui.getDt().getPom1().getBtnAgregar().addActionListener(this);
				
		
		
		gui.getRpv().getAgregar().addActionListener(this);
		gui.getRpv().getEliminar().addActionListener(this);
		
		
		gui.getFv().getPFVPanelBotones().getContinuar().addActionListener(this);
	}

	public void darDatosTienda(ActionEvent e)
	{
		if(e.getActionCommand().equals(gui.getDt().getPom1().AGREGAR))
		{
			m.getModdat().crearCarpeta(gui.getDt().getPe().getTxtNT().getText());
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
	public boolean deshabilitarBotones()
	{
		boolean deshabilitar = false;
		if(m.getModdat().getConfiguracion().exists()==false)
		{
			gui.getVp().getPg().getBtnGeneral().setEnabled(false);
			gui.getVp().getPo().getBtnProv().setEnabled(false);
			gui.getVp().getPo().getBtnProd().setEnabled(false);
			gui.getVp().getPo().getBtnProv1().setEnabled(false);		
			JOptionPane.showMessageDialog(null, "Ingrese datos de la tienda para continuar", null, JOptionPane.WARNING_MESSAGE);
			deshabilitar = true;
		}
		return deshabilitar;
	}
	public void darVenta(ActionEvent e)
	{
		gui.getFv().setVisible(true);
		if(e.getActionCommand().equals(gui.getFv().getPFVPanelBotones().CONTINUAR))
		{
			gui.getFp().setVisible(true);
		}
		
	}
	/*public void darProveedor(ActionEvent e)
	{
		//gui.getGp().setVisible(true);
		if(e.getActionCommand().equals(gui.getGp().getPanelBotones().CREAR))
		{
			gui.getRp().setVisible(true);
		}
		else if(e.getActionCommand().equals(gui.getRp().getAgregar()))
		{
			String NIT = gui.getRp().getNit().getText();
			String tel = gui.getRp().getTel().getText();
			String nombre = gui.getRp().getNom().getText();
			String direccion = gui.getRp().getAdress().getText();
			String ciudad = gui.getRp().getCiudad_().getText();
			
			m.getModprov().agregarProveedor(NIT, nombre, direccion, tel, ciudad, m.getModdat().getP().getProperty("nombreTienda"));
			gui.getRp().setVisible(false);
		}
	}*/
	public void darProducto(ActionEvent e)
	{
		
	}
	public void registrarProveedor(ActionEvent e)
	{
		if (e.getActionCommand().equals(gui.getRpv().AGREGAR))
		{
			gui.getRpv().agregarNombre();
		}
		else if (e.getActionCommand().equals(gui.getRpv().ELIMINAR))
		{
			gui.getRpv().eliminarNombre(gui.getRpv().getMiTabla2().getSelectedRow());
		}
		
	}
	
	
	public void actionPerformed(ActionEvent e)
	
	{
		if (e.getActionCommand().equals(gui.getVp().getPo().DATOS)) 
		{
			gui.getDt().setVisible(true);
			darDatosTienda(e);
		}
		else if(e.getActionCommand().equals(gui.getVp().getPg().BUTG))
		{
			
		}
		else if(e.getActionCommand().equals(gui.getVp().getPo().PROV))
		{
			gui.getRpv().setVisible(true);
		}
		registrarProveedor(e);
		if(e.getActionCommand().equals(gui.getVp().getPo().PROD))
		{
			JOptionPane.showMessageDialog(null, "HOLA");
		}
	}
	
	
}
	
	


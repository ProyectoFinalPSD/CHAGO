package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import modelo.ModProveedor;
import modelo.Mundo;
import vista.GPPanelRegistroProveedores;
import vista.GUI;
import vista.GUIM1;
import vista.JFrameFacturaVenta;
import vista.JFrameGestionProveedores;
//import vista.Ventana;

public class Controlador implements ActionListener {

	private GUI v;
	private Mundo m;
	
	private JFrameGestionProveedores j;
	private GPPanelRegistroProveedores jp;
	private JFrameFacturaVenta fv;
	private GUIM1 gui1;

	public Controlador()
	{
		v = new GUI();
		m = new Mundo();
		
		j = new JFrameGestionProveedores(); 
		jp = new GPPanelRegistroProveedores();
		gui1 = new GUIM1();
		fv = new JFrameFacturaVenta();
		
		fv.setVisible(true);
		v.setVisible(false);
		j.setVisible(false);
		jp.setVisible(false);
		
		
		gui1.getPom1().getBtnAgregar().addActionListener(this);
		
		
		v.getPo().getBtnDatos().addActionListener(this);
		v.getPo().getBtnProv().addActionListener(this);
		v.getPg().getBtnGeneral().addActionListener(this);

		
		j.getPanelBotones().getCrear().addActionListener(this);
		
		
		jp.getBtnAgregar().addActionListener(this);
		//v.getPanel().getBtnAgregar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(v.getTituloG().getText() == "")
		{
			v.getPg().getBtnGeneral().setEnabled(false);
			v.getPo().getBtnProv().setEnabled(false);
			v.getPo().getBtnProd().setEnabled(false);
			v.getPo().getBtnProv1().setEnabled(false);		
			JOptionPane.showMessageDialog(null, "Ingrese datos de la tienda para continuar", null, JOptionPane.WARNING_MESSAGE);	
			if (e.getActionCommand().equals(v.getPo().DATOS)) 
				{
					gui1.setVisible(true);
				}
			else if(e.getActionCommand().equals(gui1.getPom1().AGREGAR))
				{
					m.getModdat().crearCarpeta(gui1.getPe().getTxtNT().getText());
					m.getModdat().crearArchivos(gui1.getPe().getTxtNT().getText(), 
							gui1.getPe().getTxtTipoC().getText(),gui1.getPe().getTxtNIT().getText(),  
							gui1.getPe().getTxtCOrigen().getText(), gui1.getPe().getTxtIVa().getText(), 
							gui1.getPe().getTxtTasaInteres().getText(), gui1.getPe().getTxtNBanco().getText(), 
							gui1.getPe().getTxtNumCuenta().getText(), gui1.getPe().getTxtNGerente().getText());
					v.getTituloG().setText(gui1.getPe().getTxtNT().getText());
					JOptionPane.showMessageDialog(null, "Datos Ingresadors Correctamente");
					gui1.setVisible(false);
					v.getPg().getBtnGeneral().setEnabled(true);
					v.getPo().getBtnProv().setEnabled(true);
					v.getPo().getBtnProd().setEnabled(true);
					v.getPo().getBtnProv1().setEnabled(true);		
					
				}
		}
		else if(e.getActionCommand().equals(v.getPg().BUTG))
		{
			fv.setVisible(true);
		}
		else if(e.getActionCommand().equals(v.getPo().PROV))
		{
			j.setVisible(true);
		}
		
		else if(e.getActionCommand().equals(j.getPanelBotones().CREAR))
		{
			jp.setVisible(true);
		}
		else if(e.getActionCommand().equals(jp.getAgregar()))
		{
			String NIT = jp.getNit().getText();
			String tel = jp.getTel().getText();
			String nombre = jp.getNom().getText();
			String direccion = jp.getAdress().getText();
			String ciudad = jp.getCiudad_().getText();
			
			m.getModprov().agregarProveedor(NIT, nombre, direccion, tel, ciudad, m.getModdat().getP().getProperty("nombreTienda"));
			jp.setVisible(false);
		}
			
	}
}
	
	


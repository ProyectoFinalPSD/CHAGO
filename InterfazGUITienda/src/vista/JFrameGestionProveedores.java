package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class JFrameGestionProveedores extends JFrame
{
	private GPPanelBotonesProveedor panelBotones;
	private GPPanelListaProveedor panelLista;
	public JFrameGestionProveedores()
	{
		setSize(500,400);
		setResizable(false);
		setTitle("GESTIÓN DE PROVEEDORES");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		panelBotones =  new GPPanelBotonesProveedor();
		add(panelBotones, BorderLayout.EAST);
		
		panelLista =  new GPPanelListaProveedor();
		add(panelLista, BorderLayout.CENTER);	
	}
	public GPPanelBotonesProveedor getPanelBotones() {
		return panelBotones;
	}
	public void setPanelBotones(GPPanelBotonesProveedor panelBotones) {
		this.panelBotones = panelBotones;
	}
	public GPPanelListaProveedor getPanelLista() {
		return panelLista;
	}
	public void setPanelLista(GPPanelListaProveedor panelLista) {
		this.panelLista = panelLista;
	}	
	
}

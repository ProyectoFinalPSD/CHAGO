package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class JFrameVentanaPrincipal extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private VPPanelBotonGenerarVenta pg;
	private VPPanelBotones po;
	private JLabel tituloG;
	
	public JFrameVentanaPrincipal()
	{	
		setSize(500,220);
		setResizable(false);
		setTitle("Titulo Vetana");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		pg = new VPPanelBotonGenerarVenta();
		po = new VPPanelBotones();
	
		tituloG = new JLabel("");
		tituloG.setFont(new java.awt.Font("Yu Gothic UI Semibold", java.awt.Font.ITALIC, 23));
		tituloG.setHorizontalAlignment(JLabel.CENTER);
		
		add(tituloG,BorderLayout.NORTH);
		add(pg);
		add(po, BorderLayout.SOUTH);
	}

	public VPPanelBotonGenerarVenta getPg() {
		return pg;
	}

	public void setPg(VPPanelBotonGenerarVenta pg) {
		this.pg = pg;
	}

	public VPPanelBotones getPo() {
		return po;
	}

	public void setPo(VPPanelBotones po) {
		this.po = po;
	}

	public JLabel getTituloG() {
		return tituloG;
	}

	public void setTituloG(JLabel tituloG) {
		this.tituloG = tituloG;
	}
	
}

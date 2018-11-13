package vista;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GUI extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private GUIPanelBotonGenerarVenta pg;
	private GUIPanelBotonesOpciones po;
	private JLabel tituloG;
	
	public GUI()
	{	
		setSize(500,307);
		setResizable(false);
		setTitle("Titulo Vetana");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		pg = new GUIPanelBotonGenerarVenta();
		po = new GUIPanelBotonesOpciones();
	
		tituloG = new JLabel("");
		tituloG.setFont(new java.awt.Font("Yu Gothic UI Semibold", java.awt.Font.ITALIC, 23));
		tituloG.setHorizontalAlignment(JLabel.CENTER);
		
		add(tituloG,BorderLayout.NORTH);
		add(pg);
		add(po, BorderLayout.SOUTH);
	}

	public GUIPanelBotonGenerarVenta getPg() {
		return pg;
	}

	public void setPg(GUIPanelBotonGenerarVenta pg) {
		this.pg = pg;
	}

	public GUIPanelBotonesOpciones getPo() {
		return po;
	}

	public void setPo(GUIPanelBotonesOpciones po) {
		this.po = po;
	}

	public JLabel getTituloG() {
		return tituloG;
	}

	public void setTituloG(JLabel tituloG) {
		this.tituloG = tituloG;
	}
	
}

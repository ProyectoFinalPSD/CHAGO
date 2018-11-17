package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class JFrameDatosTienda extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DTPanelEntradas pe;
	private DTPanelBotones pom1;
	
	public JFrameDatosTienda()
	{			
		setLayout(new BorderLayout());
		setSize(700,500);
		setResizable(false);
		setTitle("Titulo Vetana");
		setLocationRelativeTo(null);
		
		
		
		pe = new DTPanelEntradas();
		pom1 = new DTPanelBotones();
		
		add(pe);
		add(pom1, BorderLayout.SOUTH);
		
		
	}


	public DTPanelEntradas getPe() {
		return pe;
	}


	public void setPe(DTPanelEntradas pe) {
		this.pe = pe;
	}


	public DTPanelBotones getPom1() {
		return pom1;
	}


	public void setPom1(DTPanelBotones pom1) {
		this.pom1 = pom1;
	}
	
		
	
	

}

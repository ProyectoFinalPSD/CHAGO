package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class GUIM1 extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private panelEM1 pe;
	private panelOpM1 pom1;
	
	public GUIM1()
	{			
		setLayout(new BorderLayout());
		setSize(700,500);
		setResizable(false);
		setTitle("Titulo Vetana");
		setLocationRelativeTo(null);
		
		
		
		pe = new panelEM1();
		pom1 = new panelOpM1();
		
		add(pe);
		add(pom1, BorderLayout.SOUTH);
		
		
	}


	public panelEM1 getPe() {
		return pe;
	}


	public void setPe(panelEM1 pe) {
		this.pe = pe;
	}


	public panelOpM1 getPom1() {
		return pom1;
	}


	public void setPom1(panelOpM1 pom1) {
		this.pom1 = pom1;
	}
	
		
	
	

}

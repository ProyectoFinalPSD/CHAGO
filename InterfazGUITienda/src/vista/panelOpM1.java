package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class panelOpM1 extends JPanel
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnAgregar;
	private JButton btnCargar;
	
	public final static String AGREGAR = "Agregar";
	public final static String CARGAR = "Cargar";
	
	
	public panelOpM1()
	{
		setLayout(new GridLayout(1, 2));
		TitledBorder border = BorderFactory.createTitledBorder("");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setActionCommand(AGREGAR);
		
		btnCargar = new JButton("Cargar");
		btnCargar.setActionCommand(CARGAR);
		
		add(btnAgregar);
		add(btnCargar);
		
		
	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	public JButton getBtnCargar() {
		return btnCargar;
	}

	public void setBtnCargar(JButton btnCargar) {
		this.btnCargar = btnCargar;
	}

		public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}

package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FVPanelCantidadProducto extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JTextField numProductosVender;
	private JLabel productos;
	
	public FVPanelCantidadProducto()
	{
		setLayout(new GridLayout(1,2));

		productos =  new JLabel("PRODUCTOS");
			
		numProductosVender =  new JTextField();
		numProductosVender.setBackground(Color.WHITE);
		numProductosVender.setForeground(Color.BLACK);
		numProductosVender.setMinimumSize(new Dimension(50, 50));
		numProductosVender.setMaximumSize(new Dimension(50, 50));
	    numProductosVender.setPreferredSize(new Dimension(50,50));	
	    
		add(productos);
		add(numProductosVender);
	}

}

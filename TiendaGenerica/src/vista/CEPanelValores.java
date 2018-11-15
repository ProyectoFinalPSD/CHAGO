package vista;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CEPanelValores extends JPanel
{
	private JLabel etiqueta1,etiqueta2,etiqueta3,etiqueta4,etiqueta5;
	private JTextField espacio1,espacio2,espacio3,espacio4,espacio5;
	private JButton validar;
	public static final String VALIDAR = "Validar";

	public CEPanelValores()
	{
		setLayout(new GridLayout(6,2));

		etiqueta1 =  new JLabel("Total: $");
		etiqueta2 =  new JLabel("IVA: ");
		etiqueta3 = new JLabel("Total + IVA: $");
		etiqueta4 =  new JLabel("Paga con: $");
		etiqueta5 =  new JLabel("Cambio:  $");

		espacio1 =  new JTextField();
		espacio1.setBackground(Color.WHITE);
		espacio1.setForeground(Color.BLACK);

		espacio2 =  new JTextField();
		espacio2.setBackground(Color.WHITE);
		espacio2.setForeground(Color.BLACK);

		espacio3 =  new JTextField();
		espacio3.setBackground(Color.WHITE);
		espacio3.setForeground(Color.BLACK);

		espacio4 =  new JTextField();
		espacio4.setBackground(Color.WHITE);
		espacio4.setForeground(Color.BLACK);

		espacio5 =  new JTextField();
		espacio5.setBackground(Color.WHITE);
		espacio5.setForeground(Color.BLACK);

		validar =  new JButton("Validar Compra");
		validar.setActionCommand(VALIDAR);

		add(etiqueta1);
		add(espacio1);
		add(etiqueta2);
		add(espacio2);
		add(etiqueta3);
		add(espacio3);	
		add(etiqueta4);
		add(espacio4);
		add(etiqueta5);
		add(espacio5);
		add(validar);
	}

}
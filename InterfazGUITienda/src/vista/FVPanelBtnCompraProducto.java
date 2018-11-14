package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FVPanelBtnCompraProducto extends JPanel
{
	private static final long serialVersionUID = 1L;
	private JButton cancelar, continuar;
	private JLabel total, IVA, totalmasIVA, valor1,valor2,valor3;
	private static final String CANCELAR = "CANCELAR";
	private static final String CONTINUAR = "CONTINUAR";
	

	public FVPanelBtnCompraProducto()
	{
		setLayout(null);

		total =  new JLabel("TOTAL :");
		total.setBounds(5, 5, 50, 10);

		IVA =  new JLabel("IVA :");
		IVA.setBounds(5, 25, 50, 10);

		totalmasIVA =  new JLabel("TOTAL + IVA :");
		totalmasIVA.setBounds(5, 45, 90, 10);
		
		valor1 = new JLabel("000000");
		valor1.setBounds(350, 5, 50, 10);
		
		valor2 =  new JLabel("000000");
		valor2.setBounds(350, 25, 50, 10);
		
		valor3 =  new JLabel("000000");
		valor3.setBounds(350, 45, 50, 10);

		continuar = new JButton("Continuar Compra");
		continuar.setBounds(5, 75, 140,30 );
		continuar.setActionCommand(CONTINUAR);

		cancelar = new JButton("Cancelar Compra");
		cancelar.setBounds(250, 75, 140, 30);
		cancelar.setActionCommand(CANCELAR);

		add(continuar);
		add(cancelar);	
		add(total);
		add(IVA);
		add(totalmasIVA);
		add(valor1);
		add(valor2);
		add(valor3);
	}
}

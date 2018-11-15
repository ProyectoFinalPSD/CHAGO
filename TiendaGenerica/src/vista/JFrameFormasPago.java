package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameFormasPago extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private FPPanelSeleccion SeleccionPago;
	
	public JFrameFormasPago() 
	{
		setSize(240,100);
		setResizable(false);
		setTitle("");
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		JLabel titulo = new JLabel("Ingrese su forma de pago");
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new java.awt.Font("", java.awt.Font.BOLD, 12));
		
		
		SeleccionPago = new FPPanelSeleccion();
		
		add(titulo, BorderLayout.NORTH);
		add(SeleccionPago, BorderLayout.CENTER);
		}

	public FPPanelSeleccion getSeleccionPago() {
		return SeleccionPago;
	}

	public void setSeleccionPago(FPPanelSeleccion seleccionPago) {
		SeleccionPago = seleccionPago;
	}
	
}

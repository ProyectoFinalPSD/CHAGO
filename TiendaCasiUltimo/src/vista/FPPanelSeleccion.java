package vista;

	import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
	import javax.swing.JLabel;
	import javax.swing.JPanel;

	public class FPPanelSeleccion extends JPanel
	{
		private JButton btnEfectivo, btnCuotas;
		public static final String EFECTIVO = "Efectivo";
		public static final String CUOTAS = "Cuotas"; 

		public FPPanelSeleccion()
		{
			setLayout(new FlowLayout());
			
			btnEfectivo =  new JButton("Efectivo");
			btnEfectivo.setActionCommand(EFECTIVO);
			
			btnCuotas =  new JButton("Cuotas");
			btnCuotas.setActionCommand(CUOTAS);
			
			add(btnEfectivo);
			add(btnCuotas);
		}

		public JButton getBtnEfectivo() {
			return btnEfectivo;
		}

		public void setBtnEfectivo(JButton btnEfectivo) {
			this.btnEfectivo = btnEfectivo;
		}

		public JButton getBtnCuotas() {
			return btnCuotas;
		}

		public void setBtnCuotas(JButton btnCuotas) {
			this.btnCuotas = btnCuotas;
		}
		
		
		
	

}

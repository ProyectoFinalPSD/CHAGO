package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JFrameInventario extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JLabel titulo;
	private DefaultTableModel model;
	private JTable tablaInventario = new JTable();
	
	
	public JFrameInventario()
	{
		setSize(480, 500);
		setTitle("Inventario");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		titulo =  new JLabel("INVENTARIO");
		titulo.setFont(new java.awt.Font("Tahoma", 0, 40));
		titulo.setBounds(120, 10, 250, 50);
		
		model = new DefaultTableModel();// definimos el objeto tableModel
		tablaInventario.setModel(model);
		model.addColumn("Código");
		model.addColumn("Nombre");
		model.addColumn("NITProveedor");
		model.addColumn("PrecioCompra");
		model.addColumn("PrecioVenta");
		
		JScrollPane miBarra = new JScrollPane();
		miBarra.setBounds(25, 75, 420, 350);
		miBarra.setViewportView(tablaInventario);		
		
		
		
		add(titulo);
		add(miBarra);
		
		
		
	}

}

package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import modelo.Cliente;
import modelo.GestionCliente;

public class VentanaPrincipal extends JFrame implements ActionListener {
	
	private JButton agregar, eliminar, borrar;/*declaramos el objeto Boton*/
	private JLabel labelTitulo, mensaje;
	private JTextField textCod, textNombre, textEdad, textTelefono,
			textProfesion;
	private JLabel cod, nombre, edad, telefono, profesion;
	private DefaultTableModel model;
	private JTable miTabla2 = new JTable();// creamos la instancia de la tabla
	
	
	public VentanaPrincipal(){
		
		setSize(480, 500);
		setTitle("CoDejaVu : Componentes JTable");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		
		
		cod = new JLabel();
		cod.setText("Codigo");
		cod.setBounds(20, 80, 80, 25);
		add(cod);

		nombre = new JLabel();
		nombre.setText("Nombre");
		nombre.setBounds(20, 120, 80, 25);
		add(nombre);

		telefono = new JLabel();
		telefono.setText("telefono");
		telefono.setBounds(290, 160, 80, 25);
		add(telefono);

		edad = new JLabel();
		edad.setText("Edad");
		edad.setBounds(290, 120, 80, 25);
		add(edad);

		profesion = new JLabel();
		profesion.setText("Profesion");
		profesion.setBounds(20, 160, 80, 25);
		add(profesion);

		textCod = new JTextField();
		textCod.setBounds(80, 80, 80, 25);
		add(textCod);

		textNombre = new JTextField();
		textNombre.setBounds(80, 120, 190, 25);
		add(textNombre);

		textTelefono = new JTextField();
		textTelefono.setBounds(340, 160, 80, 25);
		add(textTelefono);

		textEdad = new JTextField();
		textEdad.setBounds(340, 120, 80, 25);
		add(textEdad);

		textProfesion = new JTextField();
		textProfesion.setBounds(80, 160, 190, 25);
		add(textProfesion);

		
		
		/*Propiedades del boton, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		agregar= new JButton();
		agregar.setText("Agregar");
		agregar.setBounds(20, 210, 80, 23);
		agregar.addActionListener(this);
		
		eliminar= new JButton();
		eliminar.setText("Eliminar");
		eliminar.setBounds(300, 210, 80, 23);
		eliminar.addActionListener(this);
		
		borrar= new JButton();
		borrar.setText("Borrar Lista");
		borrar.setBounds(120, 210, 120, 23);
		borrar.addActionListener(this);
		
		/*Propiedades del Label, lo instanciamos, posicionamos y
		 * activamos los eventos*/
		labelTitulo= new JLabel();
		labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 20));
		labelTitulo.setText("Registro de Clientes");
		labelTitulo.setBounds(143, 20, 180, 43);
		
		mensaje= new JLabel();
		mensaje.setBounds(20, 250, 280, 23);
		
		model = new DefaultTableModel();// definimos el objeto tableModel
		miTabla2.setModel(model);
		model.addColumn("Nº Documento");
		model.addColumn("Nombre");
		model.addColumn("Edad");
		model.addColumn("Profesión");
		model.addColumn("Telefono");

		JScrollPane miBarra2 = new JScrollPane();
		miBarra2.setBounds(40, 300, 400, 130);
		miBarra2.setViewportView(miTabla2);
		
		
		/*Agregamos los componentes al Contenedor*/
		add(labelTitulo);
		add(agregar);
		add(eliminar);
		add(borrar);
		add(mensaje);
		add(miBarra2);
		//add(scrollLista);
		//contenedor.add(botonCam);

	
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource()==agregar)
		{
			agregarNombre();
			mensaje.setText("Se agregó un nuevo elemento");
			GestionCliente g = new GestionCliente();
			g.agregar(textCod.getText(), textNombre.getText(), textEdad.getText(), textProfesion.getText(), textTelefono.getText());
			System.out.println(g.getLista().size());
			
		}
		if (evento.getSource()==eliminar)
		{
			eliminarNombre(miTabla2.getSelectedRow());
		}
		if (evento.getSource()==borrar)
		{
			borrarLista();
			mensaje.setText("Se borró toda la lista");
		}
	}

	private void agregarNombre() {
		String id=textCod.getText();
		String nombre=textNombre.getText();
		String edad=textEdad.getText();
		String profesion=textProfesion.getText();
		String telefono=textTelefono.getText();
		Object[] o = {id, nombre, edad, profesion, telefono};
		model.addRow(o);
		//listaNombres.setModel(modelo);
		limpiar();
	}
	
	private void eliminarNombre(int indice) {
		if (indice>=0) {
			model.removeRow(indice);	
			mensaje.setText("Se eliminó un elemento en la posición "+indice);
		}else{
			JOptionPane.showMessageDialog(null, "Debe seleccionar un indice"
					,"Error", JOptionPane.ERROR_MESSAGE);
			
				mensaje.setText("NO se seleccionó ningún elemento");
		}
		
	}
	
	private void borrarLista() {
		//model.clear();
	}
	public void limpiar() {
		textCod.setText("");
		textNombre.setText("");
		textEdad.setText("");
		textTelefono.setText("");
		textProfesion.setText("");
	}

}

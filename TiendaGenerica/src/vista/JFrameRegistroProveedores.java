package vista;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class JFrameRegistroProveedores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton agregar, eliminar, borrar;
	public static final String AGREGAR = "Agregar";
	public static final String ELIMINAR = "Eliminar";
	private JLabel labelTitulo, mensaje;
	private JTextField textCod, textNombre, textEdad, textTelefono,
			textProfesion;
	private JLabel cod, nombre, edad, telefono, profesion;
	private DefaultTableModel model;
	private JTable miTabla2 = new JTable();
	
	
	public JFrameRegistroProveedores(){
		
		setSize(480, 500);
		setTitle("");
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

		
		
		agregar= new JButton();
		agregar.setText("Agregar");
		agregar.setBounds(20, 210, 80, 23);
		agregar.setActionCommand(AGREGAR);
		
		eliminar= new JButton();
		eliminar.setText("Eliminar");
		eliminar.setBounds(300, 210, 80, 23);
		eliminar.setActionCommand(ELIMINAR);
		
		borrar= new JButton();
		borrar.setText("Borrar Lista");
		borrar.setBounds(120, 210, 120, 23);
		
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
		
		
		add(labelTitulo);
		add(agregar);
		add(eliminar);
		add(borrar);
		add(mensaje);
		add(miBarra2);
		//add(scrollLista);
		//contenedor.add(botonCam);

	
	}

	public void agregarNombre() {
		
		String id = getTextCod().getText();
		String nombre = getTextNombre().getText();
		String edad = getTextEdad().getText();
		String profesion = getTextProfesion().getText();
		String telefono = getTextTelefono().getText();
		Object[] o = {id, nombre, edad, profesion, telefono};
		getModel().addRow(o);
		limpiar();
		getMensaje().setText("Se agregó un nuevo elemento");
	}
	
	public void eliminarNombre(int indice) {
		if (indice>=0) {
			model.removeRow(indice);	
			mensaje.setText("Se eliminó un elemento en la posición "+indice);
		}else{
			JOptionPane.showMessageDialog(null, "Debe seleccionar un indice"
					,"Error", JOptionPane.ERROR_MESSAGE);
			
				mensaje.setText("NO se seleccionó ningún elemento");
		}
		
	}
	
	public void borrarLista() {
		//model.clear();
	}
	
	public void limpiar() {
		textCod.setText("");
		textNombre.setText("");
		textEdad.setText("");
		textTelefono.setText("");
		textProfesion.setText("");
	}

	public JButton getAgregar() {
		return agregar;
	}

	public void setAgregar(JButton agregar) {
		this.agregar = agregar;
	}

	public JButton getEliminar() {
		return eliminar;
	}

	public void setEliminar(JButton eliminar) {
		this.eliminar = eliminar;
	}

	public JButton getBorrar() {
		return borrar;
	}

	public void setBorrar(JButton borrar) {
		this.borrar = borrar;
	}

	public JLabel getMensaje() {
		return mensaje;
	}

	public void setMensaje(JLabel mensaje) {
		this.mensaje = mensaje;
	}

	public JTable getMiTabla2() {
		return miTabla2;
	}

	public void setMiTabla2(JTable miTabla2) {
		this.miTabla2 = miTabla2;
	}

	public JTextField getTextCod() {
		return textCod;
	}

	public void setTextCod(JTextField textCod) {
		this.textCod = textCod;
	}

	public JTextField getTextNombre() {
		return textNombre;
	}

	public void setTextNombre(JTextField textNombre) {
		this.textNombre = textNombre;
	}

	public JTextField getTextEdad() {
		return textEdad;
	}

	public void setTextEdad(JTextField textEdad) {
		this.textEdad = textEdad;
	}

	public JTextField getTextTelefono() {
		return textTelefono;
	}

	public void setTextTelefono(JTextField textTelefono) {
		this.textTelefono = textTelefono;
	}

	public JTextField getTextProfesion() {
		return textProfesion;
	}

	public void setTextProfesion(JTextField textProfesion) {
		this.textProfesion = textProfesion;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}
	
	
}
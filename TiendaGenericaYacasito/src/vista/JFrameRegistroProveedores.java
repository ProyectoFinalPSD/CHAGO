package vista;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class JFrameRegistroProveedores extends JFrame 
{

	public static final String AGREGAR = "Agregar";
	public static final String ELIMINAR = "Eliminar";
	private static final long serialVersionUID = 1L;
	private JButton agregar, eliminar, borrar;
	private JLabel labelTitulo, mensaje;
	private JTextField textNIT, textNombre, textDireccion, textTelefono,textCiudad;
	private JLabel nit, nom, direc, tel, ciu;
	private DefaultTableModel model;
	private JTable miTabla2 = new JTable();
	
	
	public JFrameRegistroProveedores(){
		
		setSize(480, 500);
		setTitle("Proveedores");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		nit = new JLabel();
		nit.setText("NIT");
		nit.setBounds(20, 80, 80, 25);
		add(nit);

		nom = new JLabel();
		nom.setText("Nombre");
		nom.setBounds(20, 120, 80, 25);
		add(nom);
		
		direc = new JLabel();
		direc.setText("Dirección");
		direc.setBounds(290, 120, 80, 25);
		add(direc);

		tel = new JLabel();
		tel.setText("Telefono");
		tel.setBounds(290, 160, 80, 25);
		add(tel);
		
		ciu = new JLabel();
		ciu.setText("Ciudad");
		ciu.setBounds(20, 160, 80, 25);
		add(ciu);

		textNIT = new JTextField();
		textNIT.setBounds(80, 80, 80, 25);
		add(textNIT);

		textNombre = new JTextField();
		textNombre.setBounds(80, 120, 190, 25);
		add(textNombre);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(340, 120, 80, 25);
		add(textDireccion);


		textTelefono = new JTextField();
		textTelefono.setBounds(340, 160, 80, 25);
		add(textTelefono);

		
		textCiudad = new JTextField();
		textCiudad.setBounds(80, 160, 190, 25);
		add(textCiudad);
		
		
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
		labelTitulo.setText("Registro de Proveedores");
		labelTitulo.setBounds(130, 20, 220, 43);
		
		mensaje= new JLabel();
		mensaje.setBounds(20, 250, 280, 23);
		
		model = new DefaultTableModel();// definimos el objeto tableModel
		miTabla2.setModel(model);
		model.addColumn("NIT");
		model.addColumn("Nombre");
		model.addColumn("Dirección");
		model.addColumn("Telefono");
		model.addColumn("Ciudad");

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

	public void agregarProveedor() 
	{
		
		String NIT = getTextNIT().getText();
		String Nombre = getTextNombre().getText();
		String Direccion = getTextDireccion().getText();
		String Telefono = getTextTelefono().getText();
		String Ciudad = getTextTelefono().getText();
		Object[] o = {NIT, Nombre, Direccion, Telefono, Ciudad};
		getModel().addRow(o);
		limpiar();
		getMensaje().setText("Se agregó un nuevo elemento");
	}
	
	

	public void eliminarProveedor(int indice) {
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
		textNIT.setText("");
		textNombre.setText("");
		textDireccion.setText("");
		textTelefono.setText("");
		textCiudad.setText("");
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

	public JLabel getLabelTitulo() {
		return labelTitulo;
	}

	public void setLabelTitulo(JLabel labelTitulo) {
		this.labelTitulo = labelTitulo;
	}

	public JLabel getMensaje() {
		return mensaje;
	}

	public void setMensaje(JLabel mensaje) {
		this.mensaje = mensaje;
	}

	public JTextField getTextNIT() {
		return textNIT;
	}

	public void setTextNIT(JTextField textNIT) {
		this.textNIT = textNIT;
	}

	public JTextField getTextNombre() {
		return textNombre;
	}

	public void setTextNombre(JTextField textNombre) {
		this.textNombre = textNombre;
	}

	public JTextField getTextDireccion() {
		return textDireccion;
	}

	public void setTextDireccion(JTextField textDireccion) {
		this.textDireccion = textDireccion;
	}

	public JTextField getTextTelefono() {
		return textTelefono;
	}

	public void setTextTelefono(JTextField textTelefono) {
		this.textTelefono = textTelefono;
	}

	public JTextField getTextCiudad() {
		return textCiudad;
	}

	public void setTextCiudad(JTextField textCiudad) {
		this.textCiudad = textCiudad;
	}

	public JLabel getNit() {
		return nit;
	}

	public void setNit(JLabel nit) {
		this.nit = nit;
	}

	public JLabel getNom() {
		return nom;
	}

	public void setNom(JLabel nom) {
		this.nom = nom;
	}

	public JLabel getDirec() {
		return direc;
	}

	public void setDirec(JLabel direc) {
		this.direc = direc;
	}

	public JLabel getTel() {
		return tel;
	}

	public void setTel(JLabel tel) {
		this.tel = tel;
	}

	public JLabel getCiu() {
		return ciu;
	}

	public void setCiu(JLabel ciu) {
		this.ciu = ciu;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public void setModel(DefaultTableModel model) {
		this.model = model;
	}

	public JTable getMiTabla2() {
		return miTabla2;
	}

	public void setMiTabla2(JTable miTabla2) {
		this.miTabla2 = miTabla2;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
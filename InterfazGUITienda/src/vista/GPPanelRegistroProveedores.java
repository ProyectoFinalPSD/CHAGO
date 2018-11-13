package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class GPPanelRegistroProveedores extends JFrame {

	private JLabel nombre, direccion, telefono, NIT, ciudad ;
	private JTextField nom, nit, adress, tel, ciudad_;
	private JButton btnAgregar;
	public final static String AGREGAR = "Agregar";
	
	public GPPanelRegistroProveedores()
	{
		
		setLayout(new GridLayout(6, 6));
		setTitle("¿DESEA SER PROVEEDOR NUESTRO?");
		setSize(500,400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		nombre = new JLabel("Nombre");
		nom = new JTextField("");
	
		NIT = new JLabel("NIT");
		nit = new JTextField("");

		direccion = new JLabel("Dirección");
		adress = new JTextField("");
		
		telefono = new JLabel("Télefono");
		tel = new JTextField("");
		
		ciudad = new JLabel("Ciudad");
		ciudad_ = new JTextField("");
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setActionCommand(AGREGAR);
		
		add(nombre);
		add(nom);
		add(NIT);
		add(nit);
		add(direccion);
		add(adress);
		add(telefono);
		add(tel);
		add(ciudad);
		add(ciudad_);
		add(btnAgregar);
		
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JLabel getDireccion() {
		return direccion;
	}

	public void setDireccion(JLabel direccion) {
		this.direccion = direccion;
	}

	public JLabel getTelefono() {
		return telefono;
	}

	public void setTelefono(JLabel telefono) {
		this.telefono = telefono;
	}

	public JLabel getNIT() {
		return NIT;
	}

	public void setNIT(JLabel nIT) {
		NIT = nIT;
	}

	public JLabel getCiudad() {
		return ciudad;
	}

	public void setCiudad(JLabel ciudad) {
		this.ciudad = ciudad;
	}

	public JTextField getNom() {
		return nom;
	}

	public void setNom(JTextField nom) {
		this.nom = nom;
	}

	public JTextField getNit() {
		return nit;
	}

	public void setNit(JTextField nit) {
		this.nit = nit;
	}

	public JTextField getAdress() {
		return adress;
	}

	public void setAdress(JTextField adress) {
		this.adress = adress;
	}

	public JTextField getTel() {
		return tel;
	}

	public void setTel(JTextField tel) {
		this.tel = tel;
	}

	public JTextField getCiudad_() {
		return ciudad_;
	}

	public void setCiudad_(JTextField ciudad_) {
		this.ciudad_ = ciudad_;
	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	public static String getAgregar() {
		return AGREGAR;
	}
}